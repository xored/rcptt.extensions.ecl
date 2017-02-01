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
package org.eclipse.rcptt.extensions.ecl.commands;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.rcptt.ecl.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rcptt.extensions.ecl.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/rcptt/extensions/ecl/model/commands.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.rcptt.extensions.ecl.model.comands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.GetProblemMessagesImpl <em>Get Problem Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.GetProblemMessagesImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getGetProblemMessages()
	 * @generated
	 */
	int GET_PROBLEM_MESSAGES = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROBLEM_MESSAGES__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROBLEM_MESSAGES__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Get Problem Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROBLEM_MESSAGES_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewsImpl <em>Show Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewsImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getShowViews()
	 * @generated
	 */
	int SHOW_VIEWS = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEWS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEWS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Show Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEWS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewImpl <em>Show View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getShowView()
	 * @generated
	 */
	int SHOW_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEW__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEW__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEW__ID = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Show View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_VIEW_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ViewImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.GetSupportedDevicesImpl <em>Get Supported Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.GetSupportedDevicesImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getGetSupportedDevices()
	 * @generated
	 */
	int GET_SUPPORTED_DEVICES = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SUPPORTED_DEVICES__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SUPPORTED_DEVICES__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Get Supported Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SUPPORTED_DEVICES_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxCommandImpl <em>Jfx Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxCommandImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxCommand()
	 * @generated
	 */
	int JFX_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_COMMAND__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_COMMAND__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_COMMAND__CANVAS = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jfx Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_COMMAND_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxClickButtonImpl <em>Jfx Click Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxClickButtonImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxClickButton()
	 * @generated
	 */
	int JFX_CLICK_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_CLICK_BUTTON__HOST = JFX_COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_CLICK_BUTTON__BINDINGS = JFX_COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_CLICK_BUTTON__CANVAS = JFX_COMMAND__CANVAS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_CLICK_BUTTON__NAME = JFX_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jfx Click Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_CLICK_BUTTON_FEATURE_COUNT = JFX_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxSelectPinImpl <em>Jfx Select Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxSelectPinImpl
	 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxSelectPin()
	 * @generated
	 */
	int JFX_SELECT_PIN = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_SELECT_PIN__HOST = JFX_COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_SELECT_PIN__BINDINGS = JFX_COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_SELECT_PIN__CANVAS = JFX_COMMAND__CANVAS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_SELECT_PIN__ID = JFX_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jfx Select Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFX_SELECT_PIN_FEATURE_COUNT = JFX_COMMAND_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.GetProblemMessages <em>Get Problem Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Problem Messages</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.GetProblemMessages
	 * @generated
	 */
	EClass getGetProblemMessages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.ShowViews <em>Show Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Views</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.ShowViews
	 * @generated
	 */
	EClass getShowViews();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.ShowView <em>Show View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show View</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.ShowView
	 * @generated
	 */
	EClass getShowView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.ShowView#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.ShowView#getId()
	 * @see #getShowView()
	 * @generated
	 */
	EAttribute getShowView_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.View#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.View#getId()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.View#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.View#getLabel()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.View#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.View#getDescription()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.GetSupportedDevices <em>Get Supported Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Supported Devices</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.GetSupportedDevices
	 * @generated
	 */
	EClass getGetSupportedDevices();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxCommand <em>Jfx Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jfx Command</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxCommand
	 * @generated
	 */
	EClass getJfxCommand();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxCommand#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Canvas</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxCommand#getCanvas()
	 * @see #getJfxCommand()
	 * @generated
	 */
	EReference getJfxCommand_Canvas();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxClickButton <em>Jfx Click Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jfx Click Button</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxClickButton
	 * @generated
	 */
	EClass getJfxClickButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxClickButton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxClickButton#getName()
	 * @see #getJfxClickButton()
	 * @generated
	 */
	EAttribute getJfxClickButton_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxSelectPin <em>Jfx Select Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jfx Select Pin</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxSelectPin
	 * @generated
	 */
	EClass getJfxSelectPin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxSelectPin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rcptt.extensions.ecl.commands.JfxSelectPin#getId()
	 * @see #getJfxSelectPin()
	 * @generated
	 */
	EAttribute getJfxSelectPin_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.GetProblemMessagesImpl <em>Get Problem Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.GetProblemMessagesImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getGetProblemMessages()
		 * @generated
		 */
		EClass GET_PROBLEM_MESSAGES = eINSTANCE.getGetProblemMessages();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewsImpl <em>Show Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewsImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getShowViews()
		 * @generated
		 */
		EClass SHOW_VIEWS = eINSTANCE.getShowViews();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewImpl <em>Show View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ShowViewImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getShowView()
		 * @generated
		 */
		EClass SHOW_VIEW = eINSTANCE.getShowView();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_VIEW__ID = eINSTANCE.getShowView_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.ViewImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LABEL = eINSTANCE.getView_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DESCRIPTION = eINSTANCE.getView_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.GetSupportedDevicesImpl <em>Get Supported Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.GetSupportedDevicesImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getGetSupportedDevices()
		 * @generated
		 */
		EClass GET_SUPPORTED_DEVICES = eINSTANCE.getGetSupportedDevices();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxCommandImpl <em>Jfx Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxCommandImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxCommand()
		 * @generated
		 */
		EClass JFX_COMMAND = eINSTANCE.getJfxCommand();

		/**
		 * The meta object literal for the '<em><b>Canvas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFX_COMMAND__CANVAS = eINSTANCE.getJfxCommand_Canvas();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxClickButtonImpl <em>Jfx Click Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxClickButtonImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxClickButton()
		 * @generated
		 */
		EClass JFX_CLICK_BUTTON = eINSTANCE.getJfxClickButton();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFX_CLICK_BUTTON__NAME = eINSTANCE.getJfxClickButton_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxSelectPinImpl <em>Jfx Select Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.JfxSelectPinImpl
		 * @see org.eclipse.rcptt.extensions.ecl.commands.impl.CommandsPackageImpl#getJfxSelectPin()
		 * @generated
		 */
		EClass JFX_SELECT_PIN = eINSTANCE.getJfxSelectPin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFX_SELECT_PIN__ID = eINSTANCE.getJfxSelectPin_Id();

	}

} //CommandsPackage
