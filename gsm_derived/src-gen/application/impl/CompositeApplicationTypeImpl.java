/**
 */
package application.impl;

import application.ComponentType;
import application.CompositeApplicationType;
import application.EventModelType;
import application.Gsm_derivedPackage;

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
 * An implementation of the model object '<em><b>Composite Application Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.CompositeApplicationTypeImpl#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link application.impl.CompositeApplicationTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link application.impl.CompositeApplicationTypeImpl#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link application.impl.CompositeApplicationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.CompositeApplicationTypeImpl#getSienaVersion <em>Siena Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeApplicationTypeImpl extends MinimalEObjectImpl.Container implements CompositeApplicationType {
	/**
	 * The cached value of the '{@link #getEventModel() <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventModel()
	 * @generated
	 * @ordered
	 */
	protected EventModelType eventModel;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> component;

	public void setComponent(ComponentType comp) {
		component.clear();
		component.add(comp);
	}

	/**
	 * The default value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppVersion()
	 * @generated
	 * @ordered
	 */
	protected String appVersion = APP_VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getSienaVersion() <em>Siena Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSienaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SIENA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSienaVersion() <em>Siena Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSienaVersion()
	 * @generated
	 * @ordered
	 */
	protected String sienaVersion = SIENA_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeApplicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.COMPOSITE_APPLICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelType getEventModel() {
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventModel(EventModelType newEventModel, NotificationChain msgs) {
		EventModelType oldEventModel = eventModel;
		eventModel = newEventModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL, oldEventModel, newEventModel);
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
	public void setEventModel(EventModelType newEventModel) {
		if (newEventModel != eventModel) {
			NotificationChain msgs = null;
			if (eventModel != null)
				msgs = ((InternalEObject) eventModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL, null,
						msgs);
			if (newEventModel != null)
				msgs = ((InternalEObject) newEventModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL, null,
						msgs);
			msgs = basicSetEventModel(newEventModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL, newEventModel, newEventModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ComponentType>(ComponentType.class, this,
					Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppVersion(String newAppVersion) {
		String oldAppVersion = appVersion;
		appVersion = newAppVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__APP_VERSION, oldAppVersion, appVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSienaVersion() {
		return sienaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSienaVersion(String newSienaVersion) {
		String oldSienaVersion = sienaVersion;
		sienaVersion = newSienaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__SIENA_VERSION, oldSienaVersion, sienaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL:
			return basicSetEventModel(null, msgs);
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL:
			return getEventModel();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT:
			return getComponent();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__APP_VERSION:
			return getAppVersion();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__NAME:
			return getName();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__SIENA_VERSION:
			return getSienaVersion();
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
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL:
			setEventModel((EventModelType) newValue);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__APP_VERSION:
			setAppVersion((String) newValue);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__NAME:
			setName((String) newValue);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__SIENA_VERSION:
			setSienaVersion((String) newValue);
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
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL:
			setEventModel((EventModelType) null);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT:
			getComponent().clear();
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__APP_VERSION:
			setAppVersion(APP_VERSION_EDEFAULT);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__SIENA_VERSION:
			setSienaVersion(SIENA_VERSION_EDEFAULT);
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
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__EVENT_MODEL:
			return eventModel != null;
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__COMPONENT:
			return component != null && !component.isEmpty();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__APP_VERSION:
			return APP_VERSION_EDEFAULT == null ? appVersion != null : !APP_VERSION_EDEFAULT.equals(appVersion);
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE__SIENA_VERSION:
			return SIENA_VERSION_EDEFAULT == null ? sienaVersion != null : !SIENA_VERSION_EDEFAULT.equals(sienaVersion);
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
		result.append(" (appVersion: ");
		result.append(appVersion);
		result.append(", name: ");
		result.append(name);
		result.append(", sienaVersion: ");
		result.append(sienaVersion);
		result.append(')');
		return result.toString();
	}

} //CompositeApplicationTypeImpl
