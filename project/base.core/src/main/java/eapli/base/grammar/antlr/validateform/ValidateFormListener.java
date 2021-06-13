// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValidateFormParser}.
 */
public interface ValidateFormListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ValidateFormParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ValidateFormParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ValidateFormParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ValidateFormParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ValidateFormParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ValidateFormParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ValidateFormParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ValidateFormParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ValidateFormParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ValidateFormParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ValidateFormParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ValidateFormParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_mandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void enterExec_mandatory(ValidateFormParser.Exec_mandatoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_mandatory}
	 * labeled alternative in {@link ValidateFormParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void exitExec_mandatory(ValidateFormParser.Exec_mandatoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_regex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterExec_regex(ValidateFormParser.Exec_regexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_regex}
	 * labeled alternative in {@link ValidateFormParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitExec_regex(ValidateFormParser.Exec_regexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_assert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 */
	void enterExec_assert(ValidateFormParser.Exec_assertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_assert}
	 * labeled alternative in {@link ValidateFormParser#assert_func}.
	 * @param ctx the parse tree
	 */
	void exitExec_assert(ValidateFormParser.Exec_assertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_get_attribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExec_get_attribute(ValidateFormParser.Exec_get_attributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_get_attribute}
	 * labeled alternative in {@link ValidateFormParser#get_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExec_get_attribute(ValidateFormParser.Exec_get_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(ValidateFormParser.NumsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterOnly_if(ValidateFormParser.Only_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code only_if}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitOnly_if(ValidateFormParser.Only_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(ValidateFormParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_else}
	 * labeled alternative in {@link ValidateFormParser#if_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(ValidateFormParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_conditions(ValidateFormParser.Multiple_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiple_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_conditions(ValidateFormParser.Multiple_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingle_conditions(ValidateFormParser.Single_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_conditions}
	 * labeled alternative in {@link ValidateFormParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingle_conditions(ValidateFormParser.Single_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ValidateFormParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond(ValidateFormParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link ValidateFormParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond(ValidateFormParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(ValidateFormParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(ValidateFormParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ValidateFormParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ValidateFormParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterExec_assign(ValidateFormParser.Exec_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_assign}
	 * labeled alternative in {@link ValidateFormParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitExec_assign(ValidateFormParser.Exec_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ValidateFormParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ValidateFormParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ValidateFormParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ValidateFormParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ValidateFormParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(ValidateFormParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(ValidateFormParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#var_label}.
	 * @param ctx the parse tree
	 */
	void enterVar_label(ValidateFormParser.Var_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#var_label}.
	 * @param ctx the parse tree
	 */
	void exitVar_label(ValidateFormParser.Var_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(ValidateFormParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(ValidateFormParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(ValidateFormParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(ValidateFormParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ValidateFormParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ValidateFormParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ValidateFormParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidateFormParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ValidateFormParser.CharacterContext ctx);
}