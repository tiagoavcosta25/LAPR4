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


    }
