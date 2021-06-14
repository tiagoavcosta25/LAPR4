package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;

import javax.persistence.TypedQuery;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class JpaAutomaticTaskExecutionRepository extends HelpDeskJpaRepositoryBase<AutomaticTaskExecution, Long, Long>
        implements AutomaticTaskExecutionRepository {

    public JpaAutomaticTaskExecutionRepository() {
        super("m_lngID");
    }

    @Override
    public Iterable<AutomaticTaskExecution> getPendingAutomaticTasks(Long idFlux) {
        final TypedQuery<AutomaticTaskExecution> q = entityManager().createQuery(
                "SELECT DISTINCT ate FROM ActivityFluxExecution afe join afe.m_lstFlux lst " +
                        "INNER JOIN AutomaticTaskExecution ate ON ate.id = lst.id " +
                        "INNER JOIN TaskExecution te ON te.id = ate.id " +
                        "WHERE te.m_oTaskStatus =: pending AND afe.id =: idflux",
                AutomaticTaskExecution.class);
        q.setParameter("idflux", idFlux);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        return q.getResultList();
    }

    @Override
    public Iterable<ActivityFluxExecution> getActivityFlux() {
        final TypedQuery<ActivityFluxExecution> q = entityManager().createQuery(
                "SELECT distinct afe FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN TaskExecution te ON te.id = lst.id " +
                        "INNER JOIN AutomaticTaskExecution ate ON ate.id = te.id " +
                        "WHERE te.m_oTaskStatus =: pending",
                ActivityFluxExecution.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        return q.getResultList();
    }
}
