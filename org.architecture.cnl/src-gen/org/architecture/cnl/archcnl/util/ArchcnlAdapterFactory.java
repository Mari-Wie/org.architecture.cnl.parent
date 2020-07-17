/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl.util;

import org.architecture.cnl.archcnl.AndObjectConceptExpression;
import org.architecture.cnl.archcnl.Anything;
import org.architecture.cnl.archcnl.ArchcnlPackage;
import org.architecture.cnl.archcnl.CanOnlyRuleType;
import org.architecture.cnl.archcnl.CardinalityRuleType;
import org.architecture.cnl.archcnl.Concept;
import org.architecture.cnl.archcnl.ConceptAssertion;
import org.architecture.cnl.archcnl.ConceptExpression;
import org.architecture.cnl.archcnl.ConditionalRuleType;
import org.architecture.cnl.archcnl.DataStatement;
import org.architecture.cnl.archcnl.DatatypePropertyAssertion;
import org.architecture.cnl.archcnl.DatatypeRelation;
import org.architecture.cnl.archcnl.FactStatement;
import org.architecture.cnl.archcnl.Model;
import org.architecture.cnl.archcnl.MustRuleType;
import org.architecture.cnl.archcnl.NegationRuleType;
import org.architecture.cnl.archcnl.Nothing;
import org.architecture.cnl.archcnl.ObjectConceptExpression;
import org.architecture.cnl.archcnl.ObjectPropertyAssertion;
import org.architecture.cnl.archcnl.ObjectRelation;
import org.architecture.cnl.archcnl.OnlyCanRuleType;
import org.architecture.cnl.archcnl.OrObjectConceptExpression;
import org.architecture.cnl.archcnl.Relation;
import org.architecture.cnl.archcnl.RoleAssertion;
import org.architecture.cnl.archcnl.Sentence;
import org.architecture.cnl.archcnl.StatementList;
import org.architecture.cnl.archcnl.SubConceptRuleType;
import org.architecture.cnl.archcnl.ThatExpression;
import org.architecture.cnl.archcnl.Variable;
import org.architecture.cnl.archcnl.VariableStatement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.architecture.cnl.archcnl.ArchcnlPackage
 * @generated
 */
public class ArchcnlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchcnlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchcnlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchcnlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchcnlSwitch<Adapter> modelSwitch =
    new ArchcnlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseNegationRuleType(NegationRuleType object)
      {
        return createNegationRuleTypeAdapter();
      }
      @Override
      public Adapter caseAnything(Anything object)
      {
        return createAnythingAdapter();
      }
      @Override
      public Adapter caseNothing(Nothing object)
      {
        return createNothingAdapter();
      }
      @Override
      public Adapter caseConditionalRuleType(ConditionalRuleType object)
      {
        return createConditionalRuleTypeAdapter();
      }
      @Override
      public Adapter caseOnlyCanRuleType(OnlyCanRuleType object)
      {
        return createOnlyCanRuleTypeAdapter();
      }
      @Override
      public Adapter caseSubConceptRuleType(SubConceptRuleType object)
      {
        return createSubConceptRuleTypeAdapter();
      }
      @Override
      public Adapter caseMustRuleType(MustRuleType object)
      {
        return createMustRuleTypeAdapter();
      }
      @Override
      public Adapter caseObject(org.architecture.cnl.archcnl.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseCanOnlyRuleType(CanOnlyRuleType object)
      {
        return createCanOnlyRuleTypeAdapter();
      }
      @Override
      public Adapter caseCardinalityRuleType(CardinalityRuleType object)
      {
        return createCardinalityRuleTypeAdapter();
      }
      @Override
      public Adapter caseObjectConceptExpression(ObjectConceptExpression object)
      {
        return createObjectConceptExpressionAdapter();
      }
      @Override
      public Adapter caseAndObjectConceptExpression(AndObjectConceptExpression object)
      {
        return createAndObjectConceptExpressionAdapter();
      }
      @Override
      public Adapter caseOrObjectConceptExpression(OrObjectConceptExpression object)
      {
        return createOrObjectConceptExpressionAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseDatatypeRelation(DatatypeRelation object)
      {
        return createDatatypeRelationAdapter();
      }
      @Override
      public Adapter caseObjectRelation(ObjectRelation object)
      {
        return createObjectRelationAdapter();
      }
      @Override
      public Adapter caseConceptExpression(ConceptExpression object)
      {
        return createConceptExpressionAdapter();
      }
      @Override
      public Adapter caseThatExpression(ThatExpression object)
      {
        return createThatExpressionAdapter();
      }
      @Override
      public Adapter caseStatementList(StatementList object)
      {
        return createStatementListAdapter();
      }
      @Override
      public Adapter caseVariableStatement(VariableStatement object)
      {
        return createVariableStatementAdapter();
      }
      @Override
      public Adapter caseDataStatement(DataStatement object)
      {
        return createDataStatementAdapter();
      }
      @Override
      public Adapter caseFactStatement(FactStatement object)
      {
        return createFactStatementAdapter();
      }
      @Override
      public Adapter caseConceptAssertion(ConceptAssertion object)
      {
        return createConceptAssertionAdapter();
      }
      @Override
      public Adapter caseRoleAssertion(RoleAssertion object)
      {
        return createRoleAssertionAdapter();
      }
      @Override
      public Adapter caseDatatypePropertyAssertion(DatatypePropertyAssertion object)
      {
        return createDatatypePropertyAssertionAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object)
      {
        return createObjectPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseConcept(Concept object)
      {
        return createConceptAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.NegationRuleType <em>Negation Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.NegationRuleType
   * @generated
   */
  public Adapter createNegationRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Anything <em>Anything</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Anything
   * @generated
   */
  public Adapter createAnythingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Nothing <em>Nothing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Nothing
   * @generated
   */
  public Adapter createNothingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ConditionalRuleType <em>Conditional Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ConditionalRuleType
   * @generated
   */
  public Adapter createConditionalRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.OnlyCanRuleType <em>Only Can Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.OnlyCanRuleType
   * @generated
   */
  public Adapter createOnlyCanRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.SubConceptRuleType <em>Sub Concept Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.SubConceptRuleType
   * @generated
   */
  public Adapter createSubConceptRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.MustRuleType <em>Must Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.MustRuleType
   * @generated
   */
  public Adapter createMustRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.CanOnlyRuleType <em>Can Only Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.CanOnlyRuleType
   * @generated
   */
  public Adapter createCanOnlyRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.CardinalityRuleType <em>Cardinality Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.CardinalityRuleType
   * @generated
   */
  public Adapter createCardinalityRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ObjectConceptExpression <em>Object Concept Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ObjectConceptExpression
   * @generated
   */
  public Adapter createObjectConceptExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.AndObjectConceptExpression <em>And Object Concept Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.AndObjectConceptExpression
   * @generated
   */
  public Adapter createAndObjectConceptExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.OrObjectConceptExpression <em>Or Object Concept Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.OrObjectConceptExpression
   * @generated
   */
  public Adapter createOrObjectConceptExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.DatatypeRelation <em>Datatype Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.DatatypeRelation
   * @generated
   */
  public Adapter createDatatypeRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ObjectRelation <em>Object Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ObjectRelation
   * @generated
   */
  public Adapter createObjectRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ConceptExpression <em>Concept Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ConceptExpression
   * @generated
   */
  public Adapter createConceptExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ThatExpression <em>That Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ThatExpression
   * @generated
   */
  public Adapter createThatExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.StatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.StatementList
   * @generated
   */
  public Adapter createStatementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.VariableStatement <em>Variable Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.VariableStatement
   * @generated
   */
  public Adapter createVariableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.DataStatement <em>Data Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.DataStatement
   * @generated
   */
  public Adapter createDataStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.FactStatement <em>Fact Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.FactStatement
   * @generated
   */
  public Adapter createFactStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ConceptAssertion <em>Concept Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ConceptAssertion
   * @generated
   */
  public Adapter createConceptAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.RoleAssertion <em>Role Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.RoleAssertion
   * @generated
   */
  public Adapter createRoleAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.DatatypePropertyAssertion <em>Datatype Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.DatatypePropertyAssertion
   * @generated
   */
  public Adapter createDatatypePropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.ObjectPropertyAssertion
   * @generated
   */
  public Adapter createObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Concept
   * @generated
   */
  public Adapter createConceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.architecture.cnl.archcnl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.architecture.cnl.archcnl.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArchcnlAdapterFactory