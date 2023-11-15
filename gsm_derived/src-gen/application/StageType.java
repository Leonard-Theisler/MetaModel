/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.StageType#getDataFlowGuard <em>Data Flow Guard</em>}</li>
 *   <li>{@link application.StageType#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link application.StageType#getTask <em>Task</em>}</li>
 *   <li>{@link application.StageType#getSubStage <em>Sub Stage</em>}</li>
 *   <li>{@link application.StageType#getDescription <em>Description</em>}</li>
 *   <li>{@link application.StageType#getId <em>Id</em>}</li>
 *   <li>{@link application.StageType#getName <em>Name</em>}</li>
 *   <li>{@link application.StageType#getProcessFlowGuard <em>Process Flow Guard</em>}</li>
 *   <li>{@link application.StageType#getFaultLogger <em>Fault Logger</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getStageType()
 * @model extendedMetaData="name='Stage_._type' kind='elementOnly'"
 * @generated
 */
public interface StageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Flow Guard</b></em>' containment reference list.
	 * The list contents are of type {@link application.DataFlowGuardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow Guard</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getStageType_DataFlowGuard()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StageGuard' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataFlowGuardType> getDataFlowGuard();

	void setDFG(DataFlowGuardType dfg);

	void setMilestone(MilestoneType milestone);
	
	void setSubstage(SubStageType substage);

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference list.
	 * The list contents are of type {@link application.MilestoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getStageType_Milestone()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Milestone' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MilestoneType> getMilestone();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(TaskType)
	 * @see application.Gsm_derivedPackage#getStageType_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskType getTask();

	/**
	 * Sets the value of the '{@link application.StageType#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskType value);

	/**
	 * Returns the value of the '<em><b>Sub Stage</b></em>' containment reference list.
	 * The list contents are of type {@link application.SubStageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Stage</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getStageType_SubStage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubStage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubStageType> getSubStage();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see application.Gsm_derivedPackage#getStageType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link application.StageType#getDescription <em>Description</em>}' attribute.
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
	 * @see application.Gsm_derivedPackage#getStageType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.StageType#getId <em>Id</em>}' attribute.
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
	 * @see application.Gsm_derivedPackage#getStageType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.StageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Flow Guard</b></em>' containment reference list.
	 * The list contents are of type {@link application.ProcessFlowGuardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Flow Guard</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getStageType_ProcessFlowGuard()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessFlowGuardType> getProcessFlowGuard();

	/**
	 * Returns the value of the '<em><b>Fault Logger</b></em>' containment reference list.
	 * The list contents are of type {@link application.FaultLoggerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Logger</em>' containment reference list.
	 * @see application.Gsm_derivedPackage#getStageType_FaultLogger()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultLoggerType> getFaultLogger();

} // StageType
