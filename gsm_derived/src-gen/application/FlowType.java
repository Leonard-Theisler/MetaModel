/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.FlowType#getVariable <em>Variable</em>}</li>
 *   <li>{@link application.FlowType#getTask <em>Task</em>}</li>
 *   <li>{@link application.FlowType#getFlowWire <em>Flow Wire</em>}</li>
 *   <li>{@link application.FlowType#getId <em>Id</em>}</li>
 *   <li>{@link application.FlowType#getServiceId <em>Service Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getFlowType()
 * @model extendedMetaData="name='Flow_._type' kind='elementOnly'"
 * @generated
 */
public interface FlowType extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link application.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getFlowType_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VariableType> getVariable();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link application.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getFlowType_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaskType> getTask();

	/**
	 * Returns the value of the '<em><b>Flow Wire</b></em>' containment reference list.
	 * The list contents are of type {@link application.FlowWireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Wire</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getFlowType_FlowWire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FlowWire' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlowWireType> getFlowWire();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getFlowType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.FlowType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see application.Gsm_derivedPackage#getFlowType_ServiceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceId'"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link application.FlowType#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

} // FlowType
