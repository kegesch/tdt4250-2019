/**
 */
package programmes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see programmes.ProgrammesPackage
 * @generated
 */
public interface ProgrammesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgrammesFactory eINSTANCE = programmes.impl.ProgrammesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Instructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructor</em>'.
	 * @generated
	 */
	Instructor createInstructor();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization</em>'.
	 * @generated
	 */
	Specialization createSpecialization();

	/**
	 * Returns a new object of class '<em>Programme Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Year</em>'.
	 * @generated
	 */
	ProgrammeYear createProgrammeYear();

	/**
	 * Returns a new object of class '<em>Year Course Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year Course Reference</em>'.
	 * @generated
	 */
	YearCourseReference createYearCourseReference();

	/**
	 * Returns a new object of class '<em>Semester Course Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester Course Constraint</em>'.
	 * @generated
	 */
	SemesterCourseConstraint createSemesterCourseConstraint();

	/**
	 * Returns a new object of class '<em>Programme Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Course Group</em>'.
	 * @generated
	 */
	ProgrammeCourseGroup createProgrammeCourseGroup();

	/**
	 * Returns a new object of class '<em>Mandatory Course Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Course Constraint</em>'.
	 * @generated
	 */
	MandatoryCourseConstraint createMandatoryCourseConstraint();

	/**
	 * Returns a new object of class '<em>Elective Course Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elective Course Constraint</em>'.
	 * @generated
	 */
	ElectiveCourseConstraint createElectiveCourseConstraint();

	/**
	 * Returns a new object of class '<em>Amount Course Out Group Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Course Out Group Constraint</em>'.
	 * @generated
	 */
	AmountCourseOutGroupConstraint createAmountCourseOutGroupConstraint();

	/**
	 * Returns a new object of class '<em>Combined Course Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Course Constraint</em>'.
	 * @generated
	 */
	CombinedCourseConstraint createCombinedCourseConstraint();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Exam Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Attempt</em>'.
	 * @generated
	 */
	ExamAttempt createExamAttempt();

	/**
	 * Returns a new object of class '<em>Programme Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Instance</em>'.
	 * @generated
	 */
	ProgrammeInstance createProgrammeInstance();

	/**
	 * Returns a new object of class '<em>Programme Year Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Year Instance</em>'.
	 * @generated
	 */
	ProgrammeYearInstance createProgrammeYearInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProgrammesPackage getProgrammesPackage();

} //ProgrammesFactory
