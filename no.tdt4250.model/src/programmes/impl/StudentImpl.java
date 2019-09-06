/**
 */
package programmes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import programmes.ProgrammeInstance;
import programmes.ProgrammesPackage;
import programmes.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programmes.impl.StudentImpl#getEnrolledIn <em>Enrolled In</em>}</li>
 *   <li>{@link programmes.impl.StudentImpl#getStudentNumber <em>Student Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The cached value of the '{@link #getEnrolledIn() <em>Enrolled In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledIn()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeInstance enrolledIn;

	/**
	 * The default value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected int studentNumber = STUDENT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeInstance getEnrolledIn() {
		if (enrolledIn != null && enrolledIn.eIsProxy()) {
			InternalEObject oldEnrolledIn = (InternalEObject)enrolledIn;
			enrolledIn = (ProgrammeInstance)eResolveProxy(oldEnrolledIn);
			if (enrolledIn != oldEnrolledIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammesPackage.STUDENT__ENROLLED_IN, oldEnrolledIn, enrolledIn));
			}
		}
		return enrolledIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeInstance basicGetEnrolledIn() {
		return enrolledIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnrolledIn(ProgrammeInstance newEnrolledIn) {
		ProgrammeInstance oldEnrolledIn = enrolledIn;
		enrolledIn = newEnrolledIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.STUDENT__ENROLLED_IN, oldEnrolledIn, enrolledIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentNumber(int newStudentNumber) {
		int oldStudentNumber = studentNumber;
		studentNumber = newStudentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.STUDENT__STUDENT_NUMBER, oldStudentNumber, studentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammesPackage.STUDENT__ENROLLED_IN:
				if (resolve) return getEnrolledIn();
				return basicGetEnrolledIn();
			case ProgrammesPackage.STUDENT__STUDENT_NUMBER:
				return getStudentNumber();
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
			case ProgrammesPackage.STUDENT__ENROLLED_IN:
				setEnrolledIn((ProgrammeInstance)newValue);
				return;
			case ProgrammesPackage.STUDENT__STUDENT_NUMBER:
				setStudentNumber((Integer)newValue);
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
			case ProgrammesPackage.STUDENT__ENROLLED_IN:
				setEnrolledIn((ProgrammeInstance)null);
				return;
			case ProgrammesPackage.STUDENT__STUDENT_NUMBER:
				setStudentNumber(STUDENT_NUMBER_EDEFAULT);
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
			case ProgrammesPackage.STUDENT__ENROLLED_IN:
				return enrolledIn != null;
			case ProgrammesPackage.STUDENT__STUDENT_NUMBER:
				return studentNumber != STUDENT_NUMBER_EDEFAULT;
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
		result.append(" (studentNumber: ");
		result.append(studentNumber);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
