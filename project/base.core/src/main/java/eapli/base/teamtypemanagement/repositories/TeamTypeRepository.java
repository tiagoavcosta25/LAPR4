package eapli.base.teamtypemanagement.repositories;

import eapli.base.teamtypemanagement.domain.TeamType;
import eapli.base.teamtypemanagement.domain.TeamTypeId;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
public interface TeamTypeRepository extends DomainRepository<TeamTypeId, TeamType> {
    /**
     * Finds the team type with the given ID.
     * @param id the ID of the team type
     * @return the team type
     */
    default Optional<TeamType> findById(TeamTypeId id) {
        return ofIdentity(id);
    }
}
