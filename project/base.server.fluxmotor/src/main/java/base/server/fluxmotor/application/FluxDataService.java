package base.server.fluxmotor.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.framework.application.ApplicationService;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class FluxDataService {

    private final DataRepository m_oDataRepository = PersistenceContext.repositories().data();

    public String prepareFluxData(String oUsername) {
        Long nPending = this.m_oDataRepository.numberOfPendingActivities(oUsername);
        Long nExpired = this.m_oDataRepository.numberOfExpiredActivities(oUsername);
        Long nNearExpired = this.m_oDataRepository.numberOfNearExpiredActivities(oUsername);
        Long nLowPrio = this.m_oDataRepository.numberOfLowPriorityActivities(oUsername);
        Long nMidPrio = this.m_oDataRepository.numberOfMediumPriorityActivities(oUsername);
        Long nHighPrio = this.m_oDataRepository.numberOfHighPriorityActivities(oUsername);
        return nPending + ";" + nExpired + ";" + nNearExpired + ";" + nLowPrio +
                ";" + nMidPrio + ";" + nHighPrio;
    }
}

