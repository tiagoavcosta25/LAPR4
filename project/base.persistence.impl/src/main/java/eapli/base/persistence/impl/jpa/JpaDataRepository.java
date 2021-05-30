package eapli.base.persistence.impl.jpa;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.servicemanagement.domain.Service;

import javax.persistence.TypedQuery;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
class JpaDataRepository extends HelpDeskJpaRepositoryBase<Service, Long, Long>
        implements DataRepository {

    public JpaDataRepository() {
        super("m_lngID");
    }

    //TODO: Fix Class
    @Override
    public Long numberOfPendingActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(DISTINCT lst.id) from ActivityFlux a join a.m_lstFlux lst " +
                        "inner join Task t on t.id = lst.id " +
                        "inner join ManualTask mt on mt.id = t.id " +
                        "inner join Service s on s.m_oActivityFlux.id = a.id " +
                        "inner join Ticket tt on s.id = tt.m_oService.id " +
                        "where mt.m_oCollaborator.m_oMechanographicNumber.m_lngMechanographicNumber = :mec and t.m_oTaskStatus = 'PENDING'",
                Long.class);
        q.setParameter("mec", Long.valueOf(oUserName));
        return q.getSingleResult();
    }

    @Override
    public int numberOfExpiredActivities(String oUserName) {
        return 0;
    }

    @Override
    public int numberOfNearExpiredActivities(String oUserName) {
        return 0;
    }

    @Override
    public int numberOfLowPriorityActivities(String oUserName) {
        return 0;
    }

    @Override
    public int numberOfMediumPriorityActivities(String oUserName) {
        return 0;
    }

    @Override
    public int numberOfHighPriorityActivities(String oUserName) {
        return 0;
    }


}
