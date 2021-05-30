package eapli.base.taskmanagement.application;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.ManualTaskExecution;
import eapli.base.taskmanagement.domain.Task;
import eapli.base.taskmanagement.repositories.ManualTaskExecutionRepository;
import eapli.base.taskmanagement.repositories.ManualTaskRepository;
import eapli.base.taskmanagement.repositories.TaskRepository;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ExecuteManualTaskController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TaskRepository taskRepo = PersistenceContext.repositories().tasks();
    private final ManualTaskRepository mTaskRep = PersistenceContext.repositories().manualTask();
    private final ManualTaskExecutionRepository mTaskExecRepo = PersistenceContext.repositories().manualEx();
    private final ResponseRepository responseRepository = PersistenceContext.repositories().responses();

    public Iterable<ManualTask> getUserPendingTasks(ActivityFlux af) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return this.taskRepo.getHisPendingManualTasks(m_oAuthz.session().get().authenticatedUser().username(), af.identity());
    }

    public Iterable<Service> getUserActivityFlux() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return this.taskRepo.getActivityFlux(m_oAuthz.session().get().authenticatedUser().username());
    }

    public ManualTaskExecution executeTask(ManualTask task, Response response) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        ManualTaskExecution mt = new ManualTaskExecution(task);
        Response savedResponse = responseRepository.save(response);
        mt.executeTask(savedResponse);
        mTaskRep.save(mt.getManualTask());
        return this.mTaskExecRepo.save(mt);
    }

}
