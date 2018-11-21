/*******************************************************************************
 * Copyright (c) 2010-2013, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Marton Bur, Abel Hegedus, Akos Horvath - initial API and implementation 
 *******************************************************************************/
package hu.bme.mit.massif.simulink.api.adapter.port;

import java.util.Map;
import java.util.Set;

import hu.bme.mit.massif.communication.datatype.IVisitableMatlabData;
import hu.bme.mit.massif.simulink.Block;
import hu.bme.mit.massif.simulink.InPortBlock;
import hu.bme.mit.massif.simulink.OutPortBlock;
import hu.bme.mit.massif.simulink.Port;
import hu.bme.mit.massif.simulink.PortBlock;
import hu.bme.mit.massif.simulink.api.Importer;

public interface IPortAdapter {

    public Port createPort(Importer importer, Block parent, IVisitableMatlabData currentPortHandle, Map<Double, ? extends Port> inPorts);

    public PortBlock connectToBlock(Port port, IVisitableMatlabData portHandle, Integer portNum,
            Set<InPortBlock> portBlockSet, Set<OutPortBlock> outPortBlockSet, Importer importerApi);

}
