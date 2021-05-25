package eapli.base.persistence.impl.jpa;

import eapli.base.util.Application;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaTransactionalRepository;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class HelpDeskJpaRepositoryBase<T, K, I> extends JpaTransactionalRepository<T, K, I> {

    HelpDeskJpaRepositoryBase(final String persistenceUnitName, final String identityFieldName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(),
                identityFieldName);
    }

    HelpDeskJpaRepositoryBase(final String identityFieldName) {
        super(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties(), identityFieldName);
    }
}
