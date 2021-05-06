package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.colaboradormanagement.domain.Collaborator;
import eapli.base.colaboradormanagement.domain.CollaboratorID;
import eapli.base.colaboradormanagement.repositories.CollaboratorRepository;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceID;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
class JpaCollaboratorRepository
        extends JpaAutoTxRepository<Collaborator, CollaboratorID, CollaboratorID>
        implements CollaboratorRepository {

    public JpaCollaboratorRepository(TransactionalContext autoTx) {
        super(autoTx, "m_oID");
    }

    public JpaCollaboratorRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "m_oID");
    }

    @Override
    public Optional<Collaborator> findById(CollaboratorID oID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("m_oID", oID);
        return matchOne("e.id=:m_oID", params);
    }

    @Override
    public Iterable<Collaborator> findAllActive() {
        return match("e.systemUser.active = true");
    }
}