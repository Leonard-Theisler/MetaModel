/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.OutputType#getValue <em>Value</em>}</li>
 *   <li>{@link application.OutputType#getId <em>Id</em>}</li>
 *   <li>{@link application.OutputType#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link application.OutputType#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getOutputType()
 * @model extendedMetaData="name='Output_._type' kind='simple'"
 * @generated
 */
public interface OutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see application.Gsm_derivedPackage#getOutputType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link application.OutputType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getOutputType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.OutputType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see application.Gsm_derivedPackage#getOutputType_RootElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rootElement'"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link application.OutputType#getRootElement <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' attribute.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(String value);

	/**
	 * Returns the value of the '<em><b>Schema Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Uri</em>' attribute.
	 * @see #setSchemaUri(String)
	 * @see application.Gsm_derivedPackage#getOutputType_SchemaUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaUri'"
	 * @generated
	 */
	String getSchemaUri();

	/**
	 * Sets the value of the '{@link application.OutputType#getSchemaUri <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Uri</em>' attribute.
	 * @see #getSchemaUri()
	 * @generated
	 */
	void setSchemaUri(String value);

} // OutputType
