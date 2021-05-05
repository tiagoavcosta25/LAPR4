package eapli.base.formulariomanagement.repositories;

import eapli.base.formulariomanagement.domain.Form;
import eapli.base.formulariomanagement.domain.FormID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface FormRepository
        extends DomainRepository<FormID, Form> {

    /**
     * returns the form with the given id
     *
     * @param oID
     * @return
     */
    default Optional<Form> findByID(FormID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Form> findAllActive();
}
