/**
 */
package programmes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year Course Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.YearCourseReference#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.YearCourseReference#getCourse <em>Course</em>}</li>
 *   <li>{@link programmes.YearCourseReference#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link programmes.YearCourseReference#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getYearCourseReference()
 * @model
 * @generated
 */
public interface YearCourseReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Year</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link programmes.ProgrammeYear#getCourseReferences <em>Course References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Year</em>' reference.
	 * @see #setProgrammeYear(ProgrammeYear)
	 * @see programmes.ProgrammesPackage#getYearCourseReference_ProgrammeYear()
	 * @see programmes.ProgrammeYear#getCourseReferences
	 * @model opposite="courseReferences" required="true"
	 * @generated
	 */
	ProgrammeYear getProgrammeYear();

	/**
	 * Sets the value of the '{@link programmes.YearCourseReference#getProgrammeYear <em>Programme Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Year</em>' reference.
	 * @see #getProgrammeYear()
	 * @generated
	 */
	void setProgrammeYear(ProgrammeYear value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link programmes.Course#getYearReference <em>Year Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see programmes.ProgrammesPackage#getYearCourseReference_Course()
	 * @see programmes.Course#getYearReference
	 * @model opposite="yearReference" required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link programmes.YearCourseReference#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programmes.ESemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see programmes.ESemester
	 * @see #setSemesterType(ESemester)
	 * @see programmes.ProgrammesPackage#getYearCourseReference_SemesterType()
	 * @model
	 * @generated
	 */
	ESemester getSemesterType();

	/**
	 * Sets the value of the '{@link programmes.YearCourseReference#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see programmes.ESemester
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(ESemester value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(SemesterCourseConstraint)
	 * @see programmes.ProgrammesPackage#getYearCourseReference_Constraint()
	 * @model required="true"
	 * @generated
	 */
	SemesterCourseConstraint getConstraint();

	/**
	 * Sets the value of the '{@link programmes.YearCourseReference#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(SemesterCourseConstraint value);

} // YearCourseReference
