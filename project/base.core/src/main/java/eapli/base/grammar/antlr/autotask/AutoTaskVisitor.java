// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.autotask;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutoTaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutoTaskVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutoTaskParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(AutoTaskParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AutoTaskParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AutoTaskParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AutoTaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSendEmail}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execFileSearch}
	 * labeled alternative in {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly_if(AutoTaskParser.Only_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(AutoTaskParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_conditions(AutoTaskParser.Multiple_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_conditions(AutoTaskParser.Single_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(AutoTaskParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(AutoTaskParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(AutoTaskParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_assign(AutoTaskParser.Exec_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_var}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_var(AutoTaskParser.Exec_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_op_times_division}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_op_times_division(AutoTaskParser.Exec_op_times_divisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_op_plus_minus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_op_plus_minus(AutoTaskParser.Exec_op_plus_minusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_op_atom(AutoTaskParser.Exec_op_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_op_parenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_op_parenthesis(AutoTaskParser.Exec_op_parenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AutoTaskParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sign_td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_td(AutoTaskParser.Sign_tdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sign_pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_pm(AutoTaskParser.Sign_pmContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(AutoTaskParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(AutoTaskParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(AutoTaskParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AutoTaskParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(AutoTaskParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(AutoTaskParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(AutoTaskParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AutoTaskParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#var_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_label(AutoTaskParser.Var_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(AutoTaskParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#system_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_name(AutoTaskParser.System_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(AutoTaskParser.AlphaContext ctx);
}