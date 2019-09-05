/**
 */
package programmes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link programmes.Person#getSurName <em>Sur Name</em>}</li>
 *   <li>{@link programmes.Person#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see programmes.ProgrammesPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link programmes.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sur Name</em>' attribute.
	 * @see #setSurName(String)
	 * @see programmes.ProgrammesPackage#getPerson_SurName()
	 * @model
	 * @generated
	 */
	String getSurName();

	/**
	 * Sets the value of the '{@link programmes.Person#getSurName <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sur Name</em>' attribute.
	 * @see #getSurName()
	 * @generated
	 */
	void setSurName(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see programmes.ProgrammesPackage#getPerson_FullName()
	 * @model derived="true"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link programmes.Person#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

} // Person
