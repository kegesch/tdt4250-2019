/**
 */
package programmes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import programmes.Course;
import programmes.Department;
import programmes.Instructor;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.InstructorImpl#getLecturedCourses <em>Lectured Courses</em>}</li>
 *   <li>{@link programmes.impl.InstructorImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructorImpl extends PersonImpl implements Instructor {
	/**
	 * The cached value of the '{@link #getLecturedCourses() <em>Lectured Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> lecturedCourses;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.INSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getLecturedCourses() {
		if (lecturedCourses == null) {
			lecturedCourses = new EObjectWithInverseResolvingEList<Course>(Course.class, this, ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES, ProgrammesPackage.COURSE__INSTRUCTOR);
		}
		return lecturedCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject)department;
			department = (Department)eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.INSTRUCTOR__DEPARTMENT, oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgrammesPackage.INSTRUCTOR__DEPARTMENT, oldDepartment, newDepartment);
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
	public void setDepartment(Department newDepartment) {
		if (newDepartment != department) {
			NotificationChain msgs = null;
			if (department != null)
				msgs = ((InternalEObject)department).eInverseRemove(this, ProgrammesPackage.DEPARTMENT__EMPLOYEES, Department.class, msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, ProgrammesPackage.DEPARTMENT__EMPLOYEES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.INSTRUCTOR__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLecturedCourses()).basicAdd(otherEnd, msgs);
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				if (department != null)
					msgs = ((InternalEObject)department).eInverseRemove(this, ProgrammesPackage.DEPARTMENT__EMPLOYEES, Department.class, msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
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
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				return ((InternalEList<?>)getLecturedCourses()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				return basicSetDepartment(null, msgs);
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
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				return getLecturedCourses();
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				if (resolve) return getDepartment();
				return basicGetDepartment();
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
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				getLecturedCourses().clear();
				getLecturedCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				setDepartment((Department)newValue);
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
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				getLecturedCourses().clear();
				return;
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				setDepartment((Department)null);
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
			case ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES:
				return lecturedCourses != null && !lecturedCourses.isEmpty();
			case ProgrammesPackage.INSTRUCTOR__DEPARTMENT:
				return department != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructorImpl
