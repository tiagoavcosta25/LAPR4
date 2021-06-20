package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import javax.persistence.TypedQuery;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class JpaManualTaskExecutionRepository extends HelpDeskJpaRepositoryBase<ManualTaskExecution, Long, Long>
        implements ManualTaskExecutionRepository {

    public JpaManualTaskExecutionRepository() {
        super("m_oID");
    }

    @Override
    public Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername) {
        final TypedQuery<ManualTaskExecution> q = entityManager().createQuery(
                "SELECT DISTINCT mte FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = lst.id " +
                        "INNER JOIN TaskExecution te ON te.id = mte.id " +
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending " +
                        "AND afe.m_oProgress = mte.id",
                ManualTaskExecution.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }

    @Override
    public Iterable<ManualTaskExecution> getHisManualTasksFromFlux(Username oUsername, Long idFlux) {
        final TypedQuery<ManualTaskExecution> q = entityManager().createQuery(
                "SELECT DISTINCT mte FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN TaskExecution te ON te.id = lst.id " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = te.id " +
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending " +
                        "AND afe.id =: idflux AND afe.m_oProgress.m_LongProgress = mte.id",
                ManualTaskExecution.class);
        q.setParameter("idflux", idFlux);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }

    @Override
    public Iterable<ActivityFluxExecution> getHisActivityFluxWithManualTasks(Username oUsername) {
        final TypedQuery<ActivityFluxExecution> q = entityManager().createQuery(
                "SELECT distinct afe FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN TaskExecution te ON te.id = lst.id " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = te.id " +
                        "INNER JOIN Ticket t on t.m_oFluxExecution = afe " +
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending " +
                        "AND afe.m_oProgress.m_LongProgress = mte.id",
                ActivityFluxExecution.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }

    @Override
    public Iterable<ManualTaskExecution> getUnassignedPendingTasks() {
        final TypedQuery<ManualTaskExecution> q = entityManager().createQuery(
                "SELECT distinct mte FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN TaskExecution te ON te.id = lst.id " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = te.id " +
                        "WHERE te.m_oTaskStatus =: pending AND afe.m_oProgress.m_LongProgress = mte.id " +
                        "AND mte.m_oCollaborator.id = null",
                ManualTaskExecution.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        return q.getResultList();
    }

    @Override
    public Optional<ActivityFluxExecution> getFluxByManualTaskExec(Long lngTaskID) {
        final TypedQuery<ActivityFluxExecution> q = entityManager().createQuery(
                "SELECT distinct afe FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN TaskExecution te ON te.id = lst.id " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = te.id " +
                        "WHERE te.id =: tID",
                ActivityFluxExecution.class);
        q.setParameter("tID", lngTaskID);
        return Optional.ofNullable(q.getSingleResult());
    }
}
