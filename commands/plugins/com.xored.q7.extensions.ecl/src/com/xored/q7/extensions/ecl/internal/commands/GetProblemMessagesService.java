package com.xored.q7.extensions.ecl.internal.commands;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetProblemMessagesService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for (IMarker marker : ResourcesPlugin.getWorkspace().getRoot()
				.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
			context.getOutput().write(marker.getAttribute(IMarker.MESSAGE));
		}
		return Status.OK_STATUS;
	}

}
