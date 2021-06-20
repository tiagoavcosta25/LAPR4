package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class TicketManualTaskPrinter implements Visitor<Ticket> {

    @Override
    public void visit(Ticket visitee) {
        ManualTaskExecution mte = manualTaskToPrint(visitee);
        System.out.printf("%-5sTask %-40s%-20s%-30s", mte.id(), mte.getM_oManualTask().description(), visitee.urgency(),
                visitee.limitDate().toString());
    }

    public ManualTaskExecution manualTaskToPrint(Ticket t) {
        for(TaskExecution te : t.executionFlux().flux()) {
            if (te.getClass().equals(ManualTaskExecution.class)) {
                return (ManualTaskExecution) te;
            }
        }
        return null;
    }
}
