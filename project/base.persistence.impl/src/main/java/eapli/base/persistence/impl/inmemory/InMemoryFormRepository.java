package eapli.base.persistence.impl.inmemory;

import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryFormRepository
        extends InMemoryDomainRepository<Form, Long>
        implements FormRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Form> findById(Long number) {
        return Optional.of(data().get(number));
    }
}
