package eapli.base.net.activityflux.application;

import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ActivityFlowController {

    private final FluxDataService m_oFluxDataService = new FluxDataService();

    //TODO: Remove Mock
    public String prepareFluxData(String oMecanographicNumber) {
        return m_oFluxDataService.prepareFluxDataMock(oMecanographicNumber);
    }

}
