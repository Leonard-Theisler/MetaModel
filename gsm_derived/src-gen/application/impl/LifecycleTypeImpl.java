/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.LifecycleType;
import application.StateType;
import application.TransitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.LifecycleTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link application.impl.LifecycleTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link application.impl.LifecycleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.LifecycleTypeImpl#getStateXPath <em>State XPath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleTypeImpl extends MinimalEObjectImpl.Container implements LifecycleType {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType state;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected TransitionType transition;

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
	 * The default value of the '{@link #getStateXPath() <em>State XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateXPath()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateXPath() <em>State XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateXPath()
	 * @generated
	 * @ordered
	 */
	protected String stateXPath = STATE_XPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.LIFECYCLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(StateType newState, NotificationChain msgs) {
		StateType oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.LIFECYCLE_TYPE__STATE, oldState, newState);
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
	public void setState(StateType newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject) state).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.LIFECYCLE_TYPE__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.LIFECYCLE_TYPE__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.LIFECYCLE_TYPE__STATE, newState,
					newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(TransitionType newTransition, NotificationChain msgs) {
		TransitionType oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION, oldTransition, newTransition);
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
	public void setTransition(TransitionType newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject) transition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION, null, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject) newTransition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION, null, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION,
					newTransition, newTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.LIFECYCLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateXPath() {
		return stateXPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateXPath(String newStateXPath) {
		String oldStateXPath = stateXPath;
		stateXPath = newStateXPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.LIFECYCLE_TYPE__STATE_XPATH,
					oldStateXPath, stateXPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE:
			return basicSetState(null, msgs);
		case Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION:
			return basicSetTransition(null, msgs);
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
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE:
			return getState();
		case Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION:
			return getTransition();
		case Gsm_derivedPackage.LIFECYCLE_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE_XPATH:
			return getStateXPath();
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
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE:
			setState((StateType) newValue);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION:
			setTransition((TransitionType) newValue);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE_XPATH:
			setStateXPath((String) newValue);
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
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE:
			setState((StateType) null);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION:
			setTransition((TransitionType) null);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE_XPATH:
			setStateXPath(STATE_XPATH_EDEFAULT);
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
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE:
			return state != null;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__TRANSITION:
			return transition != null;
		case Gsm_derivedPackage.LIFECYCLE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.LIFECYCLE_TYPE__STATE_XPATH:
			return STATE_XPATH_EDEFAULT == null ? stateXPath != null : !STATE_XPATH_EDEFAULT.equals(stateXPath);
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
		result.append(", stateXPath: ");
		result.append(stateXPath);
		result.append(')');
		return result.toString();
	}

} //LifecycleTypeImpl
