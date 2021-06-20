package eapli.base.taskmanagement.execution.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ExecuteManualTaskController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final ManualTaskExecutionRepository mTaskExecRep = PersistenceContext.repositories().manualTaskExec();
    private final TicketRepository mTicketRep = PersistenceContext.repositories().tickets();
    private final ResponseRepository responseRepository = PersistenceContext.repositories().responses();
    private final AdvanceFluxService adAFService = new AdvanceFluxService();

    public Iterable<ManualTaskExecution> getUserPendingTasks(ActivityFluxExecution af) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return this.mTaskExecRep.getHisManualTasksFromFlux(m_oAuthz.session().get().authenticatedUser().username(), af.identity());
    }

    public Iterable<ActivityFluxExecution> getUserActivityFlux() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return this.mTaskExecRep.getHisActivityFluxWithManualTasks(m_oAuthz.session().get().authenticatedUser().username());
    }

    public ManualTaskExecution executeTask(ManualTaskExecution mTaskExecution, Response response, ActivityFluxExecution af) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        Response savedResponse = responseRepository.save(response);
        mTaskExecution.executeTask(savedResponse);
        adAFService.advanceFlux(af);
        return mTaskExecRep.save(mTaskExecution);
    }

    public Optional<Ticket> getTicketFromFlux(Long afe) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return mTicketRep.getTicketFromFlux(afe);
    }

    public boolean verifyResponses(Response oResponse, ScriptMode oScriptMode) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);
        return ScriptAlgorithms.executeValidateForm(oResponse, oScriptMode);
    }


}
