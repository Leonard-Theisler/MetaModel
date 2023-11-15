/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.InputMappingType;
import application.InvokeType;

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
 * An implementation of the model object '<em><b>Invoke Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.InvokeTypeImpl#getInputMapping <em>Input Mapping</em>}</li>
 *   <li>{@link application.impl.InvokeTypeImpl#getServiceDefinitionId <em>Service Definition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvokeTypeImpl extends MinimalEObjectImpl.Container implements InvokeType {
	/**
	 * The cached value of the '{@link #getInputMapping() <em>Input Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InputMappingType> inputMapping;

	/**
	 * The default value of the '{@link #getServiceDefinitionId() <em>Service Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DEFINITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDefinitionId() <em>Service Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected String serviceDefinitionId = SERVICE_DEFINITION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.INVOKE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputMappingType> getInputMapping() {
		if (inputMapping == null) {
			inputMapping = new EObjectContainmentEList<InputMappingType>(InputMappingType.class, this,
					Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING);
		}
		return inputMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDefinitionId() {
		return serviceDefinitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDefinitionId(String newServiceDefinitionId) {
		String oldServiceDefinitionId = serviceDefinitionId;
		serviceDefinitionId = newServiceDefinitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.INVOKE_TYPE__SERVICE_DEFINITION_ID,
					oldServiceDefinitionId, serviceDefinitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING:
			return ((InternalEList<?>) getInputMapping()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING:
			return getInputMapping();
		case Gsm_derivedPackage.INVOKE_TYPE__SERVICE_DEFINITION_ID:
			return getServiceDefinitionId();
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
		case Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING:
			getInputMapping().clear();
			getInputMapping().addAll((Collection<? extends InputMappingType>) newValue);
			return;
		case Gsm_derivedPackage.INVOKE_TYPE__SERVICE_DEFINITION_ID:
			setServiceDefinitionId((String) newValue);
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
		case Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING:
			getInputMapping().clear();
			return;
		case Gsm_derivedPackage.INVOKE_TYPE__SERVICE_DEFINITION_ID:
			setServiceDefinitionId(SERVICE_DEFINITION_ID_EDEFAULT);
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
		case Gsm_derivedPackage.INVOKE_TYPE__INPUT_MAPPING:
			return inputMapping != null && !inputMapping.isEmpty();
		case Gsm_derivedPackage.INVOKE_TYPE__SERVICE_DEFINITION_ID:
			return SERVICE_DEFINITION_ID_EDEFAULT == null ? serviceDefinitionId != null
					: !SERVICE_DEFINITION_ID_EDEFAULT.equals(serviceDefinitionId);
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
		result.append(" (serviceDefinitionId: ");
		result.append(serviceDefinitionId);
		result.append(')');
		return result.toString();
	}

} //InvokeTypeImpl
