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
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftFieldSpecificationUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(ServiceDraftFieldSpecificationUI.class);
    private final ServiceDraftSpecificationController theController = new ServiceDraftSpecificationController();

    @Override
    protected boolean doShow() {
        try{
            ServiceDraft oServiceDraft;
            String strOp = Console.readLine("Do you want to use an existing draft? (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                Iterable<ServiceDraft> itDrafts = this.theController.getDrafts();
                oServiceDraft = PrintList.chooseOne(itDrafts, "Choose the Service Draft to Save", "Service Draft");
            } else{
                oServiceDraft = this.theController.newDraft();
            }

            if(oServiceDraft == null){throw new IllegalArgumentException();}

            int intOp;
            do{
                intOp = addField(oServiceDraft);
            } while(intOp != 0);

            strOp = Console.readLine("Confirm the changes made on the Draft (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                oServiceDraft = this.theController.saveServiceDraft();
                LOGGER.info("\nOperation Successful. New Draft > {}\n\n", oServiceDraft.toString());
            } else{
                LOGGER.info("\nOperation Cancelled.\n\n");
            }
        } catch (Exception e){
            LOGGER.error("\nError in creating a service.\n\n");
        }

        return false;
    }

    private Integer addField(ServiceDraft oServiceDraft) {
        String strOp = Console.readLine("\nMENU\n==========================================\n" +
                "1 - Title\n2- Brief Description\n3 - Complete Description"
                + "\n4 - Keywords\n5- Enable Feedback\n6 - Icon\n\n0 - Finish"
                + "\n\nChoose a field to add/update in the draft >");

        switch (Integer.parseInt(strOp))
        {
            case 1:
                this.theController.addTitle(oServiceDraft, Console.readLine("Service Title >"));
                break;
            case 2:
                this.theController.addBriefDescription(oServiceDraft, Console.readLine("Brief Description >"));
                break;
            case 3:
                this.theController.addCompleteDescription(oServiceDraft, Console.readLine("Complete Description >"));
                break;
            case 4:
                List<String> lstKeywords = new ArrayList<>();
                int i = 1;
                String strAdd;
                do{
                    lstKeywords.add(Console.readLine("Keyword Number " + i + " >"));
                    strAdd = Console.readLine("Do you want to add more keywords? (Y/N) >");
                    i++;
                } while(strAdd.compareToIgnoreCase("Y") == 0);
                this.theController.addKeywordList(oServiceDraft, lstKeywords);
                break;
            case 5:
                this.theController.addFeedback(oServiceDraft, Double.parseDouble(Console.readLine("Feedback Duration >")));
                break;
            case 6:
                this.theController.addIcon(oServiceDraft, Console.readLine("Service Icon >"));
                break;
            case 0:
            default:
                return 0;
        }
        return Integer.parseInt(strOp);
    }

    @Override
    public String headline() {
        return "Service Draft Field Specification";
    }
}
