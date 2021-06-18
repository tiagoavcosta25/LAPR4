package base.server.fluxmotor.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.util.Application;
import eapli.framework.application.UseCaseController;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ActivityFlowController {

    private static final String EXECUTE_SERVER_IP = Application.settings().getExecuteServerIp();
    private final ActivityFluxExecutionRepository m_oAFERepo = PersistenceContext.repositories().fluxExecs();
    private final TaskExecutionRepository m_oTERepo = PersistenceContext.repositories().taskExecs();
    private final FluxDataService m_oFluxDataService = new FluxDataService();

    public String prepareFluxData(String oUserName) {
        return m_oFluxDataService.prepareFluxData(oUserName);
    }

    public String advanceFluxData(Long fluxID) {
        Optional<ActivityFluxExecution> afe = m_oAFERepo.findByID(fluxID);
        if(afe.isPresent()) {
            afe.get().advanceProgress();

            Long idTask = afe.get().currentProgress().currentProgress();

            if(idTask != -1) {
                Optional<TaskExecution> oTe = m_oTERepo.findByID(idTask);
                TaskExecution te;
                if(!oTe.isPresent()) return "FAILURE";
                te = oTe.get();
                if(te.getClass().equals(AutomaticTaskExecution.class)) {
                    AutomaticTaskExecution ate = (AutomaticTaskExecution) te;
                    ate.setExecuting();
                    ActivityFlowClient afc = new ActivityFlowClient(EXECUTE_SERVER_IP);
                    afc.retrieveInformation(te.id() + "," +
                            ate.getM_oAutomaticTask().script().toString(), SDP2021Code.AUTOTASK_REQUEST.getCode());
                    afc.retrieveInformation("", SDP2021Code.END.getCode());
                } else {

                }
            }




            return "SUCCESS";
        }
        return "FAILURE";
    }

}
