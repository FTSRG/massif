/*******************************************************************************
 * Copyright (c) 2010, 2014, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Peter Lunk - initial API and implementation 
 *******************************************************************************/
package hu.bme.mit.massif.communication.localscript;

import java.util.Map;

import br.com.embraer.massif.commandevaluation.commands.MatlabController;
import hu.bme.mit.massif.communication.ICommandEvaluator;
import hu.bme.mit.massif.communication.ICommandEvaluatorFactory;

/**
 * This class is responsible for returning the appropriate object with the ICommandEvaluator interface for command
 * execution.
 */
public class LocalScriptEvaluatorFactory implements ICommandEvaluatorFactory {

	@Override
	public ICommandEvaluator createCommandEvaluator(
			Map<String, Object> parameters) {
	    return new LocalScriptEvaluator(new MatlabController());
	}

	@Override
	public String getConnectorName() {
		return "LocalScript";
	}

}
