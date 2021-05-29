package eapli.base.persistence.impl.jpa;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.net.activityflux.repositories.DataRepository;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.teammanagement.domain.Team;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
class JpaDataRepository extends HelpDeskJpaRepositoryBase<Service, Long, Long>
        implements DataRepository {


    public JpaDataRepository() {
        super("m_lngID");
    }

    @Override
    public int numberOfPendingActivities(Long oMecanographicNumber) {
        final TypedQuery<Integer> q = entityManager().createQuery(
                "Select count(DISTINCT lst.id) from ActivityFlux a join a.m_lstFlux lst " +
                        "inner join Task t on t.id = lst.id " +
                        "inner join ManualTask mt on mt.id = t.id " +
                        "inner join Service s on s.m_oActivityFlux.id = a.id " +
                        "inner join Ticket tt on s.id = tt.m_oService.id " +
                        "where mt.m_oCollaborator.m_oMechanographicNumber = :mec and t.m_oTaskStatus = 'PENDING'",
                int.class);
        q.setParameter("mec", oMecanographicNumber);
        return q.getSingleResult();
    }

    @Override
    public int numberOfExpiredActivities() {
        return 0;
    }

    @Override
    public int numberOfNearExpiredActivities() {
        return 0;
    }

    @Override
    public int numberOfLowPriorityActivities() {
        return 0;
    }

    @Override
    public int numberOfMediumPriorityActivities() {
        return 0;
    }

    @Override
    public int numberOfHighPriorityActivities() {
        return 0;
    }

}
