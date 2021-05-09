package eapli.base.persistence.impl.inmemory;

import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.teamtypemanagement.repositories.TeamTypeRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.InMemoryUserRepository;

/**
 *
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

	static {
		// only needed because of the in memory persistence
		new BaseBootstrapper().execute();
	}

	@Override
	public UserRepository users(final TransactionalContext tx) {
		return new InMemoryUserRepository();
	}

	@Override
	public UserRepository users() {
		return users(null);
	}


	@Override
	public ClientUserRepository clientUsers(final TransactionalContext tx) {

		return new InMemoryClientUserRepository();
	}

	@Override
	public ClientUserRepository clientUsers() {
		return clientUsers(null);
	}

	@Override
	public SignupRequestRepository signupRequests() {
		return signupRequests(null);
	}

	@Override
	public ServiceRepository services(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public ServiceRepository services() {
		return services(null);
	}

	@Override
	public ServiceDraftRepository serviceDrafts(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public ServiceDraftRepository serviceDrafts() {
		return serviceDrafts(null);
	}

	@Override
	public FormRepository forms(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public FormRepository forms() {
		return forms(null);
	}

	@Override
	public CollaboratorRepository collaborators(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public CollaboratorRepository collaborators() {
		return collaborators(null);
	}


	@Override
	public CatalogueRepository catalogues() {
		return catalogues();
	}

	@Override
	public TeamRepository teams(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public TeamRepository teams() {
		return teams(null);
	}

	@Override
	public TeamTypeRepository teamTypes(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public TeamTypeRepository teamTypes() {
		return teamTypes(null);
	}

	@Override
	public SignupRequestRepository signupRequests(final TransactionalContext tx) {
		return new InMemorySignupRequestRepository();
	}


	@Override
	public TransactionalContext newTransactionalContext() {
		// in memory does not support transactions...
		return null;
	}

}
