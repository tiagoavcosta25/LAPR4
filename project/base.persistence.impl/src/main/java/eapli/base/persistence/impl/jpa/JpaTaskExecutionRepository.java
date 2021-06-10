package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.domain.TaskExecution;
import eapli.base.taskmanagement.repositories.TaskExecutionRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class JpaTaskExecutionRepository extends JpaAutoTxRepository<TaskExecution, Long, Long>
        implements TaskExecutionRepository {

    public JpaTaskExecutionRepository(TransactionalContext autoTx) {
        super(autoTx, "executionTaskID");
    }

    public JpaTaskExecutionRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "executionTaskID");
    }

    @Override
    public Optional<TaskExecution> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("executionTaskID", lngID);
        return matchOne("e.id=:executionTaskID", params);
    }

}