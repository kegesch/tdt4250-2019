/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Course#getCode <em>Code</em>}</li>
 *   <li>{@link programmes.Course#getName <em>Name</em>}</li>
 *   <li>{@link programmes.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link programmes.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link programmes.Course#getDepartment <em>Department</em>}</li>
 *   <li>{@link programmes.Course#getInstructor <em>Instructor</em>}</li>
 *   <li>{@link programmes.Course#getYearReference <em>Year Reference</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getCourse()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 ECTSConstrained='self.credits = 5.0 OR self.credits = 7.5 OR self.credits = 10.0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ECTSConstrained'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see programmes.ProgrammesPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link programmes.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programmes.ProgrammesPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programmes.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see programmes.ProgrammesPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link programmes.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see programmes.ProgrammesPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link programmes.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link programmes.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see programmes.ProgrammesPackage#getCourse_Department()
	 * @see programmes.Department#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link programmes.Course#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Instructor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link programmes.Instructor#getLecturedCourses <em>Lectured Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructor</em>' reference.
	 * @see #setInstructor(Instructor)
	 * @see programmes.ProgrammesPackage#getCourse_Instructor()
	 * @see programmes.Instructor#getLecturedCourses
	 * @model opposite="lecturedCourses"
	 * @generated
	 */
	Instructor getInstructor();

	/**
	 * Sets the value of the '{@link programmes.Course#getInstructor <em>Instructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructor</em>' reference.
	 * @see #getInstructor()
	 * @generated
	 */
	void setInstructor(Instructor value);

	/**
	 * Returns the value of the '<em><b>Year Reference</b></em>' reference list.
	 * The list contents are of type {@link programmes.YearCourseReference}.
	 * It is bidirectional and its opposite is '{@link programmes.YearCourseReference#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Reference</em>' reference list.
	 * @see programmes.ProgrammesPackage#getCourse_YearReference()
	 * @see programmes.YearCourseReference#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<YearCourseReference> getYearReference();

} // Course