/**
 */
package application.util;

import application.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see application.Gsm_derivedPackage
 * @generated
 */
public class Gsm_derivedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gsm_derivedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsm_derivedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Gsm_derivedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gsm_derivedSwitch<Adapter> modelSwitch = new Gsm_derivedSwitch<Adapter>() {
		@Override
		public Adapter caseAssignType(AssignType object) {
			return createAssignTypeAdapter();
		}

		@Override
		public Adapter caseCompositeApplicationType(CompositeApplicationType object) {
			return createCompositeApplicationTypeAdapter();
		}

		@Override
		public Adapter caseComponentType(ComponentType object) {
			return createComponentTypeAdapter();
		}

		@Override
		public Adapter caseEventModelType(EventModelType object) {
			return createEventModelTypeAdapter();
		}

		@Override
		public Adapter caseEventType(EventType object) {
			return createEventTypeAdapter();
		}

		@Override
		public Adapter caseConditionType(ConditionType object) {
			return createConditionTypeAdapter();
		}

		@Override
		public Adapter caseDataAccessModelType(DataAccessModelType object) {
			return createDataAccessModelTypeAdapter();
		}

		@Override
		public Adapter caseDataItemType(DataItemType object) {
			return createDataItemTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseFlowModelType(FlowModelType object) {
			return createFlowModelTypeAdapter();
		}

		@Override
		public Adapter caseFlowType(FlowType object) {
			return createFlowTypeAdapter();
		}

		@Override
		public Adapter caseFlowWireType(FlowWireType object) {
			return createFlowWireTypeAdapter();
		}

		@Override
		public Adapter caseGuardedStageModelType(GuardedStageModelType object) {
			return createGuardedStageModelTypeAdapter();
		}

		@Override
		public Adapter caseInformationModelType(InformationModelType object) {
			return createInformationModelTypeAdapter();
		}

		@Override
		public Adapter caseInputMappingType(InputMappingType object) {
			return createInputMappingTypeAdapter();
		}

		@Override
		public Adapter caseInputType(InputType object) {
			return createInputTypeAdapter();
		}

		@Override
		public Adapter caseInvokeType(InvokeType object) {
			return createInvokeTypeAdapter();
		}

		@Override
		public Adapter caseLifecycleModelType(LifecycleModelType object) {
			return createLifecycleModelTypeAdapter();
		}

		@Override
		public Adapter caseLifecycleType(LifecycleType object) {
			return createLifecycleTypeAdapter();
		}

		@Override
		public Adapter caseMappingType(MappingType object) {
			return createMappingTypeAdapter();
		}

		@Override
		public Adapter caseMilestoneType(MilestoneType object) {
			return createMilestoneTypeAdapter();
		}

		@Override
		public Adapter caseOutputType(OutputType object) {
			return createOutputTypeAdapter();
		}

		@Override
		public Adapter caseServiceAdapterType(ServiceAdapterType object) {
			return createServiceAdapterTypeAdapter();
		}

		@Override
		public Adapter caseSourceType(SourceType object) {
			return createSourceTypeAdapter();
		}

		@Override
		public Adapter caseDataFlowGuardType(DataFlowGuardType object) {
			return createDataFlowGuardTypeAdapter();
		}

		@Override
		public Adapter caseStageType(StageType object) {
			return createStageTypeAdapter();
		}

		@Override
		public Adapter caseStateType(StateType object) {
			return createStateTypeAdapter();
		}

		@Override
		public Adapter caseSubStageType(SubStageType object) {
			return createSubStageTypeAdapter();
		}

		@Override
		public Adapter caseTargetType(TargetType object) {
			return createTargetTypeAdapter();
		}

		@Override
		public Adapter caseTaskType(TaskType object) {
			return createTaskTypeAdapter();
		}

		@Override
		public Adapter caseTransitionType(TransitionType object) {
			return createTransitionTypeAdapter();
		}

		@Override
		public Adapter caseVariableType(VariableType object) {
			return createVariableTypeAdapter();
		}

		@Override
		public Adapter caseProcessFlowGuardType(ProcessFlowGuardType object) {
			return createProcessFlowGuardTypeAdapter();
		}

		@Override
		public Adapter caseFaultLoggerType(FaultLoggerType object) {
			return createFaultLoggerTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.AssignType <em>Assign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.AssignType
	 * @generated
	 */
	public Adapter createAssignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CompositeApplicationType <em>Composite Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CompositeApplicationType
	 * @generated
	 */
	public Adapter createCompositeApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.EventModelType <em>Event Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.EventModelType
	 * @generated
	 */
	public Adapter createEventModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DataAccessModelType <em>Data Access Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DataAccessModelType
	 * @generated
	 */
	public Adapter createDataAccessModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DataItemType <em>Data Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DataItemType
	 * @generated
	 */
	public Adapter createDataItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.FlowModelType <em>Flow Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.FlowModelType
	 * @generated
	 */
	public Adapter createFlowModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.FlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.FlowType
	 * @generated
	 */
	public Adapter createFlowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.FlowWireType <em>Flow Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.FlowWireType
	 * @generated
	 */
	public Adapter createFlowWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.GuardedStageModelType <em>Guarded Stage Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.GuardedStageModelType
	 * @generated
	 */
	public Adapter createGuardedStageModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InformationModelType <em>Information Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InformationModelType
	 * @generated
	 */
	public Adapter createInformationModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InputMappingType <em>Input Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InputMappingType
	 * @generated
	 */
	public Adapter createInputMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InvokeType <em>Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InvokeType
	 * @generated
	 */
	public Adapter createInvokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.LifecycleModelType <em>Lifecycle Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.LifecycleModelType
	 * @generated
	 */
	public Adapter createLifecycleModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.LifecycleType
	 * @generated
	 */
	public Adapter createLifecycleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.MappingType
	 * @generated
	 */
	public Adapter createMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.MilestoneType <em>Milestone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.MilestoneType
	 * @generated
	 */
	public Adapter createMilestoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ServiceAdapterType <em>Service Adapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ServiceAdapterType
	 * @generated
	 */
	public Adapter createServiceAdapterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DataFlowGuardType <em>Data Flow Guard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DataFlowGuardType
	 * @generated
	 */
	public Adapter createDataFlowGuardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.StageType <em>Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.StageType
	 * @generated
	 */
	public Adapter createStageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.StateType
	 * @generated
	 */
	public Adapter createStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.SubStageType <em>Sub Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.SubStageType
	 * @generated
	 */
	public Adapter createSubStageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.TargetType
	 * @generated
	 */
	public Adapter createTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.TransitionType
	 * @generated
	 */
	public Adapter createTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ProcessFlowGuardType <em>Process Flow Guard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ProcessFlowGuardType
	 * @generated
	 */
	public Adapter createProcessFlowGuardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.FaultLoggerType <em>Fault Logger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.FaultLoggerType
	 * @generated
	 */
	public Adapter createFaultLoggerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Gsm_derivedAdapterFactory
