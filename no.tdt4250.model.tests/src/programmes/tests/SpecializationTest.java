/**
 */
package programmes.tests;

import junit.textui.TestRunner;

import programmes.ProgrammesFactory;
import programmes.Specialization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecializationTest extends ProgrammeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecializationTest.class);
	}

	/**
	 * Constructs a new Specialization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specialization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Specialization getFixture() {
		return (Specialization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createSpecialization());
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

} //SpecializationTest
