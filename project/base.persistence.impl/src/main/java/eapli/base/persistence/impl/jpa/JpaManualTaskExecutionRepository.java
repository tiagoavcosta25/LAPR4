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


}
