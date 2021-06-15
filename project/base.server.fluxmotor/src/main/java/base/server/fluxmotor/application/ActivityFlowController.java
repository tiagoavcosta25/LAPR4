package base.server.fluxmotor.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.application.UseCaseController;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ActivityFlowController {

    private final ActivityFluxExecutionRepository m_oAFERepo = PersistenceContext.repositories().fluxExecs();
    private final FluxDataService m_oFluxDataService = new FluxDataService();

    public String prepareFluxData(String oUserName) {
        return m_oFluxDataService.prepareFluxData(oUserName);
    }

    public String advanceFluxData(Long fluxID) {
        Optional<ActivityFluxExecution> afe = m_oAFERepo.findByID(fluxID);
        if(afe.isPresent()) {
            afe.get().advanceProgress();
            return "SUCCESS";
        }
        return "FAILURE";
    }

}
