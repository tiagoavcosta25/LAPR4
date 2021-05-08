package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.teamtypemanagement.repositories.TeamTypeRepository;
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
	public CatalogueRepository catalogues(TransactionalContext autoTx) {
		return new JpaCatalogueRepository(autoTx);
	}

	@Override
	public CatalogueRepository catalogues() {
		return new JpaCatalogueRepository(Application.settings().getPersistenceUnitName());
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
	public JpaCollaboratorRepository collaborators(final TransactionalContext autoTx) {
		return new JpaCollaboratorRepository(autoTx);
	}

	@Override
	public JpaCollaboratorRepository collaborators() {
		return new JpaCollaboratorRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public JpaTeamRepository teams(final TransactionalContext autoTx) {
		return new JpaTeamRepository(autoTx);
	}

	@Override
	public JpaTeamRepository teams() {
		return new JpaTeamRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public TeamTypeRepository teamTypes(final TransactionalContext autoTx) {
		return new JpaTeamTypeRepository(autoTx);
	}

	@Override
	public JpaTeamTypeRepository teamTypes() {
		return new JpaTeamTypeRepository(Application.settings().getPersistenceUnitName());
	}
}
