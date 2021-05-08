package eapli.base.formmanagement.repositories;

import eapli.base.formmanagement.domain.Form;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface FormRepository
        extends DomainRepository<Long, Form> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Form> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
