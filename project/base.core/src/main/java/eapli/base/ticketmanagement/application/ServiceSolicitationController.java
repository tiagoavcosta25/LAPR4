package eapli.base.ticketmanagement.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.ticketmanagement.domain.*;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.util.Application;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.io.IOException;
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
    private final CollaboratorRepository m_oCollabRepo = PersistenceContext.repositories().collaborators();
    private final ServiceRepository m_oServRepo = PersistenceContext.repositories().services();
    private final ResponseRepository m_oRespRepo = PersistenceContext.repositories().responses();
    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private final List<String> m_lstAnswer = new ArrayList<>();
    private final List<Response> m_lstResponses = new ArrayList<>();
    private final List<TicketFile> m_lstFiles = new ArrayList<>();
    private ServiceSolicitationService m_oServiceSolicitationService = new ServiceSolicitationService();

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

    public Response createResponse(Form oForm) throws IOException {
        Response oResponse = this.m_oServiceSolicitationService.createAndValidateResponse(oForm, this.m_lstAnswer);
        this.m_lstResponses.add(oResponse);
        this.m_lstAnswer.clear();
        return oResponse;
    }

    public TicketFile addFile(String strFileName) throws IOException {
        TicketFile oFile = new TicketFile(this.m_oServiceSolicitationService.getXMLContent(strFileName));
        this.m_lstFiles.add(oFile);
        return oFile;
    }

    public Ticket addTicket(Service oService, String strUrgency, LocalDateTime dtLimitDate, LocalDateTime dtCreationDate){

        Collaborator oCollaborator = this.m_oCollabRepo.findByUsername(this.m_oAuthz.session().get().authenticatedUser().username()).get().manager();

        ActivityFluxExecution oFlux = this.m_oServiceSolicitationService.createActivityFluxExecution(oService, oCollaborator);
        return new Ticket(TicketUrgency.stringToTicketUrgency(strUrgency),
                new TicketLimitDate(dtLimitDate), new TicketCreationDate(dtCreationDate), this.m_lstResponses, oFlux, this.m_lstFiles, oService,
                this.m_oCollaboratorRepo.findByUsername(this.m_oAuthz.session().get().authenticatedUser().username()).get());
    }

    public Ticket saveTicket(Ticket oTicket){
        oTicket = m_oTicketRepo.save(oTicket);

        ActivityFlowClient oClient = new ActivityFlowClient(Application.settings().getFluxServerIp());
        oClient.retrieveInformation(oTicket.executionFlux().id().toString(), SDP2021Code.FLUX_CREATION_REQUEST.getCode());

        return oTicket;
    }

}
