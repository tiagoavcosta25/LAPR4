package eapli.base.ticketmanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SearchTicketsController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TicketRepository m_oTicketRepo = PersistenceContext.repositories().tickets();

    public Iterable<Ticket> getTicketHistory(){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER, BaseRoles.COLLABORATOR);
        return this.m_oTicketRepo.getTicketHistory(this.m_oAuthz.session().get().authenticatedUser());
    }

    public Iterable<Ticket> getOnGoingTickets(){
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER, BaseRoles.COLLABORATOR);
        return this.m_oTicketRepo.getOnGoingTickets(this.m_oAuthz.session().get().authenticatedUser());
    }
}
