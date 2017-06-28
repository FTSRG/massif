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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulink Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract EClass represents a reference for a Simulink element. The identifier is a fully qualified
 *  name constructed from a qualifier (the fully qualified name of the parent of the element) and a name.
 * Since a #{simulink.SimulinkElement} can be identified based on its fully qualified name, it is possible
 *  to reference an element by cloning and storing the reference instead of a direct link to the element itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.massif.simulink.SimulinkReference#getElement <em>Element</em>}</li>
 *   <li>{@link hu.bme.mit.massif.simulink.SimulinkReference#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.massif.simulink.SimulinkReference#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSimulinkReference()
 * @model abstract="true"
 * @generated
 */
public interface SimulinkReference extends EObject {
	/**
     * Returns the value of the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' reference.
     * @see #setElement(SimulinkElement)
     * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSimulinkReference_Element()
     * @model
     * @generated
     */
	SimulinkElement getElement();

	/**
     * Sets the value of the '{@link hu.bme.mit.massif.simulink.SimulinkReference#getElement <em>Element</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' reference.
     * @see #getElement()
     * @generated
     */
	void setElement(SimulinkElement value);

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSimulinkReference_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link hu.bme.mit.massif.simulink.SimulinkReference#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifier</em>' attribute.
     * @see #setQualifier(String)
     * @see hu.bme.mit.massif.simulink.SimulinkPackage#getSimulinkReference_Qualifier()
     * @model
     * @generated
     */
	String getQualifier();

	/**
     * Sets the value of the '{@link hu.bme.mit.massif.simulink.SimulinkReference#getQualifier <em>Qualifier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifier</em>' attribute.
     * @see #getQualifier()
     * @generated
     */
	void setQualifier(String value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model kind="operation"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(qualifier != null)\r\n\treturn qualifier+\"/\"+name;\r\nelse \r\n\treturn name;'"
     * @generated
     */
	String getFQN();

} // SimulinkReference
