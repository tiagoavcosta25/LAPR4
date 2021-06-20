package base.server.fluxmotor;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class FCFSHandler extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(FCFSHandler.class);
    private final FCFSQueue FCFSQUEUE;
    private final Collaborator collab;
    private final ManualTaskExecutionRepository m_oMTERepo = PersistenceContext.repositories().manualTaskExec();

    public FCFSHandler(FCFSQueue FCFSQUEUE, Collaborator collab) {
        this.collab = collab;
        this.FCFSQUEUE = FCFSQUEUE;
    }

    public void run() {
        while (true) {
            long number;
            try {
                number = FCFSQUEUE.removeFromQueue();
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