package eapli.base.taskmanagement.repositories;

import eapli.base.formmanagement.domain.Form;
import eapli.base.taskmanagement.domain.Task;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface TaskRepository
        extends DomainRepository<Long, Task> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Task> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
