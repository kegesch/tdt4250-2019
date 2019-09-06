/**
 */
package programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import programmes.ProgrammeYear;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programme Year</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammeYearTest extends TestCase {

	/**
	 * The fixture for this Programme Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeYear fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammeYearTest.class);
	}

	/**
	 * Constructs a new Programme Year test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeYearTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Programme Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgrammeYear fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Programme Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeYear getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createProgrammeYear());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProgrammeYearTest
