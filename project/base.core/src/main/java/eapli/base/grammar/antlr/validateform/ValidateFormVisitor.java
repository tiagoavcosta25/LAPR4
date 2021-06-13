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
	 * Visit a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ValidateFormParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link ValidateFormParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ValidateFormParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_mandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_mandatory(ValidateFormParser.Exec_mandatoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_regex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_regex(ValidateFormParser.Exec_regexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_assert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_assert(ValidateFormParser.Exec_assertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_get_attribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_get_attribute(ValidateFormParser.Exec_get_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly_if(ValidateFormParser.Only_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(ValidateFormParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_conditions(ValidateFormParser.Multiple_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_conditions(ValidateFormParser.Single_conditionsContext ctx);
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
	 * Visit a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_assign(ValidateFormParser.Exec_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ValidateFormParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ValidateFormParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(ValidateFormParser.SignContext ctx);
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
	 * Visit a parse tree produced by {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ValidateFormParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(ValidateFormParser.CharacterContext ctx);
}