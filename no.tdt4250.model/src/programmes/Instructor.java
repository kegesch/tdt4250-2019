/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Instructor#getLecturedCourses <em>Lectured Courses</em>}</li>
 *   <li>{@link programmes.Instructor#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getInstructor()
 * @model
 * @generated
 */
public interface Instructor extends Person {
	/**
	 * Returns the value of the '<em><b>Lectured Courses</b></em>' reference list.
	 * The list contents are of type {@link programmes.Course}.
	 * It is bidirectional and its opposite is '{@link programmes.Course#getInstructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lectured Courses</em>' reference list.
	 * @see programmes.ProgrammesPackage#getInstructor_LecturedCourses()
	 * @see programmes.Course#getInstructor
	 * @model opposite="instructor"
	 * @generated
	 */
	EList<Course> getLecturedCourses();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link programmes.Department#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see programmes.ProgrammesPackage#getInstructor_Department()
	 * @see programmes.Department#getEmployees
	 * @model opposite="employees"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link programmes.Instructor#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Instructor
