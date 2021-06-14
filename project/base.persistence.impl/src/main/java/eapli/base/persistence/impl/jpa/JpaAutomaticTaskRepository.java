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
        super("m_oID");
    }

    @Override
    public Optional<AutomaticTask> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", lngID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public boolean isAutoTask(Long lngID) {
        return findByID(lngID).isPresent();
    }
}
