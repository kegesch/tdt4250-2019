/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Programme#getName <em>Name</em>}</li>
 *   <li>{@link programmes.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link programmes.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link programmes.Programme#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link programmes.Programme#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programmes.ProgrammesPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programmes.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see programmes.ProgrammesPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link programmes.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link programmes.Specialization}.
	 * It is bidirectional and its opposite is '{@link programmes.Specialization#getSpecializesIn <em>Specializes In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see programmes.ProgrammesPackage#getProgramme_Specializations()
	 * @see programmes.Specialization#getSpecializesIn
	 * @model opposite="specializesIn" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Programme Semester</b></em>' containment reference list.
	 * The list contents are of type {@link programmes.Semester}.
	 * It is bidirectional and its opposite is '{@link programmes.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Semester</em>' containment reference list.
	 * @see programmes.ProgrammesPackage#getProgramme_ProgrammeSemester()
	 * @see programmes.Semester#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Semester> getProgrammeSemester();

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link programmes.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see programmes.ProgrammesPackage#getProgramme_CourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

} // Programme
