/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.DataItemType#getId <em>Id</em>}</li>
 *   <li>{@link application.DataItemType#getListElement <em>List Element</em>}</li>
 *   <li>{@link application.DataItemType#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link application.DataItemType#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getDataItemType()
 * @model extendedMetaData="name='DataItem_._type' kind='simple'"
 * @generated
 */
public interface DataItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getDataItemType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.DataItemType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>List Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Element</em>' attribute.
	 * @see #setListElement(String)
	 * @see application.Gsm_derivedPackage#getDataItemType_ListElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='listElement'"
	 * @generated
	 */
	String getListElement();

	/**
	 * Sets the value of the '{@link application.DataItemType#getListElement <em>List Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Element</em>' attribute.
	 * @see #getListElement()
	 * @generated
	 */
	void setListElement(String value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see application.Gsm_derivedPackage#getDataItemType_RootElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rootElement'"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link application.DataItemType#getRootElement <em>Root Element</em>}' attribute.
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
	 * @see application.Gsm_derivedPackage#getDataItemType_SchemaUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaUri'"
	 * @generated
	 */
	String getSchemaUri();

	/**
	 * Sets the value of the '{@link application.DataItemType#getSchemaUri <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Uri</em>' attribute.
	 * @see #getSchemaUri()
	 * @generated
	 */
	void setSchemaUri(String value);

} // DataItemType
