package eapli.base.grammar.antlr.autotask;

import eapli.base.ticketmanagement.domain.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class TaskListener extends AutoTaskBaseListener{

    private final Stack<String> stack = new Stack<>();
    private final Map<String, String> m_oMapVariables;
    private final Ticket m_oTicket;

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






}
