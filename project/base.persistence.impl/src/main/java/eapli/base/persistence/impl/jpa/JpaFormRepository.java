package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaFormRepository
        extends JpaAutoTxRepository<Form, Long, Long>
        implements FormRepository {

    public JpaFormRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaFormRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<Form> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("formID", lngID);
        return matchOne("e.id=:formID", params);
    }

    @Override
    public Iterable<Form> findAllActive() {
        return match("e.systemUser.active = true");
    }
}
