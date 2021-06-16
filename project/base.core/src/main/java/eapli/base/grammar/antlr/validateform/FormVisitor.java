package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

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

    private Integer intResult = 0;

    public FormVisitor(Response r){
        this.m_oResponse = r;
        this.m_oMapVariables = new HashMap<>();
    }

    @Override
    public String visitExecStart(ValidateFormParser.ExecStartContext ctx) {
        return visit(ctx.stmts);
    }

    @Override
    public String visitExecStatements(ValidateFormParser.ExecStatementsContext ctx) {
        return visit(ctx.stmt);
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
        return Boolean.TRUE.toString();
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
        if(!Boolean.valueOf(ctx.if_cond.getText())){
            return Boolean.FALSE.toString();
        } else {
            switch (ctx.stmt_if.getText()){
                case "#mandatory;" : return visit(ctx);
                case "#regex;" : return visit(ctx);
                case "#assert_func;" : return visit(ctx);
                case "#get_attribute;" : return visit(ctx);
                case "#if_func;" : return visit(ctx);
                case "#assign;" : return visit(ctx);
            }
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitIfElse(ValidateFormParser.IfElseContext ctx) {
        if(!Boolean.valueOf(ctx.if_cond.getText())){
            return Boolean.FALSE.toString();
        } else if (Boolean.valueOf(ctx.if_cond.getText())){
            switch (ctx.stmt_if.getText()){
                case "#mandatory;" : return visit(ctx.stmt_if);
                case "#regex;" : return visit(ctx.stmt_if);
                case "#assert_func;" : return visit(ctx.stmt_if);
                case "#get_attribute;" : return visit(ctx.stmt_if);
                case "#if_func;" : return visit(ctx.stmt_if);
                case "#assign;" : return visit(ctx.stmt_if);
            }
        } else if (!Boolean.valueOf(ctx.stmt_if.getText())){
            return Boolean.FALSE.toString();
        } else {
            switch (ctx.stmt_if.getText()){
                case "#mandatory;" : return visit(ctx.stmt_else);
                case "#regex;" : return visit(ctx.stmt_else);
                case "#assert_func;" : return visit(ctx.stmt_else);
                case "#get_attribute;" : return visit(ctx.stmt_else);
                case "#if_func;" : return visit(ctx.stmt_else);
                case "#assign;" : return visit(ctx.stmt_else);
            }
        }
        return Boolean.FALSE.toString();
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
    public String visitCond(ValidateFormParser.CondContext ctx) {
        Integer intLeft, intRight;
        if(this.m_oMapVariables.containsKey(ctx.left.getText().substring(1))){
            intLeft = Integer.parseInt(this.m_oMapVariables.get(ctx.left.getText().substring(1)));
        } else{
            intLeft = Integer.parseInt(ctx.left.getText());
        }

        if(this.m_oMapVariables.containsKey(ctx.right.getText().substring(1))){
            intRight = Integer.parseInt(this.m_oMapVariables.get(ctx.right.getText().substring(1)));
        } else{
            intRight = Integer.parseInt(ctx.right.getText());
        }

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
        this.m_oMapVariables.put(strLabel, ctx.res.getText());
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx) {
        Integer intLeft = Integer.parseInt(ctx.left.getText());
        Integer intRight = Integer.parseInt(ctx.right.getText());

        switch (ctx.sign.getText()) {
            case "*" : return String.valueOf(intLeft * intRight);
            case "/" : return String.valueOf(intLeft / intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx) {
        Integer intLeft = Integer.parseInt(ctx.left.getText());
        Integer intRight = Integer.parseInt(ctx.right.getText());

        switch (ctx.sign.getText()) {
            case "+" : return String.valueOf(intLeft + intRight);
            case "-" : return String.valueOf(intLeft - intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecOpAtom(ValidateFormParser.ExecOpAtomContext ctx) {
        return ctx.atom.getText();
    }

    @Override
    public String visitExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx) {
        return ctx.result.getText();
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
        return ctx.att.getText();
    }

    @Override
    public String visitExecString(ValidateFormParser.ExecStringContext ctx) {
        return ctx.str.getText();
    }

}