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


}
