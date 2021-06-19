package base.server.fluxmotor.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
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

    public String creationFluxData(Long fluxID) {
        Optional<ActivityFluxExecution> oAfe = m_oAFERepo.findByID(fluxID);
        if (oAfe.isPresent()) {
            ActivityFluxExecution afe = oAfe.get();
            return String.valueOf(setExecuting(afe).booleanValue());
        }
        return Boolean.FALSE.toString();
    }

    public String advanceFluxData(Long fluxID) {
        Optional<ActivityFluxExecution> oAfe = m_oAFERepo.findByID(fluxID);
        if (oAfe.isPresent()) {
            ActivityFluxExecution afe = oAfe.get();
            afe.advanceProgress();
            if (afe.currentProgress().currentProgress() == -1) return "Finished activity flux";
            return String.valueOf(setExecuting(afe));
        }
        return "Invalid activity flux execution id";
    }

    private Boolean setExecuting(ActivityFluxExecution afe) {
        Long idTask = afe.currentProgress().currentProgress();
        if (idTask != -1) {
            Optional<TaskExecution> oTe = m_oTERepo.findByID(idTask);
            TaskExecution te;
            if (!oTe.isPresent()) return false;
            te = oTe.get();
            te.setExecuting();
            m_oAFERepo.save(afe);
            m_oTERepo.save(te);
            if (te.getClass().equals(AutomaticTaskExecution.class)) {
                AutomaticTaskExecution ate = (AutomaticTaskExecution) te;
                ActivityFlowClient afc = new ActivityFlowClient(EXECUTE_SERVER_IP);
                afc.retrieveInformation(te.id() + "," +
                        ate.getM_oAutomaticTask().script().toString(), SDP2021Code.AUTOTASK_REQUEST.getCode());
                afc.retrieveInformation("", SDP2021Code.END.getCode());
                advanceFluxData(afe.id());
            } else {
                if (te.getClass().equals(ManualTaskExecution.class)) {
                    ManualTaskExecution mte = (ManualTaskExecution) te;
                    //TODO: FINISH MANUAL TASK EXECUTION
                }
            }
            return true;
        }
        return false;
    }
}