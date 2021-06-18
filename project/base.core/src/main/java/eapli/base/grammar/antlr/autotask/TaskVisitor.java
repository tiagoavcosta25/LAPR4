package eapli.base.grammar.antlr.autotask;

import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormName;
import eapli.base.formmanagement.domain.FormScript;
import eapli.base.formmanagement.domain.FormType;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.util.EmailSender;
import eapli.base.util.XmlFileReader;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class TaskVisitor extends AutoTaskBaseVisitor<String> {

    //TODO: remover m_oResponse da classe
    private final Map<String, String> m_oMapVariables;
    //private final Ticket m_oTicket;
    private final Response m_oResponse;

    public TaskVisitor() {
        this.m_oMapVariables = new HashMap<>();
        //this.m_oTicket = oTicket;
        List<String> lst = new ArrayList<>();
        lst.add("XYJ123"); //Codigo do produto
        lst.add("3"); //Quantidade pretendida
        lst.add("Nacional"); //Tipo do cliente
        this.m_oResponse = new Response(new Form(new FormName("name"), FormType.MANUALTASK,
                new FormScript("D:/teste/teste.bat"), new ArrayList<>()), lst);
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
        EmailSender.send(email, email, subject, body, email);
        return Boolean.TRUE.toString();
    }

    @Override
    public String visitExecSendEmailCollab(AutoTaskParser.ExecSendEmailCollabContext ctx) {
        //String email = m_oTicket.collaborator().user().email().toString();
        String email = "colaborador@teste.com";
        String subject = visit(ctx.sub);
        String body = visit(ctx.email_body);
        EmailSender.send(email, email, subject, body, email);
        return Boolean.TRUE.toString();
    }
}
