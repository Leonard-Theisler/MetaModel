/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.SourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.SourceTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link application.impl.SourceTypeImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link application.impl.SourceTypeImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link application.impl.SourceTypeImpl#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends MinimalEObjectImpl.Container implements SourceType {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

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
	protected SourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.SOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.SOURCE_TYPE__EXPRESSION,
					oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.SOURCE_TYPE__REF_TYPE, oldRefType,
					refType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.SOURCE_TYPE__SOURCE_ID,
					oldSourceId, sourceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.SOURCE_TYPE__XPATH, oldXPath,
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
		case Gsm_derivedPackage.SOURCE_TYPE__EXPRESSION:
			return getExpression();
		case Gsm_derivedPackage.SOURCE_TYPE__REF_TYPE:
			return getRefType();
		case Gsm_derivedPackage.SOURCE_TYPE__SOURCE_ID:
			return getSourceId();
		case Gsm_derivedPackage.SOURCE_TYPE__XPATH:
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
		case Gsm_derivedPackage.SOURCE_TYPE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__REF_TYPE:
			setRefType((String) newValue);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__SOURCE_ID:
			setSourceId((String) newValue);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__XPATH:
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
		case Gsm_derivedPackage.SOURCE_TYPE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__REF_TYPE:
			setRefType(REF_TYPE_EDEFAULT);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__SOURCE_ID:
			setSourceId(SOURCE_ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.SOURCE_TYPE__XPATH:
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
		case Gsm_derivedPackage.SOURCE_TYPE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case Gsm_derivedPackage.SOURCE_TYPE__REF_TYPE:
			return REF_TYPE_EDEFAULT == null ? refType != null : !REF_TYPE_EDEFAULT.equals(refType);
		case Gsm_derivedPackage.SOURCE_TYPE__SOURCE_ID:
			return SOURCE_ID_EDEFAULT == null ? sourceId != null : !SOURCE_ID_EDEFAULT.equals(sourceId);
		case Gsm_derivedPackage.SOURCE_TYPE__XPATH:
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", refType: ");
		result.append(refType);
		result.append(", sourceId: ");
		result.append(sourceId);
		result.append(", xPath: ");
		result.append(xPath);
		result.append(')');
		return result.toString();
	}

} //SourceTypeImpl
