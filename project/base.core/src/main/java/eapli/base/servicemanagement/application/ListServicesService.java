package eapli.base.servicemanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.teammanagement.domain.Team;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class ListServicesService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ServiceRepository serviceRepository = PersistenceContext.repositories().services();

    public Iterable<Service> allServices() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN, BaseRoles.HS_MANAGER);

        return this.serviceRepository.findAll();
    }
}
