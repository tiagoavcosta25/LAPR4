// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\helpdesk_grammar.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link helpdesk_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface helpdesk_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(helpdesk_grammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(helpdesk_grammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(helpdesk_grammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(helpdesk_grammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(helpdesk_grammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(helpdesk_grammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendEmail(helpdesk_grammarParser.SendEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSearch(helpdesk_grammarParser.FileSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_func(helpdesk_grammarParser.If_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(helpdesk_grammarParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(helpdesk_grammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(helpdesk_grammarParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(helpdesk_grammarParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(helpdesk_grammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(helpdesk_grammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(helpdesk_grammarParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(helpdesk_grammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(helpdesk_grammarParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(helpdesk_grammarParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(helpdesk_grammarParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(helpdesk_grammarParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(helpdesk_grammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(helpdesk_grammarParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(helpdesk_grammarParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(helpdesk_grammarParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(helpdesk_grammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#var_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_label(helpdesk_grammarParser.Var_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(helpdesk_grammarParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#system_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_name(helpdesk_grammarParser.System_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(helpdesk_grammarParser.AlphaContext ctx);
}