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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rcptt.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jfx Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcptt.extensions.ecl.commands.JfxCommand#getCanvas <em>Canvas</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcptt.extensions.ecl.commands.CommandsPackage#getJfxCommand()
 * @model
 * @generated
 */
public interface JfxCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' reference.
	 * @see #setCanvas(EObject)
	 * @see org.eclipse.rcptt.extensions.ecl.commands.CommandsPackage#getJfxCommand_Canvas()
	 * @model required="true"
	 * @generated
	 */
	EObject getCanvas();

	/**
	 * Sets the value of the '{@link org.eclipse.rcptt.extensions.ecl.commands.JfxCommand#getCanvas <em>Canvas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas</em>' reference.
	 * @see #getCanvas()
	 * @generated
	 */
	void setCanvas(EObject value);

} // JfxCommand
