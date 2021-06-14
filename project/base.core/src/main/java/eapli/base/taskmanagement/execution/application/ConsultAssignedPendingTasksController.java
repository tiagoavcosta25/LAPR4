package eapli.base.taskmanagement.execution.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ConsultAssignedPendingTasksController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TaskRepository m_oTaskRepo = PersistenceContext.repositories().tasks();
    private final ListTaskFilterFieldsService listTaskFilterFieldsService = new ListTaskFilterFieldsService();
    private final ListTaskOrderFieldsService listTaskOrderFieldsService = new ListTaskOrderFieldsService();

    public Iterable<TaskFilterFields> getTaskFilterFields() {
        return listTaskFilterFieldsService.getTaskFilterFields();
    }

    public Iterable<TaskOrderFields> getTaskOrderFields() {
        return listTaskOrderFieldsService.getTaskOrderFields();
    }

    public Iterable<ManualTask> getTasksOfCollaborator() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return null;
    }

    public Iterable<ManualTask> getTasksOfCollaborator(TaskFilterFields filterBy) {
return null;
    }

    public Iterable<ManualTask> getTasksOfCollaborator(TaskOrderFields orderBy) {
return null;
    }

    public Iterable<ManualTask> getTasksOfCollaborator(TaskFilterFields filterBy, TaskOrderFields orderBy) {
return null;
    }
}