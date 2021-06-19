package eapli.base.grammar.antlr.autotask;

import eapli.base.formmanagement.domain.Form;
import eapli.base.grammar.antlr.validateform.ValidateFormParser;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.util.EmailSender;
import eapli.base.util.XmlFileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class TaskListener extends AutoTaskBaseListener{

    private final Stack<String> stack = new Stack<>();
    private final Map<String, String> m_oMapVariables;
    private final Ticket m_oTicket;
    private boolean canExecuteIf = true;

    public TaskListener(Ticket m_oTicket) {
        this.m_oTicket = m_oTicket;
        this.m_oMapVariables = new HashMap<>();
    }

    public Boolean getResult() {
        this.mergeResults();
        return Boolean.valueOf(stack.peek());
    }

    public void mergeResults(){
        while(this.stack.size() > 1){
            boolean blnRight = true;
            boolean blnLeft = true;
            String strLeft = this.stack.pop();
            String strRight = this.stack.pop();
            if(strLeft.equalsIgnoreCase("false") || strLeft.equalsIgnoreCase("true")){
                blnRight = Boolean.parseBoolean(strLeft);
            }
            if(strRight.equalsIgnoreCase("false") || strRight.equalsIgnoreCase("true")){
                blnLeft = Boolean.parseBoolean(strRight);
            }

            this.stack.push(String.valueOf(Boolean.logicalAnd(blnLeft, blnRight)));
        }
    }


    @Override
    public void exitExecAssign(AutoTaskParser.ExecAssignContext ctx) {
        if(!this.canExecuteIf) {
            this.stack.pop();
            return;
        }
        String var = ctx.var.getText().substring(1);
        String res = this.stack.pop();
        if(this.m_oMapVariables.containsKey(var)){
            this.m_oMapVariables.put(var, res);
        }
        System.out.println("ASSIGNED " + var + " " + res);
        this.stack.push(Boolean.TRUE.toString());
    }

    @Override
    public void enterObjectNumber(AutoTaskParser.ObjectNumberContext ctx) {
        String objNumber = ctx.objNumber.getText();
        this.stack.push(objNumber);
    }

    @Override
    public void enterExecVar(AutoTaskParser.ExecVarContext ctx) {
        String strLabel = ctx.label.getText();
        if(!this.m_oMapVariables.containsKey(strLabel)){
            this.m_oMapVariables.put(strLabel, "");
        }
    }

    @Override
    public void enterObjectVariable(AutoTaskParser.ObjectVariableContext ctx) {
        String var = this.m_oMapVariables.get(ctx.var.getText().substring(1));
        this.stack.push(var);
    }

    @Override
    public void enterObjectText(AutoTaskParser.ObjectTextContext ctx) {
        String objText = ctx.objText.getText();
        this.stack.push(objText);
    }

    @Override
    public void enterExecGetValue(AutoTaskParser.ExecGetValueContext ctx) {
        if(!this.canExecuteIf) {
            return;
        }
        int form = Integer.parseInt(ctx.form.getText());
        int attribute = Integer.parseInt(ctx.attribute.getText());
        String result = this.m_oTicket.responses().get(form-1).getResponses().get(attribute-1);
        this.stack.push(result);
    }

    @Override
    public void exitObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx) {
        super.exitObjectFileSearch(ctx);
    }

    
    @Override
    public void exitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx) {
        if(!this.canExecuteIf) {
            this.stack.pop();
            return;
        }
        try {
            File myObj = File.createTempFile("auto_task_", ".xml");
            String s = m_oTicket.files().get(Integer.parseInt(ctx.fp.getText()) - 1).toString();
            FileWriter myWriter = new FileWriter(myObj.getAbsolutePath());
            myWriter.write(s);
            myWriter.close();
            String path = myObj.getAbsolutePath();
            String expression = this.stack.pop();
            String result;
            result = XmlFileReader.searchFor(path, expression);
            myObj.delete();
            this.stack.push(result);
        } catch (Exception e) {
            this.stack.push(Boolean.FALSE.toString());
        }
    }
    
    @Override
    public void exitExecSearchIn(AutoTaskParser.ExecSearchInContext ctx) {
        String searchIn = ctx.search_in.getText();
        String search = this.stack.pop();
        this.stack.push("/" + searchIn + search);
    }

    @Override
    public void exitExecSearchInFile(AutoTaskParser.ExecSearchInFileContext ctx) {
        StringBuilder sb = new StringBuilder();
        String searchBy = ctx.search_by.getText();
        String searchValue = stack.pop();
        String searchFor = ctx.search_for.getText();
        sb.append("[").append(searchBy).append("='").append(searchValue).append("']")
                .append("/").append(searchFor).append("/text()");
        this.stack.push(sb.toString());
    }

    @Override
    public void enterSearchKeyValue(AutoTaskParser.SearchKeyValueContext ctx) {
        String key = ctx.key.toString();
        this.stack.push(key);
    }

    @Override
    public void enterSearchKeyVar(AutoTaskParser.SearchKeyVarContext ctx) {
        String var = this.m_oMapVariables.get(ctx.var.getText().substring(1));
        this.stack.push(var);
    }

    @Override
    public void exitExecOpPlusMinus(AutoTaskParser.ExecOpPlusMinusContext ctx) {
        String strRight = this.stack.pop();
        String strLeft = this.stack.pop();
        if(areNotNumbers(strLeft, strRight)) {
            this.stack.push(strLeft + strRight);
            return;
        }
        double left = Double.parseDouble(strLeft);
        double right = Double.parseDouble(strRight);
        String sign = ctx.sign.getText();
        switch(sign) {
            case "+": this.stack.push(String.valueOf(round(left + right,2))); return;
            case "-": this.stack.push(String.valueOf(round(left - right,2))); return;
        }
        this.stack.push(Boolean.FALSE.toString());
    }

    @Override
    public void exitExecOpTimesDivision(AutoTaskParser.ExecOpTimesDivisionContext ctx) {
        String strRight = this.stack.pop();
        String strLeft = this.stack.pop();
        if(areNotNumbers(strLeft, strRight)) {
            this.stack.push(Boolean.FALSE.toString());
            return;
        }
        double left = Double.parseDouble(strLeft);
        double right = Double.parseDouble(strRight);
        String sign = ctx.sign.getText();
        switch(sign) {
            case "*":
                this.stack.push(String.valueOf(round(left * right,2)));
                return;
            case "/":
                this.stack.push(String.valueOf(round(left / right,2)));
                return;
        }
        this.stack.push(Boolean.FALSE.toString());
    }

    private boolean areNotNumbers(String... strs) {
        for(String str : strs) {
            if(!str.matches("[0-9]+(.[0-9]+)?"))
                return true;
        }
        return false;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public void exitOnlyIf(AutoTaskParser.OnlyIfContext ctx) {
        boolean cond = false;
        boolean statements = true;
        if(stack.size() == 1) {
            cond = Boolean.parseBoolean(this.stack.pop());
            this.stack.push(String.valueOf(statements));
        } else {
            statements = Boolean.parseBoolean(this.stack.pop());
            cond = Boolean.parseBoolean(this.stack.pop());
        }
        this.stack.push(String.valueOf(statements));
    }

    @Override
    public void exitIfElse(AutoTaskParser.IfElseContext ctx) {
        boolean cond = false;
        boolean statements = true;
        boolean statementselse = true;
        if(stack.size() == 1) {
            cond = Boolean.parseBoolean(this.stack.pop());
            this.stack.push(String.valueOf(statements));
        } else {
            statementselse = Boolean.parseBoolean(this.stack.pop());
            statements = Boolean.parseBoolean(this.stack.pop());
            cond = Boolean.parseBoolean(this.stack.pop());
        }
        this.stack.push(String.valueOf(statements && statementselse));
    }



    @Override
    public void exitMultipleConditions(AutoTaskParser.MultipleConditionsContext ctx) {
        boolean blnRight = Boolean.parseBoolean(this.stack.pop());
        boolean blnLeft = Boolean.parseBoolean(this.stack.pop());
        String op = ctx.conjSign.getText();
        switch (op) {
            case "||" : this.stack.push(String.valueOf(Boolean.logicalOr(blnLeft, blnRight))); return;
            case "&&" : this.stack.push(String.valueOf(Boolean.logicalAnd(blnLeft, blnRight))); return;
        }
        this.stack.push(Boolean.FALSE.toString());
    }

    @Override
    public void exitCond(AutoTaskParser.CondContext ctx) {
        String strRight = this.stack.pop();
        String strLeft = this.stack.pop();
        String sign = ctx.compSign.getText();
        boolean result = false;
        if(areNotNumbers(strLeft, strRight)) {
            if(sign.equals("==")) {
                result= strLeft.equals(strRight);
                if(!result)
                    this.canExecuteIf = false;
                this.stack.push(String.valueOf(result));
                return;
            }
            this.stack.push(Boolean.FALSE.toString());
            return;
        }
        double intLeft = Double.parseDouble(strLeft);
        double intRight = Double.parseDouble(strRight);
        switch (sign) {
            case "==" : result = intLeft == intRight; break;
            case "!=" : result = intLeft != intRight; break;
            case ">" : result = intLeft > intRight; break;
            case "<" : result = intLeft < intRight; break;
            case "<=" : result = intLeft <= intRight; break;
            case ">=" : result = intLeft >= intRight; break;
        }
        if(!result)
            this.canExecuteIf = false;
        this.stack.push(String.valueOf(result));
    }

    @Override
    public void enterExecEndIf(AutoTaskParser.ExecEndIfContext ctx) {
        this.canExecuteIf = true;
    }

    @Override
    public void enterExecStartElse(AutoTaskParser.ExecStartElseContext ctx) {
        this.canExecuteIf = !this.canExecuteIf;
    }

    @Override
    public void exitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx) {
        String em = ctx.em.getText();
        String body = this.stack.pop();
        String sub = this.stack.pop();
        EmailSender.send("no-reply@helpdesk.com", em, sub, body, em);
        this.stack.push(Boolean.TRUE.toString());
    }

    @Override
    public void exitExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx) {
        String em = m_oTicket.collaborator().user().email().toString();
        String body = this.stack.pop();
        String sub = this.stack.pop();
        EmailSender.send("no-reply@helpdesk.com", em, sub, body, em);
        this.stack.push(Boolean.TRUE.toString());
    }
}
