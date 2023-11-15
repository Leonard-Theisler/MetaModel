/**
 */
package application.impl;

import application.FlowType;
import application.FlowWireType;
import application.Gsm_derivedPackage;
import application.TaskType;
import application.VariableType;

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
 * An implementation of the model object '<em><b>Flow Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.FlowTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link application.impl.FlowTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link application.impl.FlowTypeImpl#getFlowWire <em>Flow Wire</em>}</li>
 *   <li>{@link application.impl.FlowTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.FlowTypeImpl#getServiceId <em>Service Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowTypeImpl extends MinimalEObjectImpl.Container implements FlowType {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableType> variable;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskType> task;

	/**
	 * The cached value of the '{@link #getFlowWire() <em>Flow Wire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowWire()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowWireType> flowWire;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.FLOW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<VariableType>(VariableType.class, this,
					Gsm_derivedPackage.FLOW_TYPE__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskType> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<TaskType>(TaskType.class, this, Gsm_derivedPackage.FLOW_TYPE__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowWireType> getFlowWire() {
		if (flowWire == null) {
			flowWire = new EObjectContainmentEList<FlowWireType>(FlowWireType.class, this,
					Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE);
		}
		return flowWire;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FLOW_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FLOW_TYPE__SERVICE_ID,
					oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.FLOW_TYPE__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.FLOW_TYPE__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
		case Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE:
			return ((InternalEList<?>) getFlowWire()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.FLOW_TYPE__VARIABLE:
			return getVariable();
		case Gsm_derivedPackage.FLOW_TYPE__TASK:
			return getTask();
		case Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE:
			return getFlowWire();
		case Gsm_derivedPackage.FLOW_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.FLOW_TYPE__SERVICE_ID:
			return getServiceId();
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
		case Gsm_derivedPackage.FLOW_TYPE__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends VariableType>) newValue);
			return;
		case Gsm_derivedPackage.FLOW_TYPE__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends TaskType>) newValue);
			return;
		case Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE:
			getFlowWire().clear();
			getFlowWire().addAll((Collection<? extends FlowWireType>) newValue);
			return;
		case Gsm_derivedPackage.FLOW_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.FLOW_TYPE__SERVICE_ID:
			setServiceId((String) newValue);
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
		case Gsm_derivedPackage.FLOW_TYPE__VARIABLE:
			getVariable().clear();
			return;
		case Gsm_derivedPackage.FLOW_TYPE__TASK:
			getTask().clear();
			return;
		case Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE:
			getFlowWire().clear();
			return;
		case Gsm_derivedPackage.FLOW_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.FLOW_TYPE__SERVICE_ID:
			setServiceId(SERVICE_ID_EDEFAULT);
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
		case Gsm_derivedPackage.FLOW_TYPE__VARIABLE:
			return variable != null && !variable.isEmpty();
		case Gsm_derivedPackage.FLOW_TYPE__TASK:
			return task != null && !task.isEmpty();
		case Gsm_derivedPackage.FLOW_TYPE__FLOW_WIRE:
			return flowWire != null && !flowWire.isEmpty();
		case Gsm_derivedPackage.FLOW_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.FLOW_TYPE__SERVICE_ID:
			return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
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
		result.append(", serviceId: ");
		result.append(serviceId);
		result.append(')');
		return result.toString();
	}

} //FlowTypeImpl
