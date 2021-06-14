package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaTaskRepository
        extends HelpDeskJpaRepositoryBase<Task, Long, Long>
        implements TaskRepository {

    public JpaTaskRepository() {
        super("m_lngID");
    }

    @Override
    public Optional<Task> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("taskID", lngID);
        return matchOne("e.id=:taskID", params);
    }
}