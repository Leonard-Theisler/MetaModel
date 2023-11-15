/**
 */
package application.impl;

import application.ConditionType;
import application.Gsm_derivedPackage;
import application.MilestoneType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.MilestoneTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link application.impl.MilestoneTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link application.impl.MilestoneTypeImpl#getEventIds <em>Event Ids</em>}</li>
 *   <li>{@link application.impl.MilestoneTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.MilestoneTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilestoneTypeImpl extends MinimalEObjectImpl.Container implements MilestoneType {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionType condition;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventIds() <em>Event Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventIds()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_IDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventIds() <em>Event Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventIds()
	 * @generated
	 * @ordered
	 */
	protected String eventIds = EVENT_IDS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilestoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.MILESTONE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
		ConditionType oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.MILESTONE_TYPE__CONDITION, oldCondition, newCondition);
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
	public void setCondition(ConditionType newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.MILESTONE_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.MILESTONE_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.MILESTONE_TYPE__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.MILESTONE_TYPE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventIds() {
		return eventIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventIds(String newEventIds) {
		String oldEventIds = eventIds;
		eventIds = newEventIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.MILESTONE_TYPE__EVENT_IDS,
					oldEventIds, eventIds));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.MILESTONE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.MILESTONE_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.MILESTONE_TYPE__CONDITION:
			return basicSetCondition(null, msgs);
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
		case Gsm_derivedPackage.MILESTONE_TYPE__CONDITION:
			return getCondition();
		case Gsm_derivedPackage.MILESTONE_TYPE__DESCRIPTION:
			return getDescription();
		case Gsm_derivedPackage.MILESTONE_TYPE__EVENT_IDS:
			return getEventIds();
		case Gsm_derivedPackage.MILESTONE_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.MILESTONE_TYPE__NAME:
			return getName();
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
		case Gsm_derivedPackage.MILESTONE_TYPE__CONDITION:
			setCondition((ConditionType) newValue);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__EVENT_IDS:
			setEventIds((String) newValue);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__NAME:
			setName((String) newValue);
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
		case Gsm_derivedPackage.MILESTONE_TYPE__CONDITION:
			setCondition((ConditionType) null);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__EVENT_IDS:
			setEventIds(EVENT_IDS_EDEFAULT);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.MILESTONE_TYPE__NAME:
			setName(NAME_EDEFAULT);
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
		case Gsm_derivedPackage.MILESTONE_TYPE__CONDITION:
			return condition != null;
		case Gsm_derivedPackage.MILESTONE_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Gsm_derivedPackage.MILESTONE_TYPE__EVENT_IDS:
			return EVENT_IDS_EDEFAULT == null ? eventIds != null : !EVENT_IDS_EDEFAULT.equals(eventIds);
		case Gsm_derivedPackage.MILESTONE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.MILESTONE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", eventIds: ");
		result.append(eventIds);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MilestoneTypeImpl
