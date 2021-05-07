/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueID;
import eapli.base.collaboratormanagement.application.CollaboratorSpecificationController;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class CollaboratorSpecificationBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CollaboratorSpecificationBootstrapper.class);

    private final CollaboratorSpecificationController m_oCtrl = new CollaboratorSpecificationController();

    @Override
    public boolean execute() {
        saveDraft(1l, CatalogueID.valueOf("1"));
        saveDraft(2l, CatalogueID.valueOf("1"));
        saveDraft(3l, CatalogueID.valueOf("1"));
        saveDraft(4l, CatalogueID.valueOf("1"));
        return true;
    }

    private Service specifyCollaborator(String strEmail, String strFirstName, String strLastName,
                                        String strCompleteName, String strMechanographicNumber, String strAddress,
                                        Double dblPhoneNumber, Date dtBirthDate, Set<Role> setRoles) {
        Service oService = null;
        try {
            this.m_oCtrl.addCollaborator(strEmail, strFirstName, strLastName, strCompleteName, strMechanographicNumber, strAddress, dblPhoneNumber, dtBirthDate);
            this.m_oCtrl.addRoles(setRoles);
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oService;
    }
}
