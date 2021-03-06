/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.ConceptExpression#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConceptExpression#getThat <em>That</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptExpression()
 * @model
 * @generated
 */
public interface ConceptExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Concept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' containment reference.
   * @see #setConcept(Concept)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptExpression_Concept()
   * @model containment="true"
   * @generated
   */
  Concept getConcept();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConceptExpression#getConcept <em>Concept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' containment reference.
   * @see #getConcept()
   * @generated
   */
  void setConcept(Concept value);

  /**
   * Returns the value of the '<em><b>That</b></em>' containment reference list.
   * The list contents are of type {@link org.architecture.cnl.archcnl.ThatExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>That</em>' containment reference list.
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptExpression_That()
   * @model containment="true"
   * @generated
   */
  EList<ThatExpression> getThat();

} // ConceptExpression
