/*******************************************************************************
 * Copyright (c) 2010-2013, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Abel Hegedus, Akos Horvath - initial API and implementation 
 *******************************************************************************/
/**
 */
package hu.bme.mit.massif.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This EClass represents a simple connections between a single #{simulink.OutPort} and a single #{simulink.InPort}.
 * The outport can be identified either through the from reference or through the parent #{simulink.MultiConnection}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.massif.simulink.SingleConnection#getParent <em>Parent</em>}</li>
 *   <li>{@link hu.bme.mit.massif.simulink.SingleConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSingleConnection()
 * @model
 * @generated
 */
public interface SingleConnection extends Connection {
	/**
     * Returns the value of the '<em><b>Parent</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.massif.simulink.MultiConnection#getConnections <em>Connections</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' container reference.
     * @see #setParent(MultiConnection)
     * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSingleConnection_Parent()
     * @see hu.bme.mit.massif.simulink.MultiConnection#getConnections
     * @model opposite="connections" transient="false"
     * @generated
     */
	MultiConnection getParent();

	/**
     * Sets the value of the '{@link hu.bme.mit.massif.simulink.SingleConnection#getParent <em>Parent</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' container reference.
     * @see #getParent()
     * @generated
     */
	void setParent(MultiConnection value);

	/**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.massif.simulink.InPort#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(InPort)
     * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSingleConnection_To()
     * @see hu.bme.mit.massif.simulink.InPort#getConnection
     * @model opposite="connection"
     * @generated
     */
	InPort getTo();

	/**
     * Sets the value of the '{@link hu.bme.mit.massif.simulink.SingleConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
	void setTo(InPort value);

} // SingleConnection
