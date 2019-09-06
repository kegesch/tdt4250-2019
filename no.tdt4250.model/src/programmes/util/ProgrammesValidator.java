/**
 */
package programmes.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import programmes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see programmes.ProgrammesPackage
 * @generated
 */
public class ProgrammesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProgrammesValidator INSTANCE = new ProgrammesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "programmes";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProgrammesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProgrammesPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case ProgrammesPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ProgrammesPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case ProgrammesPackage.INSTRUCTOR:
				return validateInstructor((Instructor)value, diagnostics, context);
			case ProgrammesPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case ProgrammesPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case ProgrammesPackage.PROGRAMME_YEAR:
				return validateProgrammeYear((ProgrammeYear)value, diagnostics, context);
			case ProgrammesPackage.YEAR_COURSE_REFERENCE:
				return validateYearCourseReference((YearCourseReference)value, diagnostics, context);
			case ProgrammesPackage.SEMESTER_COURSE_GROUP:
				return validateSemesterCourseGroup((SemesterCourseGroup)value, diagnostics, context);
			case ProgrammesPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case ProgrammesPackage.EXAM_ATTEMPT:
				return validateExamAttempt((ExamAttempt)value, diagnostics, context);
			case ProgrammesPackage.PROGRAMME_INSTANCE:
				return validateProgrammeInstance((ProgrammeInstance)value, diagnostics, context);
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE:
				return validateProgrammeYearInstance((ProgrammeYearInstance)value, diagnostics, context);
			case ProgrammesPackage.ESEMESTER:
				return validateESemester((ESemester)value, diagnostics, context);
			case ProgrammesPackage.EGRADE:
				return validateEGrade((EGrade)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_ECTSConstrained(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ECTSConstrained constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__ECTS_CONSTRAINED__EEXPRESSION = "self.credits = 5.0 OR self.credits = 7.5 OR self.credits = 10.0";

	/**
	 * Validates the ECTSConstrained constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_ECTSConstrained(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgrammesPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "ECTSConstrained",
				 COURSE__ECTS_CONSTRAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructor(Instructor instructor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeYear(ProgrammeYear programmeYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmeYear, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYearCourseReference(YearCourseReference yearCourseReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yearCourseReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterCourseGroup(SemesterCourseGroup semesterCourseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterCourseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExamAttempt(ExamAttempt examAttempt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(examAttempt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeInstance(ProgrammeInstance programmeInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmeInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeYearInstance(ProgrammeYearInstance programmeYearInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programmeYearInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programmeYearInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgrammeYearInstance_ConsistsOf60ETCS(programmeYearInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistsOf60ETCS constraint of '<em>Programme Year Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateProgrammeYearInstance_ConsistsOf60ETCS(ProgrammeYearInstance programmeYearInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<ExamAttempt> examAttempts = programmeYearInstance.getExamAttempts();
		double sumOfECTS = 0;
		for(ExamAttempt ref : examAttempts) {
			sumOfECTS += ref.getCourse().getCredits();
		}
		
		if (sumOfECTS < 60) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(sumOfECTS < 30 ? Diagnostic.ERROR : Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistsOf60ETCS", getObjectLabel(programmeYearInstance, context) },
						 new Object[] { programmeYearInstance },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESemester(ESemester eSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGrade(EGrade eGrade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProgrammesValidator
