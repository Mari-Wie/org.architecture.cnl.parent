/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl.impl;

import org.architecture.cnl.archcnl.ArchcnlPackage;
import org.architecture.cnl.archcnl.ConceptExpression;
import org.architecture.cnl.archcnl.SubConceptRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Concept Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.impl.SubConceptRuleTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.impl.SubConceptRuleTypeImpl#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubConceptRuleTypeImpl extends MinimalEObjectImpl.Container implements SubConceptRuleType
{
  /**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected static final String MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected String modifier = MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected ConceptExpression object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubConceptRuleTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchcnlPackage.Literals.SUB_CONCEPT_RULE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModifier(String newModifier)
  {
    String oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConceptExpression getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(ConceptExpression newObject, NotificationChain msgs)
  {
    ConceptExpression oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT, oldObject, newObject);
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
  public void setObject(ConceptExpression newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT:
        return basicSetObject(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__MODIFIER:
        return getModifier();
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT:
        return getObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__MODIFIER:
        setModifier((String)newValue);
        return;
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT:
        setObject((ConceptExpression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT:
        setObject((ConceptExpression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__MODIFIER:
        return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
      case ArchcnlPackage.SUB_CONCEPT_RULE_TYPE__OBJECT:
        return object != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (modifier: ");
    result.append(modifier);
    result.append(')');
    return result.toString();
  }

} //SubConceptRuleTypeImpl