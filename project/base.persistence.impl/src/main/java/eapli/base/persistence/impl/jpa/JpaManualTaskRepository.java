package eapli.base.persistence.impl.jpa;

import eapli.base.formmanagement.domain.Form;
import eapli.base.taskmanagement.domain.ManualTaskExecution;
import eapli.base.taskmanagement.repositories.ManualTaskRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaManualTaskRepository extends JpaAutoTxRepository<ManualTaskExecution, Long, Long>
        implements ManualTaskRepository {

    public JpaManualTaskRepository(TransactionalContext autoTx) {
        super(autoTx, "executionTaskID");
    }

    public JpaManualTaskRepository(String puname) {
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
