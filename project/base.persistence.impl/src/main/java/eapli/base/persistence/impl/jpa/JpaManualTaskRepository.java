package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.repositories.ManualTaskRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class JpaManualTaskRepository extends JpaAutoTxRepository<ManualTask, Long, Long>
        implements ManualTaskRepository {

    public JpaManualTaskRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaManualTaskRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<ManualTask> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", lngID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public boolean isManualTask(Long lngID) {
        return findByID(lngID).isPresent();
    }
}
