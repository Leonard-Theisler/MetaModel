/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.TargetType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link application.TargetType#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link application.TargetType#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getTargetType()
 * @model extendedMetaData="name='Target_._2_._type' kind='simple'"
 * @generated
 */
public interface TargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' attribute.
	 * @see #setRefType(String)
	 * @see application.Gsm_derivedPackage#getTargetType_RefType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='refType'"
	 * @generated
	 */
	String getRefType();

	/**
	 * Sets the value of the '{@link application.TargetType#getRefType <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' attribute.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(String value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see application.Gsm_derivedPackage#getTargetType_TargetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='targetId'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link application.TargetType#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

	/**
	 * Returns the value of the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPath</em>' attribute.
	 * @see #setXPath(String)
	 * @see application.Gsm_derivedPackage#getTargetType_XPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xPath'"
	 * @generated
	 */
	String getXPath();

	/**
	 * Sets the value of the '{@link application.TargetType#getXPath <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath</em>' attribute.
	 * @see #getXPath()
	 * @generated
	 */
	void setXPath(String value);

} // TargetType
