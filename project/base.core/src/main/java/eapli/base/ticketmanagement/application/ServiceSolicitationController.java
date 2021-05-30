package eapli.base.ticketmanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.ticketmanagement.domain.*;
import eapli.base.ticketmanagement.repository.ResponseRepository;
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
    private final ResponseRepository m_oRespRepo = PersistenceContext.repositories().responses();
    private final List<String> m_lstAnswer = new ArrayList<>();
    private final List<Response> m_lstResponses = new ArrayList<>();
    private final List<TicketFile> m_lstFiles = new ArrayList<>();

    public Iterable<Catalogue> getCataloguesByUser(){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER, BaseRoles.COLLABORATOR);
        return m_oCatRepo.findByUser(this.m_oAuthz.session().get().authenticatedUser());
    }

    public Iterable<Service> getServicesByCatalogue(Catalogue oCatalogue){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER, BaseRoles.COLLABORATOR);
        return m_oServRepo.findByCatalogue(oCatalogue);
    }

    public List<TicketUrgency> showUrgencies() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER, BaseRoles.COLLABORATOR);
        return Arrays.asList(TicketUrgency.values());
    }

    public String addResponse(String strResponse){
        this.m_lstAnswer.add(strResponse);
        return strResponse;
    }

    public Response createResponse(Form oForm){
        List<String> lstResp = new ArrayList<>(this.m_lstAnswer);
        Response oResponse = new Response(oForm, lstResp);
        oResponse = this.m_oRespRepo.save(oResponse);
        this.m_lstResponses.add(oResponse);
        this.m_lstAnswer.clear();
        return oResponse;
    }

    public TicketFile addFile(String strFile){
        TicketFile oFile = new TicketFile(strFile);
        this.m_lstFiles.add(oFile);
        return oFile;
    }

    public Ticket addTicket(Service oService, String strUrgency, LocalDateTime dtLimitDate, LocalDateTime dtCreationDate){

        return new Ticket(TicketUrgency.stringToTicketUrgency(strUrgency),
                new TicketLimitDate(dtLimitDate), new TicketCreationDate(dtCreationDate), this.m_lstResponses, this.m_lstFiles, oService);
    }

    public Ticket saveTicket(Ticket oTicket){
        return m_oTicketRepo.save(oTicket);
    }

}
