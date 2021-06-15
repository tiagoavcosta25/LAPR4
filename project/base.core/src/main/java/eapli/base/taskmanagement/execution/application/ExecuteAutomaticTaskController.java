package eapli.base.taskmanagement.execution.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ExecuteAutomaticTaskController {

    private static final String EXECUTE_SERVER_IP = "10.9.21.104";

    private final ExecuteAutomaticTaskService executeAutomaticTaskService = new ExecuteAutomaticTaskService();
    private final AutomaticTaskExecutionRepository autoTaskRepo = PersistenceContext.repositories().automaticTaskExec();
    private final AdvanceFluxService adAFService = new AdvanceFluxService();

    public Iterable<AutomaticTaskExecution> getPendingTasks(ActivityFluxExecution af) {
        return this.autoTaskRepo.getPendingAutomaticTasks(af.identity());
    }

    public Iterable<ActivityFluxExecution> getActivityFlow() {
        return this.autoTaskRepo.getActivityFlux();
    }

    // TODO: FIX CLASS
    public AutomaticTaskExecution executeTask(AutomaticTaskExecution task, ActivityFluxExecution af) {
        task.setExecuting();
        ActivityFlowClient afc = new ActivityFlowClient(EXECUTE_SERVER_IP);
        SDP2021 receive = afc.retrieveInformation(task.getM_oAutomaticTask().script().toString(),
                SDP2021Code.AUTOTASK_REQUEST.getCode());
        afc.retrieveInformation("", SDP2021Code.END.getCode());
        task.setExecuted();
        adAFService.advanceFlux(af);
        return autoTaskRepo.save(task);
    }

    public boolean executeAutomaticTaskMock(String filePath) {
        return executeAutomaticTaskService.executeAutomaticTaskMock(filePath, true);
    }

}
