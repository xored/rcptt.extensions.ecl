/*******************************************************************************
 * Copyright (c) 2009, 2014 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.rcptt.extensions.ecl.internal.commands;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcptt.ecl.core.Command;
import org.eclipse.rcptt.ecl.data.objects.ObjectsFactory;
import org.eclipse.rcptt.ecl.data.objects.Row;
import org.eclipse.rcptt.ecl.data.objects.Table;
import org.eclipse.rcptt.ecl.runtime.ICommandService;
import org.eclipse.rcptt.ecl.runtime.IProcess;
import org.eclipse.rcptt.extensions.ecl.commands.JfxCommand;
import org.eclipse.rcptt.extensions.ecl.internal.EclExtensionsPlugin;
import org.eclipse.rcptt.tesla.core.protocol.raw.Element;
import org.eclipse.rcptt.tesla.ecl.impl.TeslaBridge;
import org.eclipse.rcptt.tesla.ecl.model.ControlHandler;
import org.eclipse.rcptt.tesla.internal.ui.player.SWTUIElement;
import org.eclipse.rcptt.tesla.internal.ui.processors.SWTUIProcessor;
import org.eclipse.swt.widgets.Widget;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class JfxGetPinTableService implements ICommandService {

	private final ReentrantLock lock = new ReentrantLock();
	private final Condition outputWrited = lock.newCondition();

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		JfxCommand jfxCommand = (JfxCommand) command;
		EObject object = jfxCommand.getCanvas();
		if (!(object instanceof ControlHandler)) {
			return Status.CANCEL_STATUS;
		}
		Element element = TeslaBridge.find((ControlHandler) object, context);
		SWTUIElement swtuiElement = TeslaBridge.getClient().getProcessor(SWTUIProcessor.class).getMapper()
				.get(element);
		Widget widget = swtuiElement.widget;
		FXCanvas canvas = (FXCanvas) widget;

		Runnable job = getGetPinTableJob(canvas, context);
		lock.lock();
		try {
			Platform.runLater(job);
			outputWrited.await(); // wait for JavaFX thread to write the table in the output
		} finally {
			lock.unlock();
		}
		return Status.OK_STATUS;
	}

	private Runnable getGetPinTableJob(final FXCanvas canvas, final IProcess context) {
		Runnable job = new Runnable() {
			@Override
			public void run() {
				VBox vbox = (VBox) canvas.getScene().getRoot();
				ScrollPane scrollPane = null;
				for (Node child : vbox.getChildren()) {
					if (child instanceof ScrollPane) {
						scrollPane = (ScrollPane) child;
						break;
					}
				}

				Node node = scrollPane.getContent();
				while ((node instanceof Group || node instanceof Pane)
						&& !(node instanceof GridPane)) {
					if (node instanceof Group) {
						Group group = ((Group) node);
						node = group.getChildren().get(0);
					}
					if (node instanceof Pane) {
						Pane pane = ((Pane) node);
						node = pane.getChildren().get(0);
					}
				}

				ObservableList<Node> pinPanes = ((GridPane) node).getChildren();

				Table table = ObjectsFactory.eINSTANCE.createTable();
				Row header = ObjectsFactory.eINSTANCE.createRow();
				header.getValues().add("Pin Number");
				for (int i = 1; i <= 15; i++) {
					header.getValues().add(String.valueOf(i));
				}
				table.getRows().add(header);

				int index = 0;
				int prevX = 1;
				Row row = null;
				for (Node pinPane : pinPanes) {
					String label = "";
					if (!(pinPane instanceof StackPane)) {
						continue;
					}
					for (Node pin : ((StackPane) pinPane).getChildren()) {
						if (!(pin instanceof Group)) {
							continue;
						}
						for (Node item : ((Group) pin).getChildren()) {
							if (!(item instanceof Label)) {
								continue;
							}
							label = ((Label) item).getText();
							break;
						}
					}

					int tableIndex = getPinTableIndex(index);
					int x = getPinX(tableIndex);
					char y = getPinY(tableIndex);
					if (x == 1) {
						row = ObjectsFactory.eINSTANCE.createRow();
						row.getValues().add(String.valueOf(y));
						row.getValues().add(label);
					}
					if (x == prevX + 1) {
						row.getValues().add(label);
					}
					if (x > prevX + 1) {
						for (int i = prevX + 1; i < x; i++) {
							row.getValues().add(null);
						}
						row.getValues().add(label);
					}
					if (x == 15) {
						table.getRows().add(row);
					}
					index++;
					prevX = x;
				}
				lock.lock();
				try {
					context.getOutput().write(table);
					outputWrited.signal();
				} catch (CoreException e) {
					EclExtensionsPlugin.log(e);
				} finally {
					lock.unlock();
				}
			}
		};
		return job;
	}

	// returns 0-based index of the pin in 15x15 table
	private int getPinTableIndex(int index) {
		if (index >= 60 && index < 116) { // A1 = 0; E1 = 60; M1 = 116
			int subIndex = index - 60;
			if ((subIndex % 8) > 3) {
				index += (subIndex / 8 + 1) * 7;
			} else {
				index += (subIndex / 8) * 7;
			}
		} else if (index >= 116) {
			index = index + 7 * 7;
		}
		return index; // A1 = 0; E1 = 60; M1 = 165
	}

	// returns a pin's x-coordinate: 1..15
	private int getPinX(int tableIndex) {
		return tableIndex % 15 + 1;
	}

	// returns a pin's y-coordinate: A..R
	private char getPinY(int tableIndex) {
		int lineIndex = tableIndex / 15;
		if (lineIndex > 7) {
			lineIndex += 1;
		}
		if (lineIndex > 13) {
			lineIndex += 1;
		}
		if (lineIndex > 15) {
			lineIndex += 1;
		}
		return (char) (65 + lineIndex);
	}

}