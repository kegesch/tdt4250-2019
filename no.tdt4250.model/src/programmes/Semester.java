/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Semester#getProgramme <em>Programme</em>}</li>
 *   <li>{@link programmes.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link programmes.Semester#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link programmes.Semester#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getSemester()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 minECTS='self.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minECTS'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link programmes.Programme#getProgrammeSemester <em>Programme Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see programmes.ProgrammesPackage#getSemester_Programme()
	 * @see programmes.Programme#getProgrammeSemester
	 * @model opposite="programmeSemester" required="true" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link programmes.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link programmes.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see programmes.ProgrammesPackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programmes.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see programmes.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see programmes.ProgrammesPackage#getSemester_SemesterType()
	 * @model
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link programmes.Semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see programmes.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see programmes.ProgrammesPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link programmes.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // Semester
