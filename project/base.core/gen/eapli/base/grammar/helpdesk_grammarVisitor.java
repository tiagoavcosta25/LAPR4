// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\helpdesk_grammar.g4 by ANTLR 4.9.1
package eapli.base.grammar;
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
	 * Visit a parse tree produced by {@link helpdesk_grammarParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(helpdesk_grammarParser.CalcContext ctx);
}