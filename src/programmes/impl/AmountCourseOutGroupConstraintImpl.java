/**
 */
package programmes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import programmes.AmountCourseOutGroupConstraint;
import programmes.ProgrammeCourseGroup;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount Course Out Group Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.AmountCourseOutGroupConstraintImpl#getAmountOfCourses <em>Amount Of Courses</em>}</li>
 *   <li>{@link programmes.impl.AmountCourseOutGroupConstraintImpl#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmountCourseOutGroupConstraintImpl extends CombinedCourseConstraintImpl implements AmountCourseOutGroupConstraint {
	/**
	 * The default value of the '{@link #getAmountOfCourses() <em>Amount Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfCourses()
	 * @generated
	 * @ordered
	 */
	protected static final short AMOUNT_OF_COURSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfCourses() <em>Amount Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfCourses()
	 * @generated
	 * @ordered
	 */
	protected short amountOfCourses = AMOUNT_OF_COURSES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseGroup() <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeCourseGroup courseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountCourseOutGroupConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getAmountOfCourses() {
		return amountOfCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountOfCourses(short newAmountOfCourses) {
		short oldAmountOfCourses = amountOfCourses;
		amountOfCourses = newAmountOfCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__AMOUNT_OF_COURSES, oldAmountOfCourses, amountOfCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeCourseGroup getCourseGroup() {
		if (courseGroup != null && courseGroup.eIsProxy()) {
			InternalEObject oldCourseGroup = (InternalEObject)courseGroup;
			courseGroup = (ProgrammeCourseGroup)eResolveProxy(oldCourseGroup);
			if (courseGroup != oldCourseGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP, oldCourseGroup, courseGroup));
			}
		}
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeCourseGroup basicGetCourseGroup() {
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseGroup(ProgrammeCourseGroup newCourseGroup) {
		ProgrammeCourseGroup oldCourseGroup = courseGroup;
		courseGroup = newCourseGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP, oldCourseGroup, courseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__AMOUNT_OF_COURSES:
				return getAmountOfCourses();
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP:
				if (resolve) return getCourseGroup();
				return basicGetCourseGroup();
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
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__AMOUNT_OF_COURSES:
				setAmountOfCourses((Short)newValue);
				return;
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP:
				setCourseGroup((ProgrammeCourseGroup)newValue);
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
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__AMOUNT_OF_COURSES:
				setAmountOfCourses(AMOUNT_OF_COURSES_EDEFAULT);
				return;
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP:
				setCourseGroup((ProgrammeCourseGroup)null);
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
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__AMOUNT_OF_COURSES:
				return amountOfCourses != AMOUNT_OF_COURSES_EDEFAULT;
			case ProgrammesPackage.AMOUNT_COURSE_OUT_GROUP_CONSTRAINT__COURSE_GROUP:
				return courseGroup != null;
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
		result.append(" (amountOfCourses: ");
		result.append(amountOfCourses);
		result.append(')');
		return result.toString();
	}

} //AmountCourseOutGroupConstraintImpl
