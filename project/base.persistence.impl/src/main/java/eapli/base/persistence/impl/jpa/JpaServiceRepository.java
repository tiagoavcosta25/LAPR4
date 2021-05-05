package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formulariomanagement.domain.Form;
import eapli.base.formulariomanagement.domain.FormID;
import eapli.base.formulariomanagement.repositories.FormRepository;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceID;
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
class JpaServiceRepository
        extends JpaAutoTxRepository<Service, ServiceID, ServiceID>
        implements ServiceRepository {

    public JpaServiceRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaServiceRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<Service> findById(ServiceID oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public Iterable<Service> findAllActive() {
        return match("e.systemUser.active = true");
    }
}
