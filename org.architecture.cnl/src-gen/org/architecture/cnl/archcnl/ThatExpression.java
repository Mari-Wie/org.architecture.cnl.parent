/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>That Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.ThatExpression#getList <em>List</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getThatExpression()
 * @model
 * @generated
 */
public interface ThatExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link org.architecture.cnl.archcnl.StatementList}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getThatExpression_List()
   * @model containment="true"
   * @generated
   */
  EList<StatementList> getList();

} // ThatExpression
