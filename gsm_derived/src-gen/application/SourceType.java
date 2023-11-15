/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.SourceType#getExpression <em>Expression</em>}</li>
 *   <li>{@link application.SourceType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link application.SourceType#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link application.SourceType#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @see application.Gsm_derivedPackage#getSourceType()
 * @model extendedMetaData="name='Source_._3_._type' kind='simple'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see application.Gsm_derivedPackage#getSourceType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link application.SourceType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' attribute.
	 * @see #setRefType(String)
	 * @see application.Gsm_derivedPackage#getSourceType_RefType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='refType'"
	 * @generated
	 */
	String getRefType();

	/**
	 * Sets the value of the '{@link application.SourceType#getRefType <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' attribute.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' attribute.
	 * @see #setSourceId(String)
	 * @see application.Gsm_derivedPackage#getSourceType_SourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sourceId'"
	 * @generated
	 */
	String getSourceId();

	/**
	 * Sets the value of the '{@link application.SourceType#getSourceId <em>Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' attribute.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(String value);

	/**
	 * Returns the value of the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPath</em>' attribute.
	 * @see #setXPath(String)
	 * @see application.Gsm_derivedPackage#getSourceType_XPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xPath'"
	 * @generated
	 */
	String getXPath();

	/**
	 * Sets the value of the '{@link application.SourceType#getXPath <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath</em>' attribute.
	 * @see #getXPath()
	 * @generated
	 */
	void setXPath(String value);

} // SourceType
