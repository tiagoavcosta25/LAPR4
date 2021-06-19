// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValidateFormParser}.
 */
public interface ValidateFormListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code execStart}
	 * labeled alternative in {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void enterExecStart(ValidateFormParser.ExecStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execStart}
	 * labeled alternative in {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void exitExecStart(ValidateFormParser.ExecStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execStatements}
	 * labeled alternative in {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterExecStatements(ValidateFormParser.ExecStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execStatements}
	 * labeled alternative in {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitExecStatements(ValidateFormParser.ExecStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execHeader}
	 * labeled alternative in {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void enterExecHeader(ValidateFormParser.ExecHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execHeader}
	 * labeled alternative in {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void exitExecHeader(ValidateFormParser.ExecHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execType}
	 * labeled alternative in {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void enterExecType(ValidateFormParser.ExecTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execType}
	 * labeled alternative in {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void exitExecType(ValidateFormParser.ExecTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtMandatory}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtMandatory(ValidateFormParser.StmtMandatoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtMandatory}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtMandatory(ValidateFormParser.StmtMandatoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtRegex}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtRegex(ValidateFormParser.StmtRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtRegex}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtRegex(ValidateFormParser.StmtRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAssert}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssert(ValidateFormParser.StmtAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAssert}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssert(ValidateFormParser.StmtAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAttribute}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAttribute(ValidateFormParser.StmtAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAttribute}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAttribute(ValidateFormParser.StmtAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtDateComp}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDateComp(ValidateFormParser.StmtDateCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtDateComp}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDateComp(ValidateFormParser.StmtDateCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(ValidateFormParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(ValidateFormParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(ValidateFormParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(ValidateFormParser.StmtAssignContext ctx);
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
	 * Enter a parse tree produced by the {@code execDateCompare}
	 * labeled alternative in {@link ValidateFormParser#date_comp}.
	 * @param ctx the parse tree
	 */
	void enterExecDateCompare(ValidateFormParser.ExecDateCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execDateCompare}
	 * labeled alternative in {@link ValidateFormParser#date_comp}.
	 * @param ctx the parse tree
	 */
	void exitExecDateCompare(ValidateFormParser.ExecDateCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execMultipleNumbers}
	 * labeled alternative in {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void enterExecMultipleNumbers(ValidateFormParser.ExecMultipleNumbersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execMultipleNumbers}
	 * labeled alternative in {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void exitExecMultipleNumbers(ValidateFormParser.ExecMultipleNumbersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execNum}
	 * labeled alternative in {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void enterExecNum(ValidateFormParser.ExecNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execNum}
	 * labeled alternative in {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void exitExecNum(ValidateFormParser.ExecNumContext ctx);
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
	 * Enter a parse tree produced by the {@code boolMandatory}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolMandatory(ValidateFormParser.BoolMandatoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolMandatory}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolMandatory(ValidateFormParser.BoolMandatoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolRegex}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolRegex(ValidateFormParser.BoolRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolRegex}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolRegex(ValidateFormParser.BoolRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDateComp}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolDateComp(ValidateFormParser.BoolDateCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDateComp}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolDateComp(ValidateFormParser.BoolDateCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConditions}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolConditions(ValidateFormParser.BoolConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConditions}
	 * labeled alternative in {@link ValidateFormParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolConditions(ValidateFormParser.BoolConditionsContext ctx);
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
	 * Enter a parse tree produced by the {@code execOpAtom}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpAtom(ValidateFormParser.ExecOpAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpAtom}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpAtom(ValidateFormParser.ExecOpAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectVariable}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectVariable(ValidateFormParser.ObjectVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectVariable}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectVariable(ValidateFormParser.ObjectVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectNumber}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectNumber(ValidateFormParser.ObjectNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectNumber}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectNumber(ValidateFormParser.ObjectNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectAttribute}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectAttribute(ValidateFormParser.ObjectAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectAttribute}
	 * labeled alternative in {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectAttribute(ValidateFormParser.ObjectAttributeContext ctx);
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
	 * Enter a parse tree produced by {@link ValidateFormParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ValidateFormParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ValidateFormParser.NumContext ctx);
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