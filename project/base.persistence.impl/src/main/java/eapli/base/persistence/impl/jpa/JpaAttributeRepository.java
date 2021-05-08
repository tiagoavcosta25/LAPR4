package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.AttributeRepository;
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
class JpaAttributeRepository
        extends JpaAutoTxRepository<Attribute, Long, Long>
        implements AttributeRepository {

    public JpaAttributeRepository(TransactionalContext autoTx) {
        super(autoTx, "attributeID");
    }

    public JpaAttributeRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "attributeID");
    }

    @Override
    public Optional<Attribute> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("attributeID", lngID);
        return matchOne("e.id=:attributeID", params);
    }

    @Override
    public Iterable<Attribute> findAllActive() {
        return match("e.systemUser.active = true");
    }
}
