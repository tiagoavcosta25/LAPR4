/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueID;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.infrastructure.bootstrapers.TestDataConstants;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            SaveDraftBootstrapper.class);

    private final SaveDraftController m_oCtrl = new SaveDraftController();

    @Override
    public boolean execute() {
        saveDraft(1);
        saveDraft(2);
        return true;
    }

    private Service saveDraft(Integer intOp) {
        Service oService = null;
        try {
            Iterable<ServiceDraft> itServiceDrafts = this.m_oCtrl.getDrafts();
            for(int i = 0; i < intOp - 1; i++){
                itServiceDrafts.iterator().next();
            }
            ServiceDraft oServiceDraft = itServiceDrafts.iterator().next();
            //Catalogue oCatalogue = this.m_oCtrl.getCatalogueById(lngCatalogueId); //TODO
            oService = this.m_oCtrl.saveService(oServiceDraft, null);
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oService;
    }
}
