/**
 */
package programmes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import programmes.Course;
import programmes.CourseGroup;
import programmes.CourseType;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.CourseGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link programmes.impl.CourseGroupImpl#getCoursesType <em>Courses Type</em>}</li>
 *   <li>{@link programmes.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoursesType() <em>Courses Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursesType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType COURSES_TYPE_EDEFAULT = CourseType.MANDATORY;

	/**
	 * The cached value of the '{@link #getCoursesType() <em>Courses Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursesType()
	 * @generated
	 * @ordered
	 */
	protected CourseType coursesType = COURSES_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseType getCoursesType() {
		return coursesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoursesType(CourseType newCoursesType) {
		CourseType oldCoursesType = coursesType;
		coursesType = newCoursesType == null ? COURSES_TYPE_EDEFAULT : newCoursesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE_GROUP__COURSES_TYPE, oldCoursesType, coursesType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, ProgrammesPackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.COURSE_GROUP__NAME:
				return getName();
			case ProgrammesPackage.COURSE_GROUP__COURSES_TYPE:
				return getCoursesType();
			case ProgrammesPackage.COURSE_GROUP__COURSES:
				return getCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammesPackage.COURSE_GROUP__NAME:
				setName((String)newValue);
				return;
			case ProgrammesPackage.COURSE_GROUP__COURSES_TYPE:
				setCoursesType((CourseType)newValue);
				return;
			case ProgrammesPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
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
			case ProgrammesPackage.COURSE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE_GROUP__COURSES_TYPE:
				setCoursesType(COURSES_TYPE_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
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
			case ProgrammesPackage.COURSE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammesPackage.COURSE_GROUP__COURSES_TYPE:
				return coursesType != COURSES_TYPE_EDEFAULT;
			case ProgrammesPackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", coursesType: ");
		result.append(coursesType);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
