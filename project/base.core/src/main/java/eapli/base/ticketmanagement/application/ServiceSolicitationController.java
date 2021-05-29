package eapli.base.ticketmanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.ticketmanagement.domain.*;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ServiceSolicitationController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TicketRepository m_oTicketRepo = PersistenceContext.repositories().tickets();
    private final CatalogueRepository m_oCatRepo = PersistenceContext.repositories().catalogues();
    private final ServiceRepository m_oServRepo = PersistenceContext.repositories().services();
    private final List<TicketResponse> m_lstResponses = new ArrayList<>();
    private final List<TicketFile> m_lstFiles = new ArrayList<>();

    public Iterable<Catalogue> getCataloguesByUser(){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oCatRepo.findByUser(this.m_oAuthz.session().get().authenticatedUser());
    }

    public Iterable<Service> getServicesByCatalogue(Catalogue oCatalogue){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oServRepo.findByCatalogue(oCatalogue);
    }

    public List<TicketUrgency> showUrgencies() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return Arrays.asList(TicketUrgency.values());
    }

    public TicketResponse addResponse(String strResponse){
        TicketResponse oResponse = new TicketResponse(strResponse);
        this.m_lstResponses.add(oResponse);
        return oResponse;
    }

    public TicketFile addFile(String strFile){
        TicketFile oFile = new TicketFile(strFile);
        this.m_lstFiles.add(oFile);
        return oFile;
    }

    public Ticket addTicket(Service oService, String strUrgency, LocalDateTime dtLimitDate, LocalDateTime dtCreationDate){
        return new Ticket(TicketUrgency.stringToTicketUrgency(strUrgency),
                new TicketLimitDate(dtLimitDate), new TicketCreationDate(dtCreationDate) ,this.m_lstResponses, this.m_lstFiles, oService);
    }

    public Ticket saveTicket(Ticket oTicket){
        return m_oTicketRepo.save(oTicket);
    }

}
