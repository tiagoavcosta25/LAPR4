package eapli.base.persistence.impl.jpa;

import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
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
        super(autoTx, "m_oID");
    }

    public JpaTaskExecutionRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<TaskExecution> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", lngID);
        return matchOne("e.id=:m_oID", params);
    }

}
