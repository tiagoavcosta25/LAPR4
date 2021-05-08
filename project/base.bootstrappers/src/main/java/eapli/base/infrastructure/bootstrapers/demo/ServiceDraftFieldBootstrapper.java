/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.infrastructure.bootstrapers.TestDataConstants;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.Keyword;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Paulo Sousa
 */
public class ServiceDraftFieldBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ServiceDraftFieldBootstrapper.class);

    private final ServiceDraftSpecificationController m_oCtrl = new ServiceDraftSpecificationController();

    @Override
    public boolean execute() {
        draftField(-1l, 1, "Mouse Repair", null);
        draftField(1l, 2, "Repairing a Mouse Product", null);
        draftField(1l, 2, "Finding the problem on a product, mainly a mouse, that the customer has", null);
        draftField(1l, 4, null, new ArrayList<>(Arrays.asList("Repair", "Customer Service", "Approval")));
        draftField(1l, 5, "48", null);
        draftField(-1l, 1, "Internet Problems", null);
        draftField(2l, 2, "Fixing Internet Problems", null);
        draftField(2l, 2, "Fixing Internet Problems that arise", null);
        draftField(2l, 4, null, new ArrayList<>(Arrays.asList("Fix", "Internet")));
        draftField(2l, 5, "24", null);
        return true;
    }

    private ServiceDraft draftField(final Long lngDraftId, Integer intOp, String strField, List<String> lstKeywords) {
        ServiceDraft oServiceDraft = null;
        try {
            if(lngDraftId == -1l) {
                //oServiceDraft = this.m_oCtrl.getServiceDraftById(lngDraftId); TODO
            } else {
                oServiceDraft = this.m_oCtrl.newDraft();
            }

            addField(oServiceDraft, intOp, strField, lstKeywords);

            oServiceDraft = this.m_oCtrl.saveServiceDraft();
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oServiceDraft;
    }

    private void addField(ServiceDraft oServiceDraft, Integer intOp, String strField, List<String> lstKeywords){
        switch (intOp)
        {
            case 1:
                this.m_oCtrl.addTitle(oServiceDraft, strField);
                break;
            case 2:
                this.m_oCtrl.addBriefDescription(oServiceDraft, strField);
                break;
            case 3:
                this.m_oCtrl.addCompleteDescription(oServiceDraft, strField);
                break;
            case 4:
                this.m_oCtrl.addKeywordList(oServiceDraft, lstKeywords);
                break;
            case 5:
                this.m_oCtrl.addFeedback(oServiceDraft, Double.parseDouble(strField));
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
