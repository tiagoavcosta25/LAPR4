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
	 * Enter a parse tree produced by the {@code execSendEmail}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void enterExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execSendEmail}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void exitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execFileSearch}
	 * labeled alternative in {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void enterExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execFileSearch}
	 * labeled alternative in {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 */
	void exitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterOnly_if(AutoTaskParser.Only_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitOnly_if(AutoTaskParser.Only_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(AutoTaskParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(AutoTaskParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_conditions(AutoTaskParser.Multiple_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_conditions(AutoTaskParser.Multiple_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingle_conditions(AutoTaskParser.Single_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingle_conditions(AutoTaskParser.Single_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond(AutoTaskParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond(AutoTaskParser.CondContext ctx);
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
	 * Enter a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterExec_assign(AutoTaskParser.Exec_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitExec_assign(AutoTaskParser.Exec_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_var}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterExec_var(AutoTaskParser.Exec_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_var}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitExec_var(AutoTaskParser.Exec_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_op_times_division}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExec_op_times_division(AutoTaskParser.Exec_op_times_divisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_op_times_division}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExec_op_times_division(AutoTaskParser.Exec_op_times_divisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_op_plus_minus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExec_op_plus_minus(AutoTaskParser.Exec_op_plus_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_op_plus_minus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExec_op_plus_minus(AutoTaskParser.Exec_op_plus_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExec_op_atom(AutoTaskParser.Exec_op_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_op_atom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExec_op_atom(AutoTaskParser.Exec_op_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_op_parenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExec_op_parenthesis(AutoTaskParser.Exec_op_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_op_parenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExec_op_parenthesis(AutoTaskParser.Exec_op_parenthesisContext ctx);
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
	 * Enter a parse tree produced by {@link AutoTaskParser#sign_td}.
	 * @param ctx the parse tree
	 */
	void enterSign_td(AutoTaskParser.Sign_tdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#sign_td}.
	 * @param ctx the parse tree
	 */
	void exitSign_td(AutoTaskParser.Sign_tdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#sign_pm}.
	 * @param ctx the parse tree
	 */
	void enterSign_pm(AutoTaskParser.Sign_pmContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#sign_pm}.
	 * @param ctx the parse tree
	 */
	void exitSign_pm(AutoTaskParser.Sign_pmContext ctx);
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