// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\helpdesk_grammar.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helpdesk_grammarParser}.
 */
public interface helpdesk_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(helpdesk_grammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(helpdesk_grammarParser.StartContext ctx);
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
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(helpdesk_grammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(helpdesk_grammarParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_func(helpdesk_grammarParser.If_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_func(helpdesk_grammarParser.If_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(helpdesk_grammarParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(helpdesk_grammarParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(helpdesk_grammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(helpdesk_grammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(helpdesk_grammarParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(helpdesk_grammarParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(helpdesk_grammarParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(helpdesk_grammarParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(helpdesk_grammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(helpdesk_grammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(helpdesk_grammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(helpdesk_grammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(helpdesk_grammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(helpdesk_grammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(helpdesk_grammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(helpdesk_grammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(helpdesk_grammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(helpdesk_grammarParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(helpdesk_grammarParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(helpdesk_grammarParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(helpdesk_grammarParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(helpdesk_grammarParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#folder}.
	 * @param ctx the parse tree
	 */
	void enterFolder(helpdesk_grammarParser.FolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#folder}.
	 * @param ctx the parse tree
	 */
	void exitFolder(helpdesk_grammarParser.FolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(helpdesk_grammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(helpdesk_grammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(helpdesk_grammarParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(helpdesk_grammarParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(helpdesk_grammarParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(helpdesk_grammarParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(helpdesk_grammarParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(helpdesk_grammarParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(helpdesk_grammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(helpdesk_grammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#var_label}.
	 * @param ctx the parse tree
	 */
	void enterVar_label(helpdesk_grammarParser.Var_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#var_label}.
	 * @param ctx the parse tree
	 */
	void exitVar_label(helpdesk_grammarParser.Var_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(helpdesk_grammarParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(helpdesk_grammarParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#system_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_name(helpdesk_grammarParser.System_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#system_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_name(helpdesk_grammarParser.System_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helpdesk_grammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(helpdesk_grammarParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link helpdesk_grammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(helpdesk_grammarParser.AlphaContext ctx);
}