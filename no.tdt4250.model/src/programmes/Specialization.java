/**
 */
package programmes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.Specialization#getSpecializesIn <em>Specializes In</em>}</li>
 *   <li>{@link programmes.Specialization#getChosenIn <em>Chosen In</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends Programme {
	/**
	 * Returns the value of the '<em><b>Specializes In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link programmes.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes In</em>' container reference.
	 * @see #setSpecializesIn(Programme)
	 * @see programmes.ProgrammesPackage#getSpecialization_SpecializesIn()
	 * @see programmes.Programme#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	Programme getSpecializesIn();

	/**
	 * Sets the value of the '{@link programmes.Specialization#getSpecializesIn <em>Specializes In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes In</em>' container reference.
	 * @see #getSpecializesIn()
	 * @generated
	 */
	void setSpecializesIn(Programme value);

	/**
	 * Returns the value of the '<em><b>Chosen In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen In</em>' reference.
	 * @see #setChosenIn(Semester)
	 * @see programmes.ProgrammesPackage#getSpecialization_ChosenIn()
	 * @model required="true"
	 * @generated
	 */
	Semester getChosenIn();

	/**
	 * Sets the value of the '{@link programmes.Specialization#getChosenIn <em>Chosen In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen In</em>' reference.
	 * @see #getChosenIn()
	 * @generated
	 */
	void setChosenIn(Semester value);

} // Specialization
