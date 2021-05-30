package eapli.base.persistence.impl.jpa;

import eapli.base.util.Application;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author JÃ©ssica Alves 1190682@isep.ipp.pt
 */
class JpaCollaboratorRepository
        extends JpaAutoTxRepository<Collaborator, CollaboratorMechanographicNumber, CollaboratorMechanographicNumber>
        implements CollaboratorRepository {

    public JpaCollaboratorRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaCollaboratorRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<Collaborator> findByMecanographicNumber(CollaboratorMechanographicNumber oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public Optional<Collaborator> findByUsername(Username name) {
        final Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        return matchOne("e.m_oSystemUser.username=:name", params);
    }

    @Override
    public Iterable<Collaborator> findAllActive() {
        return match("e.systemUser.active = true");
    }
}