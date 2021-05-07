/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorPhoneNumber implements ValueObject, Comparable<CollaboratorPhoneNumber> {

    private static final long serialVersionUID = 1L;

    private Double m_dblPhoneNumber;
    private String m_strPrefix;

    public CollaboratorPhoneNumber(final String strPhoneNumber) {

        if (StringPredicates.isNullOrEmpty(strPhoneNumber) || (strPhoneNumber.length() != 9 && strPhoneNumber.length() != 13)) {
            throw new IllegalArgumentException(
                    "Phone Number should neither be null nor empty and must have nine or thirteen digits.");
        }

        Double dblPhoneNumber;
        String strPrefix;

        if (strPhoneNumber.length() == 13){
            strPrefix = strPhoneNumber.substring(0,3);
            dblPhoneNumber = Double.parseDouble(strPhoneNumber.substring(3,strPhoneNumber.length() - 1));
        } else {
            strPrefix = "+351";
            dblPhoneNumber = Double.parseDouble(strPhoneNumber);
        }

        if (dblPhoneNumber == null || dblPhoneNumber <= 0 || String.valueOf(dblPhoneNumber).length() != 9) {
            throw new IllegalArgumentException(
                    "Phone Number should neither be null, empty, less than zero nor less or greater than nine digits.");
        }

        if (strPrefix.matches("/+[0-9]{3}")) {
            throw new IllegalArgumentException(
                    "Prefix should have a plus sign followed by three numbers.");
        }
        // expression
        this.m_dblPhoneNumber = dblPhoneNumber;
        this.m_strPrefix = strPrefix;
    }

    protected CollaboratorPhoneNumber() {
        // for ORM
    }

    public static CollaboratorPhoneNumber valueOf(final String strPhoneNumber) {
        return new CollaboratorPhoneNumber(strPhoneNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorPhoneNumber)) {
            return false;
        }

        final CollaboratorPhoneNumber that = (CollaboratorPhoneNumber) o;
        return this.m_dblPhoneNumber == that.m_dblPhoneNumber && this.m_strPrefix.equals(that.m_strPrefix);
    }

    @Override
    public int hashCode() {
        return Double.valueOf(this.m_dblPhoneNumber).hashCode();
    }

    @Override
    public String toString() {
        return this.m_strPrefix + this.m_dblPhoneNumber;
    }

    @Override
    public int compareTo(final CollaboratorPhoneNumber arg0) {
        return (int) Math.round(m_dblPhoneNumber) - (int) Math.round(arg0.m_dblPhoneNumber);
    }
}
