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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.rcptt.ecl.core.Command;
import org.eclipse.rcptt.ecl.core.CoreFactory;
import org.eclipse.rcptt.ecl.core.EclList;
import org.eclipse.rcptt.ecl.core.EclMap;
import org.eclipse.rcptt.ecl.core.EclMapEntry;
import org.eclipse.rcptt.ecl.core.EclString;
import org.eclipse.rcptt.ecl.runtime.ICommandService;
import org.eclipse.rcptt.ecl.runtime.IProcess;

public class GetSupportedDevicesService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		EclList result = CoreFactory.eINSTANCE.createEclList();
		result.getElements().add(createDevice("R5F564MFCxLC", "RX600/RX64M/RX64M - 177pin/R5F564MFCxLC"));
		result.getElements().add(createDevice("R5F564MFDxFB", "RX600/RX64M/RX64M - 144pin/R5F564MFDxFB"));
		result.getElements().add(createDevice("R5F564MLCxLJ", "RX600/RX64M/RX64M - 100pin/R5F564MLCxLJ"));

		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

	private static EclMap createDevice(String name, String target) {
		EclMapEntry deviceName = createInfoEntry("deviceName", name);
		EclMapEntry deviceTarget = createInfoEntry("deviceTarget", target);

		EclMap map = CoreFactory.eINSTANCE.createEclMap();
		map.getEntries().add(deviceName);
		map.getEntries().add(deviceTarget);
		return map;
	}

	private static EclMapEntry createInfoEntry(String key, String value) {
		EclString keyString = CoreFactory.eINSTANCE.createEclString();
		keyString.setValue(key);
		EclString valueString = CoreFactory.eINSTANCE.createEclString();
		valueString.setValue(value);

		EclMapEntry entry = CoreFactory.eINSTANCE.createEclMapEntry();
		entry.setKey(keyString);
		entry.setValue(valueString);
		return entry;
	}

}
