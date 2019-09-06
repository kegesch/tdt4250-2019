/**
 */
package programmes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see programmes.ProgrammesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface ProgrammesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programmes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.tdt4250.model/model/programmes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programmes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgrammesPackage eINSTANCE = programmes.impl.ProgrammesPackageImpl.init();

	/**
	 * The meta object id for the '{@link programmes.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.DepartmentImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEES = 3;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.CourseImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Instructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__INSTRUCTOR = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.PersonImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.InstructorImpl <em>Instructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.InstructorImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getInstructor()
	 * @generated
	 */
	int INSTRUCTOR = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Lectured Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__LECTURED_COURSES = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__DEPARTMENT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programmes.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.ProgrammeImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALIZATIONS = 2;

	/**
	 * The feature id for the '<em><b>Programme Years</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_YEARS = 3;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.SpecializationImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = PROGRAMME__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__CODE = PROGRAMME__CODE;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATIONS = PROGRAMME__SPECIALIZATIONS;

	/**
	 * The feature id for the '<em><b>Programme Years</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAMME_YEARS = PROGRAMME__PROGRAMME_YEARS;

	/**
	 * The feature id for the '<em><b>Specializes In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZES_IN = PROGRAMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chosen In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__CHOSEN_IN = PROGRAMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = PROGRAMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = PROGRAMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programmes.impl.ProgrammeYearImpl <em>Programme Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.ProgrammeYearImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeYear()
	 * @generated
	 */
	int PROGRAMME_YEAR = 6;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Course References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR__COURSE_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Year In Programme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR__YEAR_IN_PROGRAMME = 2;

	/**
	 * The number of structural features of the '<em>Programme Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.YearCourseReferenceImpl <em>Year Course Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.YearCourseReferenceImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getYearCourseReference()
	 * @generated
	 */
	int YEAR_COURSE_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Programme Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_COURSE_REFERENCE__PROGRAMME_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_COURSE_REFERENCE__COURSE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_COURSE_REFERENCE__SEMESTER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Year Course Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_COURSE_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Year Course Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_COURSE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.SemesterCourseGroupImpl <em>Semester Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.SemesterCourseGroupImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getSemesterCourseGroup()
	 * @generated
	 */
	int SEMESTER_COURSE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_GROUP__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Semester Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semester Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.StudentImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 9;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Enrolled In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_IN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Student Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_NUMBER = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programmes.impl.ExamAttemptImpl <em>Exam Attempt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.ExamAttemptImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getExamAttempt()
	 * @generated
	 */
	int EXAM_ATTEMPT = 10;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Programme Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__PROGRAMME_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__COURSE = 3;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__GRADE = 4;

	/**
	 * The number of structural features of the '<em>Exam Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Exam Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.ProgrammeInstanceImpl <em>Programme Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.ProgrammeInstanceImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeInstance()
	 * @generated
	 */
	int PROGRAMME_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCE__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Programme Years</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCE__PROGRAMME_YEARS = 1;

	/**
	 * The feature id for the '<em><b>Starting Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCE__STARTING_YEAR = 2;

	/**
	 * The number of structural features of the '<em>Programme Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.impl.ProgrammeYearInstanceImpl <em>Programme Year Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.impl.ProgrammeYearInstanceImpl
	 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeYearInstance()
	 * @generated
	 */
	int PROGRAMME_YEAR_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Programme Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Exam Attempts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS = 1;

	/**
	 * The number of structural features of the '<em>Programme Year Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programme Year Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_YEAR_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programmes.ESemester <em>ESemester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.ESemester
	 * @see programmes.impl.ProgrammesPackageImpl#getESemester()
	 * @generated
	 */
	int ESEMESTER = 13;

	/**
	 * The meta object id for the '{@link programmes.EGrade <em>EGrade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programmes.EGrade
	 * @see programmes.impl.ProgrammesPackageImpl#getEGrade()
	 * @generated
	 */
	int EGRADE = 14;


	/**
	 * Returns the meta object for class '{@link programmes.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see programmes.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programmes.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Department#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see programmes.Department#getShortName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link programmes.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see programmes.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the reference list '{@link programmes.Department#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see programmes.Department#getEmployees()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employees();

	/**
	 * Returns the meta object for class '{@link programmes.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see programmes.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see programmes.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programmes.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see programmes.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see programmes.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the container reference '{@link programmes.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see programmes.Course#getDepartment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Department();

	/**
	 * Returns the meta object for the reference '{@link programmes.Course#getInstructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instructor</em>'.
	 * @see programmes.Course#getInstructor()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Instructor();

	/**
	 * Returns the meta object for class '{@link programmes.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see programmes.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see programmes.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Person#getSurName <em>Sur Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sur Name</em>'.
	 * @see programmes.Person#getSurName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SurName();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see programmes.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

	/**
	 * Returns the meta object for class '{@link programmes.Instructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructor</em>'.
	 * @see programmes.Instructor
	 * @generated
	 */
	EClass getInstructor();

	/**
	 * Returns the meta object for the reference list '{@link programmes.Instructor#getLecturedCourses <em>Lectured Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lectured Courses</em>'.
	 * @see programmes.Instructor#getLecturedCourses()
	 * @see #getInstructor()
	 * @generated
	 */
	EReference getInstructor_LecturedCourses();

	/**
	 * Returns the meta object for the reference '{@link programmes.Instructor#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see programmes.Instructor#getDepartment()
	 * @see #getInstructor()
	 * @generated
	 */
	EReference getInstructor_Department();

	/**
	 * Returns the meta object for class '{@link programmes.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see programmes.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programmes.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see programmes.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link programmes.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see programmes.Programme#getSpecializations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specializations();

	/**
	 * Returns the meta object for the reference list '{@link programmes.Programme#getProgrammeYears <em>Programme Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programme Years</em>'.
	 * @see programmes.Programme#getProgrammeYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ProgrammeYears();

	/**
	 * Returns the meta object for class '{@link programmes.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see programmes.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the container reference '{@link programmes.Specialization#getSpecializesIn <em>Specializes In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specializes In</em>'.
	 * @see programmes.Specialization#getSpecializesIn()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SpecializesIn();

	/**
	 * Returns the meta object for the reference '{@link programmes.Specialization#getChosenIn <em>Chosen In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chosen In</em>'.
	 * @see programmes.Specialization#getChosenIn()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_ChosenIn();

	/**
	 * Returns the meta object for class '{@link programmes.ProgrammeYear <em>Programme Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Year</em>'.
	 * @see programmes.ProgrammeYear
	 * @generated
	 */
	EClass getProgrammeYear();

	/**
	 * Returns the meta object for the reference '{@link programmes.ProgrammeYear#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see programmes.ProgrammeYear#getProgramme()
	 * @see #getProgrammeYear()
	 * @generated
	 */
	EReference getProgrammeYear_Programme();

	/**
	 * Returns the meta object for the reference list '{@link programmes.ProgrammeYear#getCourseReferences <em>Course References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course References</em>'.
	 * @see programmes.ProgrammeYear#getCourseReferences()
	 * @see #getProgrammeYear()
	 * @generated
	 */
	EReference getProgrammeYear_CourseReferences();

	/**
	 * Returns the meta object for the attribute '{@link programmes.ProgrammeYear#getYearInProgramme <em>Year In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year In Programme</em>'.
	 * @see programmes.ProgrammeYear#getYearInProgramme()
	 * @see #getProgrammeYear()
	 * @generated
	 */
	EAttribute getProgrammeYear_YearInProgramme();

	/**
	 * Returns the meta object for class '{@link programmes.YearCourseReference <em>Year Course Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Course Reference</em>'.
	 * @see programmes.YearCourseReference
	 * @generated
	 */
	EClass getYearCourseReference();

	/**
	 * Returns the meta object for the reference '{@link programmes.YearCourseReference#getProgrammeYear <em>Programme Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Year</em>'.
	 * @see programmes.YearCourseReference#getProgrammeYear()
	 * @see #getYearCourseReference()
	 * @generated
	 */
	EReference getYearCourseReference_ProgrammeYear();

	/**
	 * Returns the meta object for the reference '{@link programmes.YearCourseReference#getCourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course Group</em>'.
	 * @see programmes.YearCourseReference#getCourseGroup()
	 * @see #getYearCourseReference()
	 * @generated
	 */
	EReference getYearCourseReference_CourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link programmes.YearCourseReference#getSemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Type</em>'.
	 * @see programmes.YearCourseReference#getSemesterType()
	 * @see #getYearCourseReference()
	 * @generated
	 */
	EAttribute getYearCourseReference_SemesterType();

	/**
	 * Returns the meta object for class '{@link programmes.SemesterCourseGroup <em>Semester Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Course Group</em>'.
	 * @see programmes.SemesterCourseGroup
	 * @generated
	 */
	EClass getSemesterCourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link programmes.SemesterCourseGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programmes.SemesterCourseGroup#getName()
	 * @see #getSemesterCourseGroup()
	 * @generated
	 */
	EAttribute getSemesterCourseGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link programmes.SemesterCourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see programmes.SemesterCourseGroup#getCourses()
	 * @see #getSemesterCourseGroup()
	 * @generated
	 */
	EReference getSemesterCourseGroup_Courses();

	/**
	 * Returns the meta object for class '{@link programmes.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see programmes.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference '{@link programmes.Student#getEnrolledIn <em>Enrolled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enrolled In</em>'.
	 * @see programmes.Student#getEnrolledIn()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_EnrolledIn();

	/**
	 * Returns the meta object for the attribute '{@link programmes.Student#getStudentNumber <em>Student Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Number</em>'.
	 * @see programmes.Student#getStudentNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentNumber();

	/**
	 * Returns the meta object for class '{@link programmes.ExamAttempt <em>Exam Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Attempt</em>'.
	 * @see programmes.ExamAttempt
	 * @generated
	 */
	EClass getExamAttempt();

	/**
	 * Returns the meta object for the attribute '{@link programmes.ExamAttempt#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see programmes.ExamAttempt#getDate()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EAttribute getExamAttempt_Date();

	/**
	 * Returns the meta object for the attribute '{@link programmes.ExamAttempt#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see programmes.ExamAttempt#getSemester()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EAttribute getExamAttempt_Semester();

	/**
	 * Returns the meta object for the reference '{@link programmes.ExamAttempt#getProgrammeYear <em>Programme Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Year</em>'.
	 * @see programmes.ExamAttempt#getProgrammeYear()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EReference getExamAttempt_ProgrammeYear();

	/**
	 * Returns the meta object for the reference '{@link programmes.ExamAttempt#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see programmes.ExamAttempt#getCourse()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EReference getExamAttempt_Course();

	/**
	 * Returns the meta object for the attribute '{@link programmes.ExamAttempt#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see programmes.ExamAttempt#getGrade()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EAttribute getExamAttempt_Grade();

	/**
	 * Returns the meta object for class '{@link programmes.ProgrammeInstance <em>Programme Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Instance</em>'.
	 * @see programmes.ProgrammeInstance
	 * @generated
	 */
	EClass getProgrammeInstance();

	/**
	 * Returns the meta object for the reference '{@link programmes.ProgrammeInstance#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see programmes.ProgrammeInstance#getProgramme()
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	EReference getProgrammeInstance_Programme();

	/**
	 * Returns the meta object for the reference list '{@link programmes.ProgrammeInstance#getProgrammeYears <em>Programme Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programme Years</em>'.
	 * @see programmes.ProgrammeInstance#getProgrammeYears()
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	EReference getProgrammeInstance_ProgrammeYears();

	/**
	 * Returns the meta object for the attribute '{@link programmes.ProgrammeInstance#getStartingYear <em>Starting Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Year</em>'.
	 * @see programmes.ProgrammeInstance#getStartingYear()
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	EAttribute getProgrammeInstance_StartingYear();

	/**
	 * Returns the meta object for class '{@link programmes.ProgrammeYearInstance <em>Programme Year Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Year Instance</em>'.
	 * @see programmes.ProgrammeYearInstance
	 * @generated
	 */
	EClass getProgrammeYearInstance();

	/**
	 * Returns the meta object for the reference '{@link programmes.ProgrammeYearInstance#getProgrammeYear <em>Programme Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Year</em>'.
	 * @see programmes.ProgrammeYearInstance#getProgrammeYear()
	 * @see #getProgrammeYearInstance()
	 * @generated
	 */
	EReference getProgrammeYearInstance_ProgrammeYear();

	/**
	 * Returns the meta object for the reference list '{@link programmes.ProgrammeYearInstance#getExamAttempts <em>Exam Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exam Attempts</em>'.
	 * @see programmes.ProgrammeYearInstance#getExamAttempts()
	 * @see #getProgrammeYearInstance()
	 * @generated
	 */
	EReference getProgrammeYearInstance_ExamAttempts();

	/**
	 * Returns the meta object for enum '{@link programmes.ESemester <em>ESemester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESemester</em>'.
	 * @see programmes.ESemester
	 * @generated
	 */
	EEnum getESemester();

	/**
	 * Returns the meta object for enum '{@link programmes.EGrade <em>EGrade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGrade</em>'.
	 * @see programmes.EGrade
	 * @generated
	 */
	EEnum getEGrade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgrammesFactory getProgrammesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link programmes.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.DepartmentImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__SHORT_NAME = eINSTANCE.getDepartment_ShortName();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEES = eINSTANCE.getDepartment_Employees();

		/**
		 * The meta object literal for the '{@link programmes.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.CourseImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENT = eINSTANCE.getCourse_Department();

		/**
		 * The meta object literal for the '<em><b>Instructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__INSTRUCTOR = eINSTANCE.getCourse_Instructor();

		/**
		 * The meta object literal for the '{@link programmes.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.PersonImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Sur Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUR_NAME = eINSTANCE.getPerson_SurName();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

		/**
		 * The meta object literal for the '{@link programmes.impl.InstructorImpl <em>Instructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.InstructorImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getInstructor()
		 * @generated
		 */
		EClass INSTRUCTOR = eINSTANCE.getInstructor();

		/**
		 * The meta object literal for the '<em><b>Lectured Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTOR__LECTURED_COURSES = eINSTANCE.getInstructor_LecturedCourses();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTOR__DEPARTMENT = eINSTANCE.getInstructor_Department();

		/**
		 * The meta object literal for the '{@link programmes.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.ProgrammeImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALIZATIONS = eINSTANCE.getProgramme_Specializations();

		/**
		 * The meta object literal for the '<em><b>Programme Years</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__PROGRAMME_YEARS = eINSTANCE.getProgramme_ProgrammeYears();

		/**
		 * The meta object literal for the '{@link programmes.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.SpecializationImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Specializes In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZES_IN = eINSTANCE.getSpecialization_SpecializesIn();

		/**
		 * The meta object literal for the '<em><b>Chosen In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__CHOSEN_IN = eINSTANCE.getSpecialization_ChosenIn();

		/**
		 * The meta object literal for the '{@link programmes.impl.ProgrammeYearImpl <em>Programme Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.ProgrammeYearImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeYear()
		 * @generated
		 */
		EClass PROGRAMME_YEAR = eINSTANCE.getProgrammeYear();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_YEAR__PROGRAMME = eINSTANCE.getProgrammeYear_Programme();

		/**
		 * The meta object literal for the '<em><b>Course References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_YEAR__COURSE_REFERENCES = eINSTANCE.getProgrammeYear_CourseReferences();

		/**
		 * The meta object literal for the '<em><b>Year In Programme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_YEAR__YEAR_IN_PROGRAMME = eINSTANCE.getProgrammeYear_YearInProgramme();

		/**
		 * The meta object literal for the '{@link programmes.impl.YearCourseReferenceImpl <em>Year Course Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.YearCourseReferenceImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getYearCourseReference()
		 * @generated
		 */
		EClass YEAR_COURSE_REFERENCE = eINSTANCE.getYearCourseReference();

		/**
		 * The meta object literal for the '<em><b>Programme Year</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR_COURSE_REFERENCE__PROGRAMME_YEAR = eINSTANCE.getYearCourseReference_ProgrammeYear();

		/**
		 * The meta object literal for the '<em><b>Course Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR_COURSE_REFERENCE__COURSE_GROUP = eINSTANCE.getYearCourseReference_CourseGroup();

		/**
		 * The meta object literal for the '<em><b>Semester Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_COURSE_REFERENCE__SEMESTER_TYPE = eINSTANCE.getYearCourseReference_SemesterType();

		/**
		 * The meta object literal for the '{@link programmes.impl.SemesterCourseGroupImpl <em>Semester Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.SemesterCourseGroupImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getSemesterCourseGroup()
		 * @generated
		 */
		EClass SEMESTER_COURSE_GROUP = eINSTANCE.getSemesterCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE_GROUP__NAME = eINSTANCE.getSemesterCourseGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE_GROUP__COURSES = eINSTANCE.getSemesterCourseGroup_Courses();

		/**
		 * The meta object literal for the '{@link programmes.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.StudentImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Enrolled In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLED_IN = eINSTANCE.getStudent_EnrolledIn();

		/**
		 * The meta object literal for the '<em><b>Student Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_NUMBER = eINSTANCE.getStudent_StudentNumber();

		/**
		 * The meta object literal for the '{@link programmes.impl.ExamAttemptImpl <em>Exam Attempt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.ExamAttemptImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getExamAttempt()
		 * @generated
		 */
		EClass EXAM_ATTEMPT = eINSTANCE.getExamAttempt();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_ATTEMPT__DATE = eINSTANCE.getExamAttempt_Date();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_ATTEMPT__SEMESTER = eINSTANCE.getExamAttempt_Semester();

		/**
		 * The meta object literal for the '<em><b>Programme Year</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_ATTEMPT__PROGRAMME_YEAR = eINSTANCE.getExamAttempt_ProgrammeYear();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_ATTEMPT__COURSE = eINSTANCE.getExamAttempt_Course();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_ATTEMPT__GRADE = eINSTANCE.getExamAttempt_Grade();

		/**
		 * The meta object literal for the '{@link programmes.impl.ProgrammeInstanceImpl <em>Programme Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.ProgrammeInstanceImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeInstance()
		 * @generated
		 */
		EClass PROGRAMME_INSTANCE = eINSTANCE.getProgrammeInstance();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_INSTANCE__PROGRAMME = eINSTANCE.getProgrammeInstance_Programme();

		/**
		 * The meta object literal for the '<em><b>Programme Years</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_INSTANCE__PROGRAMME_YEARS = eINSTANCE.getProgrammeInstance_ProgrammeYears();

		/**
		 * The meta object literal for the '<em><b>Starting Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_INSTANCE__STARTING_YEAR = eINSTANCE.getProgrammeInstance_StartingYear();

		/**
		 * The meta object literal for the '{@link programmes.impl.ProgrammeYearInstanceImpl <em>Programme Year Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.impl.ProgrammeYearInstanceImpl
		 * @see programmes.impl.ProgrammesPackageImpl#getProgrammeYearInstance()
		 * @generated
		 */
		EClass PROGRAMME_YEAR_INSTANCE = eINSTANCE.getProgrammeYearInstance();

		/**
		 * The meta object literal for the '<em><b>Programme Year</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR = eINSTANCE.getProgrammeYearInstance_ProgrammeYear();

		/**
		 * The meta object literal for the '<em><b>Exam Attempts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS = eINSTANCE.getProgrammeYearInstance_ExamAttempts();

		/**
		 * The meta object literal for the '{@link programmes.ESemester <em>ESemester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.ESemester
		 * @see programmes.impl.ProgrammesPackageImpl#getESemester()
		 * @generated
		 */
		EEnum ESEMESTER = eINSTANCE.getESemester();

		/**
		 * The meta object literal for the '{@link programmes.EGrade <em>EGrade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programmes.EGrade
		 * @see programmes.impl.ProgrammesPackageImpl#getEGrade()
		 * @generated
		 */
		EEnum EGRADE = eINSTANCE.getEGrade();

	}

} //ProgrammesPackage
