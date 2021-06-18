package base.server.autotaskexecutor.algorithms;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public interface ScriptQueue {
    void addScript(Long lngID, AutomaticTaskScript oScript);
}
