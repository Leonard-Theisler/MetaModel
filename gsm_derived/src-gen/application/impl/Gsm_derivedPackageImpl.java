/**
 */
package application.impl;

import application.AssignType;
import application.ComponentType;
import application.CompositeApplicationType;
import application.ConditionType;
import application.DataAccessModelType;
import application.DataFlowGuardType;
import application.DataItemType;
import application.DocumentRoot;
import application.EventModelType;
import application.EventType;
import application.FaultLoggerType;
import application.FlowModelType;
import application.FlowType;
import application.FlowWireType;
import application.Gsm_derivedFactory;
import application.Gsm_derivedPackage;
import application.GuardedStageModelType;
import application.InformationModelType;
import application.InputMappingType;
import application.InputType;
import application.InvokeType;
import application.LifecycleModelType;
import application.LifecycleType;
import application.MappingType;
import application.MilestoneType;
import application.OutputType;
import application.ProcessFlowGuardType;
import application.ServiceAdapterType;
import application.SourceType;
import application.StageType;
import application.StateType;
import application.SubStageType;
import application.TargetType;
import application.TaskType;
import application.TransitionType;
import application.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gsm_derivedPackageImpl extends EPackageImpl implements Gsm_derivedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeApplicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowWireTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardedStageModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAdapterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowGuardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subStageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processFlowGuardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultLoggerTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see application.Gsm_derivedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Gsm_derivedPackageImpl() {
		super(eNS_URI, Gsm_derivedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Gsm_derivedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Gsm_derivedPackage init() {
		if (isInited)
			return (Gsm_derivedPackage) EPackage.Registry.INSTANCE.getEPackage(Gsm_derivedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGsm_derivedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Gsm_derivedPackageImpl theGsm_derivedPackage = registeredGsm_derivedPackage instanceof Gsm_derivedPackageImpl
				? (Gsm_derivedPackageImpl) registeredGsm_derivedPackage
				: new Gsm_derivedPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGsm_derivedPackage.createPackageContents();

		// Initialize created meta-data
		theGsm_derivedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGsm_derivedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Gsm_derivedPackage.eNS_URI, theGsm_derivedPackage);
		return theGsm_derivedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignType() {
		return assignTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignType_Mapping() {
		return (EReference) assignTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeApplicationType() {
		return compositeApplicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeApplicationType_EventModel() {
		return (EReference) compositeApplicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeApplicationType_Component() {
		return (EReference) compositeApplicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeApplicationType_AppVersion() {
		return (EAttribute) compositeApplicationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeApplicationType_Name() {
		return (EAttribute) compositeApplicationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeApplicationType_SienaVersion() {
		return (EAttribute) compositeApplicationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_InformationModel() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_LifecycleModel() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_DataAccessModel() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_FlowModel() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_GuardedStageModel() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_AccessControlModel() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Id() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Name() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModelType() {
		return eventModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModelType_Event() {
		return (EReference) eventModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModelType_Description() {
		return (EAttribute) eventModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModelType_Id() {
		return (EAttribute) eventModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventModelType_Name() {
		return (EAttribute) eventModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Description() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Id() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionType() {
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Description() {
		return (EAttribute) conditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Expression() {
		return (EAttribute) conditionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Id() {
		return (EAttribute) conditionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Language() {
		return (EAttribute) conditionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Name() {
		return (EAttribute) conditionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessModelType() {
		return dataAccessModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAccessModelType_Id() {
		return (EAttribute) dataAccessModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataItemType() {
		return dataItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItemType_Id() {
		return (EAttribute) dataItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItemType_ListElement() {
		return (EAttribute) dataItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItemType_RootElement() {
		return (EAttribute) dataItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataItemType_SchemaUri() {
		return (EAttribute) dataItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowModelType() {
		return flowModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowModelType_Flow() {
		return (EReference) flowModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowModelType_Id() {
		return (EAttribute) flowModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowType() {
		return flowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowType_Variable() {
		return (EReference) flowTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowType_Task() {
		return (EReference) flowTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowType_FlowWire() {
		return (EReference) flowTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowType_Id() {
		return (EAttribute) flowTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowType_ServiceId() {
		return (EAttribute) flowTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowWireType() {
		return flowWireTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowWireType_SourceId() {
		return (EAttribute) flowWireTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowWireType_TargetId() {
		return (EAttribute) flowWireTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardedStageModelType() {
		return guardedStageModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardedStageModelType_Stage() {
		return (EReference) guardedStageModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardedStageModelType_Description() {
		return (EAttribute) guardedStageModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardedStageModelType_Id() {
		return (EAttribute) guardedStageModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardedStageModelType_Name() {
		return (EAttribute) guardedStageModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationModelType() {
		return informationModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationModelType_DataItem() {
		return (EReference) informationModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationModelType_Id() {
		return (EAttribute) informationModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationModelType_RootDataItemId() {
		return (EAttribute) informationModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputMappingType() {
		return inputMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputMappingType_Source() {
		return (EReference) inputMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputMappingType_Target() {
		return (EReference) inputMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMappingType_Type() {
		return (EAttribute) inputMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputType() {
		return inputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Value() {
		return (EAttribute) inputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Id() {
		return (EAttribute) inputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_RootElement() {
		return (EAttribute) inputTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_SchemaUri() {
		return (EAttribute) inputTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeType() {
		return invokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeType_InputMapping() {
		return (EReference) invokeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeType_ServiceDefinitionId() {
		return (EAttribute) invokeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleModelType() {
		return lifecycleModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleModelType_Lifecycle() {
		return (EReference) lifecycleModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifecycleModelType_Id() {
		return (EAttribute) lifecycleModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleType() {
		return lifecycleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleType_State() {
		return (EReference) lifecycleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleType_Transition() {
		return (EReference) lifecycleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifecycleType_Id() {
		return (EAttribute) lifecycleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifecycleType_StateXPath() {
		return (EAttribute) lifecycleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingType() {
		return mappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingType_Target() {
		return (EReference) mappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingType_Type() {
		return (EAttribute) mappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingType_Source() {
		return (EReference) mappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestoneType() {
		return milestoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestoneType_Condition() {
		return (EReference) milestoneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestoneType_Description() {
		return (EAttribute) milestoneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestoneType_EventIds() {
		return (EAttribute) milestoneTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestoneType_Id() {
		return (EAttribute) milestoneTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestoneType_Name() {
		return (EAttribute) milestoneTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		return outputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Value() {
		return (EAttribute) outputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Id() {
		return (EAttribute) outputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_RootElement() {
		return (EAttribute) outputTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_SchemaUri() {
		return (EAttribute) outputTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAdapterType() {
		return serviceAdapterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAdapterType_Value() {
		return (EAttribute) serviceAdapterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAdapterType_EventId() {
		return (EAttribute) serviceAdapterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAdapterType_Id() {
		return (EAttribute) serviceAdapterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAdapterType_Name() {
		return (EAttribute) serviceAdapterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Expression() {
		return (EAttribute) sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_RefType() {
		return (EAttribute) sourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_SourceId() {
		return (EAttribute) sourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_XPath() {
		return (EAttribute) sourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowGuardType() {
		return dataFlowGuardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_Description() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_EventIds() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_Expression() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_Id() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_Language() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowGuardType_Name() {
		return (EAttribute) dataFlowGuardTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStageType() {
		return stageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_DataFlowGuard() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_Milestone() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_Task() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_SubStage() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStageType_Description() {
		return (EAttribute) stageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStageType_Id() {
		return (EAttribute) stageTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStageType_Name() {
		return (EAttribute) stageTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_ProcessFlowGuard() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageType_FaultLogger() {
		return (EReference) stageTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateType() {
		return stateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateType_Id() {
		return (EAttribute) stateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateType_Initial() {
		return (EAttribute) stateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubStageType() {
		return subStageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_DataFlowGuard() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_Milestone() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_SubStage() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_Task() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubStageType_Description() {
		return (EAttribute) subStageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubStageType_Id() {
		return (EAttribute) subStageTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubStageType_Name() {
		return (EAttribute) subStageTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_ProcessFlowGuard() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStageType_FaultLogger() {
		return (EReference) subStageTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType() {
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_RefType() {
		return (EAttribute) targetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_TargetId() {
		return (EAttribute) targetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_XPath() {
		return (EAttribute) targetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Assign() {
		return (EReference) taskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Id() {
		return (EAttribute) taskTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Name() {
		return (EAttribute) taskTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionType_Assign() {
		return (EReference) transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Id() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Name() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_ServiceId() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_TargetStateIds() {
		return (EAttribute) transitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Id() {
		return (EAttribute) variableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessFlowGuardType() {
		return processFlowGuardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessFlowGuardType_Description() {
		return (EAttribute) processFlowGuardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessFlowGuardType_Id() {
		return (EAttribute) processFlowGuardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessFlowGuardType_Name() {
		return (EAttribute) processFlowGuardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessFlowGuardType_Expression() {
		return (EAttribute) processFlowGuardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultLoggerType() {
		return faultLoggerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_Description() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_EventIds() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_Expression() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_Id() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_Language() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultLoggerType_Name() {
		return (EAttribute) faultLoggerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsm_derivedFactory getGsm_derivedFactory() {
		return (Gsm_derivedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		assignTypeEClass = createEClass(ASSIGN_TYPE);
		createEReference(assignTypeEClass, ASSIGN_TYPE__MAPPING);

		compositeApplicationTypeEClass = createEClass(COMPOSITE_APPLICATION_TYPE);
		createEReference(compositeApplicationTypeEClass, COMPOSITE_APPLICATION_TYPE__EVENT_MODEL);
		createEReference(compositeApplicationTypeEClass, COMPOSITE_APPLICATION_TYPE__COMPONENT);
		createEAttribute(compositeApplicationTypeEClass, COMPOSITE_APPLICATION_TYPE__APP_VERSION);
		createEAttribute(compositeApplicationTypeEClass, COMPOSITE_APPLICATION_TYPE__NAME);
		createEAttribute(compositeApplicationTypeEClass, COMPOSITE_APPLICATION_TYPE__SIENA_VERSION);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__INFORMATION_MODEL);
		createEReference(componentTypeEClass, COMPONENT_TYPE__LIFECYCLE_MODEL);
		createEReference(componentTypeEClass, COMPONENT_TYPE__DATA_ACCESS_MODEL);
		createEReference(componentTypeEClass, COMPONENT_TYPE__FLOW_MODEL);
		createEReference(componentTypeEClass, COMPONENT_TYPE__GUARDED_STAGE_MODEL);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__ACCESS_CONTROL_MODEL);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__ID);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);

		eventModelTypeEClass = createEClass(EVENT_MODEL_TYPE);
		createEReference(eventModelTypeEClass, EVENT_MODEL_TYPE__EVENT);
		createEAttribute(eventModelTypeEClass, EVENT_MODEL_TYPE__DESCRIPTION);
		createEAttribute(eventModelTypeEClass, EVENT_MODEL_TYPE__ID);
		createEAttribute(eventModelTypeEClass, EVENT_MODEL_TYPE__NAME);

		eventTypeEClass = createEClass(EVENT_TYPE);
		createEAttribute(eventTypeEClass, EVENT_TYPE__DESCRIPTION);
		createEAttribute(eventTypeEClass, EVENT_TYPE__ID);
		createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);

		conditionTypeEClass = createEClass(CONDITION_TYPE);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__DESCRIPTION);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__EXPRESSION);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__ID);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__LANGUAGE);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__NAME);

		dataAccessModelTypeEClass = createEClass(DATA_ACCESS_MODEL_TYPE);
		createEAttribute(dataAccessModelTypeEClass, DATA_ACCESS_MODEL_TYPE__ID);

		dataItemTypeEClass = createEClass(DATA_ITEM_TYPE);
		createEAttribute(dataItemTypeEClass, DATA_ITEM_TYPE__ID);
		createEAttribute(dataItemTypeEClass, DATA_ITEM_TYPE__LIST_ELEMENT);
		createEAttribute(dataItemTypeEClass, DATA_ITEM_TYPE__ROOT_ELEMENT);
		createEAttribute(dataItemTypeEClass, DATA_ITEM_TYPE__SCHEMA_URI);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);

		flowModelTypeEClass = createEClass(FLOW_MODEL_TYPE);
		createEReference(flowModelTypeEClass, FLOW_MODEL_TYPE__FLOW);
		createEAttribute(flowModelTypeEClass, FLOW_MODEL_TYPE__ID);

		flowTypeEClass = createEClass(FLOW_TYPE);
		createEReference(flowTypeEClass, FLOW_TYPE__VARIABLE);
		createEReference(flowTypeEClass, FLOW_TYPE__TASK);
		createEReference(flowTypeEClass, FLOW_TYPE__FLOW_WIRE);
		createEAttribute(flowTypeEClass, FLOW_TYPE__ID);
		createEAttribute(flowTypeEClass, FLOW_TYPE__SERVICE_ID);

		flowWireTypeEClass = createEClass(FLOW_WIRE_TYPE);
		createEAttribute(flowWireTypeEClass, FLOW_WIRE_TYPE__SOURCE_ID);
		createEAttribute(flowWireTypeEClass, FLOW_WIRE_TYPE__TARGET_ID);

		guardedStageModelTypeEClass = createEClass(GUARDED_STAGE_MODEL_TYPE);
		createEReference(guardedStageModelTypeEClass, GUARDED_STAGE_MODEL_TYPE__STAGE);
		createEAttribute(guardedStageModelTypeEClass, GUARDED_STAGE_MODEL_TYPE__DESCRIPTION);
		createEAttribute(guardedStageModelTypeEClass, GUARDED_STAGE_MODEL_TYPE__ID);
		createEAttribute(guardedStageModelTypeEClass, GUARDED_STAGE_MODEL_TYPE__NAME);

		informationModelTypeEClass = createEClass(INFORMATION_MODEL_TYPE);
		createEReference(informationModelTypeEClass, INFORMATION_MODEL_TYPE__DATA_ITEM);
		createEAttribute(informationModelTypeEClass, INFORMATION_MODEL_TYPE__ID);
		createEAttribute(informationModelTypeEClass, INFORMATION_MODEL_TYPE__ROOT_DATA_ITEM_ID);

		inputMappingTypeEClass = createEClass(INPUT_MAPPING_TYPE);
		createEReference(inputMappingTypeEClass, INPUT_MAPPING_TYPE__SOURCE);
		createEReference(inputMappingTypeEClass, INPUT_MAPPING_TYPE__TARGET);
		createEAttribute(inputMappingTypeEClass, INPUT_MAPPING_TYPE__TYPE);

		inputTypeEClass = createEClass(INPUT_TYPE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__VALUE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__ID);
		createEAttribute(inputTypeEClass, INPUT_TYPE__ROOT_ELEMENT);
		createEAttribute(inputTypeEClass, INPUT_TYPE__SCHEMA_URI);

		invokeTypeEClass = createEClass(INVOKE_TYPE);
		createEReference(invokeTypeEClass, INVOKE_TYPE__INPUT_MAPPING);
		createEAttribute(invokeTypeEClass, INVOKE_TYPE__SERVICE_DEFINITION_ID);

		lifecycleModelTypeEClass = createEClass(LIFECYCLE_MODEL_TYPE);
		createEReference(lifecycleModelTypeEClass, LIFECYCLE_MODEL_TYPE__LIFECYCLE);
		createEAttribute(lifecycleModelTypeEClass, LIFECYCLE_MODEL_TYPE__ID);

		lifecycleTypeEClass = createEClass(LIFECYCLE_TYPE);
		createEReference(lifecycleTypeEClass, LIFECYCLE_TYPE__STATE);
		createEReference(lifecycleTypeEClass, LIFECYCLE_TYPE__TRANSITION);
		createEAttribute(lifecycleTypeEClass, LIFECYCLE_TYPE__ID);
		createEAttribute(lifecycleTypeEClass, LIFECYCLE_TYPE__STATE_XPATH);

		mappingTypeEClass = createEClass(MAPPING_TYPE);
		createEReference(mappingTypeEClass, MAPPING_TYPE__TARGET);
		createEAttribute(mappingTypeEClass, MAPPING_TYPE__TYPE);
		createEReference(mappingTypeEClass, MAPPING_TYPE__SOURCE);

		milestoneTypeEClass = createEClass(MILESTONE_TYPE);
		createEReference(milestoneTypeEClass, MILESTONE_TYPE__CONDITION);
		createEAttribute(milestoneTypeEClass, MILESTONE_TYPE__DESCRIPTION);
		createEAttribute(milestoneTypeEClass, MILESTONE_TYPE__EVENT_IDS);
		createEAttribute(milestoneTypeEClass, MILESTONE_TYPE__ID);
		createEAttribute(milestoneTypeEClass, MILESTONE_TYPE__NAME);

		outputTypeEClass = createEClass(OUTPUT_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__VALUE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__ID);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__ROOT_ELEMENT);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__SCHEMA_URI);

		serviceAdapterTypeEClass = createEClass(SERVICE_ADAPTER_TYPE);
		createEAttribute(serviceAdapterTypeEClass, SERVICE_ADAPTER_TYPE__VALUE);
		createEAttribute(serviceAdapterTypeEClass, SERVICE_ADAPTER_TYPE__EVENT_ID);
		createEAttribute(serviceAdapterTypeEClass, SERVICE_ADAPTER_TYPE__ID);
		createEAttribute(serviceAdapterTypeEClass, SERVICE_ADAPTER_TYPE__NAME);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__EXPRESSION);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__REF_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__SOURCE_ID);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__XPATH);

		dataFlowGuardTypeEClass = createEClass(DATA_FLOW_GUARD_TYPE);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__DESCRIPTION);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__EVENT_IDS);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__EXPRESSION);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__ID);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__LANGUAGE);
		createEAttribute(dataFlowGuardTypeEClass, DATA_FLOW_GUARD_TYPE__NAME);

		stageTypeEClass = createEClass(STAGE_TYPE);
		createEReference(stageTypeEClass, STAGE_TYPE__DATA_FLOW_GUARD);
		createEReference(stageTypeEClass, STAGE_TYPE__MILESTONE);
		createEReference(stageTypeEClass, STAGE_TYPE__TASK);
		createEReference(stageTypeEClass, STAGE_TYPE__SUB_STAGE);
		createEAttribute(stageTypeEClass, STAGE_TYPE__DESCRIPTION);
		createEAttribute(stageTypeEClass, STAGE_TYPE__ID);
		createEAttribute(stageTypeEClass, STAGE_TYPE__NAME);
		createEReference(stageTypeEClass, STAGE_TYPE__PROCESS_FLOW_GUARD);
		createEReference(stageTypeEClass, STAGE_TYPE__FAULT_LOGGER);

		stateTypeEClass = createEClass(STATE_TYPE);
		createEAttribute(stateTypeEClass, STATE_TYPE__ID);
		createEAttribute(stateTypeEClass, STATE_TYPE__INITIAL);

		subStageTypeEClass = createEClass(SUB_STAGE_TYPE);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__DATA_FLOW_GUARD);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__MILESTONE);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__SUB_STAGE);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__TASK);
		createEAttribute(subStageTypeEClass, SUB_STAGE_TYPE__DESCRIPTION);
		createEAttribute(subStageTypeEClass, SUB_STAGE_TYPE__ID);
		createEAttribute(subStageTypeEClass, SUB_STAGE_TYPE__NAME);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__PROCESS_FLOW_GUARD);
		createEReference(subStageTypeEClass, SUB_STAGE_TYPE__FAULT_LOGGER);

		targetTypeEClass = createEClass(TARGET_TYPE);
		createEAttribute(targetTypeEClass, TARGET_TYPE__REF_TYPE);
		createEAttribute(targetTypeEClass, TARGET_TYPE__TARGET_ID);
		createEAttribute(targetTypeEClass, TARGET_TYPE__XPATH);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEReference(taskTypeEClass, TASK_TYPE__ASSIGN);
		createEAttribute(taskTypeEClass, TASK_TYPE__ID);
		createEAttribute(taskTypeEClass, TASK_TYPE__NAME);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEReference(transitionTypeEClass, TRANSITION_TYPE__ASSIGN);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__ID);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__NAME);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__SERVICE_ID);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TARGET_STATE_IDS);

		variableTypeEClass = createEClass(VARIABLE_TYPE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__ID);

		processFlowGuardTypeEClass = createEClass(PROCESS_FLOW_GUARD_TYPE);
		createEAttribute(processFlowGuardTypeEClass, PROCESS_FLOW_GUARD_TYPE__DESCRIPTION);
		createEAttribute(processFlowGuardTypeEClass, PROCESS_FLOW_GUARD_TYPE__ID);
		createEAttribute(processFlowGuardTypeEClass, PROCESS_FLOW_GUARD_TYPE__NAME);
		createEAttribute(processFlowGuardTypeEClass, PROCESS_FLOW_GUARD_TYPE__EXPRESSION);

		faultLoggerTypeEClass = createEClass(FAULT_LOGGER_TYPE);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__DESCRIPTION);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__EVENT_IDS);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__EXPRESSION);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__ID);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__LANGUAGE);
		createEAttribute(faultLoggerTypeEClass, FAULT_LOGGER_TYPE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(assignTypeEClass, AssignType.class, "AssignType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignType_Mapping(), this.getMappingType(), null, "mapping", null, 1, 1, AssignType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeApplicationTypeEClass, CompositeApplicationType.class, "CompositeApplicationType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeApplicationType_EventModel(), this.getEventModelType(), null, "eventModel", null, 0,
				1, CompositeApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeApplicationType_Component(), this.getComponentType(), null, "component", null, 0, -1,
				CompositeApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeApplicationType_AppVersion(), theXMLTypePackage.getString(), "appVersion", null, 0,
				1, CompositeApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeApplicationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				CompositeApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeApplicationType_SienaVersion(), theXMLTypePackage.getString(), "sienaVersion", null,
				0, 1, CompositeApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_InformationModel(), this.getInformationModelType(), null, "informationModel",
				null, 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_LifecycleModel(), this.getLifecycleModelType(), null, "lifecycleModel", null, 1,
				1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_DataAccessModel(), this.getDataAccessModelType(), null, "dataAccessModel", null,
				1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_FlowModel(), this.getFlowModelType(), null, "flowModel", null, 0, 1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_GuardedStageModel(), this.getGuardedStageModelType(), null, "guardedStageModel",
				null, 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_AccessControlModel(), theXMLTypePackage.getString(), "accessControlModel", null,
				1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventModelTypeEClass, EventModelType.class, "EventModelType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventModelType_Event(), this.getEventType(), null, "event", null, 0, -1, EventModelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModelType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				EventModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModelType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, EventModelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventModelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				EventModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, EventType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, EventType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionTypeEClass, ConditionType.class, "ConditionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1,
				ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ConditionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_Language(), theXMLTypePackage.getString(), "language", null, 0, 1,
				ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ConditionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAccessModelTypeEClass, DataAccessModelType.class, "DataAccessModelType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAccessModelType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				DataAccessModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemTypeEClass, DataItemType.class, "DataItemType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataItemType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, DataItemType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItemType_ListElement(), theXMLTypePackage.getString(), "listElement", null, 0, 1,
				DataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItemType_RootElement(), theXMLTypePackage.getString(), "rootElement", null, 0, 1,
				DataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItemType_SchemaUri(), theXMLTypePackage.getString(), "schemaUri", null, 0, 1,
				DataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowModelTypeEClass, FlowModelType.class, "FlowModelType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowModelType_Flow(), this.getFlowType(), null, "flow", null, 1, 1, FlowModelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowModelType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, FlowModelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowTypeEClass, FlowType.class, "FlowType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, FlowType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowType_Task(), this.getTaskType(), null, "task", null, 0, -1, FlowType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFlowType_FlowWire(), this.getFlowWireType(), null, "flowWire", null, 0, -1, FlowType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, FlowType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowType_ServiceId(), theXMLTypePackage.getString(), "serviceId", null, 0, 1, FlowType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowWireTypeEClass, FlowWireType.class, "FlowWireType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowWireType_SourceId(), theXMLTypePackage.getString(), "sourceId", null, 0, 1,
				FlowWireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowWireType_TargetId(), theXMLTypePackage.getString(), "targetId", null, 0, 1,
				FlowWireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(guardedStageModelTypeEClass, GuardedStageModelType.class, "GuardedStageModelType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardedStageModelType_Stage(), this.getStageType(), null, "stage", null, 0, -1,
				GuardedStageModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuardedStageModelType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				GuardedStageModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuardedStageModelType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				GuardedStageModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuardedStageModelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				GuardedStageModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationModelTypeEClass, InformationModelType.class, "InformationModelType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationModelType_DataItem(), this.getDataItemType(), null, "dataItem", null, 1, 1,
				InformationModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationModelType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				InformationModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationModelType_RootDataItemId(), theXMLTypePackage.getString(), "rootDataItemId", null,
				0, 1, InformationModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputMappingTypeEClass, InputMappingType.class, "InputMappingType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputMappingType_Source(), this.getSourceType(), null, "source", null, 1, 1,
				InputMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputMappingType_Target(), this.getTargetType(), null, "target", null, 1, 1,
				InputMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputMappingType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1,
				InputMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, InputType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, InputType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_RootElement(), theXMLTypePackage.getString(), "rootElement", null, 0, 1,
				InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_SchemaUri(), theXMLTypePackage.getString(), "schemaUri", null, 0, 1,
				InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(invokeTypeEClass, InvokeType.class, "InvokeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeType_InputMapping(), this.getInputMappingType(), null, "inputMapping", null, 0, -1,
				InvokeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeType_ServiceDefinitionId(), theXMLTypePackage.getString(), "serviceDefinitionId", null,
				0, 1, InvokeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleModelTypeEClass, LifecycleModelType.class, "LifecycleModelType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifecycleModelType_Lifecycle(), this.getLifecycleType(), null, "lifecycle", null, 1, 1,
				LifecycleModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycleModelType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				LifecycleModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleTypeEClass, LifecycleType.class, "LifecycleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifecycleType_State(), this.getStateType(), null, "state", null, 1, 1, LifecycleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifecycleType_Transition(), this.getTransitionType(), null, "transition", null, 1, 1,
				LifecycleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycleType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, LifecycleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycleType_StateXPath(), theXMLTypePackage.getString(), "stateXPath", null, 0, 1,
				LifecycleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mappingTypeEClass, MappingType.class, "MappingType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingType_Target(), this.getTargetType(), null, "target", null, 1, 1, MappingType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, MappingType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingType_Source(), this.getSourceType(), null, "source", null, 1, 1, MappingType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneTypeEClass, MilestoneType.class, "MilestoneType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMilestoneType_Condition(), this.getConditionType(), null, "condition", null, 1, 1,
				MilestoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestoneType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				MilestoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestoneType_EventIds(), theXMLTypePackage.getString(), "eventIds", null, 0, 1,
				MilestoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestoneType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, MilestoneType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestoneType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MilestoneType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, OutputType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, OutputType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_RootElement(), theXMLTypePackage.getString(), "rootElement", null, 0, 1,
				OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_SchemaUri(), theXMLTypePackage.getString(), "schemaUri", null, 0, 1,
				OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceAdapterTypeEClass, ServiceAdapterType.class, "ServiceAdapterType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceAdapterType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1,
				ServiceAdapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAdapterType_EventId(), theXMLTypePackage.getString(), "eventId", null, 0, 1,
				ServiceAdapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAdapterType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				ServiceAdapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceAdapterType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				ServiceAdapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SourceType.class, "SourceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1,
				SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_RefType(), theXMLTypePackage.getString(), "refType", null, 0, 1, SourceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_SourceId(), theXMLTypePackage.getString(), "sourceId", null, 0, 1,
				SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_XPath(), theXMLTypePackage.getString(), "xPath", null, 0, 1, SourceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowGuardTypeEClass, DataFlowGuardType.class, "DataFlowGuardType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFlowGuardType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowGuardType_EventIds(), theXMLTypePackage.getString(), "eventIds", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowGuardType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowGuardType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowGuardType_Language(), theXMLTypePackage.getString(), "language", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowGuardType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				DataFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stageTypeEClass, StageType.class, "StageType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStageType_DataFlowGuard(), this.getDataFlowGuardType(), null, "dataFlowGuard", null, 1, -1,
				StageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStageType_Milestone(), this.getMilestoneType(), null, "milestone", null, 1, -1,
				StageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStageType_Task(), this.getTaskType(), null, "task", null, 0, 1, StageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStageType_SubStage(), this.getSubStageType(), null, "subStage", null, 0, -1, StageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				StageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, StageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, StageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStageType_ProcessFlowGuard(), this.getProcessFlowGuardType(), null, "processFlowGuard", null,
				0, -1, StageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStageType_FaultLogger(), this.getFaultLoggerType(), null, "faultLogger", null, 0, -1,
				StageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTypeEClass, StateType.class, "StateType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, StateType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateType_Initial(), theXMLTypePackage.getString(), "initial", null, 0, 1, StateType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subStageTypeEClass, SubStageType.class, "SubStageType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubStageType_DataFlowGuard(), this.getDataFlowGuardType(), null, "dataFlowGuard", null, 1, -1,
				SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStageType_Milestone(), this.getMilestoneType(), null, "milestone", null, 1, -1,
				SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStageType_SubStage(), this.getSubStageType(), null, "subStage", null, 0, -1,
				SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStageType_Task(), this.getTaskType(), null, "task", null, 0, 1, SubStageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubStageType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubStageType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, SubStageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubStageType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SubStageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStageType_ProcessFlowGuard(), this.getProcessFlowGuardType(), null, "processFlowGuard",
				null, 0, -1, SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStageType_FaultLogger(), this.getFaultLoggerType(), null, "faultLogger", null, 0, -1,
				SubStageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetTypeEClass, TargetType.class, "TargetType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetType_RefType(), theXMLTypePackage.getString(), "refType", null, 0, 1, TargetType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_TargetId(), theXMLTypePackage.getString(), "targetId", null, 0, 1,
				TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_XPath(), theXMLTypePackage.getString(), "xPath", null, 0, 1, TargetType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskType_Assign(), this.getAssignType(), null, "assign", null, 1, 1, TaskType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, TaskType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TaskType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionType_Assign(), this.getAssignType(), null, "assign", null, 0, -1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, TransitionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ServiceId(), theXMLTypePackage.getString(), "serviceId", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_TargetStateIds(), theXMLTypePackage.getString(), "targetStateIds", null, 0, 1,
				TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, VariableType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processFlowGuardTypeEClass, ProcessFlowGuardType.class, "ProcessFlowGuardType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessFlowGuardType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				ProcessFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessFlowGuardType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1,
				ProcessFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessFlowGuardType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				ProcessFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessFlowGuardType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1,
				ProcessFlowGuardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultLoggerTypeEClass, FaultLoggerType.class, "FaultLoggerType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultLoggerType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
				FaultLoggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultLoggerType_EventIds(), theXMLTypePackage.getString(), "eventIds", null, 0, 1,
				FaultLoggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultLoggerType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1,
				FaultLoggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultLoggerType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, FaultLoggerType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultLoggerType_Language(), theXMLTypePackage.getString(), "language", null, 0, 1,
				FaultLoggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultLoggerType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				FaultLoggerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(assignTypeEClass, source, new String[] { "name", "Assign_._3_._type", "kind", "elementOnly" });
		addAnnotation(getAssignType_Mapping(), source,
				new String[] { "kind", "element", "name", "Mapping", "namespace", "##targetNamespace" });
		addAnnotation(compositeApplicationTypeEClass, source,
				new String[] { "name", "CompositeApplication_._type", "kind", "elementOnly" });
		addAnnotation(getCompositeApplicationType_EventModel(), source,
				new String[] { "kind", "element", "name", "EventModel", "namespace", "##targetNamespace" });
		addAnnotation(getCompositeApplicationType_Component(), source,
				new String[] { "kind", "element", "name", "Component", "namespace", "##targetNamespace" });
		addAnnotation(getCompositeApplicationType_AppVersion(), source,
				new String[] { "kind", "attribute", "name", "appVersion" });
		addAnnotation(getCompositeApplicationType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getCompositeApplicationType_SienaVersion(), source,
				new String[] { "kind", "attribute", "name", "sienaVersion" });
		addAnnotation(componentTypeEClass, source, new String[] { "name", "Component_._type", "kind", "elementOnly" });
		addAnnotation(getComponentType_InformationModel(), source,
				new String[] { "kind", "element", "name", "InformationModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_LifecycleModel(), source,
				new String[] { "kind", "element", "name", "LifecycleModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_DataAccessModel(), source,
				new String[] { "kind", "element", "name", "DataAccessModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_FlowModel(), source,
				new String[] { "kind", "element", "name", "FlowModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_GuardedStageModel(), source,
				new String[] { "kind", "element", "name", "GuardedStageModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_AccessControlModel(), source,
				new String[] { "kind", "element", "name", "AccessControlModel", "namespace", "##targetNamespace" });
		addAnnotation(getComponentType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getComponentType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(eventModelTypeEClass, source, new String[] { "name", "EventModelType", "kind", "elementOnly" });
		addAnnotation(getEventModelType_Event(), source,
				new String[] { "kind", "element", "name", "Event", "namespace", "##targetNamespace" });
		addAnnotation(getEventModelType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getEventModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getEventModelType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(eventTypeEClass, source, new String[] { "name", "EventType", "kind", "elementOnly" });
		addAnnotation(getEventType_Description(), source, new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getEventType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getEventType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(conditionTypeEClass, source, new String[] { "name", "Condition_._3_._type", "kind", "simple" });
		addAnnotation(getConditionType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getConditionType_Expression(), source,
				new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getConditionType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getConditionType_Language(), source, new String[] { "kind", "attribute", "name", "language" });
		addAnnotation(getConditionType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(dataAccessModelTypeEClass, source,
				new String[] { "name", "DataAccessModel_._type", "kind", "simple" });
		addAnnotation(getDataAccessModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(dataItemTypeEClass, source, new String[] { "name", "DataItem_._type", "kind", "simple" });
		addAnnotation(getDataItemType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getDataItemType_ListElement(), source,
				new String[] { "kind", "attribute", "name", "listElement" });
		addAnnotation(getDataItemType_RootElement(), source,
				new String[] { "kind", "attribute", "name", "rootElement" });
		addAnnotation(getDataItemType_SchemaUri(), source, new String[] { "kind", "attribute", "name", "schemaUri" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(flowModelTypeEClass, source, new String[] { "name", "FlowModel_._type", "kind", "elementOnly" });
		addAnnotation(getFlowModelType_Flow(), source,
				new String[] { "kind", "element", "name", "Flow", "namespace", "##targetNamespace" });
		addAnnotation(getFlowModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(flowTypeEClass, source, new String[] { "name", "Flow_._type", "kind", "elementOnly" });
		addAnnotation(getFlowType_Variable(), source,
				new String[] { "kind", "element", "name", "Variable", "namespace", "##targetNamespace" });
		addAnnotation(getFlowType_Task(), source,
				new String[] { "kind", "element", "name", "Task", "namespace", "##targetNamespace" });
		addAnnotation(getFlowType_FlowWire(), source,
				new String[] { "kind", "element", "name", "FlowWire", "namespace", "##targetNamespace" });
		addAnnotation(getFlowType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getFlowType_ServiceId(), source, new String[] { "kind", "attribute", "name", "serviceId" });
		addAnnotation(flowWireTypeEClass, source, new String[] { "name", "FlowWire_._type", "kind", "simple" });
		addAnnotation(getFlowWireType_SourceId(), source, new String[] { "kind", "attribute", "name", "sourceId" });
		addAnnotation(getFlowWireType_TargetId(), source, new String[] { "kind", "attribute", "name", "targetId" });
		addAnnotation(guardedStageModelTypeEClass, source,
				new String[] { "name", "GuardedStageModel_._type", "kind", "elementOnly" });
		addAnnotation(getGuardedStageModelType_Stage(), source,
				new String[] { "kind", "element", "name", "Stage", "namespace", "##targetNamespace" });
		addAnnotation(getGuardedStageModelType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getGuardedStageModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getGuardedStageModelType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(informationModelTypeEClass, source,
				new String[] { "name", "InformationModel_._type", "kind", "elementOnly" });
		addAnnotation(getInformationModelType_DataItem(), source,
				new String[] { "kind", "element", "name", "DataItem", "namespace", "##targetNamespace" });
		addAnnotation(getInformationModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getInformationModelType_RootDataItemId(), source,
				new String[] { "kind", "attribute", "name", "rootDataItemId" });
		addAnnotation(inputMappingTypeEClass, source,
				new String[] { "name", "InputMapping_._type", "kind", "elementOnly" });
		addAnnotation(getInputMappingType_Source(), source,
				new String[] { "kind", "element", "name", "Source", "namespace", "##targetNamespace" });
		addAnnotation(getInputMappingType_Target(), source,
				new String[] { "kind", "element", "name", "Target", "namespace", "##targetNamespace" });
		addAnnotation(getInputMappingType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(inputTypeEClass, source, new String[] { "name", "Input_._type", "kind", "simple" });
		addAnnotation(getInputType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getInputType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getInputType_RootElement(), source, new String[] { "kind", "attribute", "name", "rootElement" });
		addAnnotation(getInputType_SchemaUri(), source, new String[] { "kind", "attribute", "name", "schemaUri" });
		addAnnotation(invokeTypeEClass, source, new String[] { "name", "Invoke_._type", "kind", "elementOnly" });
		addAnnotation(getInvokeType_InputMapping(), source,
				new String[] { "kind", "element", "name", "InputMapping", "namespace", "##targetNamespace" });
		addAnnotation(getInvokeType_ServiceDefinitionId(), source,
				new String[] { "kind", "attribute", "name", "serviceDefinitionId" });
		addAnnotation(lifecycleModelTypeEClass, source,
				new String[] { "name", "LifecycleModel_._type", "kind", "elementOnly" });
		addAnnotation(getLifecycleModelType_Lifecycle(), source,
				new String[] { "kind", "element", "name", "Lifecycle", "namespace", "##targetNamespace" });
		addAnnotation(getLifecycleModelType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(lifecycleTypeEClass, source, new String[] { "name", "Lifecycle_._type", "kind", "elementOnly" });
		addAnnotation(getLifecycleType_State(), source,
				new String[] { "kind", "element", "name", "State", "namespace", "##targetNamespace" });
		addAnnotation(getLifecycleType_Transition(), source,
				new String[] { "kind", "element", "name", "Transition", "namespace", "##targetNamespace" });
		addAnnotation(getLifecycleType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getLifecycleType_StateXPath(), source,
				new String[] { "kind", "attribute", "name", "stateXPath" });
		addAnnotation(mappingTypeEClass, source, new String[] { "name", "Mapping_._1_._type", "kind", "elementOnly" });
		addAnnotation(getMappingType_Target(), source,
				new String[] { "kind", "element", "name", "Target", "namespace", "##targetNamespace" });
		addAnnotation(getMappingType_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(getMappingType_Source(), source,
				new String[] { "kind", "element", "name", "Source", "namespace", "##targetNamespace" });
		addAnnotation(milestoneTypeEClass, source,
				new String[] { "name", "Milestone_._3_._type", "kind", "elementOnly" });
		addAnnotation(getMilestoneType_Condition(), source,
				new String[] { "kind", "element", "name", "Condition", "namespace", "##targetNamespace" });
		addAnnotation(getMilestoneType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getMilestoneType_EventIds(), source, new String[] { "kind", "attribute", "name", "eventIds" });
		addAnnotation(getMilestoneType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getMilestoneType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(outputTypeEClass, source, new String[] { "name", "Output_._type", "kind", "simple" });
		addAnnotation(getOutputType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getOutputType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getOutputType_RootElement(), source, new String[] { "kind", "attribute", "name", "rootElement" });
		addAnnotation(getOutputType_SchemaUri(), source, new String[] { "kind", "attribute", "name", "schemaUri" });
		addAnnotation(serviceAdapterTypeEClass, source,
				new String[] { "name", "ServiceAdapter_._type", "kind", "simple" });
		addAnnotation(getServiceAdapterType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getServiceAdapterType_EventId(), source, new String[] { "kind", "attribute", "name", "eventId" });
		addAnnotation(getServiceAdapterType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getServiceAdapterType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(sourceTypeEClass, source, new String[] { "name", "Source_._3_._type", "kind", "simple" });
		addAnnotation(getSourceType_Expression(), source, new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getSourceType_RefType(), source, new String[] { "kind", "attribute", "name", "refType" });
		addAnnotation(getSourceType_SourceId(), source, new String[] { "kind", "attribute", "name", "sourceId" });
		addAnnotation(getSourceType_XPath(), source, new String[] { "kind", "attribute", "name", "xPath" });
		addAnnotation(dataFlowGuardTypeEClass, source,
				new String[] { "name", "StageGuard_._3_._type", "kind", "simple" });
		addAnnotation(getDataFlowGuardType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getDataFlowGuardType_EventIds(), source,
				new String[] { "kind", "attribute", "name", "eventIds" });
		addAnnotation(getDataFlowGuardType_Expression(), source,
				new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getDataFlowGuardType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getDataFlowGuardType_Language(), source,
				new String[] { "kind", "attribute", "name", "language" });
		addAnnotation(getDataFlowGuardType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(stageTypeEClass, source, new String[] { "name", "Stage_._type", "kind", "elementOnly" });
		addAnnotation(getStageType_DataFlowGuard(), source,
				new String[] { "kind", "element", "name", "StageGuard", "namespace", "##targetNamespace" });
		addAnnotation(getStageType_Milestone(), source,
				new String[] { "kind", "element", "name", "Milestone", "namespace", "##targetNamespace" });
		addAnnotation(getStageType_Task(), source,
				new String[] { "kind", "element", "name", "Task", "namespace", "##targetNamespace" });
		addAnnotation(getStageType_SubStage(), source,
				new String[] { "kind", "element", "name", "SubStage", "namespace", "##targetNamespace" });
		addAnnotation(getStageType_Description(), source, new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getStageType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getStageType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(stateTypeEClass, source, new String[] { "name", "State_._type", "kind", "simple" });
		addAnnotation(getStateType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getStateType_Initial(), source, new String[] { "kind", "attribute", "name", "initial" });
		addAnnotation(subStageTypeEClass, source,
				new String[] { "name", "SubStage_._2_._type", "kind", "elementOnly" });
		addAnnotation(getSubStageType_DataFlowGuard(), source,
				new String[] { "kind", "element", "name", "StageGuard", "namespace", "##targetNamespace" });
		addAnnotation(getSubStageType_Milestone(), source,
				new String[] { "kind", "element", "name", "Milestone", "namespace", "##targetNamespace" });
		addAnnotation(getSubStageType_SubStage(), source,
				new String[] { "kind", "element", "name", "SubStage", "namespace", "##targetNamespace" });
		addAnnotation(getSubStageType_Task(), source,
				new String[] { "kind", "element", "name", "Task", "namespace", "##targetNamespace" });
		addAnnotation(getSubStageType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getSubStageType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getSubStageType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(targetTypeEClass, source, new String[] { "name", "Target_._2_._type", "kind", "simple" });
		addAnnotation(getTargetType_RefType(), source, new String[] { "kind", "attribute", "name", "refType" });
		addAnnotation(getTargetType_TargetId(), source, new String[] { "kind", "attribute", "name", "targetId" });
		addAnnotation(getTargetType_XPath(), source, new String[] { "kind", "attribute", "name", "xPath" });
		addAnnotation(taskTypeEClass, source, new String[] { "name", "Task_._type", "kind", "elementOnly" });
		addAnnotation(getTaskType_Assign(), source,
				new String[] { "kind", "element", "name", "Assign", "namespace", "##targetNamespace" });
		addAnnotation(getTaskType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getTaskType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(transitionTypeEClass, source,
				new String[] { "name", "Transition_._type", "kind", "elementOnly" });
		addAnnotation(getTransitionType_Assign(), source,
				new String[] { "kind", "element", "name", "Assign", "namespace", "##targetNamespace" });
		addAnnotation(getTransitionType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getTransitionType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getTransitionType_ServiceId(), source, new String[] { "kind", "attribute", "name", "serviceId" });
		addAnnotation(getTransitionType_TargetStateIds(), source,
				new String[] { "kind", "attribute", "name", "targetStateIds" });
		addAnnotation(variableTypeEClass, source, new String[] { "name", "Variable_._type", "kind", "simple" });
		addAnnotation(getVariableType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(faultLoggerTypeEClass, source,
				new String[] { "name", "StageGuard_._3_._type", "kind", "simple" });
		addAnnotation(getFaultLoggerType_Description(), source,
				new String[] { "kind", "attribute", "name", "description" });
		addAnnotation(getFaultLoggerType_EventIds(), source, new String[] { "kind", "attribute", "name", "eventIds" });
		addAnnotation(getFaultLoggerType_Expression(), source,
				new String[] { "kind", "attribute", "name", "expression" });
		addAnnotation(getFaultLoggerType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getFaultLoggerType_Language(), source, new String[] { "kind", "attribute", "name", "language" });
		addAnnotation(getFaultLoggerType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
	}

} //Gsm_derivedPackageImpl
