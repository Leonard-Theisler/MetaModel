/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.FlowWireType#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link application.FlowWireType#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getFlowWireType()
 * @model extendedMetaData="name='FlowWire_._type' kind='simple'"
 * @generated
 */
public interface FlowWireType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see application.Gsm_derivedPackage#getFlowWireType_SourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sourceId'"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link application.FlowWireType#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see application.Gsm_derivedPackage#getFlowWireType_TargetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='targetId'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link application.FlowWireType#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

} // FlowWireType
