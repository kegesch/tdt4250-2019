/**
 */
package programmes.tests;

import junit.textui.TestRunner;

import programmes.ElectiveCourseConstraint;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elective Course Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElectiveCourseConstraintTest extends SemesterCourseConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElectiveCourseConstraintTest.class);
	}

	/**
	 * Constructs a new Elective Course Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourseConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elective Course Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElectiveCourseConstraint getFixture() {
		return (ElectiveCourseConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createElectiveCourseConstraint());
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

} //ElectiveCourseConstraintTest
