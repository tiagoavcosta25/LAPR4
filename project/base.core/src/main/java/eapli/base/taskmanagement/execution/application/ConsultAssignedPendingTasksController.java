package eapli.base.taskmanagement.execution.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ConsultAssignedPendingTasksController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final ManualTaskExecutionRepository mTaskExecRep = PersistenceContext.repositories().manualTaskExec();
    private final TicketRepository mTicketRep = PersistenceContext.repositories().tickets();
    private final ListTaskFilterFieldsService listTaskFilterFieldsService = new ListTaskFilterFieldsService();
    private final ListTaskOrderFieldsService listTaskOrderFieldsService = new ListTaskOrderFieldsService();

    // TODO: Finish Class

    public Iterable<TaskFilterFields> getTaskFilterFields() {
        return listTaskFilterFieldsService.getTaskFilterFields();
    }

    public Iterable<TicketUrgency> getPriorityFilters() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return Arrays.asList(TicketUrgency.values());
    }

    public Iterable<TaskOrderFields> getTaskOrderFields() {
        return listTaskOrderFieldsService.getTaskOrderFields();
    }

    public Iterable<Ticket> getTasksOfCollaborator() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return mTicketRep.getPendingManualTasksByTicket(m_oAuthz.session().get().authenticatedUser().username());
    }

    public Iterable<Ticket> getTasksOfCollaborator(TaskFilterFields filterBy, String value) {
        Iterable<Ticket> iRegular = getTasksOfCollaborator();
        List<Ticket> lstT = new ArrayList<>();
        switch(filterBy) {
            case PRIORITY:

                break;
            case FINISHDATE:

                break;
        }
        return lstT;
    }

    public Iterable<ManualTask> getTasksOfCollaborator(TaskOrderFields orderBy) {
return null;
    }

    public Iterable<ManualTask> getTasksOfCollaborator(TaskFilterFields filterBy, TaskOrderFields orderBy) {
        return null;
    }
}
