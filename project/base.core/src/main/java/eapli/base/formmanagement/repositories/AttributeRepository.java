package eapli.base.formmanagement.repositories;

import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface AttributeRepository
        extends DomainRepository<Long, Attribute> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Attribute> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

    public Iterable<Attribute> findAllActive();
}
