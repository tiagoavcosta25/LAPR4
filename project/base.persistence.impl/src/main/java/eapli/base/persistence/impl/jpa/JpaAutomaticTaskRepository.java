package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class JpaAutomaticTaskRepository extends HelpDeskJpaRepositoryBase<AutomaticTask, Long, Long>
        implements AutomaticTaskRepository {

    public JpaAutomaticTaskRepository() {
        super("m_lngID");
    }

    @Override
    public Optional<AutomaticTask> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("taskID", lngID);
        return matchOne("e.id=:taskID", params);
    }
}
