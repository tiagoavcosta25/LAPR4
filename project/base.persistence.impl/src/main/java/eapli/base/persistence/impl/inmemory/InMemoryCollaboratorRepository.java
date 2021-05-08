package eapli.base.persistence.impl.inmemory;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class InMemoryCollaboratorRepository
        extends InMemoryDomainRepository<Collaborator, CollaboratorMechanographicNumber>
        implements CollaboratorRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Collaborator> findByUsername(Username name) {
        return matchOne(e -> e.user().username().equals(name));
    }

    @Override
    public Optional<Collaborator> findByMecanographicNumber(CollaboratorMechanographicNumber number) {
        return Optional.of(data().get(number));
    }

    @Override
    public Iterable<Collaborator> findAllActive() {
        return match(e -> e.user().isActive());
    }
}
