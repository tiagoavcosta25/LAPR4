package eapli.base.taskmanagement.execution.repositories;

import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface TaskExecutionRepository
        extends DomainRepository<Long, TaskExecution> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<TaskExecution> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

}