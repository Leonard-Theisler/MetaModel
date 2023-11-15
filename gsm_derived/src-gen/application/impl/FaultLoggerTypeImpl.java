/**
 */
package application.impl;

import application.FaultLoggerType;
import application.Gsm_derivedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Logger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getEventIds <em>Event Ids</em>}</li>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link application.impl.FaultLoggerTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultLoggerTypeImpl extends MinimalEObjectImpl.Container implements FaultLoggerType {
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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

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
	public FaultLoggerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.FAULT_LOGGER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__DESCRIPTION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__EVENT_IDS,
					oldEventIds, eventIds));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__EXPRESSION,
					oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__LANGUAGE,
					oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.FAULT_LOGGER_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__DESCRIPTION:
			return getDescription();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EVENT_IDS:
			return getEventIds();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EXPRESSION:
			return getExpression();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__LANGUAGE:
			return getLanguage();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__NAME:
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
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EVENT_IDS:
			setEventIds((String) newValue);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__NAME:
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
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EVENT_IDS:
			setEventIds(EVENT_IDS_EDEFAULT);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__NAME:
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
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EVENT_IDS:
			return EVENT_IDS_EDEFAULT == null ? eventIds != null : !EVENT_IDS_EDEFAULT.equals(eventIds);
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE__NAME:
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
		result.append(", expression: ");
		result.append(expression);
		result.append(", id: ");
		result.append(id);
		result.append(", language: ");
		result.append(language);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FaultLoggerTypeImpl
