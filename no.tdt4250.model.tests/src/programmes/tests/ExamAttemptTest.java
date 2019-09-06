/**
 */
package programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import programmes.ExamAttempt;
import programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exam Attempt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExamAttemptTest extends TestCase {

	/**
	 * The fixture for this Exam Attempt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamAttempt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExamAttemptTest.class);
	}

	/**
	 * Constructs a new Exam Attempt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamAttemptTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Exam Attempt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExamAttempt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Exam Attempt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamAttempt getFixture() {
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
		setFixture(ProgrammesFactory.eINSTANCE.createExamAttempt());
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

} //ExamAttemptTest
