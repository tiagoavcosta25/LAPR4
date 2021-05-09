package eapli.base.servicemanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class ListServiceDraftsService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ServiceDraftRepository serviceDraftRepository = PersistenceContext.repositories().serviceDrafts();

    public Iterable<ServiceDraft> allDrafts() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN, BaseRoles.HS_MANAGER);

        return this.serviceDraftRepository.findAll();
    }
}
