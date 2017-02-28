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
package org.eclipse.rcptt.extensions.ecl.commands.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.rcptt.extensions.ecl.commands.*;
import org.eclipse.rcptt.extensions.ecl.commands.CommandsFactory;
import org.eclipse.rcptt.extensions.ecl.commands.CommandsPackage;
import org.eclipse.rcptt.extensions.ecl.commands.GetProblemMessages;
import org.eclipse.rcptt.extensions.ecl.commands.GetSupportedDevices;
import org.eclipse.rcptt.extensions.ecl.commands.ShowView;
import org.eclipse.rcptt.extensions.ecl.commands.ShowViews;
import org.eclipse.rcptt.extensions.ecl.commands.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsFactoryImpl extends EFactoryImpl implements CommandsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandsFactory init() {
		try {
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory(CommandsPackage.eNS_URI);
			if (theCommandsFactory != null) {
				return theCommandsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommandsPackage.GET_PROBLEM_MESSAGES: return createGetProblemMessages();
			case CommandsPackage.SHOW_VIEWS: return createShowViews();
			case CommandsPackage.SHOW_VIEW: return createShowView();
			case CommandsPackage.VIEW: return createView();
			case CommandsPackage.GET_SUPPORTED_DEVICES: return createGetSupportedDevices();
			case CommandsPackage.JFX_COMMAND: return createJfxCommand();
			case CommandsPackage.JFX_CLICK_BUTTON: return createJfxClickButton();
			case CommandsPackage.JFX_SELECT_PIN: return createJfxSelectPin();
			case CommandsPackage.JFX_GET_PIN_TABLE: return createJfxGetPinTable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetProblemMessages createGetProblemMessages() {
		GetProblemMessagesImpl getProblemMessages = new GetProblemMessagesImpl();
		return getProblemMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowViews createShowViews() {
		ShowViewsImpl showViews = new ShowViewsImpl();
		return showViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowView createShowView() {
		ShowViewImpl showView = new ShowViewImpl();
		return showView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetSupportedDevices createGetSupportedDevices() {
		GetSupportedDevicesImpl getSupportedDevices = new GetSupportedDevicesImpl();
		return getSupportedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JfxCommand createJfxCommand() {
		JfxCommandImpl jfxCommand = new JfxCommandImpl();
		return jfxCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JfxClickButton createJfxClickButton() {
		JfxClickButtonImpl jfxClickButton = new JfxClickButtonImpl();
		return jfxClickButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JfxSelectPin createJfxSelectPin() {
		JfxSelectPinImpl jfxSelectPin = new JfxSelectPinImpl();
		return jfxSelectPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JfxGetPinTable createJfxGetPinTable() {
		JfxGetPinTableImpl jfxGetPinTable = new JfxGetPinTableImpl();
		return jfxGetPinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsPackage getCommandsPackage() {
		return (CommandsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandsPackage getPackage() {
		return CommandsPackage.eINSTANCE;
	}

} //CommandsFactoryImpl
