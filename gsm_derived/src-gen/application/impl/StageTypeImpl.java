/**
 */
package application.impl;

import application.DataFlowGuardType;
import application.FaultLoggerType;
import application.Gsm_derivedPackage;
import application.MilestoneType;
import application.ProcessFlowGuardType;
import application.StageType;
import application.SubStageType;
import application.TaskType;

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
 * An implementation of the model object '<em><b>Stage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.StageTypeImpl#getDataFlowGuard <em>Data Flow Guard</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getSubStage <em>Sub Stage</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getProcessFlowGuard <em>Process Flow Guard</em>}</li>
 *   <li>{@link application.impl.StageTypeImpl#getFaultLogger <em>Fault Logger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageTypeImpl extends MinimalEObjectImpl.Container implements StageType {
	/**
	 * The cached value of the '{@link #getDataFlowGuard() <em>Data Flow Guard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlowGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowGuardType> dataFlowGuard;

	public void setDFG(DataFlowGuardType dfg) {
		dataFlowGuard.add(dfg);
	}

	/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected EList<MilestoneType> milestone;

	public void setMilestone(MilestoneType mile) {
		milestone.add(mile);
	}

	public StageTypeImpl(DataFlowGuardType dfg, MilestoneType mile) {
		setMilestone(mile);
		setDFG(dfg);
	}

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected TaskType task;

	/**
	 * The cached value of the '{@link #getSubStage() <em>Sub Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStage()
	 * @generated
	 * @ordered
	 */
	protected EList<SubStageType> subStage;

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
	 * The cached value of the '{@link #getProcessFlowGuard() <em>Process Flow Guard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessFlowGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessFlowGuardType> processFlowGuard;

	/**
	 * The cached value of the '{@link #getFaultLogger() <em>Fault Logger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLogger()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultLoggerType> faultLogger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.STAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowGuardType> getDataFlowGuard() {
		if (dataFlowGuard == null) {
			dataFlowGuard = new EObjectContainmentEList<DataFlowGuardType>(DataFlowGuardType.class, this,
					Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD);
		}
		return dataFlowGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MilestoneType> getMilestone() {
		if (milestone == null) {
			milestone = new EObjectContainmentEList<MilestoneType>(MilestoneType.class, this,
					Gsm_derivedPackage.STAGE_TYPE__MILESTONE);
		}
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(TaskType newTask, NotificationChain msgs) {
		TaskType oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.STAGE_TYPE__TASK, oldTask, newTask);
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
	public void setTask(TaskType newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject) task).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.STAGE_TYPE__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject) newTask).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.STAGE_TYPE__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.STAGE_TYPE__TASK, newTask,
					newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubStageType> getSubStage() {
		if (subStage == null) {
			subStage = new EObjectContainmentEList<SubStageType>(SubStageType.class, this,
					Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE);
		}
		return subStage;
	}
	
	public void setSubstage(SubStageType substage) {
		subStage.add(substage);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.STAGE_TYPE__DESCRIPTION,
					oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.STAGE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.STAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessFlowGuardType> getProcessFlowGuard() {
		if (processFlowGuard == null) {
			processFlowGuard = new EObjectContainmentEList<ProcessFlowGuardType>(ProcessFlowGuardType.class, this,
					Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD);
		}
		return processFlowGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultLoggerType> getFaultLogger() {
		if (faultLogger == null) {
			faultLogger = new EObjectContainmentEList<FaultLoggerType>(FaultLoggerType.class, this,
					Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER);
		}
		return faultLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD:
			return ((InternalEList<?>) getDataFlowGuard()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.STAGE_TYPE__MILESTONE:
			return ((InternalEList<?>) getMilestone()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.STAGE_TYPE__TASK:
			return basicSetTask(null, msgs);
		case Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE:
			return ((InternalEList<?>) getSubStage()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD:
			return ((InternalEList<?>) getProcessFlowGuard()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER:
			return ((InternalEList<?>) getFaultLogger()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD:
			return getDataFlowGuard();
		case Gsm_derivedPackage.STAGE_TYPE__MILESTONE:
			return getMilestone();
		case Gsm_derivedPackage.STAGE_TYPE__TASK:
			return getTask();
		case Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE:
			return getSubStage();
		case Gsm_derivedPackage.STAGE_TYPE__DESCRIPTION:
			return getDescription();
		case Gsm_derivedPackage.STAGE_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.STAGE_TYPE__NAME:
			return getName();
		case Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD:
			return getProcessFlowGuard();
		case Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER:
			return getFaultLogger();
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
		case Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD:
			getDataFlowGuard().clear();
			getDataFlowGuard().addAll((Collection<? extends DataFlowGuardType>) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__MILESTONE:
			getMilestone().clear();
			getMilestone().addAll((Collection<? extends MilestoneType>) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__TASK:
			setTask((TaskType) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE:
			getSubStage().clear();
			getSubStage().addAll((Collection<? extends SubStageType>) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__NAME:
			setName((String) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD:
			getProcessFlowGuard().clear();
			getProcessFlowGuard().addAll((Collection<? extends ProcessFlowGuardType>) newValue);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER:
			getFaultLogger().clear();
			getFaultLogger().addAll((Collection<? extends FaultLoggerType>) newValue);
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
		case Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD:
			getDataFlowGuard().clear();
			return;
		case Gsm_derivedPackage.STAGE_TYPE__MILESTONE:
			getMilestone().clear();
			return;
		case Gsm_derivedPackage.STAGE_TYPE__TASK:
			setTask((TaskType) null);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE:
			getSubStage().clear();
			return;
		case Gsm_derivedPackage.STAGE_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD:
			getProcessFlowGuard().clear();
			return;
		case Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER:
			getFaultLogger().clear();
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
		case Gsm_derivedPackage.STAGE_TYPE__DATA_FLOW_GUARD:
			return dataFlowGuard != null && !dataFlowGuard.isEmpty();
		case Gsm_derivedPackage.STAGE_TYPE__MILESTONE:
			return milestone != null && !milestone.isEmpty();
		case Gsm_derivedPackage.STAGE_TYPE__TASK:
			return task != null;
		case Gsm_derivedPackage.STAGE_TYPE__SUB_STAGE:
			return subStage != null && !subStage.isEmpty();
		case Gsm_derivedPackage.STAGE_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Gsm_derivedPackage.STAGE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.STAGE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Gsm_derivedPackage.STAGE_TYPE__PROCESS_FLOW_GUARD:
			return processFlowGuard != null && !processFlowGuard.isEmpty();
		case Gsm_derivedPackage.STAGE_TYPE__FAULT_LOGGER:
			return faultLogger != null && !faultLogger.isEmpty();
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
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StageTypeImpl
