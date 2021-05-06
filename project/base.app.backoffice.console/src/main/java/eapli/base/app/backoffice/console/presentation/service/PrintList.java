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

import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class PrintList {

    final static Scanner sc = new Scanner(System.in);

    public static <T> T chooseOne(List<T> lstElements, String strHeader, String strElementName) {
        try{
            Integer i = 0;
            System.out.printf("\n---------------------------------\n%s\n---------------------------------\n\n", strHeader);
            for(T t : lstElements){
                System.out.printf("[%d] %s", i, t.toString());
            }
            System.out.printf("\n\n\nSelect %s Number: ", strElementName);
            Integer intOp = sc.nextInt();

            return lstElements.get(intOp);

        } catch (Exception e){
            System.out.println("Error in selecting.");
            return null;
        }
    }

    public static <T> List<T> chooseMultiple(List<T> lstElements, String strHeader, String strElementName) {
        try{
            Integer i = 0;
            System.out.printf("\n---------------------------------\n%s\n---------------------------------\n\n", strHeader);
            for(T t : lstElements){
                System.out.printf("[%d] %s\n", i, t.toString());
            }

            Integer intOp;
            i = 1;
            List<T> lstTemp = new ArrayList<>();

            do{
                System.out.printf("\n\n\n [%d x]Select %s Number: ", i, strElementName);
                intOp = sc.nextInt();
                i++;
                lstTemp.add(lstElements.get(intOp));
            } while(intOp != 0);

            return lstTemp;

        } catch (Exception e){
            System.out.printf("Error in selecting.\n", strElementName);
            return null;
        }
    }
}
