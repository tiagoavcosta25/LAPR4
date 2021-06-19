package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        if(this.stack.size() < 1){
            return false;
        }
        this.mergeResults();
        return Boolean.valueOf(stack.peek());
    }

    public void mergeResults(){
        while(this.stack.size() > 1){
            Boolean blnRight = true;
            Boolean blnLeft = true;
            String strLeft = this.stack.pop();
            String strRight = this.stack.pop();
            if(strLeft.equalsIgnoreCase("false") || strLeft.equalsIgnoreCase("true")){
                blnRight = Boolean.valueOf(strLeft);
            }
            if(strRight.equalsIgnoreCase("false") || strRight.equalsIgnoreCase("true")){
                blnLeft = Boolean.valueOf(strRight);
            }

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
        Integer intAttribute = Integer.parseInt(ctx.agr.getText());

        String strRegex = ctx.re.getText().substring(1, ctx.re.getText().length() - 1);

        Boolean flag = true;

        if(intAttribute >= this.m_oResponse.getResponses().size()){
            flag = false;
            this.stack.push(flag.toString());
            return;
        }

        if(!this.m_oResponse.getResponses().get(intAttribute).matches(strRegex)){
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
        this.stack.push(ctx.objNumber.getText());
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

    @Override
    public void exitExecGetAttribute(ValidateFormParser.ExecGetAttributeContext ctx) {
        Integer intAttribute = Integer.parseInt(ctx.attribute.getText());

        if(intAttribute >= this.m_oResponse.getResponses().size()) {
            this.stack.push(Boolean.FALSE.toString());
            return;
        }

        this.stack.push(this.m_oResponse.getResponses().get(intAttribute));
    }

    @Override
    public void exitExecOpTimesDivision(ValidateFormParser.ExecOpTimesDivisionContext ctx) {
        Integer intRight = Integer.parseInt(this.stack.pop());
        Integer intLeft = Integer.parseInt(this.stack.pop());

        switch (ctx.sign.getText()) {
            case "*" : this.stack.push(String.valueOf(intLeft * intRight));
                return;
            case "/" : this.stack.push(String.valueOf(intLeft / intRight));
                return;
        }
    }

    @Override
    public void exitExecOpPlusMinus(ValidateFormParser.ExecOpPlusMinusContext ctx) {
        Integer intRight = Integer.parseInt(this.stack.pop());
        Integer intLeft = Integer.parseInt(this.stack.pop());

        switch (ctx.sign.getText()) {
            case "+" : this.stack.push(String.valueOf(intLeft + intRight));
                return;
            case "-" : this.stack.push(String.valueOf(intLeft - intRight));
                return;
        }
    }

    @Override
    public void exitOnlyIf(ValidateFormParser.OnlyIfContext ctx) {
        Boolean blnStatements = Boolean.valueOf(this.stack.pop());
        if(Boolean.valueOf(this.stack.pop())){
            this.stack.push(blnStatements.toString());
        }
    }

    @Override
    public void exitIfElse(ValidateFormParser.IfElseContext ctx) {
        Boolean blnElseStatements = Boolean.valueOf(this.stack.pop());
        Boolean blnIfStatements = Boolean.valueOf(this.stack.pop());
        if(Boolean.valueOf(this.stack.pop())){
            this.stack.push(blnIfStatements.toString());
        } else{
            this.stack.push(blnElseStatements.toString());
        }
    }

    @Override
    public void exitExecDateCompare(ValidateFormParser.ExecDateCompareContext ctx) {
        String strRight = this.stack.pop();
        String strLeft = this.stack.pop();

        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateRight = LocalDate.parse(strRight, formatter);
            LocalDate dateLeft = LocalDate.parse(strLeft, formatter);

            switch (ctx.conjSign.getText()) {
                case "==" : this.stack.push(String.valueOf(dateLeft.isEqual(dateRight)));
                    return;
                case "!=" : this.stack.push(String.valueOf(!dateLeft.isEqual(dateRight)));
                    return;
                case ">" : this.stack.push(String.valueOf(dateLeft.isAfter(dateRight)));
                    return;
                case "<" : this.stack.push(String.valueOf(dateLeft.isBefore(dateRight)));
                    return;
                case ">=" : this.stack.push(String.valueOf(dateLeft.isAfter(dateRight) || dateLeft.isEqual(dateRight)));
                    return;
                case "<=" : this.stack.push(String.valueOf(dateLeft.isBefore(dateRight) || dateLeft.isEqual(dateRight)));
                    return;
            }
        } catch (Exception e){
            this.stack.push(Boolean.FALSE.toString());
        }
    }

}
