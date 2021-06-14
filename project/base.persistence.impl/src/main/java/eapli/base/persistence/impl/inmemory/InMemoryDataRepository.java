package eapli.base.persistence.impl.inmemory;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.time.LocalDateTime;


/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryDataRepository extends InMemoryDomainRepository<Ticket, Long> implements DataRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Long numberOfPendingActivities(String oUserName) {
        Long counter = 0L;
        Iterable<Ticket> lst = match(ticket -> ticket.executionFlux().flux().stream()
                .allMatch(taskExecution -> taskExecution.status().equals(TaskExecutionStatus.PENDING)));
        for(Ticket t : lst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                ManualTaskExecution me = (ManualTaskExecution) te;
                if (me.getM_oCollaborator().user().username().toString().equals(oUserName)) counter++;
            }
        }
        return counter;
    }

    @Override
    public Long numberOfExpiredActivities(String oUserName) {
        Long counter = 0L;
        LocalDateTime now = LocalDateTime.now();
        Iterable<Ticket> lst = match(ticket -> ticket.executionFlux().flux().stream()
                .allMatch(taskExecution -> taskExecution.status().equals(TaskExecutionStatus.PENDING))
                && ticket.limitDate().getM_dtLimitDate().isBefore(now));
        for(Ticket t : lst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                ManualTaskExecution me = (ManualTaskExecution) te;
                if (me.getM_oCollaborator().user().username().toString().equals(oUserName)) counter++;
            }
        }
        return counter;
    }

    @Override
    public Long numberOfNearExpiredActivities(String oUserName) {
        Long counter = 0L;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime in1h = now.plusHours(1);
        Iterable<Ticket> lst = match(ticket -> ticket.executionFlux().flux().stream()
                .allMatch(taskExecution -> taskExecution.status().equals(TaskExecutionStatus.PENDING))
                && ticket.limitDate().getM_dtLimitDate().isAfter(now)
                && ticket.limitDate().getM_dtLimitDate().isBefore(in1h));
        for(Ticket t : lst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                ManualTaskExecution me = (ManualTaskExecution) te;
                if (me.getM_oCollaborator().user().username().toString().equals(oUserName)) counter++;
            }
        }
        return counter;
    }

    @Override
    public Long numberOfLowPriorityActivities(String oUserName) {
        return prioritySearch(oUserName, TaskPriority.LOW);
    }

    @Override
    public Long numberOfMediumPriorityActivities(String oUserName) {
        return prioritySearch(oUserName, TaskPriority.MEDIUM);
    }

    @Override
    public Long numberOfHighPriorityActivities(String oUserName) {
        return prioritySearch(oUserName, TaskPriority.HIGH);
    }

    private Long prioritySearch(String oUserName, TaskPriority tp) {
        Long counter = 0L;
        Iterable<Ticket> lst = match(ticket -> ticket.executionFlux().flux().stream()
                .allMatch(taskExecution -> taskExecution.status().equals(TaskExecutionStatus.PENDING)));
        for(Ticket t : lst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                ManualTaskExecution me = (ManualTaskExecution) te;
                if (me.getM_oCollaborator().user().username().toString().equals(oUserName)
                        && me.getM_oManualTask().priority().equals(tp)) counter++;
            }
        }
        return counter;
    }
}
