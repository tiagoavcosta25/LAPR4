package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryManualTaskExecutionRepository extends InMemoryDomainRepository<ManualTaskExecution, Long>
        implements ManualTaskExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername) {
        return match(manualTaskExecution ->manualTaskExecution.getM_oCollaborator().user().username().equals(oUsername)
                && manualTaskExecution.status().equals(TaskExecutionStatus.PENDING));
    }

    @Override
    public Iterable<ManualTaskExecution> getHisManualTasksFromFlux(Username oUsername, Long idFlux) {
        ActivityFluxExecutionRepository imAFErepo = PersistenceContext.repositories().fluxExecs();
        List<ManualTaskExecution> lst = new ArrayList<>();
        Optional<ActivityFluxExecution> oAfe = imAFErepo.findByID(idFlux);
        ActivityFluxExecution afe;
        if(oAfe.isPresent()) {
            afe = oAfe.get();
        } else
            return new ArrayList<>();
        for(TaskExecution te : afe.flux()) {
            if(te.getClass().equals(ManualTaskExecution.class)) {
                ManualTaskExecution tmp = (ManualTaskExecution) te;
                if(tmp.getM_oCollaborator().user().username().equals(oUsername)) lst.add(tmp);
            }
        }
        return lst;
    }

    @Override
    public Iterable<ActivityFluxExecution> getHisActivityFluxWithManualTasks(Username oUsername) {
        ActivityFluxExecutionRepository imAFErepo = PersistenceContext.repositories().fluxExecs();
        List<ActivityFluxExecution> lst = new ArrayList<>();
        Iterator<ActivityFluxExecution> iAfe = imAFErepo.findAll().iterator();
        ActivityFluxExecution next;
        while(iAfe.hasNext()) {
            next = iAfe.next();
            for(TaskExecution te : next.flux()) {
                if(te.getClass().equals(ManualTaskExecution.class)) {
                    lst.add(next);
                }
            }
        }
        return lst;
    }

    @Override
    public Iterable<ManualTaskExecution> getUnassignedPendingTasks() {
        ActivityFluxExecutionRepository imAFErepo = PersistenceContext.repositories().fluxExecs();
        List<ManualTaskExecution> lst = new ArrayList<>();
        for (ActivityFluxExecution tmp : imAFErepo.findAll()) {
            for (TaskExecution te : tmp.flux()) {
                if (te.getClass().equals(ManualTaskExecution.class) && te.id().equals(tmp.currentProgress().currentProgress())) {
                    lst.add((ManualTaskExecution) te);
                }
            }
        }
        return lst;
    }

    @Override
    public Optional<ActivityFluxExecution> getFluxByManualTaskExec(Long lngTaskID) {
        ActivityFluxExecutionRepository imAFErepo = PersistenceContext.repositories().fluxExecs();
        List<ManualTaskExecution> lst = new ArrayList<>();
        Optional<ActivityFluxExecution> pAfe = null;
        for (ActivityFluxExecution tmp : imAFErepo.findAll()) {
            for (TaskExecution te : tmp.flux()) {
                if (te.id().equals(lngTaskID)) {
                    return Optional.of(tmp);
                }
            }
        }
        return pAfe;
    }
}
