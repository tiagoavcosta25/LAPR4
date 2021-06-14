package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryAutomaticTaskExecutionRepository extends InMemoryDomainRepository<AutomaticTaskExecution, Long>
        implements AutomaticTaskExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<AutomaticTaskExecution> getPendingAutomaticTasks(Long idFlux) {
        ActivityFluxExecutionRepository imAFErepo = PersistenceContext.repositories().fluxExecs();
        List<AutomaticTaskExecution> lst = new ArrayList<>();
        Optional<ActivityFluxExecution> oAfe = imAFErepo.findByID(idFlux);
        ActivityFluxExecution afe;
        if(oAfe.isPresent()) {
            afe = oAfe.get();
        } else
            return new ArrayList<>();
        for(TaskExecution te : afe.flux()) {
            if(te.getClass().equals(AutomaticTaskExecution.class)) {
                lst.add((AutomaticTaskExecution) te);
            }
        }
        return lst;
    }


}
