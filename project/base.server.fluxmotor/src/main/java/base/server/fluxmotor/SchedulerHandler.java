package base.server.fluxmotor;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

/**
 * @author Beatriz Seixas 1191460@isep.ipp.pt
 */
public class SchedulerHandler extends Thread{

    private static final Logger LOGGER = LogManager.getLogger(SchedulerHandler.class);
    private final SchedulerQueue schedulerQueue;
    private final Collaborator collab;
    private final ManualTaskExecutionRepository m_oMTERepo = PersistenceContext.repositories().manualTaskExec();
    private final int nThread;

    public SchedulerHandler(int num, SchedulerQueue schedulerQueue, Collaborator collab) {
        this.collab = collab;
        this.schedulerQueue = schedulerQueue;
        this.nThread = num;
    }

    public void run() {
        while (true) {
            long number;
            try {
                number = schedulerQueue.removeFromQueue(nThread);
                assignTask(number);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }

    private void assignTask(long number) {
        LOGGER.info("Process with collab " + collab.id() + " assigned with task number " + number);
        Optional<ManualTaskExecution> oMte = this.m_oMTERepo.findByID(number);
        if(oMte.isPresent()) {
            ManualTaskExecution mte = oMte.get();
            mte.assignCollaborator(this.collab);
            this.m_oMTERepo.save(mte);
        }
    }
}