package eapli.base.persistence.impl.jpa;

import eapli.base.util.Application;
import eapli.base.teamtypemanagement.domain.TeamType;
import eapli.base.teamtypemanagement.domain.TeamTypeId;
import eapli.base.teamtypemanagement.repositories.TeamTypeRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
public final class JpaTeamTypeRepository
    extends JpaAutoTxRepository<TeamType, TeamTypeId, TeamTypeId>
    implements TeamTypeRepository
{
    public JpaTeamTypeRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaTeamTypeRepository(final String unitName) {
        super(unitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public Optional<TeamType> findById(final TeamTypeId id) {
        final Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return matchOne("e.id=:id", params);
    }
}