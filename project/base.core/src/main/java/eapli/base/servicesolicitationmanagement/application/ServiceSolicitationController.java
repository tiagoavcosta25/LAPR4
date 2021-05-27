package eapli.base.servicesolicitationmanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.servicesolicitationmanagement.domain.*;
import eapli.base.servicesolicitationmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ServiceSolicitationController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TicketRepository m_oTicketRepo = PersistenceContext.repositories().tickets();
    private final CatalogueRepository m_oCatRepo = PersistenceContext.repositories().catalogues();
    private final ServiceRepository m_oServRepo = PersistenceContext.repositories().services();

    public Iterable<Catalogue> getCataloguesByUser(){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oCatRepo.findByUser(this.m_oAuthz.session().get().authenticatedUser());
    }

    public Iterable<Service> getServicesByCatalogue(Catalogue oCatalogue){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oServRepo.findByCatalogue(oCatalogue);
    }

    public TicketResponse addResponse(String strResponse){
        return new TicketResponse(strResponse);
    }

    public Ticket addTicket(Service oService, TicketUrgency oUrgency, TicketLimitDate dtLimitDate,
                            List<TicketResponse> ltsResponses, List<TicketFile> ltsFiles){
        return new Ticket(oUrgency, dtLimitDate,ltsResponses, ltsFiles, oService);
    }

    public Ticket saveTicket(Ticket oTicket){
        return m_oTicketRepo.save(oTicket);
    }

}
