/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.FlowModelType#getFlow <em>Flow</em>}</li>
 *   <li>{@link application.FlowModelType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getFlowModelType()
 * @model extendedMetaData="name='FlowModel_._type' kind='elementOnly'"
 * @generated
 */
public interface FlowModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference.
	 * @see #setFlow(FlowType)
	 * @see application.Gsm_derivedPackage#getFlowModelType_Flow()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Flow' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowType getFlow();

	/**
	 * Sets the value of the '{@link application.FlowModelType#getFlow <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' containment reference.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(FlowType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getFlowModelType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.FlowModelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FlowModelType
