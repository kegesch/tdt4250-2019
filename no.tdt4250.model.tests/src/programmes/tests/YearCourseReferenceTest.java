/**
 */
package programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import programmes.ProgrammesFactory;
import programmes.YearCourseReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Year Course Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YearCourseReferenceTest extends TestCase {

	/**
	 * The fixture for this Year Course Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearCourseReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YearCourseReferenceTest.class);
	}

	/**
	 * Constructs a new Year Course Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearCourseReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Year Course Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(YearCourseReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Year Course Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearCourseReference getFixture() {
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
		setFixture(ProgrammesFactory.eINSTANCE.createYearCourseReference());
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

} //YearCourseReferenceTest
