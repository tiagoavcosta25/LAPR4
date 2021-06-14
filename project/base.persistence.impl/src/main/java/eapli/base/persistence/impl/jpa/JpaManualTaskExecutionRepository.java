package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import javax.persistence.TypedQuery;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaManualTaskExecutionRepository extends HelpDeskJpaRepositoryBase<ManualTaskExecution, Long, Long>
        implements ManualTaskExecutionRepository {

    public JpaManualTaskExecutionRepository() {
        super("m_lngID");
    }

    @Override
    public Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername) {
        final TypedQuery<ManualTaskExecution> q = entityManager().createQuery(
                "SELECT mte FROM ManualTaskExecution mte " +
                        "INNER JOIN TaskExecution te ON te.id = mte.id " +
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending",
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
                        "AND afe.id =: idflux",
                ManualTaskExecution.class);
        q.setParameter("idflux", idFlux);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }


}
