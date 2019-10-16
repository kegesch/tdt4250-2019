/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link programmes.CourseGroup#getCoursesType <em>Courses Type</em>}</li>
 *   <li>{@link programmes.CourseGroup#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programmes.ProgrammesPackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programmes.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programmes.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses Type</em>' attribute.
	 * @see programmes.CourseType
	 * @see #setCoursesType(CourseType)
	 * @see programmes.ProgrammesPackage#getCourseGroup_CoursesType()
	 * @model
	 * @generated
	 */
	CourseType getCoursesType();

	/**
	 * Sets the value of the '{@link programmes.CourseGroup#getCoursesType <em>Courses Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses Type</em>' attribute.
	 * @see programmes.CourseType
	 * @see #getCoursesType()
	 * @generated
	 */
	void setCoursesType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link programmes.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see programmes.ProgrammesPackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseGroup
