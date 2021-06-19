// Generated from D:/Universidade/2/2/LAPR/lei20_21_s4_2di_03/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code execStart}
	 * labeled alternative in {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStart(AutoTaskParser.ExecStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execStatements}
	 * labeled alternative in {@link AutoTaskParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStatements(AutoTaskParser.ExecStatementsContext ctx);
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
	 * Visit a parse tree produced by the {@code stmtSendEmail}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSendEmail(AutoTaskParser.StmtSendEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFileSearch}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFileSearch(AutoTaskParser.StmtFileSearchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(AutoTaskParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtGetValue}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtGetValue(AutoTaskParser.StmtGetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(AutoTaskParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSendEmail}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSendEmailCollab}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execFileSearch}
	 * labeled alternative in {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSearchIn}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSearchIn(AutoTaskParser.ExecSearchInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSearchInFile}
	 * labeled alternative in {@link AutoTaskParser#searchInFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSearchInFile(AutoTaskParser.ExecSearchInFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchKeyValue}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchKeyValue(AutoTaskParser.SearchKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchKeyVar}
	 * labeled alternative in {@link AutoTaskParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchKeyVar(AutoTaskParser.SearchKeyVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyIf}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyIf(AutoTaskParser.OnlyIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link AutoTaskParser#if_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(AutoTaskParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execEndIf}
	 * labeled alternative in {@link AutoTaskParser#end_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecEndIf(AutoTaskParser.ExecEndIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execStartElse}
	 * labeled alternative in {@link AutoTaskParser#start_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStartElse(AutoTaskParser.ExecStartElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleConditions(AutoTaskParser.MultipleConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditions}
	 * labeled alternative in {@link AutoTaskParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditions(AutoTaskParser.SingleConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link AutoTaskParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(AutoTaskParser.CondContext ctx);
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
	 * Visit a parse tree produced by the {@code execGetValue}
	 * labeled alternative in {@link AutoTaskParser#get_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecGetValue(AutoTaskParser.ExecGetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execAssign}
	 * labeled alternative in {@link AutoTaskParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecAssign(AutoTaskParser.ExecAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execVar}
	 * labeled alternative in {@link AutoTaskParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecVar(AutoTaskParser.ExecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpTimesDivision}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpTimesDivision(AutoTaskParser.ExecOpTimesDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpParenthesis(AutoTaskParser.ExecOpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpPlusMinus}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpPlusMinus(AutoTaskParser.ExecOpPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execOpAtom}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpAtom(AutoTaskParser.ExecOpAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectVariable}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVariable(AutoTaskParser.ObjectVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectNumber}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectNumber(AutoTaskParser.ObjectNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectText}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectText(AutoTaskParser.ObjectTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFileSearch}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectGetValue}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectGetValue(AutoTaskParser.ObjectGetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sign_td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_td(AutoTaskParser.Sign_tdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#sign_pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_pm(AutoTaskParser.Sign_pmContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AutoTaskParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AutoTaskParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(AutoTaskParser.CharactersContext ctx);
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
	 * Visit a parse tree produced by the {@code execSubject}
	 * labeled alternative in {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSubject(AutoTaskParser.ExecSubjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execBody}
	 * labeled alternative in {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecBody(AutoTaskParser.ExecBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodySpacesObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodySpacesObject(AutoTaskParser.BodySpacesObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyObject}
	 * labeled alternative in {@link AutoTaskParser#email_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyObject(AutoTaskParser.BodyObjectContext ctx);
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