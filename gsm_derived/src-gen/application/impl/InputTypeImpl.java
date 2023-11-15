/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.InputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.InputTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link application.impl.InputTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.InputTypeImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link application.impl.InputTypeImpl#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputTypeImpl extends MinimalEObjectImpl.Container implements InputType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected String rootElement = ROOT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaUri() <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaUri() <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUri()
	 * @generated
	 * @ordered
	 */
	protected String schemaUri = SCHEMA_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.INPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INPUT_TYPE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INPUT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(String newRootElement) {
		String oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT,
					oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUri() {
		return schemaUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUri(String newSchemaUri) {
		String oldSchemaUri = schemaUri;
		schemaUri = newSchemaUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI,
					oldSchemaUri, schemaUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Gsm_derivedPackage.INPUT_TYPE__VALUE:
			return getValue();
		case Gsm_derivedPackage.INPUT_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT:
			return getRootElement();
		case Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI:
			return getSchemaUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Gsm_derivedPackage.INPUT_TYPE__VALUE:
			setValue((String) newValue);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT:
			setRootElement((String) newValue);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI:
			setSchemaUri((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Gsm_derivedPackage.INPUT_TYPE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT:
			setRootElement(ROOT_ELEMENT_EDEFAULT);
			return;
		case Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI:
			setSchemaUri(SCHEMA_URI_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Gsm_derivedPackage.INPUT_TYPE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case Gsm_derivedPackage.INPUT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT:
			return ROOT_ELEMENT_EDEFAULT == null ? rootElement != null : !ROOT_ELEMENT_EDEFAULT.equals(rootElement);
		case Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI:
			return SCHEMA_URI_EDEFAULT == null ? schemaUri != null : !SCHEMA_URI_EDEFAULT.equals(schemaUri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", id: ");
		result.append(id);
		result.append(", rootElement: ");
		result.append(rootElement);
		result.append(", schemaUri: ");
		result.append(schemaUri);
		result.append(')');
		return result.toString();
	}

} //InputTypeImpl
