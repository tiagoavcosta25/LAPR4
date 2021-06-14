package eapli.base.persistence.impl.jpa;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.base.taskmanagement.specification.repositories.ManualTaskRepository;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.util.Application;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
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
	public JpaActivityFluxRepository fluxes(final TransactionalContext autoTx) {
		return new JpaActivityFluxRepository(autoTx);
	}

	@Override
	public JpaActivityFluxRepository fluxes() {
		return new JpaActivityFluxRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public JpaActivityFluxExecutionRepository fluxExecs(final TransactionalContext autoTx) {
		return new JpaActivityFluxExecutionRepository(autoTx);
	}

	@Override
	public JpaActivityFluxExecutionRepository fluxExecs() {
		return new JpaActivityFluxExecutionRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public TaskRepository tasks() {
		return new JpaTaskRepository();
	}

	@Override
	public JpaResponseRepository responses(final TransactionalContext autoTx) {
		return new JpaResponseRepository(autoTx);
	}

	@Override
	public JpaResponseRepository responses() {
		return new JpaResponseRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public TicketRepository tickets() {
		return new JpaTicketRepository();
	}

	@Override
	public CatalogueRepository catalogues() {
		return new JpaCatalogueRepository();
	}

	@Override
	public JpaServiceRepository services() {
		return new JpaServiceRepository();
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

	@Override
	public DataRepository data() {
		return new JpaDataRepository();
	}

	@Override
	public JpaTaskExecutionRepository taskExecs(TransactionalContext autoTx) {
		return new JpaTaskExecutionRepository(autoTx);
	}

	@Override
	public JpaTaskExecutionRepository taskExecs() {
		return new JpaTaskExecutionRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public ManualTaskRepository manualTask(TransactionalContext autoTx) {
		return new JpaManualTaskRepository(autoTx);
	}

	@Override
	public ManualTaskRepository manualTask() {
		return new JpaManualTaskRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public AutomaticTaskRepository automaticTask() {
		return new JpaAutomaticTaskRepository();
	}

	@Override
	public ManualTaskExecutionRepository manualTaskExec() {
		return new JpaManualTaskExecutionRepository();
	}

	@Override
	public AutomaticTaskExecutionRepository automaticTaskExec() {
		return new JpaAutomaticTaskExecutionRepository();
	}

}