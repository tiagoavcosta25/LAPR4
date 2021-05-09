/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.collaboratormanagement.application.AddCollabToTeamController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt e Jéssica Alves 1190682@isep.ipp.pt
 */
public class AddCollabToTeamBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            AddCollabToTeamBootstrapper.class);

    private final AddCollabToTeamController m_oCtrl = new AddCollabToTeamController();

    @Override
    public boolean execute() {
        addColabToTeam(123456l, "1");
        addColabToTeam(987654l, "2");
        return true;
    }

    private Collaborator addColabToTeam(Long lngMecNum, String strTeamID) {
        Collaborator oCollaborator = null;
        try {
            for(Collaborator c : this.m_oCtrl.getCollaborators()){
                    if(c.hasMecNumber(CollaboratorMechanographicNumber.valueOf(lngMecNum))){
                        oCollaborator = c;
                        break;
                }
            }

            Team oTeam = null;
            for(Team t : this.m_oCtrl.getTeams()){
                if(t.hasID(TeamID.valueOf(strTeamID))){
                    oTeam = t;
                    break;
                }
            }
            if(oCollaborator == null || oTeam == null ){
                throw new IllegalArgumentException();
            }

            this.m_oCtrl.addCollabToTeam(oCollaborator, oTeam);

        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Creating Team.");
        }
        return oCollaborator;
    }
}
