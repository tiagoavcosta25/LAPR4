package eapli.base.teammanagement.repositories;

import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface TeamRepository
        extends DomainRepository<TeamID, Team> {

    /**
     * returns the Team with the given ID
     *
     * @param oID
     * @return
     */
    default Optional<Team> findByID(TeamID oID) {
        return ofIdentity(oID);
    }
}
