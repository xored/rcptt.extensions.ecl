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

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.event.Event;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcptt.ecl.core.Command;
import org.eclipse.rcptt.ecl.runtime.ICommandService;
import org.eclipse.rcptt.ecl.runtime.IProcess;
import org.eclipse.rcptt.extensions.ecl.commands.JfxClickButton;
import org.eclipse.rcptt.extensions.ecl.commands.JfxCommand;
import org.eclipse.rcptt.extensions.ecl.commands.JfxSelectPin;
import org.eclipse.rcptt.tesla.core.protocol.raw.Element;
import org.eclipse.rcptt.tesla.ecl.impl.TeslaBridge;
import org.eclipse.rcptt.tesla.ecl.model.ControlHandler;
import org.eclipse.rcptt.tesla.internal.ui.player.SWTUIElement;
import org.eclipse.rcptt.tesla.internal.ui.processors.SWTUIProcessor;
import org.eclipse.swt.widgets.Widget;

public class JfxCommandsService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		JfxCommand jfxCommand = (JfxCommand) command;
		EObject object = jfxCommand.getCanvas();
		/*if (object instanceof ControlHandler) {
			Element element = TeslaBridge.find((ControlHandler) object, context);
			SWTUIElement swtuiElement = TeslaBridge.getClient().getProcessor(SWTUIProcessor.class).getMapper().get(element);
			Widget widget = swtuiElement.widget;
			FXCanvas jfxCanvas = (FXCanvas) widget;
			
			Runnable jfxJob = getJfxJob(jfxCanvas, jfxCommand);
			if (jfxJob != null) {
				Platform.runLater(jfxJob);
				return Status.OK_STATUS;
			}
		}*/
		return Status.CANCEL_STATUS;
	}
	
	private Runnable getJfxJob(FXCanvas canvas, JfxCommand command) {
		if (command instanceof JfxClickButton) {
			JfxClickButton clickButton = (JfxClickButton) command;
			String name = clickButton.getName();
			int index = getButtonIndex(name);
			if (index == -1) {
				return null;
			}
			return getClickButtonJob(canvas, index);
		}
		if (command instanceof JfxSelectPin) {
			JfxSelectPin selectPin = (JfxSelectPin) command;
			String id = selectPin.getId();
			int index = getPinIndex(id);
			if (index == -1) {
				return null;
			}
			return getSelectPinJob(canvas, index);
		}
		return null;
	}
	
	private Runnable getClickButtonJob(final FXCanvas canvas, final int index) {
		Runnable job = new Runnable() {
			@Override
			public void run() {
				VBox vbox = (VBox) canvas.getScene().getRoot();
				BorderPane borderPane = (BorderPane) vbox.getChildren().get(0);			
				
				ObservableList<Node> childrens = borderPane.getChildren();
				ToolBar toolBar = (ToolBar) childrens.get(0);
				Button button = (Button) toolBar.getItems().get(index);				
				Event.fireEvent(button, new MouseEvent(MouseEvent.MOUSE_CLICKED,
						0, 0, 0, 0,
						MouseButton.PRIMARY,
						1, true, true, true, true, true, true, true, true, true, true, null));
			}
		};
		return job;
	}
	
	private int getButtonIndex(String name) {
		if (name == null || name.equals("")) {
			return -1;
		}
		if (name.equalsIgnoreCase("Save")) {
			return 0;
		}
		if (name.equalsIgnoreCase("Zoom Out")) {
			return 2;
		}
		if (name.equalsIgnoreCase("Zoom In")) {
			return 3;
		}
		return -1;
	}
	
	private Runnable getSelectPinJob(final FXCanvas canvas, final int index) {
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
				StackPane pinPane = (StackPane) pinPanes.get(index);
				Group pin = null;
				for (Node child : pinPane.getChildren()) {
					if (child instanceof Group) {
						pin = (Group) child;
						break;
					}
				}
				Bounds bounds = pin.localToScreen(pin.getBoundsInLocal());
				Event.fireEvent(pin, new MouseEvent(MouseEvent.MOUSE_MOVED,
						0, 0, bounds.getMaxX(), bounds.getMaxY(),
						MouseButton.NONE,
						1, true, true, true, true, true, true, true, true, true, true, null));
			}
		};
		return job;
	}
	
	private int getPinIndex(String id) {
		if (id == null || id.equals("") || id.length() < 2 || id.length() > 3) {
			return -1;
		}
		int startIndex = 62;
		int offset = 0;
		
		char line = id.charAt(0);
		int lineIndex = (int) line;
		if (lineIndex < 65 || lineIndex > 82 || lineIndex == 73 || lineIndex == 79 || lineIndex == 81) {
			return -1;
		}
		if (lineIndex > 81) {
			lineIndex -= 1;
		}
		if (lineIndex > 79) {
			lineIndex -= 1;
		}
		if (lineIndex > 73) {
			lineIndex -= 1;
		}
		lineIndex -= 64;
		
		String column = id.substring(1);
		int columnIndex;
		try {
			columnIndex = Integer.parseInt(column);
		} catch (Exception e) {
			return -1;
		}
		if (columnIndex < 1 || columnIndex > 15) {
			return -1;
		}
		if (columnIndex > 4 && columnIndex < 12 && lineIndex > 4 && lineIndex < 12) {
			return -1;
		}
		
		if (lineIndex > 4 && lineIndex < 12) {
			if (columnIndex >= 12) {
				offset += 7 * (lineIndex - 4);
			} else {
				offset += 7 * (lineIndex - 5);
			}
		}
		if (lineIndex >= 12) {
			offset += 7 * 7;
		}
		
		return startIndex + (lineIndex - 1) * 15 + columnIndex - offset;
	}

}
