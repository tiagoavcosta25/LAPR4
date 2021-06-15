// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ValidateFormParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ValidateFormVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ValidateFormParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ValidateFormParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ValidateFormParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ValidateFormParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ValidateFormParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execMandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execRegex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecRegex(ValidateFormParser.ExecRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execAssert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecAssert(ValidateFormParser.ExecAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execGetAttribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyIf(ValidateFormParser.OnlyIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ValidateFormParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditions(ValidateFormParser.SingleConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ValidateFormParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ValidateFormParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(ValidateFormParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(ValidateFormParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecAssign(ValidateFormParser.ExecAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecVar(ValidateFormParser.ExecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_op_atom(ValidateFormParser.Exec_op_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#sign_td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_td(ValidateFormParser.Sign_tdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#sign_pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_pm(ValidateFormParser.Sign_pmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#var_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_label(ValidateFormParser.Var_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(ValidateFormParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(ValidateFormParser.AlphaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execString}
	 * labeled alternative in {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecString(ValidateFormParser.ExecStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(ValidateFormParser.CharacterContext ctx);
}