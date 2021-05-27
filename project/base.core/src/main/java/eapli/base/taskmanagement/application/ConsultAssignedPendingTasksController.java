package eapli.base.taskmanagement.application;

import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.framework.application.UseCaseController;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ConsultAssignedPendingTasksController {

    private final ListTaskFilterFieldsService listTaskFilterFieldsService = new ListTaskFilterFieldsService();

    public Iterable<TaskFilterFields> getTaskFilterFields() {
        return listTaskFilterFieldsService.getTaskFilterFields();
    }
}
