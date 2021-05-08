/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
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
        List<Integer> lstOp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<String> lstField = new ArrayList<>(Arrays.asList("Mouse Repair", "Repairing a Mouse Product",
                "Finding the problem on a product, mainly a mouse, that the customer has", "", "48"));
        List<String> lstKeywords = new ArrayList<>(Arrays.asList("Repair", "Customer Service", "Approval"));
        draftField(5, lstOp, lstField, lstKeywords);

        List<String> lstField2 = new ArrayList<>(Arrays.asList("Internet Problems", "Fixing Internet Problems",
                "Fixing Internet Problems that arise", "", "24"));
        List<String> lstKeywords2 = new ArrayList<>(Arrays.asList("Fix", "Internet"));
        draftField(5, lstOp, lstField2, lstKeywords2);
        return true;
    }

    private ServiceDraft draftField(Integer intLength,  List<Integer> lstOp,  List<String> lstField,  List<String> lstKeywords) {
        ServiceDraft oServiceDraft = null;
        try {
            oServiceDraft = this.m_oCtrl.newDraft();

            for(int i = 0; i < intLength; i++){
                addField(oServiceDraft, lstOp.get(i), lstField.get(i), lstKeywords);
            }

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
