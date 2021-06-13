// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\grammar_auto_task.g4 by ANTLR 4.9.1
package eapli.base.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammar_auto_taskParser}.
 */
public interface grammar_auto_taskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(grammar_auto_taskParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(grammar_auto_taskParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(grammar_auto_taskParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(grammar_auto_taskParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grammar_auto_taskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grammar_auto_taskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(grammar_auto_taskParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(grammar_auto_taskParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammar_auto_taskParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammar_auto_taskParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(grammar_auto_taskParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(grammar_auto_taskParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void enterSendEmail(grammar_auto_taskParser.SendEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void exitSendEmail(grammar_auto_taskParser.SendEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void enterFileSearch(grammar_auto_taskParser.FileSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void exitFileSearch(grammar_auto_taskParser.FileSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_func(grammar_auto_taskParser.If_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_func(grammar_auto_taskParser.If_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(grammar_auto_taskParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(grammar_auto_taskParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammar_auto_taskParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammar_auto_taskParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(grammar_auto_taskParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(grammar_auto_taskParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(grammar_auto_taskParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(grammar_auto_taskParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(grammar_auto_taskParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(grammar_auto_taskParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(grammar_auto_taskParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(grammar_auto_taskParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(grammar_auto_taskParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(grammar_auto_taskParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(grammar_auto_taskParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(grammar_auto_taskParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(grammar_auto_taskParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(grammar_auto_taskParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(grammar_auto_taskParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(grammar_auto_taskParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(grammar_auto_taskParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(grammar_auto_taskParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#folder}.
	 * @param ctx the parse tree
	 */
	void enterFolder(grammar_auto_taskParser.FolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#folder}.
	 * @param ctx the parse tree
	 */
	void exitFolder(grammar_auto_taskParser.FolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(grammar_auto_taskParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(grammar_auto_taskParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(grammar_auto_taskParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(grammar_auto_taskParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(grammar_auto_taskParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(grammar_auto_taskParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(grammar_auto_taskParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(grammar_auto_taskParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(grammar_auto_taskParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(grammar_auto_taskParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#var_label}.
	 * @param ctx the parse tree
	 */
	void enterVar_label(grammar_auto_taskParser.Var_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#var_label}.
	 * @param ctx the parse tree
	 */
	void exitVar_label(grammar_auto_taskParser.Var_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(grammar_auto_taskParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(grammar_auto_taskParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#system_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_name(grammar_auto_taskParser.System_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#system_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_name(grammar_auto_taskParser.System_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_auto_taskParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(grammar_auto_taskParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_auto_taskParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(grammar_auto_taskParser.AlphaContext ctx);
}