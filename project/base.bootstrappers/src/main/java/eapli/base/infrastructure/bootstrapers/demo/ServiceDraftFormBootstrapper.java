/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.formulariomanagement.domain.*;
import eapli.base.infrastructure.bootstrapers.TestDataConstants;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 *
 * @author Paulo Sousa
 */
public class ServiceDraftFormBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ServiceDraftFormBootstrapper.class);

    private final ServiceDraftSpecificationController m_oCtrl = new ServiceDraftSpecificationController();

    @Override
    public boolean execute() {
        draftForm(1l, "Mouse Repair Form", FormType.SERVICE, 2, new ArrayList<>(Arrays.asList("Product_ID", "Customer_Name_Email")),
                new ArrayList<>(Arrays.asList("Product ID", "Customer Name Email")),
                new ArrayList<>(Arrays.asList("ID of the product", "Email referring to the customer")),
                new ArrayList<>(Arrays.asList("[0-9]+", "[a-zA-Z]+[0-9]*@[a-z].[a-z]")),
                new ArrayList<>(Arrays.asList("/scripts/script1.java", "/scripts/script2.java")),
                new ArrayList<>(Arrays.asList(DataType.INTEGER, DataType.STRING)));
        return true;
    }

    private ServiceDraft draftForm(final Long lngDraftId, String strFormName, FormType oFormType, Integer intNumAttributes,
                                    List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions, List<String> lstRegex,
                                    List<String> lstScripts, List<DataType> lstDataType) {
        ServiceDraft oServiceDraft = null;
        try {
            if(lngDraftId != -1) {
                oServiceDraft = this.m_oCtrl.getServiceDraftById(lngDraftId);
            } else {
                oServiceDraft = this.m_oCtrl.newDraft();
            }

            FormName oFormName = new FormName(strFormName);
            this.m_oCtrl.addForm(oFormName, oFormType);

            for(int i = 0; i < intNumAttributes; i++){
                insertAttribute(lstNames.get(i), lstLabels.get(i), lstDescriptions.get(i),
                        lstRegex.get(i), lstScripts.get(i), lstDataType.get(i));
            }

            oServiceDraft = this.m_oCtrl.addFormsToDraft();
            this.m_oCtrl.saveServiceDraft();
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oServiceDraft;
    }

    private void insertAttribute(String strAttributeName, String strAttributeLabel, String strAttributeDescription,
                                    String strAttributeRegex, String strAttributeScript, DataType oDataType) {
        final AttributeName oAttributeName = new AttributeName(strAttributeName);
        final AttributeLabel oAttributeLabel = new AttributeLabel(strAttributeLabel);
        final AttributeDescription oAttributeDescription = new AttributeDescription(strAttributeDescription);
        final AttributeRegex oAttributeRegex = new AttributeRegex(strAttributeRegex);
        final AttributeScript oAttributeScript = new AttributeScript(strAttributeScript);


        final Set<DataType> lstDataType = new HashSet<>();

        this.m_oCtrl.addAttribute(oAttributeName, oAttributeLabel, oAttributeDescription, oAttributeRegex, oAttributeScript, oDataType);
    }
}
