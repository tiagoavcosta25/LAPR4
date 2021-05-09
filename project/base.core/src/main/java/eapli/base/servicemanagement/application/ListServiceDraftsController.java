package eapli.base.servicemanagement.application;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.application.UseCaseController;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@UseCaseController
public class ListServiceDraftsController {
   private final ListServiceDraftsService listServicesService = new ListServiceDraftsService();

    public Iterable<ServiceDraft> getDrafts() {
        return listServicesService.allDrafts();
    }
}
