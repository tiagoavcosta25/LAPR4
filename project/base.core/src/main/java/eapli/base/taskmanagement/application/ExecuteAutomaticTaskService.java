package eapli.base.taskmanagement.application;

import eapli.framework.application.ApplicationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class ExecuteAutomaticTaskService {

    private static final Logger LOGGER = LogManager.getLogger(ExecuteAutomaticTaskController.class);

    public boolean executeAutomaticTaskMock(String filePath, boolean result) {
        LOGGER.info("Executing script {} ...", filePath);
        return result;
    }
}
