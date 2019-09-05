/**
 */
package programmes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import programmes.Programme;
import programmes.ProgrammeInstance;
import programmes.ProgrammeYearInstance;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.ProgrammeInstanceImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeInstanceImpl#getProgrammeYears <em>Programme Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeInstanceImpl extends MinimalEObjectImpl.Container implements ProgrammeInstance {
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
	 * The cached value of the '{@link #getProgrammeYears() <em>Programme Years</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeYears()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeYearInstance> programmeYears;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.PROGRAMME_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME, oldProgramme, programme));
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
	@Override
	public void setProgramme(Programme newProgramme) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME, oldProgramme, programme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeYearInstance> getProgrammeYears() {
		if (programmeYears == null) {
			programmeYears = new EObjectResolvingEList<ProgrammeYearInstance>(ProgrammeYearInstance.class, this, ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME_YEARS);
		}
		return programmeYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME_YEARS:
				return getProgrammeYears();
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
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME_YEARS:
				getProgrammeYears().clear();
				getProgrammeYears().addAll((Collection<? extends ProgrammeYearInstance>)newValue);
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
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME_YEARS:
				getProgrammeYears().clear();
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
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME:
				return programme != null;
			case ProgrammesPackage.PROGRAMME_INSTANCE__PROGRAMME_YEARS:
				return programmeYears != null && !programmeYears.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeInstanceImpl
