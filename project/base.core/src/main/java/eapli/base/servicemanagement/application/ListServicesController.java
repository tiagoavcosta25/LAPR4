package eapli.base.servicemanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.application.UseCaseController;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@UseCaseController
public class ListServicesController {
   private final ListServicesService listServicesService = new ListServicesService();

    public Iterable<Service> getServices() {
        return listServicesService.allServices();
    }
}
