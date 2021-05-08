/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorPhoneNumber implements ValueObject, Comparable<CollaboratorPhoneNumber> {

    private static final long serialVersionUID = 1L;

    @Column(name = "phonenNumber")
    private Double m_dblPhoneNumber;

    @Column(name = "phonenCode")
    private String m_strPhoneCode;

    public CollaboratorPhoneNumber(final Double dblPhoneNumber, String strPhoneCode) {

        int length = (int)(Math.log10(dblPhoneNumber)+1);
        if (dblPhoneNumber == null || length != 9) {
            throw new IllegalArgumentException(
                    "Phone Number should neither be null nor empty and must have nine digits.");
        }

        if (StringPredicates.isNullOrEmpty(strPhoneCode)){
            strPhoneCode = "+351";
        } else {
            if (strPhoneCode.matches("/+[0-9]+")) {
                throw new IllegalArgumentException(
                        "Phone Code should have a plus sign followed by numbers.");
            }
        }

        this.m_dblPhoneNumber = dblPhoneNumber;
        this.m_strPhoneCode = strPhoneCode;
    }

    protected CollaboratorPhoneNumber() {
        // for ORM
    }

    public static CollaboratorPhoneNumber valueOf(final String strPhoneNumber, final Double dblPhoneNumber) {
        return new CollaboratorPhoneNumber(dblPhoneNumber, strPhoneNumber);
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
        return this.m_dblPhoneNumber == that.m_dblPhoneNumber && this.m_strPhoneCode.equals(that.m_strPhoneCode);
    }

    @Override
    public int hashCode() {
        return Double.valueOf(this.m_dblPhoneNumber).hashCode();
    }

    @Override
    public String toString() {
        return this.m_strPhoneCode + this.m_dblPhoneNumber;
    }

    @Override
    public int compareTo(final CollaboratorPhoneNumber arg0) {
        return (int) Math.round(m_dblPhoneNumber) - (int) Math.round(arg0.m_dblPhoneNumber);
    }
}
