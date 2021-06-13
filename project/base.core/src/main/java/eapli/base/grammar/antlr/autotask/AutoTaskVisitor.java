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
	 * Visit a parse tree produced by {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AutoTaskParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link AutoTaskParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AutoTaskParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendEmail(AutoTaskParser.SendEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSearch(AutoTaskParser.FileSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_func(AutoTaskParser.If_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(AutoTaskParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AutoTaskParser.ConditionContext ctx);
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
	 * Visit a parse tree produced by {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AutoTaskParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AutoTaskParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(AutoTaskParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AutoTaskParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(AutoTaskParser.SignContext ctx);
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