/**
 */
package org.eclipse.rcptt.extensions.ecl.commands.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.rcptt.ecl.core.impl.CommandImpl;

import org.eclipse.rcptt.extensions.ecl.commands.CommandsPackage;
import org.eclipse.rcptt.extensions.ecl.commands.JfxCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jfx Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcptt.extensions.ecl.commands.impl.JfxCommandImpl#getCanvas <em>Canvas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JfxCommandImpl extends CommandImpl implements JfxCommand {
	/**
	 * The cached value of the '{@link #getCanvas() <em>Canvas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvas()
	 * @generated
	 * @ordered
	 */
	protected EObject canvas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JfxCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.JFX_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCanvas() {
		if (canvas != null && canvas.eIsProxy()) {
			InternalEObject oldCanvas = (InternalEObject)canvas;
			canvas = eResolveProxy(oldCanvas);
			if (canvas != oldCanvas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandsPackage.JFX_COMMAND__CANVAS, oldCanvas, canvas));
			}
		}
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetCanvas() {
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanvas(EObject newCanvas) {
		EObject oldCanvas = canvas;
		canvas = newCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.JFX_COMMAND__CANVAS, oldCanvas, canvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandsPackage.JFX_COMMAND__CANVAS:
				if (resolve) return getCanvas();
				return basicGetCanvas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommandsPackage.JFX_COMMAND__CANVAS:
				setCanvas((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommandsPackage.JFX_COMMAND__CANVAS:
				setCanvas((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommandsPackage.JFX_COMMAND__CANVAS:
				return canvas != null;
		}
		return super.eIsSet(featureID);
	}

} //JfxCommandImpl
