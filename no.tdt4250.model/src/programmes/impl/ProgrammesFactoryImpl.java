/**
 */
package programmes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import programmes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammesFactoryImpl extends EFactoryImpl implements ProgrammesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgrammesFactory init() {
		try {
			ProgrammesFactory theProgrammesFactory = (ProgrammesFactory)EPackage.Registry.INSTANCE.getEFactory(ProgrammesPackage.eNS_URI);
			if (theProgrammesFactory != null) {
				return theProgrammesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProgrammesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProgrammesPackage.DEPARTMENT: return createDepartment();
			case ProgrammesPackage.COURSE: return createCourse();
			case ProgrammesPackage.PERSON: return createPerson();
			case ProgrammesPackage.INSTRUCTOR: return createInstructor();
			case ProgrammesPackage.PROGRAMME: return createProgramme();
			case ProgrammesPackage.SPECIALIZATION: return createSpecialization();
			case ProgrammesPackage.PROGRAMME_YEAR: return createProgrammeYear();
			case ProgrammesPackage.YEAR_COURSE_REFERENCE: return createYearCourseReference();
			case ProgrammesPackage.SEMESTER_COURSE_GROUP: return createSemesterCourseGroup();
			case ProgrammesPackage.STUDENT: return createStudent();
			case ProgrammesPackage.EXAM_ATTEMPT: return createExamAttempt();
			case ProgrammesPackage.PROGRAMME_INSTANCE: return createProgrammeInstance();
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE: return createProgrammeYearInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProgrammesPackage.ESEMESTER:
				return createESemesterFromString(eDataType, initialValue);
			case ProgrammesPackage.EGRADE:
				return createEGradeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProgrammesPackage.ESEMESTER:
				return convertESemesterToString(eDataType, instanceValue);
			case ProgrammesPackage.EGRADE:
				return convertEGradeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructor createInstructor() {
		InstructorImpl instructor = new InstructorImpl();
		return instructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeYear createProgrammeYear() {
		ProgrammeYearImpl programmeYear = new ProgrammeYearImpl();
		return programmeYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearCourseReference createYearCourseReference() {
		YearCourseReferenceImpl yearCourseReference = new YearCourseReferenceImpl();
		return yearCourseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterCourseGroup createSemesterCourseGroup() {
		SemesterCourseGroupImpl semesterCourseGroup = new SemesterCourseGroupImpl();
		return semesterCourseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExamAttempt createExamAttempt() {
		ExamAttemptImpl examAttempt = new ExamAttemptImpl();
		return examAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeInstance createProgrammeInstance() {
		ProgrammeInstanceImpl programmeInstance = new ProgrammeInstanceImpl();
		return programmeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeYearInstance createProgrammeYearInstance() {
		ProgrammeYearInstanceImpl programmeYearInstance = new ProgrammeYearInstanceImpl();
		return programmeYearInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESemester createESemesterFromString(EDataType eDataType, String initialValue) {
		ESemester result = ESemester.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESemesterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGrade createEGradeFromString(EDataType eDataType, String initialValue) {
		EGrade result = EGrade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGradeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammesPackage getProgrammesPackage() {
		return (ProgrammesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProgrammesPackage getPackage() {
		return ProgrammesPackage.eINSTANCE;
	}

} //ProgrammesFactoryImpl
