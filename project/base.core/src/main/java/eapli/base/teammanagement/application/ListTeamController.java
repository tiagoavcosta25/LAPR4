package eapli.base.teammanagement.application;

import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.framework.application.UseCaseController;

import java.util.Optional;

/**
 *
 * Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ListTeamController {

    private final ListTeamService m_oListTeamService = new ListTeamService();

    public Iterable<Team> getTeams() {
        return this.m_oListTeamService.getTeams();
    }

    public Optional<Team> findByID(final TeamID oID) {
        return m_oListTeamService.findByID(oID);
    }
}
