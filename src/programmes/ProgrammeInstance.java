/**
 */
package programmes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programmes.ProgrammeInstance#getProgramme <em>Programme</em>}</li>
 *   <li>{@link programmes.ProgrammeInstance#getProgrammeYears <em>Programme Years</em>}</li>
 * </ul>
 *
 * @see programmes.ProgrammesPackage#getProgrammeInstance()
 * @model
 * @generated
 */
public interface ProgrammeInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see programmes.ProgrammesPackage#getProgrammeInstance_Programme()
	 * @model required="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link programmes.ProgrammeInstance#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Programme Years</b></em>' reference list.
	 * The list contents are of type {@link programmes.ProgrammeYearInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Years</em>' reference list.
	 * @see programmes.ProgrammesPackage#getProgrammeInstance_ProgrammeYears()
	 * @model
	 * @generated
	 */
	EList<ProgrammeYearInstance> getProgrammeYears();

} // ProgrammeInstance
