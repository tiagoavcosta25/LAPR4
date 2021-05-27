package eapli.base.taskmanagement.application;

import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.base.taskmanagement.domain.TaskOrderFields;
import eapli.framework.application.UseCaseController;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ConsultAssignedPendingTasksController {

    private final ListTaskFilterFieldsService listTaskFilterFieldsService = new ListTaskFilterFieldsService();
    private final ListTaskOrderFieldsService listTaskOrderFieldsService = new ListTaskOrderFieldsService();

    public Iterable<TaskFilterFields> getTaskFilterFields() {
        return listTaskFilterFieldsService.getTaskFilterFields();
    }

    public Iterable<TaskOrderFields> getTaskOrderFields() {
        return listTaskOrderFieldsService.getTaskOrderFields();
    }
}
