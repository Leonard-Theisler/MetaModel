/**
 */
package application.impl;

import application.AssignType;
import application.Gsm_derivedPackage;
import application.TransitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.TransitionTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link application.impl.TransitionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.TransitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.TransitionTypeImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link application.impl.TransitionTypeImpl#getTargetStateIds <em>Target State Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionTypeImpl extends MinimalEObjectImpl.Container implements TransitionType {
	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignType> assign;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetStateIds() <em>Target State Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStateIds()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_STATE_IDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetStateIds() <em>Target State Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStateIds()
	 * @generated
	 * @ordered
	 */
	protected String targetStateIds = TARGET_STATE_IDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssignType> getAssign() {
		if (assign == null) {
			assign = new EObjectContainmentEList<AssignType>(AssignType.class, this,
					Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN);
		}
		return assign;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TRANSITION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TRANSITION_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TRANSITION_TYPE__SERVICE_ID,
					oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetStateIds() {
		return targetStateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetStateIds(String newTargetStateIds) {
		String oldTargetStateIds = targetStateIds;
		targetStateIds = newTargetStateIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TRANSITION_TYPE__TARGET_STATE_IDS,
					oldTargetStateIds, targetStateIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN:
			return ((InternalEList<?>) getAssign()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN:
			return getAssign();
		case Gsm_derivedPackage.TRANSITION_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.TRANSITION_TYPE__NAME:
			return getName();
		case Gsm_derivedPackage.TRANSITION_TYPE__SERVICE_ID:
			return getServiceId();
		case Gsm_derivedPackage.TRANSITION_TYPE__TARGET_STATE_IDS:
			return getTargetStateIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN:
			getAssign().clear();
			getAssign().addAll((Collection<? extends AssignType>) newValue);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__NAME:
			setName((String) newValue);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__SERVICE_ID:
			setServiceId((String) newValue);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__TARGET_STATE_IDS:
			setTargetStateIds((String) newValue);
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
		case Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN:
			getAssign().clear();
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__SERVICE_ID:
			setServiceId(SERVICE_ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.TRANSITION_TYPE__TARGET_STATE_IDS:
			setTargetStateIds(TARGET_STATE_IDS_EDEFAULT);
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
		case Gsm_derivedPackage.TRANSITION_TYPE__ASSIGN:
			return assign != null && !assign.isEmpty();
		case Gsm_derivedPackage.TRANSITION_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.TRANSITION_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Gsm_derivedPackage.TRANSITION_TYPE__SERVICE_ID:
			return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
		case Gsm_derivedPackage.TRANSITION_TYPE__TARGET_STATE_IDS:
			return TARGET_STATE_IDS_EDEFAULT == null ? targetStateIds != null
					: !TARGET_STATE_IDS_EDEFAULT.equals(targetStateIds);
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
		result.append(", name: ");
		result.append(name);
		result.append(", serviceId: ");
		result.append(serviceId);
		result.append(", targetStateIds: ");
		result.append(targetStateIds);
		result.append(')');
		return result.toString();
	}

} //TransitionTypeImpl
