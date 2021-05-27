package eapli.base.persistence.impl.jpa;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.util.Application;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaServiceRepository
        extends HelpDeskJpaRepositoryBase<Service, Long, Long>
        implements ServiceRepository {

    public JpaServiceRepository() {
        super("m_lngID");
    }

    @Override
    public Optional<Service> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("serviceID", lngID);
        return matchOne("e.id=:serviceID", params);
    }

    @Override
    public Iterable<Service> findByCatalogue(Catalogue oCatalogue) {
        final TypedQuery<Service> q = entityManager().createQuery(
                "SELECT e FROM Service e WHERE e.m_oCatalogue.m_lngID = :catalogueID",
                Service.class);
        q.setParameter("catalogueID", oCatalogue.identity());
        return q.getResultList();
    }

}
