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

import programmes.ExamAttempt;
import programmes.ProgrammeYear;
import programmes.ProgrammeYearInstance;
import programmes.ProgrammesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Year Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.ProgrammeYearInstanceImpl#getProgrammeYear <em>Programme Year</em>}</li>
 *   <li>{@link programmes.impl.ProgrammeYearInstanceImpl#getExamAttempts <em>Exam Attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeYearInstanceImpl extends MinimalEObjectImpl.Container implements ProgrammeYearInstance {
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
	 * The cached value of the '{@link #getExamAttempts() <em>Exam Attempts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamAttempts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExamAttempt> examAttempts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeYearInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.PROGRAMME_YEAR_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR, oldProgrammeYear, programmeYear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR, oldProgrammeYear, programmeYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExamAttempt> getExamAttempts() {
		if (examAttempts == null) {
			examAttempts = new EObjectResolvingEList<ExamAttempt>(ExamAttempt.class, this, ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS);
		}
		return examAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR:
				if (resolve) return getProgrammeYear();
				return basicGetProgrammeYear();
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS:
				return getExamAttempts();
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
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)newValue);
				return;
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS:
				getExamAttempts().clear();
				getExamAttempts().addAll((Collection<? extends ExamAttempt>)newValue);
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
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR:
				setProgrammeYear((ProgrammeYear)null);
				return;
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS:
				getExamAttempts().clear();
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
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__PROGRAMME_YEAR:
				return programmeYear != null;
			case ProgrammesPackage.PROGRAMME_YEAR_INSTANCE__EXAM_ATTEMPTS:
				return examAttempts != null && !examAttempts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeYearInstanceImpl
