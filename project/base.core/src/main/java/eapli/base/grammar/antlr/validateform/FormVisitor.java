package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class FormVisitor extends ValidateFormBaseVisitor<Boolean> {

    private Response m_oResponse;
    private Map<String,String> m_oMapVariables;

    private Integer intResult = 0;

    public FormVisitor(Response r){
        this.m_oResponse = r;
        this.m_oMapVariables = new HashMap<>();
    }

    @Override
    public Boolean visitStart(ValidateFormParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    /*@Override
    public Boolean visitExecStatements(ValidateFormParser.ExecStatementsContext ctx) {
        return true;
    }*/

    @Override
    public Boolean visitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx) {
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
        return flag;
    }

    @Override
    public Boolean visitExecRegex(ValidateFormParser.ExecRegexContext ctx) {
        Integer intAttribute = Integer.parseInt(ctx.agr.getText());
        String strRegex = ctx.re.getText().substring(1, ctx.re.getText().length() - 1);

        if(intAttribute >= this.m_oResponse.getResponses().size()){
            return false;
        }
        if(!this.m_oResponse.getResponses().get(intAttribute).matches(strRegex)){
            return false;
        }
        return true;
    }

    @Override
    public Boolean visitExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx) {
        Integer intAttribute = Integer.parseInt(ctx.attribute.getText());
        if(intAttribute >= this.m_oResponse.getResponses().size() ){
            return false;
        }
        return true;
    }

    @Override
    public Boolean visitOnlyIf(ValidateFormParser.OnlyIfContext ctx) {
        if(!Boolean.valueOf(ctx.if_cond.getText())){
            return false;
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
        return false;
    }

    @Override
    public Boolean visitIfElse(ValidateFormParser.IfElseContext ctx) {
        if(!Boolean.valueOf(ctx.if_cond.getText())){
            return false;
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
            return false;
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
        return false;
    }

    @Override
    public Boolean visitMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx) {
        Boolean blnRight = visit(ctx.right);
        Boolean blnLeft = visit(ctx.left);

        switch (ctx.conjSign.getText()) {
            case "&&" : return Boolean.logicalAnd(blnLeft, blnRight);
            case "||" : return Boolean.logicalOr(blnLeft, blnRight);
        }

        return false;
    }

    @Override
    public Boolean visitSingleConditions(ValidateFormParser.SingleConditionsContext ctx) {
        return visit(ctx.cond);
    }

    @Override
    public Boolean visitCond(ValidateFormParser.CondContext ctx) {
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
            case "==" : return Boolean.valueOf(String.valueOf(intLeft == intRight));
            case "!=" : return Boolean.valueOf(String.valueOf(intLeft != intRight));
            case ">" : return Boolean.valueOf(String.valueOf(intLeft > intRight));
            case "<" : return Boolean.valueOf(String.valueOf(intLeft < intRight));
            case ">=" : return Boolean.valueOf(String.valueOf(intLeft >= intRight));
            case "<=" : return Boolean.valueOf(String.valueOf(intLeft <= intRight));
        }
        return false;
    }

    @Override
    public Boolean visitExecAssign(ValidateFormParser.ExecAssignContext ctx) {
        String strLabel = ctx.var.getText().substring(1);
        this.m_oMapVariables.put(strLabel, ctx.res.getText());
        return true;
    }

    @Override
    public Boolean visitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx) {
        Integer intLeft = Integer.parseInt(ctx.left.getText());
        Integer intRight = Integer.parseInt(ctx.right.getText());
        //Integer intResult = 0;

        switch (ctx.sign.getText()) {
            case "*" : intResult = intLeft * intRight;
                return true;
            case "/" : intResult = intLeft / intRight;
                return true;
        }
        return false;
    }

    @Override
    public Boolean visitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx) {
        Integer intLeft = Integer.parseInt(ctx.left.getText());
        Integer intRight = Integer.parseInt(ctx.right.getText());

        switch (ctx.sign.getText()) {
            case "+" : return Boolean.valueOf(String.valueOf(intLeft + intRight));
            case "-" : return Boolean.valueOf(String.valueOf(intLeft - intRight));
        }
        return false;
    }

    @Override
    public Boolean visitExecOpAtom(ValidateFormParser.ExecOpAtomContext ctx) {
        return Boolean.valueOf(String.valueOf(ctx.atom.getText()));
    }

    @Override
    public Boolean visitExecOpParenthesis(ValidateFormParser.ExecOpParenthesisContext ctx) {
        return Boolean.valueOf(String.valueOf(ctx.result.getText()));
    }

    @Override
    public Boolean visitObjectVariable(ValidateFormParser.ObjectVariableContext ctx) {
        return Boolean.valueOf(this.m_oMapVariables.get(ctx.var.getText().substring(1)));
    }

    @Override
    public Boolean visitObjectNumber(ValidateFormParser.ObjectNumberContext ctx) {
        return Boolean.valueOf(String.valueOf(ctx.objNumber.getText()));
    }

    /*@Override

    public Boolean visitObjectAttribute(ValidateFormParser.ObjectAttributeContext ctx) {
        return Boolean.valueOf(String.valueOf(ctx.str.getText()));
    }*/

    @Override
    public Boolean visitExecString(ValidateFormParser.ExecStringContext ctx) {
        return Boolean.valueOf(String.valueOf(ctx.str.getText()));
    }

}