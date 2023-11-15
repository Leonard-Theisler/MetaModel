/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.LifecycleType#getState <em>State</em>}</li>
 *   <li>{@link application.LifecycleType#getTransition <em>Transition</em>}</li>
 *   <li>{@link application.LifecycleType#getId <em>Id</em>}</li>
 *   <li>{@link application.LifecycleType#getStateXPath <em>State XPath</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getLifecycleType()
 * @model extendedMetaData="name='Lifecycle_._type' kind='elementOnly'"
 * @generated
 */
public interface LifecycleType extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(StateType)
	 * @see application.Gsm_derivedPackage#getLifecycleType_State()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='State' namespace='##targetNamespace'"
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link application.LifecycleType#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(TransitionType)
	 * @see application.Gsm_derivedPackage#getLifecycleType_Transition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Transition' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionType getTransition();

	/**
	 * Sets the value of the '{@link application.LifecycleType#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getLifecycleType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.LifecycleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State XPath</em>' attribute.
	 * @see #setStateXPath(String)
	 * @see application.Gsm_derivedPackage#getLifecycleType_StateXPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stateXPath'"
	 * @generated
	 */
	String getStateXPath();

	/**
	 * Sets the value of the '{@link application.LifecycleType#getStateXPath <em>State XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State XPath</em>' attribute.
	 * @see #getStateXPath()
	 * @generated
	 */
	void setStateXPath(String value);

} // LifecycleType
