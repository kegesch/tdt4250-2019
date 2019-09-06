/**
 */
package programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import programmes.ProgrammesFactory;
import programmes.SemesterCourseGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester Course Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemesterCourseGroupTest extends TestCase {

	/**
	 * The fixture for this Semester Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterCourseGroupTest.class);
	}

	/**
	 * Constructs a new Semester Course Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterCourseGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SemesterCourseGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseGroup getFixture() {
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
		setFixture(ProgrammesFactory.eINSTANCE.createSemesterCourseGroup());
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

} //SemesterCourseGroupTest
