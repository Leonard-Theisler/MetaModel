/**
 */
package application.impl;

import application.Gsm_derivedPackage;
import application.GuardedStageModelType;
import application.StageType;

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
 * An implementation of the model object '<em><b>Guarded Stage Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.GuardedStageModelTypeImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link application.impl.GuardedStageModelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link application.impl.GuardedStageModelTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link application.impl.GuardedStageModelTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardedStageModelTypeImpl extends MinimalEObjectImpl.Container implements GuardedStageModelType {
	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<StageType> stage;

	public void setStage(StageType s) {
		//stage = new BasicEList<StageType>(20);
		stage.add(s);
	}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedStageModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsm_derivedPackage.Literals.GUARDED_STAGE_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StageType> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<StageType>(StageType.class, this,
					Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE);
		}
		return stage;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__ID,
					oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE:
			return ((InternalEList<?>) getStage()).basicRemove(otherEnd, msgs);
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
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE:
			return getStage();
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__DESCRIPTION:
			return getDescription();
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__ID:
			return getId();
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__NAME:
			return getName();
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
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends StageType>) newValue);
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__ID:
			setId((String) newValue);
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__NAME:
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
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE:
			getStage().clear();
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__NAME:
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
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__STAGE:
			return stage != null && !stage.isEmpty();
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE__NAME:
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
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GuardedStageModelTypeImpl
