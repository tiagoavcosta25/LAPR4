package eapli.base.persistence.impl.jpa;

import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaResponseRepository
        extends JpaAutoTxRepository<Response, Long, Long>
        implements ResponseRepository {

    public JpaResponseRepository(TransactionalContext autoTx) {
        super(autoTx, "responseID");
    }

    public JpaResponseRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "responseID");
    }

    @Override
    public Optional<Response> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("responseID", lngID);
        return matchOne("e.id=:responseID", params);
    }
}
