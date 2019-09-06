/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.ProgrammeYear#getProgramme <em>Programme</em>}</li>
 *   <li>{@link programmes.ProgrammeYear#getCourseReferences <em>Course References</em>}</li>
 *   <li>{@link programmes.ProgrammeYear#getYearInProgramme <em>Year In Programme</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getProgrammeYear()
 * @model
 * @generated
 */
public interface ProgrammeYear extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link programmes.Programme#getProgrammeYears <em>Programme Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see programmes.ProgrammesPackage#getProgrammeYear_Programme()
	 * @see programmes.Programme#getProgrammeYears
	 * @model opposite="programmeYears" required="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link programmes.ProgrammeYear#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Course References</b></em>' reference list.
	 * The list contents are of type {@link programmes.YearCourseReference}.
	 * It is bidirectional and its opposite is '{@link programmes.YearCourseReference#getProgrammeYear <em>Programme Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course References</em>' reference list.
	 * @see programmes.ProgrammesPackage#getProgrammeYear_CourseReferences()
	 * @see programmes.YearCourseReference#getProgrammeYear
	 * @model opposite="programmeYear"
	 * @generated
	 */
	EList<YearCourseReference> getCourseReferences();

	/**
	 * Returns the value of the '<em><b>Year In Programme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year In Programme</em>' attribute.
	 * @see #setYearInProgramme(short)
	 * @see programmes.ProgrammesPackage#getProgrammeYear_YearInProgramme()
	 * @model
	 * @generated
	 */
	short getYearInProgramme();

	/**
	 * Sets the value of the '{@link programmes.ProgrammeYear#getYearInProgramme <em>Year In Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year In Programme</em>' attribute.
	 * @see #getYearInProgramme()
	 * @generated
	 */
	void setYearInProgramme(short value);

} // ProgrammeYear
