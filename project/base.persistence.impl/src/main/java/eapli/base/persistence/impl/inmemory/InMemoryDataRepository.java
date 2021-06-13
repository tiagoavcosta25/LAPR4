package eapli.base.persistence.impl.inmemory;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.taskmanagement.domain.ManualTaskExecution;
import eapli.base.taskmanagement.domain.TaskExecution;
import eapli.base.taskmanagement.domain.TaskExecutionStatus;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;


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
        LocalDateTime now = LocalDateTime.now();
        Iterable<Ticket> lst = match(ticket -> ticket.executionFlux().flux().stream()
                .allMatch(taskExecution -> taskExecution.status().equals(TaskExecutionStatus.PENDING))
                && ticket.limitDate().getM_dtLimitDate().isAfter(now));
        for(Ticket t : lst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                ManualTaskExecution me = (ManualTaskExecution) te;
                if (me.getM_oCollaborator().user().username().toString().equals(oUserName)) counter++;
            }
        }
        return counter;
    }

    //TODO: whole class
    @Override
    public Long numberOfExpiredActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfNearExpiredActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfLowPriorityActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfMediumPriorityActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfHighPriorityActivities(String oUserName) {
        return 0L;
    }
}
