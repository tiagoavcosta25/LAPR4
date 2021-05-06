/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formmanagement.domain;

import javax.persistence.Embeddable;

@Embeddable
public enum DataType {
    INTEGER, STRING, BOOL, DATA, FILE, ENUM;

    public static DataType stringToDataType(String strType) {
        switch (strType)
            {
                case "Integer":
                    return INTEGER;
                case "STRING":
                    return STRING;
                case "BOOL":
                    return BOOL;
                case "DATA":
                    return DATA;
                case "FILE":
                    return FILE;
                case "ENUM":
                    return ENUM;
                default:
                    return null;
            }
    }
}
