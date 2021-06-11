package eapli.base.persistence.impl.inmemory;

import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryTeamRepository extends InMemoryDomainRepository<Team, TeamID>
        implements TeamRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Team> findById(TeamID oID) {
        return matchOne(team -> team.identity().equals(oID));
    }
}
