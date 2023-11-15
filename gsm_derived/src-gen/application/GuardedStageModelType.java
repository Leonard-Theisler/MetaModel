/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Stage Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.GuardedStageModelType#getStage <em>Stage</em>}</li>
 *   <li>{@link application.GuardedStageModelType#getDescription <em>Description</em>}</li>
 *   <li>{@link application.GuardedStageModelType#getId <em>Id</em>}</li>
 *   <li>{@link application.GuardedStageModelType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getGuardedStageModelType()
 * @model extendedMetaData="name='GuardedStageModel_._type' kind='elementOnly'"
 * @generated
 */
public interface GuardedStageModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link application.StageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getGuardedStageModelType_Stage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StageType> getStage();

	void setStage(StageType s);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see application.Gsm_derivedPackage#getGuardedStageModelType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link application.GuardedStageModelType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getGuardedStageModelType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.GuardedStageModelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see application.Gsm_derivedPackage#getGuardedStageModelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.GuardedStageModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GuardedStageModelType
