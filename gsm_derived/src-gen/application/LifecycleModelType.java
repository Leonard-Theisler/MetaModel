/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.LifecycleModelType#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link application.LifecycleModelType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getLifecycleModelType()
 * @model extendedMetaData="name='LifecycleModel_._type' kind='elementOnly'"
 * @generated
 */
public interface LifecycleModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(LifecycleType)
	 * @see application.Gsm_derivedPackage#getLifecycleModelType_Lifecycle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lifecycle' namespace='##targetNamespace'"
	 * @generated
	 */
	LifecycleType getLifecycle();

	/**
	 * Sets the value of the '{@link application.LifecycleModelType#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(LifecycleType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getLifecycleModelType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.LifecycleModelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LifecycleModelType
