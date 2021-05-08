package eapli.base.collaboratormanagement.repositories;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public interface CollaboratorRepository
        extends DomainRepository<CollaboratorMechanographicNumber, Collaborator> {

    /**
     * returns the collaborator with the given Mecanographic Number
     *
     * @param number
     * @return
     */
    default Optional<Collaborator> findByMecanographicNumber(CollaboratorMechanographicNumber number) {
        return ofIdentity(number);
    }

    Optional<Collaborator> findByUsername(Username name);

    public Iterable<Collaborator> findAllActive();

}
