package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
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
class JpaActivityFluxRepository
        extends JpaAutoTxRepository<ActivityFlux, Long, Long>
        implements ActivityFluxRepository {

    public JpaActivityFluxRepository(TransactionalContext autoTx) {
        super(autoTx, "fluxID");
    }

    public JpaActivityFluxRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formID");
    }

    @Override
    public Optional<ActivityFlux> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("fluxID", lngID);
        return matchOne("e.id=:fluxID", params);
    }
}
