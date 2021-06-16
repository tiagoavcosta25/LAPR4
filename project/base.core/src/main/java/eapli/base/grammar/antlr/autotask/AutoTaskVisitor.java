// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link AutoTaskParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutoTaskParser.StartContext ctx);
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
	 * Visit a parse tree produced by {@link AutoTaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AutoTaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execSendEmail}
	 * labeled alternative in {@link AutoTaskParser#sendEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execFileSearch}
	 * labeled alternative in {@link AutoTaskParser#fileSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx);
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
	 * Visit a parse tree produced by the {@code execOpParenthesis}
	 * labeled alternative in {@link AutoTaskParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecOpParenthesis(AutoTaskParser.ExecOpParenthesisContext ctx);
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
	 * Visit a parse tree produced by the {@code objectFileSearch}
	 * labeled alternative in {@link AutoTaskParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx);
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
	 * Visit a parse tree produced by {@link AutoTaskParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(AutoTaskParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(AutoTaskParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(AutoTaskParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AutoTaskParser.FileContext ctx);
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
	 * Visit a parse tree produced by {@link AutoTaskParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(AutoTaskParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoTaskParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AutoTaskParser.BodyContext ctx);
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