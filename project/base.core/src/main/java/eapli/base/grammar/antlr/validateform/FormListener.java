package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

import java.util.*;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class FormListener extends ValidateFormBaseListener {

    private final Stack<String> stack = new Stack<>();
    private Map<String,String> m_oMapVariables;
    private Response m_oResponse;

    public FormListener(Response oResponse) {
        this.m_oResponse = oResponse;
        this.m_oMapVariables = new HashMap<>();
    }

    public Boolean getResult() {
        return Boolean.valueOf(stack.peek());
    }

    @Override
    public void exitExecStatements(ValidateFormParser.ExecStatementsContext ctx) {
        if(this.stack.size() > 1){
            Boolean blnRight = Boolean.valueOf(this.stack.pop());
            Boolean blnLeft = Boolean.valueOf(this.stack.pop());

            this.stack.push(String.valueOf(Boolean.logicalAnd(blnLeft, blnRight)));
        }
    }

    @Override
    public void exitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx) {
        String str = this.stack.pop();
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
                this.stack.push(flag.toString());
                return;
            }

            if(this.m_oResponse.getResponses().get(i).isEmpty()){
                flag = false;
                break;
            }
        }

        this.stack.push(flag.toString());
    }

    @Override
    public void exitExecMultipleNumbers(ValidateFormParser.ExecMultipleNumbersContext ctx) {
        this.stack.push(ctx.number.getText() + "," + this.stack.pop());

    }

    @Override
    public void enterExecNum(ValidateFormParser.ExecNumContext ctx) {
        this.stack.push(ctx.number.getText());
    }

    @Override
    public void exitExecRegex(ValidateFormParser.ExecRegexContext ctx) {
        Integer intAttribute = Integer.parseInt(this.stack.pop());

        String strRegex = this.stack.pop();

        Boolean flag = true;

        if(!this.m_oResponse.getResponses().get(intAttribute - 1).matches(strRegex)){
            flag = false;
        }

        this.stack.push(flag.toString());
    }

    @Override
    public void exitMultipleConditions(ValidateFormParser.MultipleConditionsContext ctx) {
        Boolean blnRight = Boolean.valueOf(this.stack.pop());
        Boolean blnLeft = Boolean.valueOf(this.stack.pop());

        switch (ctx.conjSign.getText()) {
            case "&&" : this.stack.push(String.valueOf(Boolean.logicalAnd(blnLeft, blnRight)));
                return;
            case "||" : this.stack.push(String.valueOf(Boolean.logicalOr(blnLeft, blnRight)));
                return;
        }
    }

    @Override
    public void exitCond(ValidateFormParser.CondContext ctx) {
        Integer intRight = Integer.parseInt(this.stack.pop());
        Integer intLeft = Integer.parseInt(this.stack.pop());

        switch (ctx.compSign.getText()) {
            case "==" : this.stack.push(String.valueOf(intLeft == intRight));
                return;
            case "!=" : this.stack.push(String.valueOf(intLeft != intRight));
                return;
            case ">" : this.stack.push(String.valueOf(intLeft > intRight));
                return;
            case "<" : this.stack.push(String.valueOf(intLeft < intRight));
                return;
            case ">=" : this.stack.push(String.valueOf(intLeft >= intRight));
                return;
            case "<=" : this.stack.push(String.valueOf(intLeft <= intRight));
                return;
        }
    }

    @Override
    public void enterObjectNumber(ValidateFormParser.ObjectNumberContext ctx) {
        this.stack.push(ctx.number.getText());
    }

    @Override
    public void enterObjectVariable(ValidateFormParser.ObjectVariableContext ctx) {
        this.stack.push(this.m_oMapVariables.get(ctx.var.getText().substring(1)));
    }

    @Override
    public void enterExecVar(ValidateFormParser.ExecVarContext ctx) {
        String strLabel = ctx.label.getText();
        if(!this.m_oMapVariables.containsKey(strLabel)){
            this.m_oMapVariables.put(strLabel, "");
        }
    }

    @Override
    public void exitExecAssign(ValidateFormParser.ExecAssignContext ctx) {
        String strLabel = ctx.var.getText().substring(1);
        if(this.m_oMapVariables.containsKey(strLabel)){
            this.m_oMapVariables.put(strLabel, this.stack.pop());
        }
    }

}
