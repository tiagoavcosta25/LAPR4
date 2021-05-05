package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * Created by nuno on 21/03/16.
 */
public class JpaRepositoryFactory implements RepositoryFactory {

	@Override
	public UserRepository users(final TransactionalContext autoTx) {
		return new JpaAutoTxUserRepository(autoTx);
	}

	@Override
	public UserRepository users() {
		return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
				Application.settings().getExtendedPersistenceProperties());
	}


	@Override
	public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
		return new JpaClientUserRepository(autoTx);
	}

	@Override
	public JpaClientUserRepository clientUsers() {
		return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
		return new JpaSignupRequestRepository(autoTx);
	}

	@Override
	public SignupRequestRepository signupRequests() {
		return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
	}


	@Override
	public TransactionalContext newTransactionalContext() {
		return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
				Application.settings().getExtendedPersistenceProperties());
	}

	@Override
	public JpaFormRepository forms(final TransactionalContext autoTx) {
		return new JpaFormRepository(autoTx);
	}

	@Override
	public JpaFormRepository forms() {
		return new JpaFormRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public JpaServiceRepository services(final TransactionalContext autoTx) {
		return new JpaServiceRepository(autoTx);
	}

	@Override
	public JpaServiceRepository services() {
		return new JpaServiceRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public JpaServiceDraftRepository serviceDrafts(final TransactionalContext autoTx) {
		return new JpaServiceDraftRepository(autoTx);
	}

	@Override
	public JpaServiceDraftRepository serviceDrafts() {
		return new JpaServiceDraftRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public JpaCollaboratorRepository colaborators(final TransactionalContext autoTx) {
		return new JpaCollaboratorRepository(autoTx);
	}

	@Override
	public JpaCollaboratorRepository colaborators() {
		return new JpaCollaboratorRepository(Application.settings().getPersistenceUnitName());
	}

}
