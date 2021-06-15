package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class FormVisitor extends ValidateFormBaseVisitor<Boolean> {

    private Response m_oResponse;

    public FormVisitor(Response r){
        this.m_oResponse = r;
    }

    @Override
    public Boolean visitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx) {
        String str = ctx.agr.getText();

        System.out.println(str);

        return true;
    }
}