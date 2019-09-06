/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Year Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.ProgrammeYearInstance#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.ProgrammeYearInstance#getExamAttempts <em>Exam Attempts</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getProgrammeYearInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistsOf60ETCS'"
 * @generated
 */
public interface ProgrammeYearInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Year</em>' reference.
	 * @see #setProgrammeYear(ProgrammeYear)
	 * @see programmes.ProgrammesPackage#getProgrammeYearInstance_ProgrammeYear()
	 * @model required="true"
	 * @generated
	 */
	ProgrammeYear getProgrammeYear();

	/**
	 * Sets the value of the '{@link programmes.ProgrammeYearInstance#getProgrammeYear <em>Programme Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Year</em>' reference.
	 * @see #getProgrammeYear()
	 * @generated
	 */
	void setProgrammeYear(ProgrammeYear value);

	/**
	 * Returns the value of the '<em><b>Exam Attempts</b></em>' reference list.
	 * The list contents are of type {@link programmes.ExamAttempt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Attempts</em>' reference list.
	 * @see programmes.ProgrammesPackage#getProgrammeYearInstance_ExamAttempts()
	 * @model
	 * @generated
	 */
	EList<ExamAttempt> getExamAttempts();

} // ProgrammeYearInstance
