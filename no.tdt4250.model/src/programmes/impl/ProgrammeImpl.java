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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import programmes.CourseGroup;
import programmes.Programme;
import programmes.ProgrammesPackage;
import programmes.Semester;
import programmes.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeImpl#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeImpl#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getProgrammeSemester() <em>Programme Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> programmeSemester;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, ProgrammesPackage.PROGRAMME__SPECIALIZATIONS, ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getProgrammeSemester() {
		if (programmeSemester == null) {
			programmeSemester = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER, ProgrammesPackage.SEMESTER__PROGRAMME);
		}
		return programmeSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, ProgrammesPackage.PROGRAMME__COURSE_GROUPS);
		}
		return courseGroups;
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
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgrammeSemester()).basicAdd(otherEnd, msgs);
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
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				return ((InternalEList<?>)getProgrammeSemester()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.PROGRAMME__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
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
			case ProgrammesPackage.PROGRAMME__NAME:
				return getName();
			case ProgrammesPackage.PROGRAMME__CODE:
				return getCode();
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				return getProgrammeSemester();
			case ProgrammesPackage.PROGRAMME__COURSE_GROUPS:
				return getCourseGroups();
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
			case ProgrammesPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case ProgrammesPackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
				getProgrammeSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case ProgrammesPackage.PROGRAMME__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
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
			case ProgrammesPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammesPackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
				return;
			case ProgrammesPackage.PROGRAMME__COURSE_GROUPS:
				getCourseGroups().clear();
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
			case ProgrammesPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammesPackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ProgrammesPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case ProgrammesPackage.PROGRAMME__PROGRAMME_SEMESTER:
				return programmeSemester != null && !programmeSemester.isEmpty();
			case ProgrammesPackage.PROGRAMME__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
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
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
