package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

import java.util.Stack;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class FormListener extends ValidateFormBaseListener {

    private final Stack<Boolean> stack = new Stack<>();
    private Response m_oResponse;

    public FormListener(Response oResponse) {
        this.m_oResponse = oResponse;
    }

    public Boolean getResult() {
        return stack.peek();
    }

}
