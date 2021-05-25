package eapli.base.persistence.impl.jpa;

import eapli.base.util.Application;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaServiceDraftRepository
        extends JpaAutoTxRepository<ServiceDraft, Long, Long>
        implements ServiceDraftRepository {

    public JpaServiceDraftRepository(TransactionalContext autoTx) {
        super(autoTx, "serviceDraftID");
    }

    public JpaServiceDraftRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "serviceDraftID");
    }

    @Override
    public Optional<ServiceDraft> findById(Long oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("serviceDraftID", oID);
        return matchOne("e.id=:serviceDraftID", params);
    }
}
