package eapli.base.persistence.impl.jpa;

import eapli.base.util.Application;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaTeamRepository extends JpaAutoTxRepository<Team, TeamID, TeamID>
    implements TeamRepository {

    public JpaTeamRepository(final TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaTeamRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "m_oID");
    }

    @Override
    public Optional<Team> findById(TeamID oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }
}
