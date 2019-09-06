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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import programmes.Course;
import programmes.Department;
import programmes.Instructor;
import programmes.ProgrammesPackage;
import programmes.YearCourseReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getInstructor <em>Instructor</em>}</li>
 *   <li>{@link programmes.impl.CourseImpl#getYearReference <em>Year Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructor() <em>Instructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructor()
	 * @generated
	 * @ordered
	 */
	protected Instructor instructor;

	/**
	 * The cached value of the '{@link #getYearReference() <em>Year Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearReference()
	 * @generated
	 * @ordered
	 */
	protected EList<YearCourseReference> yearReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (eContainerFeatureID() != ProgrammesPackage.COURSE__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, ProgrammesPackage.COURSE__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != ProgrammesPackage.COURSE__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, ProgrammesPackage.DEPARTMENT__COURSES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructor getInstructor() {
		if (instructor != null && instructor.eIsProxy()) {
			InternalEObject oldInstructor = (InternalEObject)instructor;
			instructor = (Instructor)eResolveProxy(oldInstructor);
			if (instructor != oldInstructor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.COURSE__INSTRUCTOR, oldInstructor, instructor));
			}
		}
		return instructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructor basicGetInstructor() {
		return instructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructor(Instructor newInstructor, NotificationChain msgs) {
		Instructor oldInstructor = instructor;
		instructor = newInstructor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__INSTRUCTOR, oldInstructor, newInstructor);
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
	public void setInstructor(Instructor newInstructor) {
		if (newInstructor != instructor) {
			NotificationChain msgs = null;
			if (instructor != null)
				msgs = ((InternalEObject)instructor).eInverseRemove(this, ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES, Instructor.class, msgs);
			if (newInstructor != null)
				msgs = ((InternalEObject)newInstructor).eInverseAdd(this, ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES, Instructor.class, msgs);
			msgs = basicSetInstructor(newInstructor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.COURSE__INSTRUCTOR, newInstructor, newInstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YearCourseReference> getYearReference() {
		if (yearReference == null) {
			yearReference = new EObjectWithInverseResolvingEList<YearCourseReference>(YearCourseReference.class, this, ProgrammesPackage.COURSE__YEAR_REFERENCE, ProgrammesPackage.YEAR_COURSE_REFERENCE__COURSE);
		}
		return yearReference;
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
			case ProgrammesPackage.COURSE__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				if (instructor != null)
					msgs = ((InternalEObject)instructor).eInverseRemove(this, ProgrammesPackage.INSTRUCTOR__LECTURED_COURSES, Instructor.class, msgs);
				return basicSetInstructor((Instructor)otherEnd, msgs);
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getYearReference()).basicAdd(otherEnd, msgs);
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
			case ProgrammesPackage.COURSE__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				return basicSetInstructor(null, msgs);
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				return ((InternalEList<?>)getYearReference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProgrammesPackage.COURSE__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, ProgrammesPackage.DEPARTMENT__COURSES, Department.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.COURSE__CODE:
				return getCode();
			case ProgrammesPackage.COURSE__NAME:
				return getName();
			case ProgrammesPackage.COURSE__CREDITS:
				return getCredits();
			case ProgrammesPackage.COURSE__LEVEL:
				return getLevel();
			case ProgrammesPackage.COURSE__DEPARTMENT:
				return getDepartment();
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				if (resolve) return getInstructor();
				return basicGetInstructor();
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				return getYearReference();
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
			case ProgrammesPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case ProgrammesPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case ProgrammesPackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
			case ProgrammesPackage.COURSE__LEVEL:
				setLevel((String)newValue);
				return;
			case ProgrammesPackage.COURSE__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				setInstructor((Instructor)newValue);
				return;
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				getYearReference().clear();
				getYearReference().addAll((Collection<? extends YearCourseReference>)newValue);
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
			case ProgrammesPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case ProgrammesPackage.COURSE__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				setInstructor((Instructor)null);
				return;
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				getYearReference().clear();
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
			case ProgrammesPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ProgrammesPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammesPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case ProgrammesPackage.COURSE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case ProgrammesPackage.COURSE__DEPARTMENT:
				return getDepartment() != null;
			case ProgrammesPackage.COURSE__INSTRUCTOR:
				return instructor != null;
			case ProgrammesPackage.COURSE__YEAR_REFERENCE:
				return yearReference != null && !yearReference.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", credits: ");
		result.append(credits);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
