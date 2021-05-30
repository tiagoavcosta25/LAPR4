package eapli.base.taskmanagement.application;

import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ExecuteAutomaticTaskController {

    private final ExecuteAutomaticTaskService executeAutomaticTaskService = new ExecuteAutomaticTaskService();

    public boolean executeAutomaticTaskMock(String filePath) {
        return executeAutomaticTaskService.executeAutomaticTaskMock(filePath, true);
    }

}
