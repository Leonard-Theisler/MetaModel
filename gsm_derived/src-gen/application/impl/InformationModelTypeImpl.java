/**
 */
package application.impl;

import application.DataItemType;
import application.Gsm_derivedPackage;
import application.InformationModelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.InformationModelTypeImpl#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link application.impl.InformationModelTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.InformationModelTypeImpl#getRootDataItemId <em>Root Data Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationModelTypeImpl extends MinimalEObjectImpl.Container implements InformationModelType {
	/**
	 * The cached value of the '{@link #getDataItem() <em>Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataItem()
	 * @generated
	 * @ordered
	 */
	protected DataItemType dataItem;

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
	 * The default value of the '{@link #getRootDataItemId() <em>Root Data Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDataItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_DATA_ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootDataItemId() <em>Root Data Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDataItemId()
	 * @generated
	 * @ordered
	 */
	protected String rootDataItemId = ROOT_DATA_ITEM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.INFORMATION_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemType getDataItem() {
		return dataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataItem(DataItemType newDataItem, NotificationChain msgs) {
		DataItemType oldDataItem = dataItem;
		dataItem = newDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM, oldDataItem, newDataItem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataItem(DataItemType newDataItem) {
		if (newDataItem != dataItem) {
			NotificationChain msgs = null;
			if (dataItem != null)
				msgs = ((InternalEObject) dataItem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM, null, msgs);
			if (newDataItem != null)
				msgs = ((InternalEObject) newDataItem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM, null, msgs);
			msgs = basicSetDataItem(newDataItem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM,
					newDataItem, newDataItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootDataItemId() {
		return rootDataItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootDataItemId(String newRootDataItemId) {
		String oldRootDataItemId = rootDataItemId;
		rootDataItemId = newRootDataItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID, oldRootDataItemId, rootDataItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM:
			return basicSetDataItem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM:
			return getDataItem();
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID:
			return getRootDataItemId();
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
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM:
			setDataItem((DataItemType) newValue);
			return;
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID:
			setRootDataItemId((String) newValue);
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
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM:
			setDataItem((DataItemType) null);
			return;
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID:
			setRootDataItemId(ROOT_DATA_ITEM_ID_EDEFAULT);
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
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__DATA_ITEM:
			return dataItem != null;
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID:
			return ROOT_DATA_ITEM_ID_EDEFAULT == null ? rootDataItemId != null
					: !ROOT_DATA_ITEM_ID_EDEFAULT.equals(rootDataItemId);
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
		result.append(", rootDataItemId: ");
		result.append(rootDataItemId);
		result.append(')');
		return result.toString();
	}

} //InformationModelTypeImpl
