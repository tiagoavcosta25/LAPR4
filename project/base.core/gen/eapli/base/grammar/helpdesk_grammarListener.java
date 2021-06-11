// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\helpdesk_grammar.g4 by ANTLR 4.9.1
package eapli.base.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helpdesk_grammarParser}.
 */
public interface helpdesk_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(helpdesk_grammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(helpdesk_grammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(helpdesk_grammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(helpdesk_grammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(helpdesk_grammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(helpdesk_grammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(helpdesk_grammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(helpdesk_grammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void enterSendEmail(helpdesk_grammarParser.SendEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void exitSendEmail(helpdesk_grammarParser.SendEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void enterFileSearch(helpdesk_grammarParser.FileSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void exitFileSearch(helpdesk_grammarParser.FileSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(helpdesk_grammarParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(helpdesk_grammarParser.CalcContext ctx);
}