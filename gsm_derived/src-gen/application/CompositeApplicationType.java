/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.CompositeApplicationType#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link application.CompositeApplicationType#getComponent <em>Component</em>}</li>
 *   <li>{@link application.CompositeApplicationType#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link application.CompositeApplicationType#getName <em>Name</em>}</li>
 *   <li>{@link application.CompositeApplicationType#getSienaVersion <em>Siena Version</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getCompositeApplicationType()
 * @model extendedMetaData="name='CompositeApplication_._type' kind='elementOnly'"
 * @generated
 */
public interface CompositeApplicationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Model</em>' containment reference.
	 * @see #setEventModel(EventModelType)
	 * @see application.Gsm_derivedPackage#getCompositeApplicationType_EventModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EventModelType getEventModel();

	/**
	 * Sets the value of the '{@link application.CompositeApplicationType#getEventModel <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Model</em>' containment reference.
	 * @see #getEventModel()
	 * @generated
	 */
	void setEventModel(EventModelType value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link application.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getCompositeApplicationType_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentType> getComponent();

	void setComponent(ComponentType comp);

	/**
	 * Returns the value of the '<em><b>App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Version</em>' attribute.
	 * @see #setAppVersion(String)
	 * @see application.Gsm_derivedPackage#getCompositeApplicationType_AppVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='appVersion'"
	 * @generated
	 */
	String getAppVersion();

	/**
	 * Sets the value of the '{@link application.CompositeApplicationType#getAppVersion <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Version</em>' attribute.
	 * @see #getAppVersion()
	 * @generated
	 */
	void setAppVersion(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see application.Gsm_derivedPackage#getCompositeApplicationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.CompositeApplicationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Siena Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siena Version</em>' attribute.
	 * @see #setSienaVersion(String)
	 * @see application.Gsm_derivedPackage#getCompositeApplicationType_SienaVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sienaVersion'"
	 * @generated
	 */
	String getSienaVersion();

	/**
	 * Sets the value of the '{@link application.CompositeApplicationType#getSienaVersion <em>Siena Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siena Version</em>' attribute.
	 * @see #getSienaVersion()
	 * @generated
	 */
	void setSienaVersion(String value);

} // CompositeApplicationType
