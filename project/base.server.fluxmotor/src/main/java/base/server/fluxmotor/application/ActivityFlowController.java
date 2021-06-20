package base.server.fluxmotor.application;

import base.server.fluxmotor.GenericQueue;
import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketStatus;
import eapli.base.ticketmanagement.repository.TicketRepository;
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
    private final ManualTaskExecutionRepository m_oMTERepo = PersistenceContext.repositories().manualTaskExec();
    private final FluxDataService m_oFluxDataService = new FluxDataService();
    private final CollaboratorRepository collabRepo = PersistenceContext.repositories().collaborators();
    private final TicketRepository tRepo = PersistenceContext.repositories().tickets();

    public String prepareFluxData(String oUserName) {
        return m_oFluxDataService.prepareFluxData(oUserName);
    }

    public String creationFluxData(Long fluxID, GenericQueue FCFSQUEUE) {
        Optional<ActivityFluxExecution> oAfe = m_oAFERepo.findByID(fluxID);
        if (oAfe.isPresent()) {
            ActivityFluxExecution afe = oAfe.get();
            return String.valueOf(setExecuting(afe, FCFSQUEUE).booleanValue());
        }
        return Boolean.FALSE.toString();
    }

    public String advanceFluxData(Long fluxID, GenericQueue FCFSQUEUE) {
        Optional<ActivityFluxExecution> oAfe = m_oAFERepo.findByID(fluxID);
        if (oAfe.isPresent()) {
            ActivityFluxExecution afe = oAfe.get();
            afe.advanceProgress();
            this.m_oAFERepo.save(afe);
            if (afe.currentProgress().currentProgress() == -1) {
                Optional<Ticket> oT = tRepo.getTicketFromFlux(fluxID);
                if(oT.isPresent()) {
                    Ticket t = oT.get();
                    t.setStatus(TicketStatus.CLOSED);
                    this.tRepo.save(t);
                }
                return "Finished activity flux";
            }
            return String.valueOf(setExecuting(afe, FCFSQUEUE));
        }
        return "Invalid activity flux execution id";
    }

    private Boolean setExecuting(ActivityFluxExecution afe, GenericQueue FCFSQUEUE) {
        Long idTask = afe.currentProgress().currentProgress();
        if (idTask != -1) {
            Optional<TaskExecution> oTe = m_oTERepo.findByID(idTask);
            TaskExecution te;
            if (!oTe.isPresent()) return false;
            te = oTe.get();
            if (te.getClass().equals(AutomaticTaskExecution.class)) {
                AutomaticTaskExecution ate = (AutomaticTaskExecution) te;
                ActivityFlowClient afc = new ActivityFlowClient(EXECUTE_SERVER_IP);
                afc.retrieveInformation(te.id() + "," +
                        ate.getM_oAutomaticTask().script().toString(), SDP2021Code.AUTOTASK_REQUEST.getCode());
                afc.retrieveInformation("", SDP2021Code.END.getCode());
                advanceFluxData(afe.id(), FCFSQUEUE);
            } else {
                if (te.getClass().equals(ManualTaskExecution.class)) {
                    ManualTaskExecution mte = (ManualTaskExecution) te;
                    if(mte.getM_oCollaborator() == null)
                        addManualTask(te.id(), FCFSQUEUE);
                }
            }
            return true;
        }
        return false;
    }

    private void addManualTask(long mTaskID, GenericQueue FCFSQUEUE) {
        FCFSQUEUE.addToQueue(mTaskID);
    }

    public Iterable<Collaborator> getAllCollabs() {
        return this.collabRepo.findAll();
    }

    public Iterable<ManualTaskExecution> getUnassignedPendingTasks() {
        return this.m_oMTERepo.getUnassignedPendingTasks();
    }

    public Optional<ActivityFluxExecution> getFluxByManualTaskExec(long mTaskID) {
        return this.m_oMTERepo.getFluxByManualTaskExec(mTaskID);
    }
}