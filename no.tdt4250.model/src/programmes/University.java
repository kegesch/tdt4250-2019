/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.University#getName <em>Name</em>}</li>
 *   <li>{@link programmes.University#getStudyProgrammes <em>Study Programmes</em>}</li>
 *   <li>{@link programmes.University#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programmes.ProgrammesPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programmes.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link programmes.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programmes</em>' containment reference list.
	 * @see programmes.ProgrammesPackage#getUniversity_StudyProgrammes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getStudyProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link programmes.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see programmes.ProgrammesPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // University
