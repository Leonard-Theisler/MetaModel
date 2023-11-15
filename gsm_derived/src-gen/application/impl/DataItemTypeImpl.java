/**
 */
package application.impl;

import application.DataItemType;
import application.Gsm_derivedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.DataItemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.DataItemTypeImpl#getListElement <em>List Element</em>}</li>
 *   <li>{@link application.impl.DataItemTypeImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link application.impl.DataItemTypeImpl#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataItemTypeImpl extends MinimalEObjectImpl.Container implements DataItemType {
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
	 * The default value of the '{@link #getListElement() <em>List Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElement()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListElement() <em>List Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElement()
	 * @generated
	 * @ordered
	 */
	protected String listElement = LIST_ELEMENT_EDEFAULT;

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
	public DataItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.DATA_ITEM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.DATA_ITEM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListElement() {
		return listElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListElement(String newListElement) {
		String oldListElement = listElement;
		listElement = newListElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.DATA_ITEM_TYPE__LIST_ELEMENT,
					oldListElement, listElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.DATA_ITEM_TYPE__ROOT_ELEMENT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.DATA_ITEM_TYPE__SCHEMA_URI,
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
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.DATA_ITEM_TYPE__LIST_ELEMENT:
			return getListElement();
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ROOT_ELEMENT:
			return getRootElement();
		case Gsm_derivedPackage.DATA_ITEM_TYPE__SCHEMA_URI:
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
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__LIST_ELEMENT:
			setListElement((String) newValue);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ROOT_ELEMENT:
			setRootElement((String) newValue);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__SCHEMA_URI:
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
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__LIST_ELEMENT:
			setListElement(LIST_ELEMENT_EDEFAULT);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ROOT_ELEMENT:
			setRootElement(ROOT_ELEMENT_EDEFAULT);
			return;
		case Gsm_derivedPackage.DATA_ITEM_TYPE__SCHEMA_URI:
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
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.DATA_ITEM_TYPE__LIST_ELEMENT:
			return LIST_ELEMENT_EDEFAULT == null ? listElement != null : !LIST_ELEMENT_EDEFAULT.equals(listElement);
		case Gsm_derivedPackage.DATA_ITEM_TYPE__ROOT_ELEMENT:
			return ROOT_ELEMENT_EDEFAULT == null ? rootElement != null : !ROOT_ELEMENT_EDEFAULT.equals(rootElement);
		case Gsm_derivedPackage.DATA_ITEM_TYPE__SCHEMA_URI:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", listElement: ");
		result.append(listElement);
		result.append(", rootElement: ");
		result.append(rootElement);
		result.append(", schemaUri: ");
		result.append(schemaUri);
		result.append(')');
		return result.toString();
	}

} //DataItemTypeImpl
