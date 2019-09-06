/**
 */
package programmes.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>programmes</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ProgrammesTests("programmes Tests");
		suite.addTestSuite(PersonTest.class);
		suite.addTestSuite(InstructorTest.class);
		suite.addTestSuite(StudentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammesTests(String name) {
		super(name);
	}

} //ProgrammesTests