// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValidateFormParser}.
 */
public interface ValidateFormListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ValidateFormParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ValidateFormParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ValidateFormParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ValidateFormParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ValidateFormParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ValidateFormParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ValidateFormParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ValidateFormParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ValidateFormParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ValidateFormParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execMandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void enterExecMandatory(ValidateFormParser.ExecMandatoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execMandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void exitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execRegex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterExecRegex(ValidateFormParser.ExecRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execRegex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitExecRegex(ValidateFormParser.ExecRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execAssert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 */
	void enterExecAssert(ValidateFormParser.ExecAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execAssert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 */
	void exitExecAssert(ValidateFormParser.ExecAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execGetAttribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execGetAttribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterOnlyIf(ValidateFormParser.OnlyIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitOnlyIf(ValidateFormParser.OnlyIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(ValidateFormParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(ValidateFormParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingleConditions(ValidateFormParser.SingleConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingleConditions(ValidateFormParser.SingleConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ValidateFormParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond(ValidateFormParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ValidateFormParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond(ValidateFormParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(ValidateFormParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(ValidateFormParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ValidateFormParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ValidateFormParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterExecAssign(ValidateFormParser.ExecAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitExecAssign(ValidateFormParser.ExecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterExecVar(ValidateFormParser.ExecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitExecVar(ValidateFormParser.ExecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExec_op_atom(ValidateFormParser.Exec_op_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExec_op_atom(ValidateFormParser.Exec_op_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#sign_td}.
	 * @param ctx the parse tree
	 */
	void enterSign_td(ValidateFormParser.Sign_tdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#sign_td}.
	 * @param ctx the parse tree
	 */
	void exitSign_td(ValidateFormParser.Sign_tdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#sign_pm}.
	 * @param ctx the parse tree
	 */
	void enterSign_pm(ValidateFormParser.Sign_pmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#sign_pm}.
	 * @param ctx the parse tree
	 */
	void exitSign_pm(ValidateFormParser.Sign_pmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#var_label}.
	 * @param ctx the parse tree
	 */
	void enterVar_label(ValidateFormParser.Var_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#var_label}.
	 * @param ctx the parse tree
	 */
	void exitVar_label(ValidateFormParser.Var_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(ValidateFormParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(ValidateFormParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(ValidateFormParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(ValidateFormParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execString}
	 * labeled alternative in {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 */
	void enterExecString(ValidateFormParser.ExecStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execString}
	 * labeled alternative in {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 */
	void exitExecString(ValidateFormParser.ExecStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ValidateFormParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ValidateFormParser.CharacterContext ctx);
}