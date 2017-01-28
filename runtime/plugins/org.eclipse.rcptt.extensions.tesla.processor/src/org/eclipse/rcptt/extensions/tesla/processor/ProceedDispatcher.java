/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.rcptt.extensions.tesla.processor;

import org.eclipse.rcptt.tesla.core.context.ContextManagement.Context;
import org.eclipse.rcptt.tesla.core.info.AdvancedInformation;
import org.eclipse.rcptt.tesla.core.info.Q7WaitInfoRoot;
import org.eclipse.rcptt.tesla.core.protocol.IElementProcessorMapper;
import org.eclipse.rcptt.tesla.core.protocol.SelectCommand;
import org.eclipse.rcptt.tesla.core.protocol.SelectResponse;
import org.eclipse.rcptt.tesla.core.protocol.raw.Command;
import org.eclipse.rcptt.tesla.core.protocol.raw.Element;
import org.eclipse.rcptt.tesla.core.protocol.raw.Response;
import org.eclipse.rcptt.tesla.internal.core.AbstractTeslaClient;
import org.eclipse.rcptt.tesla.internal.core.processing.ElementGenerator;
import org.eclipse.rcptt.tesla.internal.core.processing.ITeslaCommandProcessor;
import org.eclipse.rcptt.tesla.internal.ui.processors.ISWTWaitPolicy;

/**
 * 
 * @author idMolotov
 * 
 *         Example of Proceed Dispatcher allows to override control for
 *         test workflow execution in case of not finished 
 *         custom background jobs.
 *
 */
public class ProceedDispatcher implements ITeslaCommandProcessor, ISWTWaitPolicy {

	@Override
	public String getFeatureID() {
		return "com.xored.q7.extensions.tesla.processor.ProceedDispatcher";
	}

	@Override
	public boolean isSelectorSupported(String kind) {
		return false;
	}

	@Override
	public SelectResponse select(SelectCommand cmd, ElementGenerator generator, IElementProcessorMapper mapper) {
		return null;
	}

	@Override
	public boolean isCommandSupported(Command cmd) {
		return false;
	}

	@Override
	public Response executeCommand(Command command, IElementProcessorMapper mapper) {
		return null;
	}

	@Override
	public PreExecuteStatus preExecute(Command command, PreExecuteStatus previousStatus, Q7WaitInfoRoot info) {
		return null;
	}

	@Override
	public void initialize(AbstractTeslaClient client, String id) {
	}

	@Override
	public void postSelect(Element element, IElementProcessorMapper mapper) {

	}

	@Override
	public boolean isInactivityRequired() {
		return false;
	}

	@Override
	public boolean isReadyToProceed(Context context, Q7WaitInfoRoot info) {
		return canProceed(context, info);
	}

	@Override
	public boolean canProceed(Context context, Q7WaitInfoRoot info) {
		/*
		 * TODO implement this function
		 * 
		 * Here you can check is there any background job is not finished and
		 * return FALSE in this case.
		 * 
		 * When you will be ready to proceed - return TRUE;
		 * 
		 */

		return true;
	}

	@Override
	public void clean() {
	}

	@Override
	public void terminate() {
	}

	@Override
	public void checkHang() {
	}

	@Override
	public void collectInformation(AdvancedInformation information, Command lastCommand) {
	}

	@Override
	public void notifyUI() {
	}

	@Override
	public int getPriority() {
		return 0;
	}
}
