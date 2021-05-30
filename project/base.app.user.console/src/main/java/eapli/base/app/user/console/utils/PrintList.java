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
package eapli.base.app.user.console.utils;

import eapli.framework.io.util.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class PrintList {

    final static Scanner sc = new Scanner(System.in);

    public static <T> T chooseOne(Iterable<T> itElements, String strHeader, String strElementName) {
        try{
            Integer i = 1;
            List<T> lstTemp = new ArrayList<>();
            System.out.printf("\n==========================================\n%s\n==========================================\n\n", strHeader);
            for(T t : itElements){
                System.out.printf("[%d] %s\n", i, t.toString());
                i++;
                lstTemp.add(t);
            }
            if(lstTemp.isEmpty()){
                System.out.println("There is no " + strElementName + "s in the Database.\n\n");
                return null;
            }
            Integer intOp = Integer.parseInt(Console.readLine("\n\n\nSelect " + strElementName + " Number >"));

            return lstTemp.get(intOp - 1);

        } catch (Exception e){
            System.out.println("Error in selecting.\n\n");
            return null;
        }
    }

    public static <T> List<T> chooseMultiple(Iterable<T> itElements, String strHeader, String strElementName) {
        try{
            List<T> lstTemp = new ArrayList<>();
            Integer intOp, j = 1;
            List<T> lstReturn = new ArrayList<>();
            do{
                Integer i = 1;
                System.out.printf("\n---------------------------------\n%s\n---------------------------------\n\n", strHeader);
                for(T t : itElements){
                    System.out.printf("[%d] %s\n", i, t.toString());
                    i++;
                    lstTemp.add(t);
                }
                System.out.printf("\n[0] Exit\n");
                intOp = Integer.parseInt(Console.readLine("\n\n[" + j + " x] Select " + strElementName + " Number >"));
                j++;
                if(intOp == 0){
                    break;
                }
                lstReturn.add(lstTemp.get(intOp - 1));
                lstTemp.remove(intOp - 1);
            } while(intOp != 0);

            return lstReturn;

        } catch (Exception e){
            System.out.printf("Error in selecting.\n", strElementName);
            return null;
        }
    }
}
