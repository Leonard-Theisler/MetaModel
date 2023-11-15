/**
 */
package application.impl;

import application.FlowWireType;
import application.Gsm_derivedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Wire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.FlowWireTypeImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link application.impl.FlowWireTypeImpl#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowWireTypeImpl extends MinimalEObjectImpl.Container implements FlowWireType {
	/**
	 * The default value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected String sourceId = SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected String targetId = TARGET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowWireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.FLOW_WIRE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(String newSourceId) {
		String oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FLOW_WIRE_TYPE__SOURCE_ID,
					oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(String newTargetId) {
		String oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FLOW_WIRE_TYPE__TARGET_ID,
					oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__SOURCE_ID:
			return getSourceId();
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__TARGET_ID:
			return getTargetId();
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
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__SOURCE_ID:
			setSourceId((String) newValue);
			return;
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__TARGET_ID:
			setTargetId((String) newValue);
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
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__SOURCE_ID:
			setSourceId(SOURCE_ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__TARGET_ID:
			setTargetId(TARGET_ID_EDEFAULT);
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
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__SOURCE_ID:
			return SOURCE_ID_EDEFAULT == null ? sourceId != null : !SOURCE_ID_EDEFAULT.equals(sourceId);
		case Gsm_derivedPackage.FLOW_WIRE_TYPE__TARGET_ID:
			return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
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
		result.append(" (sourceId: ");
		result.append(sourceId);
		result.append(", targetId: ");
		result.append(targetId);
		result.append(')');
		return result.toString();
	}

} //FlowWireTypeImpl
