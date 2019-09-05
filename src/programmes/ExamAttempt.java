/**
 */
package programmes;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Attempt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.ExamAttempt#getDate <em>Date</em>}</li>
 *   <li>{@link programmes.ExamAttempt#getSemester <em>Semester</em>}</li>
 *   <li>{@link programmes.ExamAttempt#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.ExamAttempt#getCourse <em>Course</em>}</li>
 *   <li>{@link programmes.ExamAttempt#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getExamAttempt()
 * @model
 * @generated
 */
public interface ExamAttempt extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see programmes.ProgrammesPackage#getExamAttempt_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link programmes.ExamAttempt#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link programmes.ESemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see programmes.ESemester
	 * @see #setSemester(ESemester)
	 * @see programmes.ProgrammesPackage#getExamAttempt_Semester()
	 * @model
	 * @generated
	 */
	ESemester getSemester();

	/**
	 * Sets the value of the '{@link programmes.ExamAttempt#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see programmes.ESemester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(ESemester value);

	/**
	 * Returns the value of the '<em><b>Programme Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Year</em>' reference.
	 * @see #setProgrammeYear(ProgrammeYear)
	 * @see programmes.ProgrammesPackage#getExamAttempt_ProgrammeYear()
	 * @model
	 * @generated
	 */
	ProgrammeYear getProgrammeYear();

	/**
	 * Sets the value of the '{@link programmes.ExamAttempt#getProgrammeYear <em>Programme Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Year</em>' reference.
	 * @see #getProgrammeYear()
	 * @generated
	 */
	void setProgrammeYear(ProgrammeYear value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see programmes.ProgrammesPackage#getExamAttempt_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link programmes.ExamAttempt#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link programmes.EGrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see programmes.EGrade
	 * @see #setGrade(EGrade)
	 * @see programmes.ProgrammesPackage#getExamAttempt_Grade()
	 * @model
	 * @generated
	 */
	EGrade getGrade();

	/**
	 * Sets the value of the '{@link programmes.ExamAttempt#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see programmes.EGrade
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(EGrade value);

} // ExamAttempt
