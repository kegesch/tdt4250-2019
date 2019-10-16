/**
 */
package programmes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import programmes.Programme;
import programmes.ProgrammesPackage;
import programmes.Semester;
import programmes.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.SpecializationImpl#getSpecializesIn <em>Specializes In</em>}</li>
 *   <li>{@link programmes.impl.SpecializationImpl#getChosenIn <em>Chosen In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends ProgrammeImpl implements Specialization {
	/**
	 * The cached value of the '{@link #getChosenIn() <em>Chosen In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenIn()
	 * @generated
	 * @ordered
	 */
	protected Semester chosenIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getSpecializesIn() {
		if (eContainerFeatureID() != ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializesIn(Programme newSpecializesIn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecializesIn, ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializesIn(Programme newSpecializesIn) {
		if (newSpecializesIn != eInternalContainer() || (eContainerFeatureID() != ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN && newSpecializesIn != null)) {
			if (EcoreUtil.isAncestor(this, newSpecializesIn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecializesIn != null)
				msgs = ((InternalEObject)newSpecializesIn).eInverseAdd(this, ProgrammesPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetSpecializesIn(newSpecializesIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN, newSpecializesIn, newSpecializesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getChosenIn() {
		if (chosenIn != null && chosenIn.eIsProxy()) {
			InternalEObject oldChosenIn = (InternalEObject)chosenIn;
			chosenIn = (Semester)eResolveProxy(oldChosenIn);
			if (chosenIn != oldChosenIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.SPECIALIZATION__CHOSEN_IN, oldChosenIn, chosenIn));
			}
		}
		return chosenIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetChosenIn() {
		return chosenIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChosenIn(Semester newChosenIn) {
		Semester oldChosenIn = chosenIn;
		chosenIn = newChosenIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.SPECIALIZATION__CHOSEN_IN, oldChosenIn, chosenIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecializesIn((Programme)otherEnd, msgs);
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				return basicSetSpecializesIn(null, msgs);
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				return eInternalContainer().eInverseRemove(this, ProgrammesPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				return getSpecializesIn();
			case ProgrammesPackage.SPECIALIZATION__CHOSEN_IN:
				if (resolve) return getChosenIn();
				return basicGetChosenIn();
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				setSpecializesIn((Programme)newValue);
				return;
			case ProgrammesPackage.SPECIALIZATION__CHOSEN_IN:
				setChosenIn((Semester)newValue);
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				setSpecializesIn((Programme)null);
				return;
			case ProgrammesPackage.SPECIALIZATION__CHOSEN_IN:
				setChosenIn((Semester)null);
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
			case ProgrammesPackage.SPECIALIZATION__SPECIALIZES_IN:
				return getSpecializesIn() != null;
			case ProgrammesPackage.SPECIALIZATION__CHOSEN_IN:
				return chosenIn != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
