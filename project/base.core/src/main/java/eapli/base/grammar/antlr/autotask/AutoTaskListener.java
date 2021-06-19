// Generated from D:/Universidade/2/2/LAPR/lei20_21_s4_2di_03/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.autotask;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutoTaskParser}.
 */
public interface AutoTaskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code execStart}
	 * labeled alternative in {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 */
	void enterExecStart(AutoTaskParser.ExecStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execStart}
	 * labeled alternative in {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 */
	void exitExecStart(AutoTaskParser.ExecStartContext ctx);
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
	 * Enter a parse tree produced by the {@code stmtSendEmail}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSendEmail(AutoTaskParser.StmtSendEmailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSendEmail}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSendEmail(AutoTaskParser.StmtSendEmailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFileSearch}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFileSearch(AutoTaskParser.StmtFileSearchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFileSearch}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFileSearch(AutoTaskParser.StmtFileSearchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(AutoTaskParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(AutoTaskParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtGetValue}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtGetValue(AutoTaskParser.StmtGetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtGetValue}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtGetValue(AutoTaskParser.StmtGetValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(AutoTaskParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(AutoTaskParser.StmtAssignContext ctx);
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
	 * Enter a parse tree produced by the {@code execSendEmailCollab}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void enterExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execSendEmailCollab}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 */
	void exitExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx);
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
	 * Enter a parse tree produced by the {@code execSearchIn}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 */
	void enterExecSearchIn(AutoTaskParser.ExecSearchInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execSearchIn}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 */
	void exitExecSearchIn(AutoTaskParser.ExecSearchInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execSearchInFile}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 */
	void enterExecSearchInFile(AutoTaskParser.ExecSearchInFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execSearchInFile}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 */
	void exitExecSearchInFile(AutoTaskParser.ExecSearchInFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchKeyValue}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSearchKeyValue(AutoTaskParser.SearchKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchKeyValue}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSearchKeyValue(AutoTaskParser.SearchKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchKeyVar}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSearchKeyVar(AutoTaskParser.SearchKeyVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchKeyVar}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSearchKeyVar(AutoTaskParser.SearchKeyVarContext ctx);
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
	 * Enter a parse tree produced by the {@code execEndIf}
	 * labeled alternative in {@link AutoTaskParser#end_if}.
	 * @param ctx the parse tree
	 */
	void enterExecEndIf(AutoTaskParser.ExecEndIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execEndIf}
	 * labeled alternative in {@link AutoTaskParser#end_if}.
	 * @param ctx the parse tree
	 */
	void exitExecEndIf(AutoTaskParser.ExecEndIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execStartElse}
	 * labeled alternative in {@link AutoTaskParser#start_else}.
	 * @param ctx the parse tree
	 */
	void enterExecStartElse(AutoTaskParser.ExecStartElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execStartElse}
	 * labeled alternative in {@link AutoTaskParser#start_else}.
	 * @param ctx the parse tree
	 */
	void exitExecStartElse(AutoTaskParser.ExecStartElseContext ctx);
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
	 * Enter a parse tree produced by the {@code execGetValue}
	 * labeled alternative in {@link AutoTaskParser#get_value}.
	 * @param ctx the parse tree
	 */
	void enterExecGetValue(AutoTaskParser.ExecGetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execGetValue}
	 * labeled alternative in {@link AutoTaskParser#get_value}.
	 * @param ctx the parse tree
	 */
	void exitExecGetValue(AutoTaskParser.ExecGetValueContext ctx);
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
	 * Enter a parse tree produced by the {@code objectText}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectText(AutoTaskParser.ObjectTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectText}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectText(AutoTaskParser.ObjectTextContext ctx);
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
	 * Enter a parse tree produced by the {@code objectGetValue}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectGetValue(AutoTaskParser.ObjectGetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectGetValue}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectGetValue(AutoTaskParser.ObjectGetValueContext ctx);
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
	 * Enter a parse tree produced by {@link AutoTaskParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AutoTaskParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AutoTaskParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoTaskParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(AutoTaskParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoTaskParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(AutoTaskParser.CharactersContext ctx);
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
	 * Enter a parse tree produced by the {@code execSubject}
	 * labeled alternative in {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterExecSubject(AutoTaskParser.ExecSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execSubject}
	 * labeled alternative in {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitExecSubject(AutoTaskParser.ExecSubjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execBody}
	 * labeled alternative in {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 */
	void enterExecBody(AutoTaskParser.ExecBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execBody}
	 * labeled alternative in {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 */
	void exitExecBody(AutoTaskParser.ExecBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodySpacesObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 */
	void enterBodySpacesObject(AutoTaskParser.BodySpacesObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodySpacesObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 */
	void exitBodySpacesObject(AutoTaskParser.BodySpacesObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 */
	void enterBodyObject(AutoTaskParser.BodyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 */
	void exitBodyObject(AutoTaskParser.BodyObjectContext ctx);
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