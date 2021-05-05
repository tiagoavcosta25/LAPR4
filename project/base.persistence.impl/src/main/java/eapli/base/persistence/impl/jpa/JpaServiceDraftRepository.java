package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.servicemanagement.domain.ServiceID;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
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
        super(autoTx, "m_oID");
    }

    public JpaServiceDraftRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<ServiceDraft> findById(Long oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public Iterable<ServiceDraft> findAllActive() {
        return match("e.systemUser.active = true");
    }
}
