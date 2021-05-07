/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.*;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class TeamCreatorBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            TeamCreatorBootstrapper.class);

    private final TeamCreatorController m_oCtrl = new TeamCreatorController();

    @Override
    public boolean execute() {
        List<Long> setColabsID = new ArrayList<>();
        setColabsID.add(123456l);
        setColabsID.add(987654l);
        createTeam("1", TeamType.TYPE_FIRE, "TM1", "Team 1", setColabsID);
        setColabsID.clear();
        setColabsID.add(564821l);
        createTeam("2", TeamType.TYPE_FIRE, "TM2", "Team 2", setColabsID);
        return true;
    }

    private Team createTeam(String strID, TeamType enumTeamType, String strAcronym, String strTeamDescription,
                                    List<Long> listCollabID) {
        Team oTeam = null;
        try {
            Set<Collaborator> setCollab = new HashSet<>();
            for(Collaborator c : this.m_oCtrl.getCollaborators()){
                for(int i = 0; i < listCollabID.size(); i++){
                    if(c.hasMecNumber(CollaboratorMechanographicNumber.valueOf(listCollabID.get(i)))){
                        setCollab.add(c);
                        break;
                    }
                }
            }
            oTeam = this.m_oCtrl.createTeam(TeamID.valueOf(strID), enumTeamType, Acronym.valueOf(strAcronym),
                    TeamDescription.valueOf(strTeamDescription), setCollab);

        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Creating Team.");
        }
        return oTeam;
    }
}
