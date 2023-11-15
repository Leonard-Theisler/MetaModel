/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.InformationModelType#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link application.InformationModelType#getId <em>Id</em>}</li>
 *   <li>{@link application.InformationModelType#getRootDataItemId <em>Root Data Item Id</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getInformationModelType()
 * @model extendedMetaData="name='InformationModel_._type' kind='elementOnly'"
 * @generated
 */
public interface InformationModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Item</em>' containment reference.
	 * @see #setDataItem(DataItemType)
	 * @see application.Gsm_derivedPackage#getInformationModelType_DataItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataItem' namespace='##targetNamespace'"
	 * @generated
	 */
	DataItemType getDataItem();

	/**
	 * Sets the value of the '{@link application.InformationModelType#getDataItem <em>Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Item</em>' containment reference.
	 * @see #getDataItem()
	 * @generated
	 */
	void setDataItem(DataItemType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see application.Gsm_derivedPackage#getInformationModelType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link application.InformationModelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Root Data Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Data Item Id</em>' attribute.
	 * @see #setRootDataItemId(String)
	 * @see application.Gsm_derivedPackage#getInformationModelType_RootDataItemId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rootDataItemId'"
	 * @generated
	 */
	String getRootDataItemId();

	/**
	 * Sets the value of the '{@link application.InformationModelType#getRootDataItemId <em>Root Data Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Data Item Id</em>' attribute.
	 * @see #getRootDataItemId()
	 * @generated
	 */
	void setRootDataItemId(String value);

} // InformationModelType
