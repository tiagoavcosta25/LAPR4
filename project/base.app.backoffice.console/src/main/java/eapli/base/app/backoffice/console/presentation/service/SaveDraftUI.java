/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(SaveDraftUI.class);
    private final SaveDraftController theController = new SaveDraftController();

    @Override
    protected boolean doShow() {
        try{
            Iterable<ServiceDraft> itDrafts = this.theController.getDrafts();
            ServiceDraft oServiceDraft = PrintList.chooseOne(itDrafts, "Choose the Service Draft to Save", "Service Draft");

            if(oServiceDraft == null){
                LOGGER.error("\nNo Drafts to be saved.");
                throw new IllegalArgumentException();
            }

            Iterable<Catalogue> itCatalogues = this.theController.getCatalogues();
            Catalogue oCatalogue = PrintList.chooseOne(itCatalogues, "Choose a Catalogue for this Service", "Catalogue");

            String strOp = Console.readLine("Confirm the creation of the following Service (Y/N) > " +
                    oServiceDraft);

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.saveService(oServiceDraft, oCatalogue);
                LOGGER.info("\nOperation Successful.\n");
            } else{
                LOGGER.info("\nOperation Cancelled.\n");
            }

        } catch (Exception e){
            LOGGER.error("\nError in saving a service.\n");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Save Service Draft";
    }
}
