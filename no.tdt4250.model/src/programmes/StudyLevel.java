/**
 */
package programmes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Study Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see programmes.ProgrammesPackage#getStudyLevel()
 * @model
 * @generated
 */
public enum StudyLevel implements Enumerator {
	/**
	 * The '<em><b>FIRST YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_YEAR(0, "FIRST_YEAR", "FIRST_YEAR"),

	/**
	 * The '<em><b>SECOND YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_YEAR(1, "SECOND_YEAR", "SECOND_YEAR"),

	/**
	 * The '<em><b>THIRD YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_YEAR(2, "THIRD_YEAR", "THIRD_YEAR"),

	/**
	 * The '<em><b>SECOND DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_DEGREE(3, "SECOND_DEGREE", "SECOND_DEGREE"),

	/**
	 * The '<em><b>POST GRAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_GRAD_VALUE
	 * @generated
	 * @ordered
	 */
	POST_GRAD(4, "POST_GRAD", "POST_GRAD");

	/**
	 * The '<em><b>FIRST YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_YEAR_VALUE = 0;

	/**
	 * The '<em><b>SECOND YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_YEAR_VALUE = 1;

	/**
	 * The '<em><b>THIRD YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_YEAR_VALUE = 2;

	/**
	 * The '<em><b>SECOND DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_DEGREE_VALUE = 3;

	/**
	 * The '<em><b>POST GRAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_GRAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_GRAD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Study Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StudyLevel[] VALUES_ARRAY =
		new StudyLevel[] {
			FIRST_YEAR,
			SECOND_YEAR,
			THIRD_YEAR,
			SECOND_DEGREE,
			POST_GRAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Study Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StudyLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Study Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyLevel get(int value) {
		switch (value) {
			case FIRST_YEAR_VALUE: return FIRST_YEAR;
			case SECOND_YEAR_VALUE: return SECOND_YEAR;
			case THIRD_YEAR_VALUE: return THIRD_YEAR;
			case SECOND_DEGREE_VALUE: return SECOND_DEGREE;
			case POST_GRAD_VALUE: return POST_GRAD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StudyLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StudyLevel
