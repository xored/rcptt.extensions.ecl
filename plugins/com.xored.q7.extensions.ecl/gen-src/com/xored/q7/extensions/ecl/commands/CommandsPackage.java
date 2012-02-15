/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.xored.q7.extensions.ecl.commands;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.xored.q7.extensions.ecl.commands.CommandsFactory
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
	String eNS_URI = "http://www.xored.com/q7/extensions/ecl/commands.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.xored.q7.extensions.ecl.commands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = com.xored.q7.extensions.ecl.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.xored.q7.extensions.ecl.commands.impl.GetProblemMessagesImpl <em>Get Problem Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xored.q7.extensions.ecl.commands.impl.GetProblemMessagesImpl
	 * @see com.xored.q7.extensions.ecl.commands.impl.CommandsPackageImpl#getGetProblemMessages()
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
	 * Returns the meta object for class '{@link com.xored.q7.extensions.ecl.commands.GetProblemMessages <em>Get Problem Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Problem Messages</em>'.
	 * @see com.xored.q7.extensions.ecl.commands.GetProblemMessages
	 * @generated
	 */
	EClass getGetProblemMessages();

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
		 * The meta object literal for the '{@link com.xored.q7.extensions.ecl.commands.impl.GetProblemMessagesImpl <em>Get Problem Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xored.q7.extensions.ecl.commands.impl.GetProblemMessagesImpl
		 * @see com.xored.q7.extensions.ecl.commands.impl.CommandsPackageImpl#getGetProblemMessages()
		 * @generated
		 */
		EClass GET_PROBLEM_MESSAGES = eINSTANCE.getGetProblemMessages();

	}

} //CommandsPackage
