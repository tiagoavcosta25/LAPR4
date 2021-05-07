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
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        saveDraft(1l, CatalogueID.valueOf("1"));
        saveDraft(2l, CatalogueID.valueOf("1"));
        saveDraft(3l, CatalogueID.valueOf("1"));
        saveDraft(4l, CatalogueID.valueOf("1"));
        return true;
    }

    private Service saveDraft(final Long lngDraftId, final CatalogueID oCatalogueId) {
        Service oService = null;
        try {
            this.m_oCtrl.getServiceDraftById(lngDraftId);
            Catalogue oCatalogue = null;
            for(Catalogue c : this.m_oCtrl.getCatalogues()){
                if(c.hasID(oCatalogueId)){
                    oCatalogue = c;
                    break;
                }
            }
            oService = this.m_oCtrl.saveService(oCatalogue);
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oService;
    }
}
