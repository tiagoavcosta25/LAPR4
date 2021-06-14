package eapli.base.taskmanagement.execution.application;

import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
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
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TaskRepository taskRepo = PersistenceContext.repositories().tasks();
    private final AutomaticTaskRepository aTaskRep = PersistenceContext.repositories().automaticTask();

    public Iterable<AutomaticTask> getPendingTasks(ActivityFlux af) {
        return this.aTaskRep.getPendingAutomaticTasks(af.identity());
    }

    public Iterable<Service> getActivityFlow() {
        return this.aTaskRep.getActivityFlux();
    }

    public AutomaticTask executeTask(AutomaticTask task) {
        /*task.setExecuting();
        ActivityFlowClient afc = new ActivityFlowClient(EXECUTE_SERVER_IP);
        SDP2021 receive = afc.retrieveInformation(task.script().toString(), SDP2021Code.AUTOTASK_REQUEST.getCode());
        afc.retrieveInformation("", SDP2021Code.END.getCode());
        task.setExecuted();*/ // TODO
        return this.aTaskRep.save(task);
    }
    public boolean executeAutomaticTaskMock(String filePath) {
        return executeAutomaticTaskService.executeAutomaticTaskMock(filePath, true);
    }

}