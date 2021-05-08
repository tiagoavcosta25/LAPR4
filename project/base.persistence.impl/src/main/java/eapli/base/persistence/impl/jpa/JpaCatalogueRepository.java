package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


class JpaCatalogueRepository
        extends JpaAutoTxRepository<Catalogue, Long, Long>
        implements CatalogueRepository {


    public JpaCatalogueRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaCatalogueRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<Catalogue> findById(Long oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public Iterable<Catalogue> findAllActive() {
        return match("e.systemUser.active = true");
    }

}
