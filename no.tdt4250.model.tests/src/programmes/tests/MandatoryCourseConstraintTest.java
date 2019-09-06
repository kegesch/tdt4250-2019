/**
 */
package programmes.tests;

import junit.textui.TestRunner;

import programmes.MandatoryCourseConstraint;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mandatory Course Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MandatoryCourseConstraintTest extends SemesterCourseConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MandatoryCourseConstraintTest.class);
	}

	/**
	 * Constructs a new Mandatory Course Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCourseConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mandatory Course Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MandatoryCourseConstraint getFixture() {
		return (MandatoryCourseConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createMandatoryCourseConstraint());
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

} //MandatoryCourseConstraintTest
