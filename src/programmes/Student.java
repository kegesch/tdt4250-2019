/**
 */
package programmes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Student#getEnrolledIn <em>Enrolled In</em>}</li>
 *   <li>{@link programmes.Student#getStudentNumber <em>Student Number</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Enrolled In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled In</em>' reference.
	 * @see #setEnrolledIn(ProgrammeInstance)
	 * @see programmes.ProgrammesPackage#getStudent_EnrolledIn()
	 * @model
	 * @generated
	 */
	ProgrammeInstance getEnrolledIn();

	/**
	 * Sets the value of the '{@link programmes.Student#getEnrolledIn <em>Enrolled In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrolled In</em>' reference.
	 * @see #getEnrolledIn()
	 * @generated
	 */
	void setEnrolledIn(ProgrammeInstance value);

	/**
	 * Returns the value of the '<em><b>Student Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Number</em>' attribute.
	 * @see #setStudentNumber(int)
	 * @see programmes.ProgrammesPackage#getStudent_StudentNumber()
	 * @model
	 * @generated
	 */
	int getStudentNumber();

	/**
	 * Sets the value of the '{@link programmes.Student#getStudentNumber <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Number</em>' attribute.
	 * @see #getStudentNumber()
	 * @generated
	 */
	void setStudentNumber(int value);

} // Student
