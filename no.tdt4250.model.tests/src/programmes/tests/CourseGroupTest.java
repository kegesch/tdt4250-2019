/**
 */
package programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import programmes.CourseGroup;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseGroupTest extends TestCase {

	/**
	 * The fixture for this Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseGroupTest.class);
	}

	/**
	 * Constructs a new Course Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroup getFixture() {
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
		setFixture(ProgrammesFactory.eINSTANCE.createCourseGroup());
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

} //CourseGroupTest
