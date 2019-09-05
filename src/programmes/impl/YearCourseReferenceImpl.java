/**
 */
package programmes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import programmes.Course;
import programmes.ESemester;
import programmes.ProgrammeYear;
import programmes.ProgrammesPackage;
import programmes.SemesterCourseConstraint;
import programmes.YearCourseReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year Course Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.YearCourseReferenceImpl#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.impl.YearCourseReferenceImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link programmes.impl.YearCourseReferenceImpl#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link programmes.impl.YearCourseReferenceImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearCourseReferenceImpl extends MinimalEObjectImpl.Container implements YearCourseReference {
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
	 * The default value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected static final ESemester SEMESTER_TYPE_EDEFAULT = ESemester.AUTUMN;

	/**
	 * The cached value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected ESemester semesterType = SEMESTER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected SemesterCourseConstraint constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearCourseReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.YEAR_COURSE_REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR, oldProgrammeYear, programmeYear));
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
	public NotificationChain basicSetProgrammeYear(ProgrammeYear newProgrammeYear, NotificationChain msgs) {
		ProgrammeYear oldProgrammeYear = programmeYear;
		programmeYear = newProgrammeYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR, oldProgrammeYear, newProgrammeYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeYear(ProgrammeYear newProgrammeYear) {
		if (newProgrammeYear != programmeYear) {
			NotificationChain msgs = null;
			if (programmeYear != null)
				msgs = ((InternalEObject)programmeYear).eInverseRemove(this, ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES, ProgrammeYear.class, msgs);
			if (newProgrammeYear != null)
				msgs = ((InternalEObject)newProgrammeYear).eInverseAdd(this, ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES, ProgrammeYear.class, msgs);
			msgs = basicSetProgrammeYear(newProgrammeYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR, newProgrammeYear, newProgrammeYear));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE, oldCourse, course));
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
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE, oldCourse, newCourse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject)course).eInverseRemove(this, ProgrammesPackage.COURSE__YEAR_REFERENCE, Course.class, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, ProgrammesPackage.COURSE__YEAR_REFERENCE, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESemester getSemesterType() {
		return semesterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterType(ESemester newSemesterType) {
		ESemester oldSemesterType = semesterType;
		semesterType = newSemesterType == null ? SEMESTER_TYPE_EDEFAULT : newSemesterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__SEMESTER_TYPE, oldSemesterType, semesterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterCourseConstraint getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (SemesterCourseConstraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterCourseConstraint basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraint(SemesterCourseConstraint newConstraint) {
		SemesterCourseConstraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				if (programmeYear != null)
					msgs = ((InternalEObject)programmeYear).eInverseRemove(this, ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES, ProgrammeYear.class, msgs);
				return basicSetProgrammeYear((ProgrammeYear)otherEnd, msgs);
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				if (course != null)
					msgs = ((InternalEObject)course).eInverseRemove(this, ProgrammesPackage.COURSE__YEAR_REFERENCE, Course.class, msgs);
				return basicSetCourse((Course)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				return basicSetProgrammeYear(null, msgs);
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				if (resolve) return getProgrammeYear();
				return basicGetProgrammeYear();
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__SEMESTER_TYPE:
				return getSemesterType();
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
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
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)newValue);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				setCourse((Course)newValue);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__SEMESTER_TYPE:
				setSemesterType((ESemester)newValue);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT:
				setConstraint((SemesterCourseConstraint)newValue);
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
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)null);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				setCourse((Course)null);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__SEMESTER_TYPE:
				setSemesterType(SEMESTER_TYPE_EDEFAULT);
				return;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT:
				setConstraint((SemesterCourseConstraint)null);
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
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR:
				return programmeYear != null;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE:
				return course != null;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__SEMESTER_TYPE:
				return semesterType != SEMESTER_TYPE_EDEFAULT;
			case ProgrammesPackage.YEAR_COURSE_REFERENCE__CONSTRAINT:
				return constraint != null;
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
		result.append(" (semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //YearCourseReferenceImpl
