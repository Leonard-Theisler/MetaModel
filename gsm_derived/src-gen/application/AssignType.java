/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.AssignType#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getAssignType()
 * @model extendedMetaData="name='Assign_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface AssignType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(MappingType)
	 * @see application.Gsm_derivedPackage#getAssignType_Mapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingType getMapping();

	/**
	 * Sets the value of the '{@link application.AssignType#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(MappingType value);

} // AssignType
