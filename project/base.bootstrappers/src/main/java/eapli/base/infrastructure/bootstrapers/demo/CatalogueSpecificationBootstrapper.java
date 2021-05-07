/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;
import eapli.base.cataloguemanagement.application.CatalogueSpecificationController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
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
public class CatalogueSpecificationBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CatalogueSpecificationBootstrapper.class);

    private final CatalogueSpecificationController m_oCtrl = new CatalogueSpecificationController();

    @Override
    public boolean execute() {
        specifyCatalogue("Repair Catalogue",
                "Catalogue containing all the Repair Services.",
                "This Catalogue contains all the Repair Services presented in the app.",
                123456l, new ArrayList<>(Arrays.asList(TeamID.valueOf("1"))));
        specifyCatalogue("HR Catalogue",
                "Catalogue containing all the HR Services.",
                "This Catalogue contains all the HR Services presented in the app.",
                654321l, new ArrayList<>(Arrays.asList(TeamID.valueOf("2"))));
        return true;
    }

    private Catalogue specifyCatalogue(final String strTitle, final String strBriefDescription,
                                     final String strCompleteDescription,
                                       Long lngCollabID, List<TeamID> lstTeamIDs) {
        Catalogue oCatalogue = null;
        try {
            Collaborator oCollaborator = null;
            for(Collaborator c : this.m_oCtrl.getCollaborators()){
                    if(c.hasMecNumber(CollaboratorMechanographicNumber.valueOf(lngCollabID))){
                        oCollaborator = c;
                        break;
                    }
            }

            Set<Team> setTeams = new HashSet<>();
            for(Team t : this.m_oCtrl.getTeams()){
                for(int i = 0; i < lstTeamIDs.size(); i++){
                    if(t.hasID(lstTeamIDs.get(i))){
                        setTeams.add(t);
                        i++;
                        break;
                    }
                }
            }
            this.m_oCtrl.createCatalog(strTitle, strBriefDescription, strCompleteDescription, oCollaborator, setTeams);
            oCatalogue = this.m_oCtrl.saveCatalogue();
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oCatalogue;
    }
}
