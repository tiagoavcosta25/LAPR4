package eapli.base.colaboradormanagement.repositories;

import eapli.base.colaboradormanagement.domain.Collaborator;
import eapli.base.colaboradormanagement.domain.CollaboratorID;
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
