/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.TransitionType#getAssign <em>Assign</em>}</li>
 *   <li>{@link application.TransitionType#getId <em>Id</em>}</li>
 *   <li>{@link application.TransitionType#getName <em>Name</em>}</li>
 *   <li>{@link application.TransitionType#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link application.TransitionType#getTargetStateIds <em>Target State Ids</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getTransitionType()
 * @model extendedMetaData="name='Transition_._type' kind='elementOnly'"
 * @generated
 */
public interface TransitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
	 * The list contents are of type {@link application.AssignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getTransitionType_Assign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assign' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssignType> getAssign();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getTransitionType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.TransitionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see application.Gsm_derivedPackage#getTransitionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.TransitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see application.Gsm_derivedPackage#getTransitionType_ServiceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceId'"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link application.TransitionType#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Target State Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State Ids</em>' attribute.
	 * @see #setTargetStateIds(String)
	 * @see application.Gsm_derivedPackage#getTransitionType_TargetStateIds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='targetStateIds'"
	 * @generated
	 */
	String getTargetStateIds();

	/**
	 * Sets the value of the '{@link application.TransitionType#getTargetStateIds <em>Target State Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State Ids</em>' attribute.
	 * @see #getTargetStateIds()
	 * @generated
	 */
	void setTargetStateIds(String value);

} // TransitionType
