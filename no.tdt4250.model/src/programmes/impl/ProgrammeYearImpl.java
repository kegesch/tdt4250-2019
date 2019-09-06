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
import org.eclipse.emf.ecore.util.InternalEList;

import programmes.Programme;
import programmes.ProgrammeYear;
import programmes.ProgrammesPackage;
import programmes.YearCourseReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.ProgrammeYearImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeYearImpl#getCourseReferences <em>Course References</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeYearImpl#getYearInProgramme <em>Year In Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeYearImpl extends MinimalEObjectImpl.Container implements ProgrammeYear {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme programme;

	/**
	 * The cached value of the '{@link #getCourseReferences() <em>Course References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<YearCourseReference> courseReferences;

	/**
	 * The default value of the '{@link #getYearInProgramme() <em>Year In Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearInProgramme()
	 * @generated
	 * @ordered
	 */
	protected static final short YEAR_IN_PROGRAMME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearInProgramme() <em>Year In Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearInProgramme()
	 * @generated
	 * @ordered
	 */
	protected short yearInProgramme = YEAR_IN_PROGRAMME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.PROGRAMME_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject)programme;
			programme = (Programme)eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME, oldProgramme, newProgramme);
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
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != programme) {
			NotificationChain msgs = null;
			if (programme != null)
				msgs = ((InternalEObject)programme).eInverseRemove(this, ProgrammesPackage.PROGRAMME__PROGRAMME_YEARS, Programme.class, msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, ProgrammesPackage.PROGRAMME__PROGRAMME_YEARS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YearCourseReference> getCourseReferences() {
		if (courseReferences == null) {
			courseReferences = new EObjectWithInverseResolvingEList<YearCourseReference>(YearCourseReference.class, this, ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES, ProgrammesPackage.YEAR_COURSE_REFERENCE__PROGRAMME_YEAR);
		}
		return courseReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getYearInProgramme() {
		return yearInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearInProgramme(short newYearInProgramme) {
		short oldYearInProgramme = yearInProgramme;
		yearInProgramme = newYearInProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME_YEAR__YEAR_IN_PROGRAMME, oldYearInProgramme, yearInProgramme));
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				if (programme != null)
					msgs = ((InternalEObject)programme).eInverseRemove(this, ProgrammesPackage.PROGRAMME__PROGRAMME_YEARS, Programme.class, msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseReferences()).basicAdd(otherEnd, msgs);
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				return ((InternalEList<?>)getCourseReferences()).basicRemove(otherEnd, msgs);
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				return getCourseReferences();
			case ProgrammesPackage.PROGRAMME_YEAR__YEAR_IN_PROGRAMME:
				return getYearInProgramme();
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				getCourseReferences().clear();
				getCourseReferences().addAll((Collection<? extends YearCourseReference>)newValue);
				return;
			case ProgrammesPackage.PROGRAMME_YEAR__YEAR_IN_PROGRAMME:
				setYearInProgramme((Short)newValue);
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				getCourseReferences().clear();
				return;
			case ProgrammesPackage.PROGRAMME_YEAR__YEAR_IN_PROGRAMME:
				setYearInProgramme(YEAR_IN_PROGRAMME_EDEFAULT);
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
			case ProgrammesPackage.PROGRAMME_YEAR__PROGRAMME:
				return programme != null;
			case ProgrammesPackage.PROGRAMME_YEAR__COURSE_REFERENCES:
				return courseReferences != null && !courseReferences.isEmpty();
			case ProgrammesPackage.PROGRAMME_YEAR__YEAR_IN_PROGRAMME:
				return yearInProgramme != YEAR_IN_PROGRAMME_EDEFAULT;
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
		result.append(" (yearInProgramme: ");
		result.append(yearInProgramme);
		result.append(')');
		return result.toString();
	}

} //ProgrammeYearImpl
