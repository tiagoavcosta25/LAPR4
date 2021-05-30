package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.domain.ManualTaskExecution;
import eapli.base.taskmanagement.repositories.ManualTaskExecutionRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaManualTaskExecutionRepository extends JpaAutoTxRepository<ManualTaskExecution, Long, Long>
        implements ManualTaskExecutionRepository {

    public JpaManualTaskExecutionRepository(TransactionalContext autoTx) {
        super(autoTx, "executionTaskID");
    }

    public JpaManualTaskExecutionRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "executionTaskID");
    }

    @Override
    public Optional<ManualTaskExecution> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("executionTaskID", lngID);
        return matchOne("e.id=:executionTaskID", params);
    }

}
