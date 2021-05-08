package eapli.base.teammanagement.application;

import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ListTeamTypeController {

    private final ListTeamTypeService listTeamTypeService = new ListTeamTypeService();

    public Iterable<TeamType> getTeamTypes() {
        return this.listTeamTypeService.getTeamTypes();
    }
}
