package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaActivityFluxExecutionRepository
        extends JpaAutoTxRepository<ActivityFluxExecution, Long, Long>
        implements ActivityFluxExecutionRepository {

    public JpaActivityFluxExecutionRepository(TransactionalContext autoTx) {
        super(autoTx, "fluxExecID");
    }

    public JpaActivityFluxExecutionRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "fluxExecID");
    }

    @Override
    public Optional<ActivityFluxExecution> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("fluxExecID", lngID);
        return matchOne("e.id=:fluxExecID", params);
    }
}
