/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.TargetType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.TargetTypeImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link application.impl.TargetTypeImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link application.impl.TargetTypeImpl#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetTypeImpl extends MinimalEObjectImpl.Container implements TargetType {
	/**
	 * The default value of the '{@link #getRefType() <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefType()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefType()
	 * @generated
	 * @ordered
	 */
	protected String refType = REF_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getXPath() <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPath() <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPath()
	 * @generated
	 * @ordered
	 */
	protected String xPath = XPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.TARGET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefType() {
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefType(String newRefType) {
		String oldRefType = refType;
		refType = newRefType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TARGET_TYPE__REF_TYPE, oldRefType,
					refType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TARGET_TYPE__TARGET_ID,
					oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPath() {
		return xPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPath(String newXPath) {
		String oldXPath = xPath;
		xPath = newXPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.TARGET_TYPE__XPATH, oldXPath,
					xPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Gsm_derivedPackage.TARGET_TYPE__REF_TYPE:
			return getRefType();
		case Gsm_derivedPackage.TARGET_TYPE__TARGET_ID:
			return getTargetId();
		case Gsm_derivedPackage.TARGET_TYPE__XPATH:
			return getXPath();
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
		case Gsm_derivedPackage.TARGET_TYPE__REF_TYPE:
			setRefType((String) newValue);
			return;
		case Gsm_derivedPackage.TARGET_TYPE__TARGET_ID:
			setTargetId((String) newValue);
			return;
		case Gsm_derivedPackage.TARGET_TYPE__XPATH:
			setXPath((String) newValue);
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
		case Gsm_derivedPackage.TARGET_TYPE__REF_TYPE:
			setRefType(REF_TYPE_EDEFAULT);
			return;
		case Gsm_derivedPackage.TARGET_TYPE__TARGET_ID:
			setTargetId(TARGET_ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.TARGET_TYPE__XPATH:
			setXPath(XPATH_EDEFAULT);
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
		case Gsm_derivedPackage.TARGET_TYPE__REF_TYPE:
			return REF_TYPE_EDEFAULT == null ? refType != null : !REF_TYPE_EDEFAULT.equals(refType);
		case Gsm_derivedPackage.TARGET_TYPE__TARGET_ID:
			return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
		case Gsm_derivedPackage.TARGET_TYPE__XPATH:
			return XPATH_EDEFAULT == null ? xPath != null : !XPATH_EDEFAULT.equals(xPath);
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
		result.append(" (refType: ");
		result.append(refType);
		result.append(", targetId: ");
		result.append(targetId);
		result.append(", xPath: ");
		result.append(xPath);
		result.append(')');
		return result.toString();
	}

} //TargetTypeImpl
