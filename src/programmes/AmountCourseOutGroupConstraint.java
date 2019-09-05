/**
 */
package programmes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount Course Out Group Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.AmountCourseOutGroupConstraint#getAmountOfCourses <em>Amount Of Courses</em>}</li>
 *   <li>{@link programmes.AmountCourseOutGroupConstraint#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getAmountCourseOutGroupConstraint()
 * @model
 * @generated
 */
public interface AmountCourseOutGroupConstraint extends CombinedCourseConstraint {
	/**
	 * Returns the value of the '<em><b>Amount Of Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Courses</em>' attribute.
	 * @see #setAmountOfCourses(short)
	 * @see programmes.ProgrammesPackage#getAmountCourseOutGroupConstraint_AmountOfCourses()
	 * @model
	 * @generated
	 */
	short getAmountOfCourses();

	/**
	 * Sets the value of the '{@link programmes.AmountCourseOutGroupConstraint#getAmountOfCourses <em>Amount Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Courses</em>' attribute.
	 * @see #getAmountOfCourses()
	 * @generated
	 */
	void setAmountOfCourses(short value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' reference.
	 * @see #setCourseGroup(ProgrammeCourseGroup)
	 * @see programmes.ProgrammesPackage#getAmountCourseOutGroupConstraint_CourseGroup()
	 * @model required="true"
	 * @generated
	 */
	ProgrammeCourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link programmes.AmountCourseOutGroupConstraint#getCourseGroup <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(ProgrammeCourseGroup value);

} // AmountCourseOutGroupConstraint
