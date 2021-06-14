package base.server.fluxmotor.application;

import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ActivityFlowController {

    private final FluxDataService m_oFluxDataService = new FluxDataService();
    
    public String prepareFluxData(String oUserName) {
        return m_oFluxDataService.prepareFluxData(oUserName);
    }

}
