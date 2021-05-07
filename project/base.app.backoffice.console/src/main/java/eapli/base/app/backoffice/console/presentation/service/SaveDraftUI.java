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

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.application.SaveDraftController;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import java.util.List;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftUI extends AbstractUI {

    private final SaveDraftController theController = new SaveDraftController();

    @Override
    protected boolean doShow() {
        try{
            Long lngID = Long.parseLong(Console.readLine("Draft ID"));
            ServiceDraft oServiceDraft = this.theController.getServiceDraftById(lngID);

            Iterable<Catalogue> itCatalogues = this.theController.getCatalogues();

            Catalogue oCatalogue = PrintList.chooseOne(itCatalogues, "Choose a Catalogue for this Service", "Catalogue");

            String strOp = Console.readLine("Confirm the creation of the following Service (Y/N):\n\n%s\n" +
                    oServiceDraft.toString());

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.saveService(oCatalogue);
                System.out.printf("Operation Successful.");
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a service.");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Save Service Draft";
    }
}
