/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.InvokeType#getInputMapping <em>Input Mapping</em>}</li>
 *   <li>{@link application.InvokeType#getServiceDefinitionId <em>Service Definition Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getInvokeType()
 * @model extendedMetaData="name='Invoke_._type' kind='elementOnly'"
 * @generated
 */
public interface InvokeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link application.InputMappingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Mapping</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getInvokeType_InputMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InputMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InputMappingType> getInputMapping();

	/**
	 * Returns the value of the '<em><b>Service Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition Id</em>' attribute.
	 * @see #setServiceDefinitionId(String)
	 * @see application.Gsm_derivedPackage#getInvokeType_ServiceDefinitionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceDefinitionId'"
	 * @generated
	 */
	String getServiceDefinitionId();

	/**
	 * Sets the value of the '{@link application.InvokeType#getServiceDefinitionId <em>Service Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition Id</em>' attribute.
	 * @see #getServiceDefinitionId()
	 * @generated
	 */
	void setServiceDefinitionId(String value);

} // InvokeType
