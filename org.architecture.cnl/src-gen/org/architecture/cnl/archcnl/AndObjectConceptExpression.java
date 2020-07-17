/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Object Concept Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.AndObjectConceptExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getAndObjectConceptExpression()
 * @model
 * @generated
 */
public interface AndObjectConceptExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ObjectConceptExpression)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getAndObjectConceptExpression_Expression()
   * @model containment="true"
   * @generated
   */
  ObjectConceptExpression getExpression();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.AndObjectConceptExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ObjectConceptExpression value);

} // AndObjectConceptExpression