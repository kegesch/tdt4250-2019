/**
 */
package programmes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import programmes.Course;
import programmes.EGrade;
import programmes.ESemester;
import programmes.ExamAttempt;
import programmes.ProgrammeYear;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Attempt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.ExamAttemptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link programmes.impl.ExamAttemptImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link programmes.impl.ExamAttemptImpl#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.impl.ExamAttemptImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link programmes.impl.ExamAttemptImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamAttemptImpl extends MinimalEObjectImpl.Container implements ExamAttempt {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final ESemester SEMESTER_EDEFAULT = ESemester.AUTUMN;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected ESemester semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammeYear() <em>Programme Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeYear()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeYear programmeYear;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final EGrade GRADE_EDEFAULT = EGrade.A;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected EGrade grade = GRADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamAttemptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.EXAM_ATTEMPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.EXAM_ATTEMPT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESemester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(ESemester newSemester) {
		ESemester oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.EXAM_ATTEMPT__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeYear getProgrammeYear() {
		if (programmeYear != null && programmeYear.eIsProxy()) {
			InternalEObject oldProgrammeYear = (InternalEObject)programmeYear;
			programmeYear = (ProgrammeYear)eResolveProxy(oldProgrammeYear);
			if (programmeYear != oldProgrammeYear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR, oldProgrammeYear, programmeYear));
			}
		}
		return programmeYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeYear basicGetProgrammeYear() {
		return programmeYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeYear(ProgrammeYear newProgrammeYear) {
		ProgrammeYear oldProgrammeYear = programmeYear;
		programmeYear = newProgrammeYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR, oldProgrammeYear, programmeYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.EXAM_ATTEMPT__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.EXAM_ATTEMPT__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGrade getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(EGrade newGrade) {
		EGrade oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.EXAM_ATTEMPT__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.EXAM_ATTEMPT__DATE:
				return getDate();
			case ProgrammesPackage.EXAM_ATTEMPT__SEMESTER:
				return getSemester();
			case ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR:
				if (resolve) return getProgrammeYear();
				return basicGetProgrammeYear();
			case ProgrammesPackage.EXAM_ATTEMPT__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case ProgrammesPackage.EXAM_ATTEMPT__GRADE:
				return getGrade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammesPackage.EXAM_ATTEMPT__DATE:
				setDate((Date)newValue);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__SEMESTER:
				setSemester((ESemester)newValue);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)newValue);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__COURSE:
				setCourse((Course)newValue);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__GRADE:
				setGrade((EGrade)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgrammesPackage.EXAM_ATTEMPT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)null);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__COURSE:
				setCourse((Course)null);
				return;
			case ProgrammesPackage.EXAM_ATTEMPT__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgrammesPackage.EXAM_ATTEMPT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ProgrammesPackage.EXAM_ATTEMPT__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
			case ProgrammesPackage.EXAM_ATTEMPT__PROGRAMME_YEAR:
				return programmeYear != null;
			case ProgrammesPackage.EXAM_ATTEMPT__COURSE:
				return course != null;
			case ProgrammesPackage.EXAM_ATTEMPT__GRADE:
				return grade != GRADE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", semester: ");
		result.append(semester);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //ExamAttemptImpl
