/**
 */
package application.impl;

import application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gsm_derivedFactoryImpl extends EFactoryImpl implements Gsm_derivedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gsm_derivedFactory init() {
		try {
			Gsm_derivedFactory theGsm_derivedFactory = (Gsm_derivedFactory) EPackage.Registry.INSTANCE
					.getEFactory(Gsm_derivedPackage.eNS_URI);
			if (theGsm_derivedFactory != null) {
				return theGsm_derivedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gsm_derivedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsm_derivedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Gsm_derivedPackage.ASSIGN_TYPE:
			return createAssignType();
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE:
			return createCompositeApplicationType();
		case Gsm_derivedPackage.COMPONENT_TYPE:
			return createComponentType();
		case Gsm_derivedPackage.EVENT_MODEL_TYPE:
			return createEventModelType();
		case Gsm_derivedPackage.EVENT_TYPE:
			return createEventType();
		case Gsm_derivedPackage.CONDITION_TYPE:
			return createConditionType();
		case Gsm_derivedPackage.DATA_ACCESS_MODEL_TYPE:
			return createDataAccessModelType();
		case Gsm_derivedPackage.DATA_ITEM_TYPE:
			return createDataItemType();
		case Gsm_derivedPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case Gsm_derivedPackage.FLOW_MODEL_TYPE:
			return createFlowModelType();
		case Gsm_derivedPackage.FLOW_TYPE:
			return createFlowType();
		case Gsm_derivedPackage.FLOW_WIRE_TYPE:
			return createFlowWireType();
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE:
			return createGuardedStageModelType();
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE:
			return createInformationModelType();
		case Gsm_derivedPackage.INPUT_MAPPING_TYPE:
			return createInputMappingType();
		case Gsm_derivedPackage.INPUT_TYPE:
			return createInputType();
		case Gsm_derivedPackage.INVOKE_TYPE:
			return createInvokeType();
		case Gsm_derivedPackage.LIFECYCLE_MODEL_TYPE:
			return createLifecycleModelType();
		case Gsm_derivedPackage.LIFECYCLE_TYPE:
			return createLifecycleType();
		case Gsm_derivedPackage.MAPPING_TYPE:
			return createMappingType();
		case Gsm_derivedPackage.MILESTONE_TYPE:
			return createMilestoneType();
		case Gsm_derivedPackage.OUTPUT_TYPE:
			return createOutputType();
		case Gsm_derivedPackage.SERVICE_ADAPTER_TYPE:
			return createServiceAdapterType();
		case Gsm_derivedPackage.SOURCE_TYPE:
			return createSourceType();
		case Gsm_derivedPackage.DATA_FLOW_GUARD_TYPE:
			return createDataFlowGuardType();
		case Gsm_derivedPackage.STAGE_TYPE:
			return createStageType();
		case Gsm_derivedPackage.STATE_TYPE:
			return createStateType();
		case Gsm_derivedPackage.SUB_STAGE_TYPE:
			return createSubStageType();
		case Gsm_derivedPackage.TARGET_TYPE:
			return createTargetType();
		case Gsm_derivedPackage.TASK_TYPE:
			return createTaskType();
		case Gsm_derivedPackage.TRANSITION_TYPE:
			return createTransitionType();
		case Gsm_derivedPackage.VARIABLE_TYPE:
			return createVariableType();
		case Gsm_derivedPackage.PROCESS_FLOW_GUARD_TYPE:
			return createProcessFlowGuardType();
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE:
			return createFaultLoggerType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignType createAssignType() {
		AssignTypeImpl assignType = new AssignTypeImpl();
		return assignType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeApplicationType createCompositeApplicationType() {
		CompositeApplicationTypeImpl compositeApplicationType = new CompositeApplicationTypeImpl();
		return compositeApplicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModelType createEventModelType() {
		EventModelTypeImpl eventModelType = new EventModelTypeImpl();
		return eventModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessModelType createDataAccessModelType() {
		DataAccessModelTypeImpl dataAccessModelType = new DataAccessModelTypeImpl();
		return dataAccessModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemType createDataItemType() {
		DataItemTypeImpl dataItemType = new DataItemTypeImpl();
		return dataItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowModelType createFlowModelType() {
		FlowModelTypeImpl flowModelType = new FlowModelTypeImpl();
		return flowModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowType createFlowType() {
		FlowTypeImpl flowType = new FlowTypeImpl();
		return flowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowWireType createFlowWireType() {
		FlowWireTypeImpl flowWireType = new FlowWireTypeImpl();
		return flowWireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedStageModelType createGuardedStageModelType() {
		GuardedStageModelTypeImpl guardedStageModelType = new GuardedStageModelTypeImpl();
		return guardedStageModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationModelType createInformationModelType() {
		InformationModelTypeImpl informationModelType = new InformationModelTypeImpl();
		return informationModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMappingType createInputMappingType() {
		InputMappingTypeImpl inputMappingType = new InputMappingTypeImpl();
		return inputMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeType createInvokeType() {
		InvokeTypeImpl invokeType = new InvokeTypeImpl();
		return invokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleModelType createLifecycleModelType() {
		LifecycleModelTypeImpl lifecycleModelType = new LifecycleModelTypeImpl();
		return lifecycleModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleType createLifecycleType() {
		LifecycleTypeImpl lifecycleType = new LifecycleTypeImpl();
		return lifecycleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingType() {
		MappingTypeImpl mappingType = new MappingTypeImpl();
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilestoneType createMilestoneType() {
		MilestoneTypeImpl milestoneType = new MilestoneTypeImpl();
		return milestoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputType() {
		OutputTypeImpl outputType = new OutputTypeImpl();
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterType createServiceAdapterType() {
		ServiceAdapterTypeImpl serviceAdapterType = new ServiceAdapterTypeImpl();
		return serviceAdapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowGuardType createDataFlowGuardType() {
		DataFlowGuardTypeImpl dataFlowGuardType = new DataFlowGuardTypeImpl();
		return dataFlowGuardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageType createStageType() {
		StageTypeImpl stageType = new StageTypeImpl();
		return stageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateType() {
		StateTypeImpl stateType = new StateTypeImpl();
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStageType createSubStageType() {
		SubStageTypeImpl subStageType = new SubStageTypeImpl();
		return subStageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFlowGuardType createProcessFlowGuardType() {
		ProcessFlowGuardTypeImpl processFlowGuardType = new ProcessFlowGuardTypeImpl();
		return processFlowGuardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultLoggerType createFaultLoggerType() {
		FaultLoggerTypeImpl faultLoggerType = new FaultLoggerTypeImpl();
		return faultLoggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsm_derivedPackage getGsm_derivedPackage() {
		return (Gsm_derivedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gsm_derivedPackage getPackage() {
		return Gsm_derivedPackage.eINSTANCE;
	}

} //Gsm_derivedFactoryImpl
