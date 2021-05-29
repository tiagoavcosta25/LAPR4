package net.activityflux.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.activityflux.repositories.DataRepository;
import eapli.framework.application.ApplicationService;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class FluxDataService {

    private final DataRepository m_oDataRepository = PersistenceContext.repositories().data();

    //TODO: Finish Repository
    public String prepareFluxData(String oMecanographicNumber) {
        Long mecNumber = Long.valueOf(oMecanographicNumber);
        int nPending = Math.toIntExact(this.m_oDataRepository.numberOfPendingActivities(mecNumber));
        int nExpired = 1;//this.m_oDataRepository.numberOfExpiredActivities(mecNumber);
        int nNearExpired = 1;//this.m_oDataRepository.numberOfNearExpiredActivities(mecNumber);
        int nLowPrio = 1;//this.m_oDataRepository.numberOfLowPriorityActivities(mecNumber);
        int nMidPrio = 1;//this.m_oDataRepository.numberOfMediumPriorityActivities(mecNumber);
        int nHighPrio = 1;//this.m_oDataRepository.numberOfHighPriorityActivities(mecNumber);
        return nPending + ";" + nExpired + ";" + nNearExpired + ";" + nLowPrio +
                ";" + nMidPrio + ";" + nHighPrio;
    }

    public String prepareFluxDataMock(String oMecanographicNumber) {
        return "5;3;5;2;1;1";
    }

}

