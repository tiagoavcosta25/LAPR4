// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.autotask;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutoTaskParser}.
 */
public interface AutoTaskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AutoTaskParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AutoTaskParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(AutoTaskParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(AutoTaskParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AutoTaskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AutoTaskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AutoTaskParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AutoTaskParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AutoTaskParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AutoTaskParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AutoTaskParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AutoTaskParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void enterSendEmail(AutoTaskParser.SendEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void exitSendEmail(AutoTaskParser.SendEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void enterFileSearch(AutoTaskParser.FileSearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void exitFileSearch(AutoTaskParser.FileSearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_func(AutoTaskParser.If_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_func(AutoTaskParser.If_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(AutoTaskParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(AutoTaskParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AutoTaskParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AutoTaskParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(AutoTaskParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(AutoTaskParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(AutoTaskParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(AutoTaskParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AutoTaskParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AutoTaskParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AutoTaskParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AutoTaskParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(AutoTaskParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(AutoTaskParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AutoTaskParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AutoTaskParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(AutoTaskParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(AutoTaskParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(AutoTaskParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(AutoTaskParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(AutoTaskParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(AutoTaskParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#folder}.
	 * @param ctx the parse tree
	 */
	void enterFolder(AutoTaskParser.FolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#folder}.
	 * @param ctx the parse tree
	 */
	void exitFolder(AutoTaskParser.FolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AutoTaskParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AutoTaskParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(AutoTaskParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(AutoTaskParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(AutoTaskParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(AutoTaskParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(AutoTaskParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(AutoTaskParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AutoTaskParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AutoTaskParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#var_label}.
	 * @param ctx the parse tree
	 */
	void enterVar_label(AutoTaskParser.Var_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#var_label}.
	 * @param ctx the parse tree
	 */
	void exitVar_label(AutoTaskParser.Var_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(AutoTaskParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(AutoTaskParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#system_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_name(AutoTaskParser.System_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#system_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_name(AutoTaskParser.System_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(AutoTaskParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(AutoTaskParser.AlphaContext ctx);
}