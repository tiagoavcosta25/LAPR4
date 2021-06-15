package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.activityfluxmanagement.specification.repositories.ActivityFluxRepository;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.specification.repositories.ManualTaskRepository;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
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
	public ServiceRepository services() {
		return services();
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
	public ActivityFluxRepository fluxes() {
		return fluxes(null);
	}

	@Override
	public ActivityFluxRepository fluxes(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public ActivityFluxExecutionRepository fluxExecs() {
		return fluxExecs(null);
	}

	@Override
	public ActivityFluxExecutionRepository fluxExecs(TransactionalContext autoTx) {
		return new InMemoryActivityFluxExecutionRepository();
	}

	@Override
	public ResponseRepository responses() {
		return responses(null);
	}

	@Override
	public ResponseRepository responses(TransactionalContext autoTx) {
		return null;
	}

	@Override
	public TaskRepository tasks() {
		return new InMemoryTaskRepository();
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
		return new InMemoryTeamRepository();
	}

	@Override
	public TeamRepository teams() {
		return teams(null);
	}

	@Override
	public TicketRepository tickets() {
		return tickets();
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
	public DataRepository data() {
		return new InMemoryDataRepository();
	}

	@Override
	public TaskExecutionRepository taskExecs(TransactionalContext autoTx) {
		return new InMemoryTaskExecutionRepository();
	}

	@Override
	public TaskExecutionRepository taskExecs() {
		return taskExecs(null);
	}

	@Override
	public ManualTaskRepository manualTask(TransactionalContext autoTx) {
		return new InMemoryManualTaskRepository();
	}

	@Override
	public ManualTaskRepository manualTask() {
		return manualTask(null);
	}

	@Override
	public AutomaticTaskRepository automaticTask() {
		return new InMemoryAutomaticTaskRepository();
	}

	@Override
	public ManualTaskExecutionRepository manualTaskExec() {
		return new InMemoryManualTaskExecutionRepository();
	}

	@Override
	public AutomaticTaskExecutionRepository automaticTaskExec() {
		return new InMemoryAutomaticTaskExecutionRepository();
	}


	@Override
	public TransactionalContext newTransactionalContext() {
		// in memory does not support transactions...
		return null;
	}

}
