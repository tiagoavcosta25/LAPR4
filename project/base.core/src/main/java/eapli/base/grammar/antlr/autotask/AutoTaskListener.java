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
	 * Enter a parse tree produced by the {@code execStatements}
	 * labeled alternative in {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterExecStatements(AutoTaskParser.ExecStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execStatements}
	 * labeled alternative in {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitExecStatements(AutoTaskParser.ExecStatementsContext ctx);
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
	 * Enter a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterOnlyIf(AutoTaskParser.OnlyIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitOnlyIf(AutoTaskParser.OnlyIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(AutoTaskParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(AutoTaskParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterMultipleConditions(AutoTaskParser.MultipleConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitMultipleConditions(AutoTaskParser.MultipleConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingleConditions(AutoTaskParser.SingleConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingleConditions(AutoTaskParser.SingleConditionsContext ctx);
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
	 * Enter a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterExecAssign(AutoTaskParser.ExecAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitExecAssign(AutoTaskParser.ExecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterExecVar(AutoTaskParser.ExecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitExecVar(AutoTaskParser.ExecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpTimesDivision(AutoTaskParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpTimesDivision(AutoTaskParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpParenthesis(AutoTaskParser.ExecOpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpParenthesis(AutoTaskParser.ExecOpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpPlusMinus(AutoTaskParser.ExecOpPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpPlusMinus(AutoTaskParser.ExecOpPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execOpAtom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void enterExecOpAtom(AutoTaskParser.ExecOpAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execOpAtom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 */
	void exitExecOpAtom(AutoTaskParser.ExecOpAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectVariable}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectVariable(AutoTaskParser.ObjectVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectVariable}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectVariable(AutoTaskParser.ObjectVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectNumber}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectNumber(AutoTaskParser.ObjectNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectNumber}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectNumber(AutoTaskParser.ObjectNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFileSearch}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFileSearch}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx);
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
	 * Enter a parse tree produced by {@link AutoTaskParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AutoTaskParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AutoTaskParser.NumContext ctx);
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