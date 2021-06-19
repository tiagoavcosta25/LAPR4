package eapli.base.grammar.antlr.autotask;

import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.util.EmailSender;
import eapli.base.util.XmlFileReader;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class TaskVisitor extends AutoTaskBaseVisitor<String> {

    private final Map<String, String> m_oMapVariables;
    private final Ticket m_oTicket;

    public TaskVisitor(Ticket oTicket) {
        this.m_oMapVariables = new HashMap<>();
        this.m_oTicket = oTicket;
    }


    @Override
    public String visitChildren(RuleNode node) {
        String result = "true";
        int n = node.getChildCount();
        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            String childResult = c.accept(this);
            result = String.valueOf(Boolean.logicalAnd(Boolean.parseBoolean(result), Boolean.parseBoolean(childResult)));
        }
        return result;
    }

    @Override
    public String visitExecStart(AutoTaskParser.ExecStartContext ctx) {
        return visit(ctx.stmts);
    }

    @Override
    public String visitExecStatements(AutoTaskParser.ExecStatementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitStmtSendEmail(AutoTaskParser.StmtSendEmailContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtFileSearch(AutoTaskParser.StmtFileSearchContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtIf(AutoTaskParser.StmtIfContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitStmtAssign(AutoTaskParser.StmtAssignContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitExecSendEmail(AutoTaskParser.ExecSendEmailContext ctx) {
        String email = ctx.em.getText();
        String subject = visit(ctx.sub);
        String body = visit(ctx.email_body);
        EmailSender.send("no-reply@helpdesk.com", email, subject, body, email);
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx) {
        String email = m_oTicket.collaborator().user().email().toString();
        String subject = visit(ctx.sub);
        String body = visit(ctx.email_body);
        EmailSender.send("no-reply@helpdesk.com", email, subject, body, email);
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecFileSearch(AutoTaskParser.ExecFileSearchContext ctx) {
        String result;
        try {
            File myObj = File.createTempFile("auto_task_", ".xml");
            String s = m_oTicket.files().get(Integer.parseInt(ctx.fp.getText()) - 1).toString();
            FileWriter myWriter = new FileWriter(myObj.getAbsolutePath());
            myWriter.write(s);
            myWriter.close();
            String path = myObj.getAbsolutePath();
            String expression = visit(ctx.search);
            result = XmlFileReader.searchFor(path, expression);
            myObj.delete();
        } catch (Exception e) {
            return Boolean.FALSE.toString();
        }
        return result;
    }

    @Override
    public String visitExecSearchIn(AutoTaskParser.ExecSearchInContext ctx) {
        return "/" + ctx.search_in.getText() + visit(ctx.search);
    }

    @Override
    public String visitExecSearchInFile(AutoTaskParser.ExecSearchInFileContext ctx) {
        StringBuilder sb = new StringBuilder();
        String searchBy = ctx.search_by.getText();
        String searchValue = visit(ctx.search_value);
        String searchFor = ctx.search_for.getText();
        sb.append("[").append(searchBy).append("='").append(searchValue).append("']")
                .append("/").append(searchFor).append("/text()");
        return sb.toString();
    }

    @Override
    public String visitOnlyIf(AutoTaskParser.OnlyIfContext ctx) {
        if(Boolean.parseBoolean(visit(ctx.if_cond))){
            return visit(ctx.stmt_if);
        }
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitIfElse(AutoTaskParser.IfElseContext ctx) {
        if(Boolean.parseBoolean(visit(ctx.if_cond))){
            return visit(ctx.stmt_if);
        } else{
            return visit(ctx.stmt_else);
        }
    }

    @Override
    public String visitMultipleConditions(AutoTaskParser.MultipleConditionsContext ctx) {
        boolean blnRight = Boolean.parseBoolean(visit(ctx.right));
        boolean blnLeft = Boolean.parseBoolean(visit(ctx.left));

        switch (ctx.conjSign.getText()) {
            case "||" : return String.valueOf(Boolean.logicalOr(blnLeft, blnRight));
            case "&&" : return String.valueOf(Boolean.logicalAnd(blnLeft, blnRight));
        }

        return Boolean.FALSE.toString();
    }

    @Override
    public String visitSingleConditions(AutoTaskParser.SingleConditionsContext ctx) {
        return visit(ctx.cond);
    }

    @Override
    public String visitCond(AutoTaskParser.CondContext ctx) {
        String strLeft = visit(ctx.left);
        String strRight = visit(ctx.right);
        String sign = ctx.compSign.getText();
        if(areNotNumbers(strLeft, strRight)) {
            if(sign.equals("=="))
                return String.valueOf(strLeft.equals(strRight));
            return Boolean.FALSE.toString();
        }
        double intLeft = Double.parseDouble(strLeft);
        double intRight = Double.parseDouble(strRight);
        switch (sign) {
            case "==" : return String.valueOf(intLeft == intRight);
            case "!=" : return String.valueOf(intLeft != intRight);
            case ">" : return String.valueOf(intLeft > intRight);
            case "<" : return String.valueOf(intLeft < intRight);
            case "<=" : return String.valueOf(intLeft <= intRight);
            case ">=" : return String.valueOf(intLeft >= intRight);
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecAssign(AutoTaskParser.ExecAssignContext ctx) {
        String strLabel = ctx.var.getText().substring(1);
        this.m_oMapVariables.put(strLabel, visit(ctx.res));
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecVar(AutoTaskParser.ExecVarContext ctx) {
        return ctx.label.getText();
    }

    @Override
    public String visitExecOpTimesDivision(AutoTaskParser.ExecOpTimesDivisionContext ctx) {
        String strLeft = visit(ctx.left);
        String strRight = visit(ctx.right);
        if(areNotNumbers(strLeft, strRight)) return Boolean.FALSE.toString();
        double left = Double.parseDouble(strLeft);
        double right = Double.parseDouble(strRight);
        switch(ctx.sign.getText()) {
            case "*": return String.valueOf(round(left * right, 2));
            case "/": return String.valueOf(round(left / right, 2));
        }
        return Boolean.FALSE.toString();
    }

    @Override
    public String visitExecOpPlusMinus(AutoTaskParser.ExecOpPlusMinusContext ctx) {
        String strLeft = visit(ctx.left);
        String strRight = visit(ctx.right);
        if(areNotNumbers(strLeft, strRight)) {
            return strLeft + strRight;
        }
        double left = Double.parseDouble(strLeft);
        double right = Double.parseDouble(strRight);
        switch(ctx.sign.getText()) {
            case "+": return String.valueOf(round(left + right,2));
            case "-": return String.valueOf(round(left - right,2));
        }
        return Boolean.FALSE.toString();
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private boolean areNotNumbers(String... strs) {
        for(String str : strs) {
            if(!str.matches("[0-9]+(.[0-9]+)?"))
                return true;
        }
        return false;
    }

    @Override
    public String visitExecOpParenthesis(AutoTaskParser.ExecOpParenthesisContext ctx) {
        return visit(ctx.result);
    }

    @Override
    public String visitStmtGetValue(AutoTaskParser.StmtGetValueContext ctx) {
        return visit(ctx.stmt);
    }

    @Override
    public String visitExecGetValue(AutoTaskParser.ExecGetValueContext ctx) {
        int form = Integer.parseInt(ctx.form.getText());
        int attribute = Integer.parseInt(ctx.attribute.getText());
        return this.m_oTicket.responses().get(form - 1).getResponses().get(attribute - 1);
    }

    @Override
    public String visitObjectGetValue(AutoTaskParser.ObjectGetValueContext ctx) {
        return visit(ctx.res);
    }

    @Override
    public String visitExecOpAtom(AutoTaskParser.ExecOpAtomContext ctx) {
        return visit(ctx.atom);
    }

    @Override
    public String visitObjectVariable(AutoTaskParser.ObjectVariableContext ctx) {
        return this.m_oMapVariables.get(ctx.var.getText().substring(1));
    }

    @Override
    public String visitObjectNumber(AutoTaskParser.ObjectNumberContext ctx) {
        return ctx.objNumber.getText();
    }

    @Override
    public String visitObjectText(AutoTaskParser.ObjectTextContext ctx) {
        return ctx.objText.getText();
    }

    @Override
    public String visitObjectFileSearch(AutoTaskParser.ObjectFileSearchContext ctx) {
        return visit(ctx.res);
    }

    @Override
    public String visitExecSubject(AutoTaskParser.ExecSubjectContext ctx) {
        return visit(ctx.text);
    }

    @Override
    public String visitExecBody(AutoTaskParser.ExecBodyContext ctx) {
        return visit(ctx.text);
    }

    @Override
    public String visitBodySpacesObject(AutoTaskParser.BodySpacesObjectContext ctx) {
        return visit(ctx.obj) + ctx.spaces.getText() + visit(ctx.rest);
    }

    @Override
    public String visitBodyObject(AutoTaskParser.BodyObjectContext ctx) {
        return visit(ctx.obj);
    }

    @Override
    public String visitSearchKeyValue(AutoTaskParser.SearchKeyValueContext ctx) {
        return ctx.key.getText();
    }

    @Override
    public String visitSearchKeyVar(AutoTaskParser.SearchKeyVarContext ctx) {
        return this.m_oMapVariables.get(ctx.var.getText().substring(1));
    }
}
