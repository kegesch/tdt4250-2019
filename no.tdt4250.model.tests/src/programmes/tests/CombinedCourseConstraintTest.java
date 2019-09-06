/**
 */
package programmes.tests;

import junit.textui.TestRunner;

import programmes.CombinedCourseConstraint;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Combined Course Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombinedCourseConstraintTest extends SemesterCourseConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CombinedCourseConstraintTest.class);
	}

	/**
	 * Constructs a new Combined Course Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedCourseConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Combined Course Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CombinedCourseConstraint getFixture() {
		return (CombinedCourseConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createCombinedCourseConstraint());
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

} //CombinedCourseConstraintTest
