/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.ComponentType#getInformationModel <em>Information Model</em>}</li>
 *   <li>{@link application.ComponentType#getLifecycleModel <em>Lifecycle Model</em>}</li>
 *   <li>{@link application.ComponentType#getDataAccessModel <em>Data Access Model</em>}</li>
 *   <li>{@link application.ComponentType#getFlowModel <em>Flow Model</em>}</li>
 *   <li>{@link application.ComponentType#getGuardedStageModel <em>Guarded Stage Model</em>}</li>
 *   <li>{@link application.ComponentType#getAccessControlModel <em>Access Control Model</em>}</li>
 *   <li>{@link application.ComponentType#getId <em>Id</em>}</li>
 *   <li>{@link application.ComponentType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getComponentType()
 * @model extendedMetaData="name='Component_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Information Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Model</em>' containment reference.
	 * @see #setInformationModel(InformationModelType)
	 * @see application.Gsm_derivedPackage#getComponentType_InformationModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InformationModel' namespace='##targetNamespace'"
	 * @generated
	 */
	InformationModelType getInformationModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getInformationModel <em>Information Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Model</em>' containment reference.
	 * @see #getInformationModel()
	 * @generated
	 */
	void setInformationModel(InformationModelType value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Model</em>' containment reference.
	 * @see #setLifecycleModel(LifecycleModelType)
	 * @see application.Gsm_derivedPackage#getComponentType_LifecycleModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LifecycleModel' namespace='##targetNamespace'"
	 * @generated
	 */
	LifecycleModelType getLifecycleModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getLifecycleModel <em>Lifecycle Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Model</em>' containment reference.
	 * @see #getLifecycleModel()
	 * @generated
	 */
	void setLifecycleModel(LifecycleModelType value);

	/**
	 * Returns the value of the '<em><b>Data Access Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Access Model</em>' containment reference.
	 * @see #setDataAccessModel(DataAccessModelType)
	 * @see application.Gsm_derivedPackage#getComponentType_DataAccessModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataAccessModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DataAccessModelType getDataAccessModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getDataAccessModel <em>Data Access Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Access Model</em>' containment reference.
	 * @see #getDataAccessModel()
	 * @generated
	 */
	void setDataAccessModel(DataAccessModelType value);

	/**
	 * Returns the value of the '<em><b>Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Model</em>' containment reference.
	 * @see #setFlowModel(FlowModelType)
	 * @see application.Gsm_derivedPackage#getComponentType_FlowModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FlowModel' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowModelType getFlowModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getFlowModel <em>Flow Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Model</em>' containment reference.
	 * @see #getFlowModel()
	 * @generated
	 */
	void setFlowModel(FlowModelType value);

	/**
	 * Returns the value of the '<em><b>Guarded Stage Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarded Stage Model</em>' containment reference.
	 * @see #setGuardedStageModel(GuardedStageModelType)
	 * @see application.Gsm_derivedPackage#getComponentType_GuardedStageModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GuardedStageModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GuardedStageModelType getGuardedStageModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getGuardedStageModel <em>Guarded Stage Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarded Stage Model</em>' containment reference.
	 * @see #getGuardedStageModel()
	 * @generated
	 */
	void setGuardedStageModel(GuardedStageModelType value);

	/**
	 * Returns the value of the '<em><b>Access Control Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control Model</em>' attribute.
	 * @see #setAccessControlModel(String)
	 * @see application.Gsm_derivedPackage#getComponentType_AccessControlModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AccessControlModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessControlModel();

	/**
	 * Sets the value of the '{@link application.ComponentType#getAccessControlModel <em>Access Control Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control Model</em>' attribute.
	 * @see #getAccessControlModel()
	 * @generated
	 */
	void setAccessControlModel(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getComponentType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.ComponentType#getId <em>Id</em>}' attribute.
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
	 * @see application.Gsm_derivedPackage#getComponentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentType
