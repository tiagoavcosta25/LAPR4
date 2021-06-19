package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class FormVisitor extends ValidateFormBaseVisitor<String> {

    private Response m_oResponse;
    private Map<String,String> m_oMapVariables;

    public FormVisitor(Response r){
        this.m_oResponse = r;
        this.m_oMapVariables = new HashMap<>();
    }

    @Override
    public String visitChildren(RuleNode node) {
        String result = "true";
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            String childResult = c.accept(this);
            result = String.valueOf(Boolean.logicalAnd(Boolean.valueOf(result), Boolean.valueOf(childResult)));
        }

        return result;
    }

    @Override
    public String visitExecStart(ValidateFormParser.ExecStartContext ctx) {
        return visit(ctx.stmts);
    }

    @Override
    public String visitExecStatements(ValidateFormParser.ExecStatementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitStmtMandatory(ValidateFormParser.StmtMandatoryContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtRegex(ValidateFormParser.StmtRegexContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtAssert(ValidateFormParser.StmtAssertContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtAttribute(ValidateFormParser.StmtAttributeContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtDateComp(ValidateFormParser.StmtDateCompContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtIf(ValidateFormParser.StmtIfContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtAssign(ValidateFormParser.StmtAssignContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx) {
        String str = ctx.agr.getText();
        Boolean flag = true;
        List<Integer> lstAttributes = new ArrayList<>();

        while(!str.isEmpty()){
            if(str.indexOf(",") == -1){
                lstAttributes.add(Integer.parseInt(str.trim()));
                break;
            }
            lstAttributes.add(Integer.parseInt(str.substring(0, str.indexOf(",")).trim()));
            str = str.substring(str.indexOf(",") + 1);
        }

        for(Integer i : lstAttributes){
            if(i >= this.m_oResponse.getResponses().size()){
                flag = false;
                break;
            }
            if(this.m_oResponse.getResponses().get(i).isEmpty()){
                flag = false;
                break;
            }
        }
        return flag.toString();
    }

    @Override
    public String visitExecRegex(ValidateFormParser.ExecRegexContext ctx) {
        Integer intAttribute = Integer.parseInt(ctx.agr.getText());
        String strRegex = ctx.re.getText().substring(1, ctx.re.getText().length() - 1);

        if(intAttribute >= this.m_oResponse.getResponses().size()){
            return Boolean.FALSE.toString();
        }
        if(!this.m_oResponse.getResponses().get(intAttribute).matches(strRegex)){
            return Boolean.FALSE.toString();
        }
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecAssert(ValidateFormParser.ExecAssertContext ctx) {
        return visit(ctx.cond);
    }

    @Override
    public String visitExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx) {
        Integer intAttribute = Integer.parseInt(ctx.attribute.getText());
        if(intAttribute >= this.m_oResponse.getResponses().size() ){
            return Boolean.FALSE.toString();
        }
        return this.m_oResponse.getResponses().get(intAttribute);
    }

    @Override
    public String visitExecMultipleNumbers(ValidateFormParser.ExecMultipleNumbersContext ctx) {
        return ctx.number.getText() + "," + ctx.multipleNumbers.getText();
    }

    @Override
    public String visitExecNum(ValidateFormParser.ExecNumContext ctx) {
        return ctx.number.getText();
    }

    @Override
    public String visitExecVar(ValidateFormParser.ExecVarContext ctx) {
        return ctx.label.getText();
    }

    @Override
    public String visitOnlyIf(ValidateFormParser.OnlyIfContext ctx) {
        if(Boolean.parseBoolean(visit(ctx.if_cond))){
            return visit(ctx.stmt_if);
        }
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitIfElse(ValidateFormParser.IfElseContext ctx) {
        if(Boolean.parseBoolean(visit(ctx.if_cond))){
            return visit(ctx.stmt_if);
        } else{
            return visit(ctx.stmt_else);
        }
    }

    @Override
    public String visitMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx) {
        Boolean blnRight = Boolean.valueOf(visit(ctx.right));
        Boolean blnLeft = Boolean.valueOf(visit(ctx.left));

        switch (ctx.conjSign.getText()) {
            case "&&" : return String.valueOf(Boolean.logicalAnd(blnLeft, blnRight));
            case "||" : return String.valueOf(Boolean.logicalOr(blnLeft, blnRight));
        }

        return Boolean.FALSE.toString();
    }

    @Override
    public String visitSingleConditions(ValidateFormParser.SingleConditionsContext ctx) {
        return visit(ctx.cond);
    }

    @Override
    public String visitBoolMandatory(ValidateFormParser.BoolMandatoryContext ctx) {
        return visit(ctx.bl);
    }

    @Override
    public String visitBoolRegex(ValidateFormParser.BoolRegexContext ctx) {
        return visit(ctx.bl);
    }

    @Override
    public String visitBoolDateComp(ValidateFormParser.BoolDateCompContext ctx) {
        return visit(ctx.bl);
    }

    @Override
    public String visitBoolConditions(ValidateFormParser.BoolConditionsContext ctx) {
        return visit(ctx.bl);
    }

    @Override
    public String visitCond(ValidateFormParser.CondContext ctx) {

        Integer intLeft = Integer.parseInt(visit(ctx.left));
        Integer intRight = Integer.parseInt(visit(ctx.right));

        switch (ctx.compSign.getText()) {
            case "==" : return String.valueOf(intLeft == intRight);
            case "!=" : return String.valueOf(intLeft != intRight);
            case ">" : return String.valueOf(intLeft > intRight);
            case "<" : return String.valueOf(intLeft < intRight);
            case ">=" : return String.valueOf(intLeft >= intRight);
            case "<=" : return String.valueOf(intLeft <= intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecAssign(ValidateFormParser.ExecAssignContext ctx) {
        String strLabel = ctx.var.getText().substring(1);

        this.m_oMapVariables.put(strLabel, visit(ctx.res));

        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx) {
        Integer intLeft = Integer.parseInt(visit(ctx.left));
        Integer intRight = Integer.parseInt(visit(ctx.right));

        switch (ctx.sign.getText()) {
            case "*" : return String.valueOf(intLeft * intRight);
            case "/" : return String.valueOf(intLeft / intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx) {
        Integer intLeft = Integer.parseInt(visit(ctx.left));
        Integer intRight = Integer.parseInt(visit(ctx.right));

        switch (ctx.sign.getText()) {
            case "+" : return String.valueOf(intLeft + intRight);
            case "-" : return String.valueOf(intLeft - intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecOpAtom(ValidateFormParser.ExecOpAtomContext ctx) {
        return visit(ctx.atom);
    }

    @Override
    public String visitExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx) {
        return visit(ctx.result);
    }

    @Override
    public String visitObjectVariable(ValidateFormParser.ObjectVariableContext ctx) {
        return this.m_oMapVariables.get(ctx.var.getText().substring(1));
    }

    @Override
    public String visitObjectNumber(ValidateFormParser.ObjectNumberContext ctx) {
        return ctx.objNumber.getText();
    }

    @Override
    public String visitObjectAttribute(ValidateFormParser.ObjectAttributeContext ctx) {
        return visit(ctx.att);
    }

    @Override
    public String visitExecString(ValidateFormParser.ExecStringContext ctx) {
        return ctx.str.getText();
    }

    @Override
    public String visitExecDateCompare(ValidateFormParser.ExecDateCompareContext ctx) {
        String strLeft = visit(ctx.date1);
        String strRight = visit(ctx.date2);

        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateRight = LocalDate.parse(strRight, formatter);
            LocalDate dateLeft = LocalDate.parse(strLeft, formatter);

            switch (ctx.conjSign.getText()) {
                case "==" : return String.valueOf(dateLeft.isEqual(dateRight));

                case "!=" : return String.valueOf(!dateLeft.isEqual(dateRight));

                case ">" : return String.valueOf(dateLeft.isAfter(dateRight));

                case "<" : return String.valueOf(dateLeft.isBefore(dateRight));

                case ">=" : return String.valueOf(dateLeft.isAfter(dateRight) || dateLeft.isEqual(dateRight));

                case "<=" : return String.valueOf(dateLeft.isBefore(dateRight) || dateLeft.isEqual(dateRight));

            }
        } catch (Exception e){
        }
        return Boolean.FALSE.toString();
    }

}