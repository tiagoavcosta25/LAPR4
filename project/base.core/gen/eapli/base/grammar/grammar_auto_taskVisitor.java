// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\grammar_auto_task.g4 by ANTLR 4.9.1
package eapli.base.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammar_auto_taskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammar_auto_taskVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(grammar_auto_taskParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(grammar_auto_taskParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grammar_auto_taskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(grammar_auto_taskParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammar_auto_taskParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(grammar_auto_taskParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendEmail(grammar_auto_taskParser.SendEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSearch(grammar_auto_taskParser.FileSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_func(grammar_auto_taskParser.If_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(grammar_auto_taskParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grammar_auto_taskParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(grammar_auto_taskParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(grammar_auto_taskParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(grammar_auto_taskParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(grammar_auto_taskParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(grammar_auto_taskParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(grammar_auto_taskParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(grammar_auto_taskParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(grammar_auto_taskParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(grammar_auto_taskParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(grammar_auto_taskParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(grammar_auto_taskParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(grammar_auto_taskParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(grammar_auto_taskParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(grammar_auto_taskParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(grammar_auto_taskParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#var_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_label(grammar_auto_taskParser.Var_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(grammar_auto_taskParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#system_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_name(grammar_auto_taskParser.System_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_auto_taskParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(grammar_auto_taskParser.AlphaContext ctx);
}