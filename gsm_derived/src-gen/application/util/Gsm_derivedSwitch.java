/**
 */
package application.util;

import application.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see application.Gsm_derivedPackage
 * @generated
 */
public class Gsm_derivedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gsm_derivedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsm_derivedSwitch() {
		if (modelPackage == null) {
			modelPackage = Gsm_derivedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Gsm_derivedPackage.ASSIGN_TYPE: {
			AssignType assignType = (AssignType) theEObject;
			T result = caseAssignType(assignType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.COMPOSITE_APPLICATION_TYPE: {
			CompositeApplicationType compositeApplicationType = (CompositeApplicationType) theEObject;
			T result = caseCompositeApplicationType(compositeApplicationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.COMPONENT_TYPE: {
			ComponentType componentType = (ComponentType) theEObject;
			T result = caseComponentType(componentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.EVENT_MODEL_TYPE: {
			EventModelType eventModelType = (EventModelType) theEObject;
			T result = caseEventModelType(eventModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.EVENT_TYPE: {
			EventType eventType = (EventType) theEObject;
			T result = caseEventType(eventType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.CONDITION_TYPE: {
			ConditionType conditionType = (ConditionType) theEObject;
			T result = caseConditionType(conditionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.DATA_ACCESS_MODEL_TYPE: {
			DataAccessModelType dataAccessModelType = (DataAccessModelType) theEObject;
			T result = caseDataAccessModelType(dataAccessModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.DATA_ITEM_TYPE: {
			DataItemType dataItemType = (DataItemType) theEObject;
			T result = caseDataItemType(dataItemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.FLOW_MODEL_TYPE: {
			FlowModelType flowModelType = (FlowModelType) theEObject;
			T result = caseFlowModelType(flowModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.FLOW_TYPE: {
			FlowType flowType = (FlowType) theEObject;
			T result = caseFlowType(flowType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.FLOW_WIRE_TYPE: {
			FlowWireType flowWireType = (FlowWireType) theEObject;
			T result = caseFlowWireType(flowWireType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.GUARDED_STAGE_MODEL_TYPE: {
			GuardedStageModelType guardedStageModelType = (GuardedStageModelType) theEObject;
			T result = caseGuardedStageModelType(guardedStageModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.INFORMATION_MODEL_TYPE: {
			InformationModelType informationModelType = (InformationModelType) theEObject;
			T result = caseInformationModelType(informationModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.INPUT_MAPPING_TYPE: {
			InputMappingType inputMappingType = (InputMappingType) theEObject;
			T result = caseInputMappingType(inputMappingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.INPUT_TYPE: {
			InputType inputType = (InputType) theEObject;
			T result = caseInputType(inputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.INVOKE_TYPE: {
			InvokeType invokeType = (InvokeType) theEObject;
			T result = caseInvokeType(invokeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.LIFECYCLE_MODEL_TYPE: {
			LifecycleModelType lifecycleModelType = (LifecycleModelType) theEObject;
			T result = caseLifecycleModelType(lifecycleModelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.LIFECYCLE_TYPE: {
			LifecycleType lifecycleType = (LifecycleType) theEObject;
			T result = caseLifecycleType(lifecycleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.MAPPING_TYPE: {
			MappingType mappingType = (MappingType) theEObject;
			T result = caseMappingType(mappingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.MILESTONE_TYPE: {
			MilestoneType milestoneType = (MilestoneType) theEObject;
			T result = caseMilestoneType(milestoneType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.OUTPUT_TYPE: {
			OutputType outputType = (OutputType) theEObject;
			T result = caseOutputType(outputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.SERVICE_ADAPTER_TYPE: {
			ServiceAdapterType serviceAdapterType = (ServiceAdapterType) theEObject;
			T result = caseServiceAdapterType(serviceAdapterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.SOURCE_TYPE: {
			SourceType sourceType = (SourceType) theEObject;
			T result = caseSourceType(sourceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.DATA_FLOW_GUARD_TYPE: {
			DataFlowGuardType dataFlowGuardType = (DataFlowGuardType) theEObject;
			T result = caseDataFlowGuardType(dataFlowGuardType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.STAGE_TYPE: {
			StageType stageType = (StageType) theEObject;
			T result = caseStageType(stageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.STATE_TYPE: {
			StateType stateType = (StateType) theEObject;
			T result = caseStateType(stateType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.SUB_STAGE_TYPE: {
			SubStageType subStageType = (SubStageType) theEObject;
			T result = caseSubStageType(subStageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.TARGET_TYPE: {
			TargetType targetType = (TargetType) theEObject;
			T result = caseTargetType(targetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.TASK_TYPE: {
			TaskType taskType = (TaskType) theEObject;
			T result = caseTaskType(taskType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.TRANSITION_TYPE: {
			TransitionType transitionType = (TransitionType) theEObject;
			T result = caseTransitionType(transitionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.VARIABLE_TYPE: {
			VariableType variableType = (VariableType) theEObject;
			T result = caseVariableType(variableType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.PROCESS_FLOW_GUARD_TYPE: {
			ProcessFlowGuardType processFlowGuardType = (ProcessFlowGuardType) theEObject;
			T result = caseProcessFlowGuardType(processFlowGuardType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Gsm_derivedPackage.FAULT_LOGGER_TYPE: {
			FaultLoggerType faultLoggerType = (FaultLoggerType) theEObject;
			T result = caseFaultLoggerType(faultLoggerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignType(AssignType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Application Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeApplicationType(CompositeApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventModelType(EventModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessModelType(DataAccessModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItemType(DataItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowModelType(FlowModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowType(FlowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowWireType(FlowWireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guarded Stage Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guarded Stage Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardedStageModelType(GuardedStageModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationModelType(InformationModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMappingType(InputMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType(InputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeType(InvokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleModelType(LifecycleModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleType(LifecycleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingType(MappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Milestone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Milestone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilestoneType(MilestoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Adapter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Adapter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAdapterType(ServiceAdapterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Guard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Guard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowGuardType(DataFlowGuardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageType(StageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateType(StateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Stage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Stage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubStageType(SubStageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetType(TargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionType(TransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Flow Guard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Flow Guard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessFlowGuardType(ProcessFlowGuardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Logger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Logger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultLoggerType(FaultLoggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Gsm_derivedSwitch
