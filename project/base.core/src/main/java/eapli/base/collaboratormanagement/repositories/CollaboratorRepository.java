package eapli.base.collaboratormanagement.repositories;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public interface CollaboratorRepository
        extends DomainRepository<CollaboratorID, Collaborator> {

    /**
     * returns the collaborator with the given ID
     *
     * @param oID
     * @return
     */
    default Optional<Collaborator> findByID(CollaboratorID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Collaborator> findAllActive();

    List<Collaborator> all();
}
