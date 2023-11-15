/**
 */
package application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see application.Gsm_derivedFactory
 * @model kind="package"
 * @generated
 */
public interface Gsm_derivedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://siena.ibm.com/model/CompositeApplication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gsm_derivedPackage eINSTANCE = application.impl.Gsm_derivedPackageImpl.init();

	/**
	 * The meta object id for the '{@link application.impl.AssignTypeImpl <em>Assign Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.AssignTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getAssignType()
	 * @generated
	 */
	int ASSIGN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_TYPE__MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Assign Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assign Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.CompositeApplicationTypeImpl <em>Composite Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.CompositeApplicationTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getCompositeApplicationType()
	 * @generated
	 */
	int COMPOSITE_APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE__EVENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE__APP_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Siena Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE__SIENA_VERSION = 4;

	/**
	 * The number of structural features of the '<em>Composite Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Composite Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_APPLICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ComponentTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Information Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INFORMATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Lifecycle Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__LIFECYCLE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Data Access Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DATA_ACCESS_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__FLOW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Guarded Stage Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GUARDED_STAGE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Access Control Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ACCESS_CONTROL_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.EventModelTypeImpl <em>Event Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.EventModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getEventModelType()
	 * @generated
	 */
	int EVENT_MODEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Event Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.EventTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ConditionTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DataAccessModelTypeImpl <em>Data Access Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DataAccessModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getDataAccessModelType()
	 * @generated
	 */
	int DATA_ACCESS_MODEL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_MODEL_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Data Access Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Access Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DataItemTypeImpl <em>Data Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DataItemTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getDataItemType()
	 * @generated
	 */
	int DATA_ITEM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>List Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE__LIST_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE__ROOT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Schema Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE__SCHEMA_URI = 3;

	/**
	 * The number of structural features of the '<em>Data Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DocumentRootImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.FlowModelTypeImpl <em>Flow Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.FlowModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getFlowModelType()
	 * @generated
	 */
	int FLOW_MODEL_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MODEL_TYPE__FLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MODEL_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Flow Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MODEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.FlowTypeImpl <em>Flow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.FlowTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getFlowType()
	 * @generated
	 */
	int FLOW_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__TASK = 1;

	/**
	 * The feature id for the '<em><b>Flow Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__FLOW_WIRE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__SERVICE_ID = 4;

	/**
	 * The number of structural features of the '<em>Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.FlowWireTypeImpl <em>Flow Wire Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.FlowWireTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getFlowWireType()
	 * @generated
	 */
	int FLOW_WIRE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_WIRE_TYPE__SOURCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_WIRE_TYPE__TARGET_ID = 1;

	/**
	 * The number of structural features of the '<em>Flow Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_WIRE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_WIRE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.GuardedStageModelTypeImpl <em>Guarded Stage Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.GuardedStageModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getGuardedStageModelType()
	 * @generated
	 */
	int GUARDED_STAGE_MODEL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE__STAGE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Guarded Stage Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Guarded Stage Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_STAGE_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.InformationModelTypeImpl <em>Information Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InformationModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getInformationModelType()
	 * @generated
	 */
	int INFORMATION_MODEL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MODEL_TYPE__DATA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MODEL_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Root Data Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID = 2;

	/**
	 * The number of structural features of the '<em>Information Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MODEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Information Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.InputMappingTypeImpl <em>Input Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InputMappingTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getInputMappingType()
	 * @generated
	 */
	int INPUT_MAPPING_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_TYPE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Input Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MAPPING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InputTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__ROOT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Schema Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__SCHEMA_URI = 3;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.InvokeTypeImpl <em>Invoke Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InvokeTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getInvokeType()
	 * @generated
	 */
	int INVOKE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Input Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TYPE__INPUT_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Service Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TYPE__SERVICE_DEFINITION_ID = 1;

	/**
	 * The number of structural features of the '<em>Invoke Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Invoke Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.LifecycleModelTypeImpl <em>Lifecycle Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.LifecycleModelTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getLifecycleModelType()
	 * @generated
	 */
	int LIFECYCLE_MODEL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_MODEL_TYPE__LIFECYCLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_MODEL_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Lifecycle Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_MODEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lifecycle Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.LifecycleTypeImpl <em>Lifecycle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.LifecycleTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getLifecycleType()
	 * @generated
	 */
	int LIFECYCLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>State XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__STATE_XPATH = 3;

	/**
	 * The number of structural features of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.MappingTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getMappingType()
	 * @generated
	 */
	int MAPPING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.MilestoneTypeImpl <em>Milestone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.MilestoneTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getMilestoneType()
	 * @generated
	 */
	int MILESTONE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Event Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE__EVENT_IDS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Milestone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Milestone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.OutputTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__ROOT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Schema Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__SCHEMA_URI = 3;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.ServiceAdapterTypeImpl <em>Service Adapter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ServiceAdapterTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getServiceAdapterType()
	 * @generated
	 */
	int SERVICE_ADAPTER_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE__EVENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Service Adapter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Adapter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ADAPTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.SourceTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__REF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SOURCE_ID = 2;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__XPATH = 3;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DataFlowGuardTypeImpl <em>Data Flow Guard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DataFlowGuardTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getDataFlowGuardType()
	 * @generated
	 */
	int DATA_FLOW_GUARD_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Event Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__EVENT_IDS = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Data Flow Guard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Data Flow Guard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.StageTypeImpl <em>Stage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.StageTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getStageType()
	 * @generated
	 */
	int STAGE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Data Flow Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__DATA_FLOW_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__MILESTONE = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__TASK = 2;

	/**
	 * The feature id for the '<em><b>Sub Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__SUB_STAGE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Process Flow Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__PROCESS_FLOW_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Fault Logger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE__FAULT_LOGGER = 8;

	/**
	 * The number of structural features of the '<em>Stage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Stage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.StateTypeImpl <em>State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.StateTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE__INITIAL = 1;

	/**
	 * The number of structural features of the '<em>State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.SubStageTypeImpl <em>Sub Stage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.SubStageTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getSubStageType()
	 * @generated
	 */
	int SUB_STAGE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Data Flow Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__DATA_FLOW_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__MILESTONE = 1;

	/**
	 * The feature id for the '<em><b>Sub Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__SUB_STAGE = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__TASK = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Process Flow Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__PROCESS_FLOW_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Fault Logger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE__FAULT_LOGGER = 8;

	/**
	 * The number of structural features of the '<em>Sub Stage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Sub Stage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.TargetTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__REF_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__TARGET_ID = 1;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__XPATH = 2;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.TaskTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ASSIGN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.TransitionTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ASSIGN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SERVICE_ID = 3;

	/**
	 * The feature id for the '<em><b>Target State Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TARGET_STATE_IDS = 4;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.VariableTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.ProcessFlowGuardTypeImpl <em>Process Flow Guard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ProcessFlowGuardTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getProcessFlowGuardType()
	 * @generated
	 */
	int PROCESS_FLOW_GUARD_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE__EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Process Flow Guard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process Flow Guard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.FaultLoggerTypeImpl <em>Fault Logger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.FaultLoggerTypeImpl
	 * @see application.impl.Gsm_derivedPackageImpl#getFaultLoggerType()
	 * @generated
	 */
	int FAULT_LOGGER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Event Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__EVENT_IDS = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Fault Logger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Fault Logger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_TYPE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link application.AssignType <em>Assign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Type</em>'.
	 * @see application.AssignType
	 * @generated
	 */
	EClass getAssignType();

	/**
	 * Returns the meta object for the containment reference '{@link application.AssignType#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see application.AssignType#getMapping()
	 * @see #getAssignType()
	 * @generated
	 */
	EReference getAssignType_Mapping();

	/**
	 * Returns the meta object for class '{@link application.CompositeApplicationType <em>Composite Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Application Type</em>'.
	 * @see application.CompositeApplicationType
	 * @generated
	 */
	EClass getCompositeApplicationType();

	/**
	 * Returns the meta object for the containment reference '{@link application.CompositeApplicationType#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Model</em>'.
	 * @see application.CompositeApplicationType#getEventModel()
	 * @see #getCompositeApplicationType()
	 * @generated
	 */
	EReference getCompositeApplicationType_EventModel();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CompositeApplicationType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see application.CompositeApplicationType#getComponent()
	 * @see #getCompositeApplicationType()
	 * @generated
	 */
	EReference getCompositeApplicationType_Component();

	/**
	 * Returns the meta object for the attribute '{@link application.CompositeApplicationType#getAppVersion <em>App Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Version</em>'.
	 * @see application.CompositeApplicationType#getAppVersion()
	 * @see #getCompositeApplicationType()
	 * @generated
	 */
	EAttribute getCompositeApplicationType_AppVersion();

	/**
	 * Returns the meta object for the attribute '{@link application.CompositeApplicationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.CompositeApplicationType#getName()
	 * @see #getCompositeApplicationType()
	 * @generated
	 */
	EAttribute getCompositeApplicationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link application.CompositeApplicationType#getSienaVersion <em>Siena Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Siena Version</em>'.
	 * @see application.CompositeApplicationType#getSienaVersion()
	 * @see #getCompositeApplicationType()
	 * @generated
	 */
	EAttribute getCompositeApplicationType_SienaVersion();

	/**
	 * Returns the meta object for class '{@link application.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see application.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link application.ComponentType#getInformationModel <em>Information Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information Model</em>'.
	 * @see application.ComponentType#getInformationModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_InformationModel();

	/**
	 * Returns the meta object for the containment reference '{@link application.ComponentType#getLifecycleModel <em>Lifecycle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle Model</em>'.
	 * @see application.ComponentType#getLifecycleModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_LifecycleModel();

	/**
	 * Returns the meta object for the containment reference '{@link application.ComponentType#getDataAccessModel <em>Data Access Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Access Model</em>'.
	 * @see application.ComponentType#getDataAccessModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_DataAccessModel();

	/**
	 * Returns the meta object for the containment reference '{@link application.ComponentType#getFlowModel <em>Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Model</em>'.
	 * @see application.ComponentType#getFlowModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_FlowModel();

	/**
	 * Returns the meta object for the containment reference '{@link application.ComponentType#getGuardedStageModel <em>Guarded Stage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guarded Stage Model</em>'.
	 * @see application.ComponentType#getGuardedStageModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_GuardedStageModel();

	/**
	 * Returns the meta object for the attribute '{@link application.ComponentType#getAccessControlModel <em>Access Control Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Control Model</em>'.
	 * @see application.ComponentType#getAccessControlModel()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_AccessControlModel();

	/**
	 * Returns the meta object for the attribute '{@link application.ComponentType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.ComponentType#getId()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for class '{@link application.EventModelType <em>Event Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Model Type</em>'.
	 * @see application.EventModelType
	 * @generated
	 */
	EClass getEventModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.EventModelType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see application.EventModelType#getEvent()
	 * @see #getEventModelType()
	 * @generated
	 */
	EReference getEventModelType_Event();

	/**
	 * Returns the meta object for the attribute '{@link application.EventModelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.EventModelType#getDescription()
	 * @see #getEventModelType()
	 * @generated
	 */
	EAttribute getEventModelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.EventModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.EventModelType#getId()
	 * @see #getEventModelType()
	 * @generated
	 */
	EAttribute getEventModelType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.EventModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.EventModelType#getName()
	 * @see #getEventModelType()
	 * @generated
	 */
	EAttribute getEventModelType_Name();

	/**
	 * Returns the meta object for class '{@link application.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see application.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link application.EventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.EventType#getDescription()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.EventType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.EventType#getId()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link application.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see application.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the attribute '{@link application.ConditionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.ConditionType#getDescription()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.ConditionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see application.ConditionType#getExpression()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link application.ConditionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.ConditionType#getId()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.ConditionType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see application.ConditionType#getLanguage()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Language();

	/**
	 * Returns the meta object for the attribute '{@link application.ConditionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.ConditionType#getName()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Name();

	/**
	 * Returns the meta object for class '{@link application.DataAccessModelType <em>Data Access Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Model Type</em>'.
	 * @see application.DataAccessModelType
	 * @generated
	 */
	EClass getDataAccessModelType();

	/**
	 * Returns the meta object for the attribute '{@link application.DataAccessModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.DataAccessModelType#getId()
	 * @see #getDataAccessModelType()
	 * @generated
	 */
	EAttribute getDataAccessModelType_Id();

	/**
	 * Returns the meta object for class '{@link application.DataItemType <em>Data Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item Type</em>'.
	 * @see application.DataItemType
	 * @generated
	 */
	EClass getDataItemType();

	/**
	 * Returns the meta object for the attribute '{@link application.DataItemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.DataItemType#getId()
	 * @see #getDataItemType()
	 * @generated
	 */
	EAttribute getDataItemType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.DataItemType#getListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Element</em>'.
	 * @see application.DataItemType#getListElement()
	 * @see #getDataItemType()
	 * @generated
	 */
	EAttribute getDataItemType_ListElement();

	/**
	 * Returns the meta object for the attribute '{@link application.DataItemType#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Element</em>'.
	 * @see application.DataItemType#getRootElement()
	 * @see #getDataItemType()
	 * @generated
	 */
	EAttribute getDataItemType_RootElement();

	/**
	 * Returns the meta object for the attribute '{@link application.DataItemType#getSchemaUri <em>Schema Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Uri</em>'.
	 * @see application.DataItemType#getSchemaUri()
	 * @see #getDataItemType()
	 * @generated
	 */
	EAttribute getDataItemType_SchemaUri();

	/**
	 * Returns the meta object for class '{@link application.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see application.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link application.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see application.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link application.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see application.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link application.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see application.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for class '{@link application.FlowModelType <em>Flow Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Model Type</em>'.
	 * @see application.FlowModelType
	 * @generated
	 */
	EClass getFlowModelType();

	/**
	 * Returns the meta object for the containment reference '{@link application.FlowModelType#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see application.FlowModelType#getFlow()
	 * @see #getFlowModelType()
	 * @generated
	 */
	EReference getFlowModelType_Flow();

	/**
	 * Returns the meta object for the attribute '{@link application.FlowModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.FlowModelType#getId()
	 * @see #getFlowModelType()
	 * @generated
	 */
	EAttribute getFlowModelType_Id();

	/**
	 * Returns the meta object for class '{@link application.FlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Type</em>'.
	 * @see application.FlowType
	 * @generated
	 */
	EClass getFlowType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.FlowType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see application.FlowType#getVariable()
	 * @see #getFlowType()
	 * @generated
	 */
	EReference getFlowType_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link application.FlowType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see application.FlowType#getTask()
	 * @see #getFlowType()
	 * @generated
	 */
	EReference getFlowType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link application.FlowType#getFlowWire <em>Flow Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Wire</em>'.
	 * @see application.FlowType#getFlowWire()
	 * @see #getFlowType()
	 * @generated
	 */
	EReference getFlowType_FlowWire();

	/**
	 * Returns the meta object for the attribute '{@link application.FlowType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.FlowType#getId()
	 * @see #getFlowType()
	 * @generated
	 */
	EAttribute getFlowType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.FlowType#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see application.FlowType#getServiceId()
	 * @see #getFlowType()
	 * @generated
	 */
	EAttribute getFlowType_ServiceId();

	/**
	 * Returns the meta object for class '{@link application.FlowWireType <em>Flow Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Wire Type</em>'.
	 * @see application.FlowWireType
	 * @generated
	 */
	EClass getFlowWireType();

	/**
	 * Returns the meta object for the attribute '{@link application.FlowWireType#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see application.FlowWireType#getSourceId()
	 * @see #getFlowWireType()
	 * @generated
	 */
	EAttribute getFlowWireType_SourceId();

	/**
	 * Returns the meta object for the attribute '{@link application.FlowWireType#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see application.FlowWireType#getTargetId()
	 * @see #getFlowWireType()
	 * @generated
	 */
	EAttribute getFlowWireType_TargetId();

	/**
	 * Returns the meta object for class '{@link application.GuardedStageModelType <em>Guarded Stage Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Stage Model Type</em>'.
	 * @see application.GuardedStageModelType
	 * @generated
	 */
	EClass getGuardedStageModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.GuardedStageModelType#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see application.GuardedStageModelType#getStage()
	 * @see #getGuardedStageModelType()
	 * @generated
	 */
	EReference getGuardedStageModelType_Stage();

	/**
	 * Returns the meta object for the attribute '{@link application.GuardedStageModelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.GuardedStageModelType#getDescription()
	 * @see #getGuardedStageModelType()
	 * @generated
	 */
	EAttribute getGuardedStageModelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.GuardedStageModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.GuardedStageModelType#getId()
	 * @see #getGuardedStageModelType()
	 * @generated
	 */
	EAttribute getGuardedStageModelType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.GuardedStageModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.GuardedStageModelType#getName()
	 * @see #getGuardedStageModelType()
	 * @generated
	 */
	EAttribute getGuardedStageModelType_Name();

	/**
	 * Returns the meta object for class '{@link application.InformationModelType <em>Information Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Model Type</em>'.
	 * @see application.InformationModelType
	 * @generated
	 */
	EClass getInformationModelType();

	/**
	 * Returns the meta object for the containment reference '{@link application.InformationModelType#getDataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Item</em>'.
	 * @see application.InformationModelType#getDataItem()
	 * @see #getInformationModelType()
	 * @generated
	 */
	EReference getInformationModelType_DataItem();

	/**
	 * Returns the meta object for the attribute '{@link application.InformationModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.InformationModelType#getId()
	 * @see #getInformationModelType()
	 * @generated
	 */
	EAttribute getInformationModelType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.InformationModelType#getRootDataItemId <em>Root Data Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Data Item Id</em>'.
	 * @see application.InformationModelType#getRootDataItemId()
	 * @see #getInformationModelType()
	 * @generated
	 */
	EAttribute getInformationModelType_RootDataItemId();

	/**
	 * Returns the meta object for class '{@link application.InputMappingType <em>Input Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Mapping Type</em>'.
	 * @see application.InputMappingType
	 * @generated
	 */
	EClass getInputMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link application.InputMappingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see application.InputMappingType#getSource()
	 * @see #getInputMappingType()
	 * @generated
	 */
	EReference getInputMappingType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link application.InputMappingType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see application.InputMappingType#getTarget()
	 * @see #getInputMappingType()
	 * @generated
	 */
	EReference getInputMappingType_Target();

	/**
	 * Returns the meta object for the attribute '{@link application.InputMappingType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see application.InputMappingType#getType()
	 * @see #getInputMappingType()
	 * @generated
	 */
	EAttribute getInputMappingType_Type();

	/**
	 * Returns the meta object for class '{@link application.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see application.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the attribute '{@link application.InputType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see application.InputType#getValue()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Value();

	/**
	 * Returns the meta object for the attribute '{@link application.InputType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.InputType#getId()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.InputType#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Element</em>'.
	 * @see application.InputType#getRootElement()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_RootElement();

	/**
	 * Returns the meta object for the attribute '{@link application.InputType#getSchemaUri <em>Schema Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Uri</em>'.
	 * @see application.InputType#getSchemaUri()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_SchemaUri();

	/**
	 * Returns the meta object for class '{@link application.InvokeType <em>Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Type</em>'.
	 * @see application.InvokeType
	 * @generated
	 */
	EClass getInvokeType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.InvokeType#getInputMapping <em>Input Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Mapping</em>'.
	 * @see application.InvokeType#getInputMapping()
	 * @see #getInvokeType()
	 * @generated
	 */
	EReference getInvokeType_InputMapping();

	/**
	 * Returns the meta object for the attribute '{@link application.InvokeType#getServiceDefinitionId <em>Service Definition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Definition Id</em>'.
	 * @see application.InvokeType#getServiceDefinitionId()
	 * @see #getInvokeType()
	 * @generated
	 */
	EAttribute getInvokeType_ServiceDefinitionId();

	/**
	 * Returns the meta object for class '{@link application.LifecycleModelType <em>Lifecycle Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Model Type</em>'.
	 * @see application.LifecycleModelType
	 * @generated
	 */
	EClass getLifecycleModelType();

	/**
	 * Returns the meta object for the containment reference '{@link application.LifecycleModelType#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle</em>'.
	 * @see application.LifecycleModelType#getLifecycle()
	 * @see #getLifecycleModelType()
	 * @generated
	 */
	EReference getLifecycleModelType_Lifecycle();

	/**
	 * Returns the meta object for the attribute '{@link application.LifecycleModelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.LifecycleModelType#getId()
	 * @see #getLifecycleModelType()
	 * @generated
	 */
	EAttribute getLifecycleModelType_Id();

	/**
	 * Returns the meta object for class '{@link application.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Type</em>'.
	 * @see application.LifecycleType
	 * @generated
	 */
	EClass getLifecycleType();

	/**
	 * Returns the meta object for the containment reference '{@link application.LifecycleType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see application.LifecycleType#getState()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EReference getLifecycleType_State();

	/**
	 * Returns the meta object for the containment reference '{@link application.LifecycleType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see application.LifecycleType#getTransition()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EReference getLifecycleType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link application.LifecycleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.LifecycleType#getId()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EAttribute getLifecycleType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.LifecycleType#getStateXPath <em>State XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State XPath</em>'.
	 * @see application.LifecycleType#getStateXPath()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EAttribute getLifecycleType_StateXPath();

	/**
	 * Returns the meta object for class '{@link application.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Type</em>'.
	 * @see application.MappingType
	 * @generated
	 */
	EClass getMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link application.MappingType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see application.MappingType#getTarget()
	 * @see #getMappingType()
	 * @generated
	 */
	EReference getMappingType_Target();

	/**
	 * Returns the meta object for the attribute '{@link application.MappingType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see application.MappingType#getType()
	 * @see #getMappingType()
	 * @generated
	 */
	EAttribute getMappingType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link application.MappingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see application.MappingType#getSource()
	 * @see #getMappingType()
	 * @generated
	 */
	EReference getMappingType_Source();

	/**
	 * Returns the meta object for class '{@link application.MilestoneType <em>Milestone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone Type</em>'.
	 * @see application.MilestoneType
	 * @generated
	 */
	EClass getMilestoneType();

	/**
	 * Returns the meta object for the containment reference '{@link application.MilestoneType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see application.MilestoneType#getCondition()
	 * @see #getMilestoneType()
	 * @generated
	 */
	EReference getMilestoneType_Condition();

	/**
	 * Returns the meta object for the attribute '{@link application.MilestoneType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.MilestoneType#getDescription()
	 * @see #getMilestoneType()
	 * @generated
	 */
	EAttribute getMilestoneType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.MilestoneType#getEventIds <em>Event Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Ids</em>'.
	 * @see application.MilestoneType#getEventIds()
	 * @see #getMilestoneType()
	 * @generated
	 */
	EAttribute getMilestoneType_EventIds();

	/**
	 * Returns the meta object for the attribute '{@link application.MilestoneType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.MilestoneType#getId()
	 * @see #getMilestoneType()
	 * @generated
	 */
	EAttribute getMilestoneType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.MilestoneType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.MilestoneType#getName()
	 * @see #getMilestoneType()
	 * @generated
	 */
	EAttribute getMilestoneType_Name();

	/**
	 * Returns the meta object for class '{@link application.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see application.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for the attribute '{@link application.OutputType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see application.OutputType#getValue()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Value();

	/**
	 * Returns the meta object for the attribute '{@link application.OutputType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.OutputType#getId()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.OutputType#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Element</em>'.
	 * @see application.OutputType#getRootElement()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_RootElement();

	/**
	 * Returns the meta object for the attribute '{@link application.OutputType#getSchemaUri <em>Schema Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Uri</em>'.
	 * @see application.OutputType#getSchemaUri()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_SchemaUri();

	/**
	 * Returns the meta object for class '{@link application.ServiceAdapterType <em>Service Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Adapter Type</em>'.
	 * @see application.ServiceAdapterType
	 * @generated
	 */
	EClass getServiceAdapterType();

	/**
	 * Returns the meta object for the attribute '{@link application.ServiceAdapterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see application.ServiceAdapterType#getValue()
	 * @see #getServiceAdapterType()
	 * @generated
	 */
	EAttribute getServiceAdapterType_Value();

	/**
	 * Returns the meta object for the attribute '{@link application.ServiceAdapterType#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see application.ServiceAdapterType#getEventId()
	 * @see #getServiceAdapterType()
	 * @generated
	 */
	EAttribute getServiceAdapterType_EventId();

	/**
	 * Returns the meta object for the attribute '{@link application.ServiceAdapterType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.ServiceAdapterType#getId()
	 * @see #getServiceAdapterType()
	 * @generated
	 */
	EAttribute getServiceAdapterType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.ServiceAdapterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.ServiceAdapterType#getName()
	 * @see #getServiceAdapterType()
	 * @generated
	 */
	EAttribute getServiceAdapterType_Name();

	/**
	 * Returns the meta object for class '{@link application.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see application.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link application.SourceType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see application.SourceType#getExpression()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link application.SourceType#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Type</em>'.
	 * @see application.SourceType#getRefType()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_RefType();

	/**
	 * Returns the meta object for the attribute '{@link application.SourceType#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see application.SourceType#getSourceId()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_SourceId();

	/**
	 * Returns the meta object for the attribute '{@link application.SourceType#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath</em>'.
	 * @see application.SourceType#getXPath()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_XPath();

	/**
	 * Returns the meta object for class '{@link application.DataFlowGuardType <em>Data Flow Guard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Guard Type</em>'.
	 * @see application.DataFlowGuardType
	 * @generated
	 */
	EClass getDataFlowGuardType();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.DataFlowGuardType#getDescription()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getEventIds <em>Event Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Ids</em>'.
	 * @see application.DataFlowGuardType#getEventIds()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_EventIds();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see application.DataFlowGuardType#getExpression()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.DataFlowGuardType#getId()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see application.DataFlowGuardType#getLanguage()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_Language();

	/**
	 * Returns the meta object for the attribute '{@link application.DataFlowGuardType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.DataFlowGuardType#getName()
	 * @see #getDataFlowGuardType()
	 * @generated
	 */
	EAttribute getDataFlowGuardType_Name();

	/**
	 * Returns the meta object for class '{@link application.StageType <em>Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Type</em>'.
	 * @see application.StageType
	 * @generated
	 */
	EClass getStageType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.StageType#getDataFlowGuard <em>Data Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flow Guard</em>'.
	 * @see application.StageType#getDataFlowGuard()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_DataFlowGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link application.StageType#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestone</em>'.
	 * @see application.StageType#getMilestone()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_Milestone();

	/**
	 * Returns the meta object for the containment reference '{@link application.StageType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see application.StageType#getTask()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link application.StageType#getSubStage <em>Sub Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Stage</em>'.
	 * @see application.StageType#getSubStage()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_SubStage();

	/**
	 * Returns the meta object for the attribute '{@link application.StageType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.StageType#getDescription()
	 * @see #getStageType()
	 * @generated
	 */
	EAttribute getStageType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.StageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.StageType#getId()
	 * @see #getStageType()
	 * @generated
	 */
	EAttribute getStageType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.StageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.StageType#getName()
	 * @see #getStageType()
	 * @generated
	 */
	EAttribute getStageType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link application.StageType#getProcessFlowGuard <em>Process Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Flow Guard</em>'.
	 * @see application.StageType#getProcessFlowGuard()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_ProcessFlowGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link application.StageType#getFaultLogger <em>Fault Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault Logger</em>'.
	 * @see application.StageType#getFaultLogger()
	 * @see #getStageType()
	 * @generated
	 */
	EReference getStageType_FaultLogger();

	/**
	 * Returns the meta object for class '{@link application.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Type</em>'.
	 * @see application.StateType
	 * @generated
	 */
	EClass getStateType();

	/**
	 * Returns the meta object for the attribute '{@link application.StateType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.StateType#getId()
	 * @see #getStateType()
	 * @generated
	 */
	EAttribute getStateType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.StateType#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see application.StateType#getInitial()
	 * @see #getStateType()
	 * @generated
	 */
	EAttribute getStateType_Initial();

	/**
	 * Returns the meta object for class '{@link application.SubStageType <em>Sub Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Stage Type</em>'.
	 * @see application.SubStageType
	 * @generated
	 */
	EClass getSubStageType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.SubStageType#getDataFlowGuard <em>Data Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flow Guard</em>'.
	 * @see application.SubStageType#getDataFlowGuard()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_DataFlowGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link application.SubStageType#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestone</em>'.
	 * @see application.SubStageType#getMilestone()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_Milestone();

	/**
	 * Returns the meta object for the containment reference list '{@link application.SubStageType#getSubStage <em>Sub Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Stage</em>'.
	 * @see application.SubStageType#getSubStage()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_SubStage();

	/**
	 * Returns the meta object for the containment reference '{@link application.SubStageType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see application.SubStageType#getTask()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_Task();

	/**
	 * Returns the meta object for the attribute '{@link application.SubStageType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.SubStageType#getDescription()
	 * @see #getSubStageType()
	 * @generated
	 */
	EAttribute getSubStageType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.SubStageType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.SubStageType#getId()
	 * @see #getSubStageType()
	 * @generated
	 */
	EAttribute getSubStageType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.SubStageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.SubStageType#getName()
	 * @see #getSubStageType()
	 * @generated
	 */
	EAttribute getSubStageType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link application.SubStageType#getProcessFlowGuard <em>Process Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Flow Guard</em>'.
	 * @see application.SubStageType#getProcessFlowGuard()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_ProcessFlowGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link application.SubStageType#getFaultLogger <em>Fault Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault Logger</em>'.
	 * @see application.SubStageType#getFaultLogger()
	 * @see #getSubStageType()
	 * @generated
	 */
	EReference getSubStageType_FaultLogger();

	/**
	 * Returns the meta object for class '{@link application.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see application.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the attribute '{@link application.TargetType#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Type</em>'.
	 * @see application.TargetType#getRefType()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_RefType();

	/**
	 * Returns the meta object for the attribute '{@link application.TargetType#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see application.TargetType#getTargetId()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link application.TargetType#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath</em>'.
	 * @see application.TargetType#getXPath()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_XPath();

	/**
	 * Returns the meta object for class '{@link application.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see application.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the containment reference '{@link application.TaskType#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign</em>'.
	 * @see application.TaskType#getAssign()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Assign();

	/**
	 * Returns the meta object for the attribute '{@link application.TaskType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.TaskType#getId()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for class '{@link application.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see application.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.TransitionType#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see application.TransitionType#getAssign()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Assign();

	/**
	 * Returns the meta object for the attribute '{@link application.TransitionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.TransitionType#getId()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.TransitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.TransitionType#getName()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link application.TransitionType#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see application.TransitionType#getServiceId()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link application.TransitionType#getTargetStateIds <em>Target State Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State Ids</em>'.
	 * @see application.TransitionType#getTargetStateIds()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_TargetStateIds();

	/**
	 * Returns the meta object for class '{@link application.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see application.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the attribute '{@link application.VariableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.VariableType#getId()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Id();

	/**
	 * Returns the meta object for class '{@link application.ProcessFlowGuardType <em>Process Flow Guard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Flow Guard Type</em>'.
	 * @see application.ProcessFlowGuardType
	 * @generated
	 */
	EClass getProcessFlowGuardType();

	/**
	 * Returns the meta object for the attribute '{@link application.ProcessFlowGuardType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.ProcessFlowGuardType#getDescription()
	 * @see #getProcessFlowGuardType()
	 * @generated
	 */
	EAttribute getProcessFlowGuardType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.ProcessFlowGuardType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.ProcessFlowGuardType#getId()
	 * @see #getProcessFlowGuardType()
	 * @generated
	 */
	EAttribute getProcessFlowGuardType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.ProcessFlowGuardType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.ProcessFlowGuardType#getName()
	 * @see #getProcessFlowGuardType()
	 * @generated
	 */
	EAttribute getProcessFlowGuardType_Name();

	/**
	 * Returns the meta object for the attribute '{@link application.ProcessFlowGuardType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see application.ProcessFlowGuardType#getExpression()
	 * @see #getProcessFlowGuardType()
	 * @generated
	 */
	EAttribute getProcessFlowGuardType_Expression();

	/**
	 * Returns the meta object for class '{@link application.FaultLoggerType <em>Fault Logger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Logger Type</em>'.
	 * @see application.FaultLoggerType
	 * @generated
	 */
	EClass getFaultLoggerType();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see application.FaultLoggerType#getDescription()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_Description();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getEventIds <em>Event Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Ids</em>'.
	 * @see application.FaultLoggerType#getEventIds()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_EventIds();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see application.FaultLoggerType#getExpression()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see application.FaultLoggerType#getId()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_Id();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see application.FaultLoggerType#getLanguage()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_Language();

	/**
	 * Returns the meta object for the attribute '{@link application.FaultLoggerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.FaultLoggerType#getName()
	 * @see #getFaultLoggerType()
	 * @generated
	 */
	EAttribute getFaultLoggerType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gsm_derivedFactory getGsm_derivedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link application.impl.AssignTypeImpl <em>Assign Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.AssignTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getAssignType()
		 * @generated
		 */
		EClass ASSIGN_TYPE = eINSTANCE.getAssignType();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_TYPE__MAPPING = eINSTANCE.getAssignType_Mapping();

		/**
		 * The meta object literal for the '{@link application.impl.CompositeApplicationTypeImpl <em>Composite Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.CompositeApplicationTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getCompositeApplicationType()
		 * @generated
		 */
		EClass COMPOSITE_APPLICATION_TYPE = eINSTANCE.getCompositeApplicationType();

		/**
		 * The meta object literal for the '<em><b>Event Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_APPLICATION_TYPE__EVENT_MODEL = eINSTANCE.getCompositeApplicationType_EventModel();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_APPLICATION_TYPE__COMPONENT = eINSTANCE.getCompositeApplicationType_Component();

		/**
		 * The meta object literal for the '<em><b>App Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_APPLICATION_TYPE__APP_VERSION = eINSTANCE.getCompositeApplicationType_AppVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_APPLICATION_TYPE__NAME = eINSTANCE.getCompositeApplicationType_Name();

		/**
		 * The meta object literal for the '<em><b>Siena Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_APPLICATION_TYPE__SIENA_VERSION = eINSTANCE.getCompositeApplicationType_SienaVersion();

		/**
		 * The meta object literal for the '{@link application.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ComponentTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Information Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INFORMATION_MODEL = eINSTANCE.getComponentType_InformationModel();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__LIFECYCLE_MODEL = eINSTANCE.getComponentType_LifecycleModel();

		/**
		 * The meta object literal for the '<em><b>Data Access Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__DATA_ACCESS_MODEL = eINSTANCE.getComponentType_DataAccessModel();

		/**
		 * The meta object literal for the '<em><b>Flow Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__FLOW_MODEL = eINSTANCE.getComponentType_FlowModel();

		/**
		 * The meta object literal for the '<em><b>Guarded Stage Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__GUARDED_STAGE_MODEL = eINSTANCE.getComponentType_GuardedStageModel();

		/**
		 * The meta object literal for the '<em><b>Access Control Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__ACCESS_CONTROL_MODEL = eINSTANCE.getComponentType_AccessControlModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__ID = eINSTANCE.getComponentType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.EventModelTypeImpl <em>Event Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.EventModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getEventModelType()
		 * @generated
		 */
		EClass EVENT_MODEL_TYPE = eINSTANCE.getEventModelType();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL_TYPE__EVENT = eINSTANCE.getEventModelType_Event();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL_TYPE__DESCRIPTION = eINSTANCE.getEventModelType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL_TYPE__ID = eINSTANCE.getEventModelType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MODEL_TYPE__NAME = eINSTANCE.getEventModelType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.EventTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__DESCRIPTION = eINSTANCE.getEventType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__ID = eINSTANCE.getEventType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ConditionTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getConditionType()
		 * @generated
		 */
		EClass CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__DESCRIPTION = eINSTANCE.getConditionType_Description();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__EXPRESSION = eINSTANCE.getConditionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__ID = eINSTANCE.getConditionType_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__LANGUAGE = eINSTANCE.getConditionType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__NAME = eINSTANCE.getConditionType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.DataAccessModelTypeImpl <em>Data Access Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DataAccessModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getDataAccessModelType()
		 * @generated
		 */
		EClass DATA_ACCESS_MODEL_TYPE = eINSTANCE.getDataAccessModelType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCESS_MODEL_TYPE__ID = eINSTANCE.getDataAccessModelType_Id();

		/**
		 * The meta object literal for the '{@link application.impl.DataItemTypeImpl <em>Data Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DataItemTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getDataItemType()
		 * @generated
		 */
		EClass DATA_ITEM_TYPE = eINSTANCE.getDataItemType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM_TYPE__ID = eINSTANCE.getDataItemType_Id();

		/**
		 * The meta object literal for the '<em><b>List Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM_TYPE__LIST_ELEMENT = eINSTANCE.getDataItemType_ListElement();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM_TYPE__ROOT_ELEMENT = eINSTANCE.getDataItemType_RootElement();

		/**
		 * The meta object literal for the '<em><b>Schema Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM_TYPE__SCHEMA_URI = eINSTANCE.getDataItemType_SchemaUri();

		/**
		 * The meta object literal for the '{@link application.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DocumentRootImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '{@link application.impl.FlowModelTypeImpl <em>Flow Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.FlowModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getFlowModelType()
		 * @generated
		 */
		EClass FLOW_MODEL_TYPE = eINSTANCE.getFlowModelType();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_MODEL_TYPE__FLOW = eINSTANCE.getFlowModelType_Flow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_MODEL_TYPE__ID = eINSTANCE.getFlowModelType_Id();

		/**
		 * The meta object literal for the '{@link application.impl.FlowTypeImpl <em>Flow Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.FlowTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getFlowType()
		 * @generated
		 */
		EClass FLOW_TYPE = eINSTANCE.getFlowType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TYPE__VARIABLE = eINSTANCE.getFlowType_Variable();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TYPE__TASK = eINSTANCE.getFlowType_Task();

		/**
		 * The meta object literal for the '<em><b>Flow Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TYPE__FLOW_WIRE = eINSTANCE.getFlowType_FlowWire();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_TYPE__ID = eINSTANCE.getFlowType_Id();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_TYPE__SERVICE_ID = eINSTANCE.getFlowType_ServiceId();

		/**
		 * The meta object literal for the '{@link application.impl.FlowWireTypeImpl <em>Flow Wire Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.FlowWireTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getFlowWireType()
		 * @generated
		 */
		EClass FLOW_WIRE_TYPE = eINSTANCE.getFlowWireType();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_WIRE_TYPE__SOURCE_ID = eINSTANCE.getFlowWireType_SourceId();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_WIRE_TYPE__TARGET_ID = eINSTANCE.getFlowWireType_TargetId();

		/**
		 * The meta object literal for the '{@link application.impl.GuardedStageModelTypeImpl <em>Guarded Stage Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.GuardedStageModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getGuardedStageModelType()
		 * @generated
		 */
		EClass GUARDED_STAGE_MODEL_TYPE = eINSTANCE.getGuardedStageModelType();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED_STAGE_MODEL_TYPE__STAGE = eINSTANCE.getGuardedStageModelType_Stage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARDED_STAGE_MODEL_TYPE__DESCRIPTION = eINSTANCE.getGuardedStageModelType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARDED_STAGE_MODEL_TYPE__ID = eINSTANCE.getGuardedStageModelType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARDED_STAGE_MODEL_TYPE__NAME = eINSTANCE.getGuardedStageModelType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.InformationModelTypeImpl <em>Information Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InformationModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getInformationModelType()
		 * @generated
		 */
		EClass INFORMATION_MODEL_TYPE = eINSTANCE.getInformationModelType();

		/**
		 * The meta object literal for the '<em><b>Data Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_MODEL_TYPE__DATA_ITEM = eINSTANCE.getInformationModelType_DataItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_MODEL_TYPE__ID = eINSTANCE.getInformationModelType_Id();

		/**
		 * The meta object literal for the '<em><b>Root Data Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID = eINSTANCE.getInformationModelType_RootDataItemId();

		/**
		 * The meta object literal for the '{@link application.impl.InputMappingTypeImpl <em>Input Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InputMappingTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getInputMappingType()
		 * @generated
		 */
		EClass INPUT_MAPPING_TYPE = eINSTANCE.getInputMappingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MAPPING_TYPE__SOURCE = eINSTANCE.getInputMappingType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MAPPING_TYPE__TARGET = eINSTANCE.getInputMappingType_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MAPPING_TYPE__TYPE = eINSTANCE.getInputMappingType_Type();

		/**
		 * The meta object literal for the '{@link application.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InputTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__VALUE = eINSTANCE.getInputType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__ID = eINSTANCE.getInputType_Id();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__ROOT_ELEMENT = eINSTANCE.getInputType_RootElement();

		/**
		 * The meta object literal for the '<em><b>Schema Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__SCHEMA_URI = eINSTANCE.getInputType_SchemaUri();

		/**
		 * The meta object literal for the '{@link application.impl.InvokeTypeImpl <em>Invoke Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InvokeTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getInvokeType()
		 * @generated
		 */
		EClass INVOKE_TYPE = eINSTANCE.getInvokeType();

		/**
		 * The meta object literal for the '<em><b>Input Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TYPE__INPUT_MAPPING = eINSTANCE.getInvokeType_InputMapping();

		/**
		 * The meta object literal for the '<em><b>Service Definition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_TYPE__SERVICE_DEFINITION_ID = eINSTANCE.getInvokeType_ServiceDefinitionId();

		/**
		 * The meta object literal for the '{@link application.impl.LifecycleModelTypeImpl <em>Lifecycle Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.LifecycleModelTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getLifecycleModelType()
		 * @generated
		 */
		EClass LIFECYCLE_MODEL_TYPE = eINSTANCE.getLifecycleModelType();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_MODEL_TYPE__LIFECYCLE = eINSTANCE.getLifecycleModelType_Lifecycle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_MODEL_TYPE__ID = eINSTANCE.getLifecycleModelType_Id();

		/**
		 * The meta object literal for the '{@link application.impl.LifecycleTypeImpl <em>Lifecycle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.LifecycleTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getLifecycleType()
		 * @generated
		 */
		EClass LIFECYCLE_TYPE = eINSTANCE.getLifecycleType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_TYPE__STATE = eINSTANCE.getLifecycleType_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_TYPE__TRANSITION = eINSTANCE.getLifecycleType_Transition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_TYPE__ID = eINSTANCE.getLifecycleType_Id();

		/**
		 * The meta object literal for the '<em><b>State XPath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_TYPE__STATE_XPATH = eINSTANCE.getLifecycleType_StateXPath();

		/**
		 * The meta object literal for the '{@link application.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.MappingTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getMappingType()
		 * @generated
		 */
		EClass MAPPING_TYPE = eINSTANCE.getMappingType();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TYPE__TARGET = eINSTANCE.getMappingType_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_TYPE__TYPE = eINSTANCE.getMappingType_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TYPE__SOURCE = eINSTANCE.getMappingType_Source();

		/**
		 * The meta object literal for the '{@link application.impl.MilestoneTypeImpl <em>Milestone Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.MilestoneTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getMilestoneType()
		 * @generated
		 */
		EClass MILESTONE_TYPE = eINSTANCE.getMilestoneType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE_TYPE__CONDITION = eINSTANCE.getMilestoneType_Condition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE_TYPE__DESCRIPTION = eINSTANCE.getMilestoneType_Description();

		/**
		 * The meta object literal for the '<em><b>Event Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE_TYPE__EVENT_IDS = eINSTANCE.getMilestoneType_EventIds();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE_TYPE__ID = eINSTANCE.getMilestoneType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE_TYPE__NAME = eINSTANCE.getMilestoneType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.OutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.OutputTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getOutputType()
		 * @generated
		 */
		EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__VALUE = eINSTANCE.getOutputType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__ID = eINSTANCE.getOutputType_Id();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__ROOT_ELEMENT = eINSTANCE.getOutputType_RootElement();

		/**
		 * The meta object literal for the '<em><b>Schema Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__SCHEMA_URI = eINSTANCE.getOutputType_SchemaUri();

		/**
		 * The meta object literal for the '{@link application.impl.ServiceAdapterTypeImpl <em>Service Adapter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ServiceAdapterTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getServiceAdapterType()
		 * @generated
		 */
		EClass SERVICE_ADAPTER_TYPE = eINSTANCE.getServiceAdapterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ADAPTER_TYPE__VALUE = eINSTANCE.getServiceAdapterType_Value();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ADAPTER_TYPE__EVENT_ID = eINSTANCE.getServiceAdapterType_EventId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ADAPTER_TYPE__ID = eINSTANCE.getServiceAdapterType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ADAPTER_TYPE__NAME = eINSTANCE.getServiceAdapterType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.SourceTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__EXPRESSION = eINSTANCE.getSourceType_Expression();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__REF_TYPE = eINSTANCE.getSourceType_RefType();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__SOURCE_ID = eINSTANCE.getSourceType_SourceId();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__XPATH = eINSTANCE.getSourceType_XPath();

		/**
		 * The meta object literal for the '{@link application.impl.DataFlowGuardTypeImpl <em>Data Flow Guard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DataFlowGuardTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getDataFlowGuardType()
		 * @generated
		 */
		EClass DATA_FLOW_GUARD_TYPE = eINSTANCE.getDataFlowGuardType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__DESCRIPTION = eINSTANCE.getDataFlowGuardType_Description();

		/**
		 * The meta object literal for the '<em><b>Event Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__EVENT_IDS = eINSTANCE.getDataFlowGuardType_EventIds();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__EXPRESSION = eINSTANCE.getDataFlowGuardType_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__ID = eINSTANCE.getDataFlowGuardType_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__LANGUAGE = eINSTANCE.getDataFlowGuardType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD_TYPE__NAME = eINSTANCE.getDataFlowGuardType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.StageTypeImpl <em>Stage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.StageTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getStageType()
		 * @generated
		 */
		EClass STAGE_TYPE = eINSTANCE.getStageType();

		/**
		 * The meta object literal for the '<em><b>Data Flow Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__DATA_FLOW_GUARD = eINSTANCE.getStageType_DataFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__MILESTONE = eINSTANCE.getStageType_Milestone();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__TASK = eINSTANCE.getStageType_Task();

		/**
		 * The meta object literal for the '<em><b>Sub Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__SUB_STAGE = eINSTANCE.getStageType_SubStage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE_TYPE__DESCRIPTION = eINSTANCE.getStageType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE_TYPE__ID = eINSTANCE.getStageType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE_TYPE__NAME = eINSTANCE.getStageType_Name();

		/**
		 * The meta object literal for the '<em><b>Process Flow Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__PROCESS_FLOW_GUARD = eINSTANCE.getStageType_ProcessFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Fault Logger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_TYPE__FAULT_LOGGER = eINSTANCE.getStageType_FaultLogger();

		/**
		 * The meta object literal for the '{@link application.impl.StateTypeImpl <em>State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.StateTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getStateType()
		 * @generated
		 */
		EClass STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TYPE__ID = eINSTANCE.getStateType_Id();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TYPE__INITIAL = eINSTANCE.getStateType_Initial();

		/**
		 * The meta object literal for the '{@link application.impl.SubStageTypeImpl <em>Sub Stage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.SubStageTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getSubStageType()
		 * @generated
		 */
		EClass SUB_STAGE_TYPE = eINSTANCE.getSubStageType();

		/**
		 * The meta object literal for the '<em><b>Data Flow Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__DATA_FLOW_GUARD = eINSTANCE.getSubStageType_DataFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__MILESTONE = eINSTANCE.getSubStageType_Milestone();

		/**
		 * The meta object literal for the '<em><b>Sub Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__SUB_STAGE = eINSTANCE.getSubStageType_SubStage();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__TASK = eINSTANCE.getSubStageType_Task();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STAGE_TYPE__DESCRIPTION = eINSTANCE.getSubStageType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STAGE_TYPE__ID = eINSTANCE.getSubStageType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STAGE_TYPE__NAME = eINSTANCE.getSubStageType_Name();

		/**
		 * The meta object literal for the '<em><b>Process Flow Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__PROCESS_FLOW_GUARD = eINSTANCE.getSubStageType_ProcessFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Fault Logger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STAGE_TYPE__FAULT_LOGGER = eINSTANCE.getSubStageType_FaultLogger();

		/**
		 * The meta object literal for the '{@link application.impl.TargetTypeImpl <em>Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.TargetTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getTargetType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__REF_TYPE = eINSTANCE.getTargetType_RefType();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__TARGET_ID = eINSTANCE.getTargetType_TargetId();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__XPATH = eINSTANCE.getTargetType_XPath();

		/**
		 * The meta object literal for the '{@link application.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.TaskTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__ASSIGN = eINSTANCE.getTaskType_Assign();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ID = eINSTANCE.getTaskType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '{@link application.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.TransitionTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__ASSIGN = eINSTANCE.getTransitionType_Assign();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__ID = eINSTANCE.getTransitionType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__NAME = eINSTANCE.getTransitionType_Name();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__SERVICE_ID = eINSTANCE.getTransitionType_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Target State Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TARGET_STATE_IDS = eINSTANCE.getTransitionType_TargetStateIds();

		/**
		 * The meta object literal for the '{@link application.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.VariableTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__ID = eINSTANCE.getVariableType_Id();

		/**
		 * The meta object literal for the '{@link application.impl.ProcessFlowGuardTypeImpl <em>Process Flow Guard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ProcessFlowGuardTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getProcessFlowGuardType()
		 * @generated
		 */
		EClass PROCESS_FLOW_GUARD_TYPE = eINSTANCE.getProcessFlowGuardType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_FLOW_GUARD_TYPE__DESCRIPTION = eINSTANCE.getProcessFlowGuardType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_FLOW_GUARD_TYPE__ID = eINSTANCE.getProcessFlowGuardType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_FLOW_GUARD_TYPE__NAME = eINSTANCE.getProcessFlowGuardType_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_FLOW_GUARD_TYPE__EXPRESSION = eINSTANCE.getProcessFlowGuardType_Expression();

		/**
		 * The meta object literal for the '{@link application.impl.FaultLoggerTypeImpl <em>Fault Logger Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.FaultLoggerTypeImpl
		 * @see application.impl.Gsm_derivedPackageImpl#getFaultLoggerType()
		 * @generated
		 */
		EClass FAULT_LOGGER_TYPE = eINSTANCE.getFaultLoggerType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__DESCRIPTION = eINSTANCE.getFaultLoggerType_Description();

		/**
		 * The meta object literal for the '<em><b>Event Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__EVENT_IDS = eINSTANCE.getFaultLoggerType_EventIds();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__EXPRESSION = eINSTANCE.getFaultLoggerType_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__ID = eINSTANCE.getFaultLoggerType_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__LANGUAGE = eINSTANCE.getFaultLoggerType_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER_TYPE__NAME = eINSTANCE.getFaultLoggerType_Name();

	}

} //Gsm_derivedPackage
