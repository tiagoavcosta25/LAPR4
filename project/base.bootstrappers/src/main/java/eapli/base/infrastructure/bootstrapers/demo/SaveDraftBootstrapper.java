/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
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
        saveDraft();
        return true;
    }

    private Service saveDraft() {
        Service oService = null;
        try {
            Iterable<ServiceDraft> itServiceDrafts = this.m_oCtrl.getDrafts();
            ServiceDraft oServiceDraft = itServiceDrafts.iterator().next();
            Catalogue oCatalogue = this.m_oCtrl.getCatalogues().iterator().next();
            oService = this.m_oCtrl.saveService(oServiceDraft, oCatalogue);
        } catch (final Exception e) {
            LOGGER.error("Error Saving the Service.");
        }
        return oService;
    }
}
