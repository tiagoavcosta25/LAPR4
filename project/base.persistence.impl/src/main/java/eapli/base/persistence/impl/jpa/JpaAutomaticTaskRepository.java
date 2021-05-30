package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.domain.AutomaticTask;
import eapli.base.taskmanagement.repositories.AutomaticTaskRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import javax.persistence.TypedQuery;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaAutomaticTaskRepository extends HelpDeskJpaRepositoryBase<AutomaticTask, Long, Long>
        implements AutomaticTaskRepository {

    public JpaAutomaticTaskRepository() {
        super("m_lngID");
    }

    @Override
    public Iterable<AutomaticTask> getPendingAutomaticTasks(Long idFlux) {
        final TypedQuery<AutomaticTask> q = entityManager().createQuery(
                "Select distinct at from ActivityFlux af join af.m_lstFlux lst " +
                        "inner join Task t on t.id = lst.id " +
                        "inner join AutomaticTask at on at.id = t.id " +
                        "where t.m_oTaskStatus = 'PENDING' and af.id =:idflux",
                AutomaticTask.class);
        q.setParameter("idflux", idFlux);
        return q.getResultList();
    }

    @Override
    public Iterable<Service> getActivityFlux() {
        final TypedQuery<Service> q = entityManager().createQuery(
                "Select distinct s from ActivityFlux af join af.m_lstFlux lst " +
                        "inner join Service s on s.m_oActivityFlux.id = af.id " +
                        "inner join AutomaticTask at on at.id = lst.id " +
                        "inner join Task t on t.id = at.id " +
                        "where t.m_oTaskStatus = 'PENDING'",
                Service.class);
        return q.getResultList();
    }
}
