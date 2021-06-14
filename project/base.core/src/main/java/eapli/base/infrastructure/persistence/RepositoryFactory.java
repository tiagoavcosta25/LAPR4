/**
 *
 */
package eapli.base.infrastructure.persistence;

import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.activityfluxmanagement.specification.repositories.ActivityFluxRepository;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;

import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.formmanagement.repositories.FormRepository;
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

/**
 * @author Paulo Gandra Sousa
 *
 */
public interface RepositoryFactory {

	/**
	 * factory method to create a transactional context to use in the repositories
	 *
	 * @return
	 */
	TransactionalContext newTransactionalContext();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	UserRepository users(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	UserRepository users();

	/**
	 *
	 * @param autoTx the transactional context to enroll
	 * @return
	 */
	ClientUserRepository clientUsers(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ClientUserRepository clientUsers();

	/**
	 *
	 * @param autoTx the transactional context to enroll
	 * @return
	 */
	SignupRequestRepository signupRequests(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	SignupRequestRepository signupRequests();


	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ServiceRepository services();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	ServiceDraftRepository serviceDrafts(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ServiceDraftRepository serviceDrafts();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	FormRepository forms(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	FormRepository forms();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	ActivityFluxRepository fluxes(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ActivityFluxRepository fluxes();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	ActivityFluxExecutionRepository fluxExecs(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ActivityFluxExecutionRepository fluxExecs();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	ResponseRepository responses(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ResponseRepository responses();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	TaskRepository tasks();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	CollaboratorRepository collaborators(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	CollaboratorRepository collaborators();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	CatalogueRepository catalogues();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	TeamRepository teams(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	TeamRepository teams();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	TicketRepository tickets();

	TeamTypeRepository teamTypes(TransactionalContext autoTx);
	TeamTypeRepository teamTypes();

	DataRepository data();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	TaskExecutionRepository taskExecs(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	TaskExecutionRepository taskExecs();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	ManualTaskRepository manualTask(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ManualTaskRepository manualTask();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	AutomaticTaskRepository automaticTask();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ManualTaskExecutionRepository manualTaskExec();

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	AutomaticTaskExecutionRepository automaticTaskExec();


}