/**
 */
package application.impl;

import application.ComponentType;
import application.DataAccessModelType;
import application.FlowModelType;
import application.Gsm_derivedPackage;
import application.GuardedStageModelType;
import application.InformationModelType;
import application.LifecycleModelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ComponentTypeImpl#getInformationModel <em>Information Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getLifecycleModel <em>Lifecycle Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getDataAccessModel <em>Data Access Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getFlowModel <em>Flow Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getGuardedStageModel <em>Guarded Stage Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getAccessControlModel <em>Access Control Model</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
	/**
	 * The cached value of the '{@link #getInformationModel() <em>Information Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationModel()
	 * @generated
	 * @ordered
	 */
	protected InformationModelType informationModel;

	/**
	 * The cached value of the '{@link #getLifecycleModel() <em>Lifecycle Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleModel()
	 * @generated
	 * @ordered
	 */
	protected LifecycleModelType lifecycleModel;

	/**
	 * The cached value of the '{@link #getDataAccessModel() <em>Data Access Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAccessModel()
	 * @generated
	 * @ordered
	 */
	protected DataAccessModelType dataAccessModel;

	/**
	 * The cached value of the '{@link #getFlowModel() <em>Flow Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowModel()
	 * @generated
	 * @ordered
	 */
	protected FlowModelType flowModel;

	/**
	 * The cached value of the '{@link #getGuardedStageModel() <em>Guarded Stage Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardedStageModel()
	 * @generated
	 * @ordered
	 */
	protected GuardedStageModelType guardedStageModel;

	/**
	 * The default value of the '{@link #getAccessControlModel() <em>Access Control Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControlModel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_CONTROL_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessControlModel() <em>Access Control Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControlModel()
	 * @generated
	 * @ordered
	 */
	protected String accessControlModel = ACCESS_CONTROL_MODEL_EDEFAULT;

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
	public ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationModelType getInformationModel() {
		return informationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationModel(InformationModelType newInformationModel,
			NotificationChain msgs) {
		InformationModelType oldInformationModel = informationModel;
		informationModel = newInformationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL, oldInformationModel, newInformationModel);
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
	public void setInformationModel(InformationModelType newInformationModel) {
		if (newInformationModel != informationModel) {
			NotificationChain msgs = null;
			if (informationModel != null)
				msgs = ((InternalEObject) informationModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL, null, msgs);
			if (newInformationModel != null)
				msgs = ((InternalEObject) newInformationModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL, null, msgs);
			msgs = basicSetInformationModel(newInformationModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL,
					newInformationModel, newInformationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleModelType getLifecycleModel() {
		return lifecycleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycleModel(LifecycleModelType newLifecycleModel, NotificationChain msgs) {
		LifecycleModelType oldLifecycleModel = lifecycleModel;
		lifecycleModel = newLifecycleModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL, oldLifecycleModel, newLifecycleModel);
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
	public void setLifecycleModel(LifecycleModelType newLifecycleModel) {
		if (newLifecycleModel != lifecycleModel) {
			NotificationChain msgs = null;
			if (lifecycleModel != null)
				msgs = ((InternalEObject) lifecycleModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL, null, msgs);
			if (newLifecycleModel != null)
				msgs = ((InternalEObject) newLifecycleModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL, null, msgs);
			msgs = basicSetLifecycleModel(newLifecycleModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL,
					newLifecycleModel, newLifecycleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessModelType getDataAccessModel() {
		return dataAccessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAccessModel(DataAccessModelType newDataAccessModel, NotificationChain msgs) {
		DataAccessModelType oldDataAccessModel = dataAccessModel;
		dataAccessModel = newDataAccessModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL, oldDataAccessModel, newDataAccessModel);
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
	public void setDataAccessModel(DataAccessModelType newDataAccessModel) {
		if (newDataAccessModel != dataAccessModel) {
			NotificationChain msgs = null;
			if (dataAccessModel != null)
				msgs = ((InternalEObject) dataAccessModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL, null, msgs);
			if (newDataAccessModel != null)
				msgs = ((InternalEObject) newDataAccessModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL, null, msgs);
			msgs = basicSetDataAccessModel(newDataAccessModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL,
					newDataAccessModel, newDataAccessModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowModelType getFlowModel() {
		return flowModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowModel(FlowModelType newFlowModel, NotificationChain msgs) {
		FlowModelType oldFlowModel = flowModel;
		flowModel = newFlowModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL, oldFlowModel, newFlowModel);
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
	public void setFlowModel(FlowModelType newFlowModel) {
		if (newFlowModel != flowModel) {
			NotificationChain msgs = null;
			if (flowModel != null)
				msgs = ((InternalEObject) flowModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL, null, msgs);
			if (newFlowModel != null)
				msgs = ((InternalEObject) newFlowModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL, null, msgs);
			msgs = basicSetFlowModel(newFlowModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL,
					newFlowModel, newFlowModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedStageModelType getGuardedStageModel() {
		return guardedStageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardedStageModel(GuardedStageModelType newGuardedStageModel,
			NotificationChain msgs) {
		GuardedStageModelType oldGuardedStageModel = guardedStageModel;
		guardedStageModel = newGuardedStageModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL, oldGuardedStageModel, newGuardedStageModel);
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
	public void setGuardedStageModel(GuardedStageModelType newGuardedStageModel) {
		if (newGuardedStageModel != guardedStageModel) {
			NotificationChain msgs = null;
			if (guardedStageModel != null)
				msgs = ((InternalEObject) guardedStageModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL, null, msgs);
			if (newGuardedStageModel != null)
				msgs = ((InternalEObject) newGuardedStageModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL, null, msgs);
			msgs = basicSetGuardedStageModel(newGuardedStageModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL, newGuardedStageModel,
					newGuardedStageModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessControlModel() {
		return accessControlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControlModel(String newAccessControlModel) {
		String oldAccessControlModel = accessControlModel;
		accessControlModel = newAccessControlModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPONENT_TYPE__ACCESS_CONTROL_MODEL, oldAccessControlModel,
					accessControlModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPONENT_TYPE__NAME, oldName,
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
		case Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL:
			return basicSetInformationModel(null, msgs);
		case Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL:
			return basicSetLifecycleModel(null, msgs);
		case Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL:
			return basicSetDataAccessModel(null, msgs);
		case Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL:
			return basicSetFlowModel(null, msgs);
		case Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL:
			return basicSetGuardedStageModel(null, msgs);
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
		case Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL:
			return getInformationModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL:
			return getLifecycleModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL:
			return getDataAccessModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL:
			return getFlowModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL:
			return getGuardedStageModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__ACCESS_CONTROL_MODEL:
			return getAccessControlModel();
		case Gsm_derivedPackage.COMPONENT_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.COMPONENT_TYPE__NAME:
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
		case Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL:
			setInformationModel((InformationModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL:
			setLifecycleModel((LifecycleModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL:
			setDataAccessModel((DataAccessModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL:
			setFlowModel((FlowModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL:
			setGuardedStageModel((GuardedStageModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__ACCESS_CONTROL_MODEL:
			setAccessControlModel((String) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__NAME:
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
		case Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL:
			setInformationModel((InformationModelType) null);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL:
			setLifecycleModel((LifecycleModelType) null);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL:
			setDataAccessModel((DataAccessModelType) null);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL:
			setFlowModel((FlowModelType) null);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL:
			setGuardedStageModel((GuardedStageModelType) null);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__ACCESS_CONTROL_MODEL:
			setAccessControlModel(ACCESS_CONTROL_MODEL_EDEFAULT);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.COMPONENT_TYPE__NAME:
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
		case Gsm_derivedPackage.COMPONENT_TYPE__INFORMATION_MODEL:
			return informationModel != null;
		case Gsm_derivedPackage.COMPONENT_TYPE__LIFECYCLE_MODEL:
			return lifecycleModel != null;
		case Gsm_derivedPackage.COMPONENT_TYPE__DATA_ACCESS_MODEL:
			return dataAccessModel != null;
		case Gsm_derivedPackage.COMPONENT_TYPE__FLOW_MODEL:
			return flowModel != null;
		case Gsm_derivedPackage.COMPONENT_TYPE__GUARDED_STAGE_MODEL:
			return guardedStageModel != null;
		case Gsm_derivedPackage.COMPONENT_TYPE__ACCESS_CONTROL_MODEL:
			return ACCESS_CONTROL_MODEL_EDEFAULT == null ? accessControlModel != null
					: !ACCESS_CONTROL_MODEL_EDEFAULT.equals(accessControlModel);
		case Gsm_derivedPackage.COMPONENT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.COMPONENT_TYPE__NAME:
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
		result.append(" (accessControlModel: ");
		result.append(accessControlModel);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
