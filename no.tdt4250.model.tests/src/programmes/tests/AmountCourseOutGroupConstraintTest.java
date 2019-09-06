/**
 */
package programmes.tests;

import junit.textui.TestRunner;

import programmes.AmountCourseOutGroupConstraint;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amount Course Out Group Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmountCourseOutGroupConstraintTest extends CombinedCourseConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmountCourseOutGroupConstraintTest.class);
	}

	/**
	 * Constructs a new Amount Course Out Group Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountCourseOutGroupConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Amount Course Out Group Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AmountCourseOutGroupConstraint getFixture() {
		return (AmountCourseOutGroupConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createAmountCourseOutGroupConstraint());
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

} //AmountCourseOutGroupConstraintTest
