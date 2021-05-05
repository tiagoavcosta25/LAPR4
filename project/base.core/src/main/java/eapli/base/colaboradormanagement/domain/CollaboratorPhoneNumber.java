/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.colaboradormanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorPhoneNumber implements ValueObject, Comparable<CollaboratorPhoneNumber> {

    private static final long serialVersionUID = 1L;

    private Double m_dblPhoneNumber;

    public CollaboratorPhoneNumber(final Double dblPhoneNumber) {
        if (dblPhoneNumber == null) {
            throw new IllegalArgumentException(
                    "Phone Number can't be null nor empty.");
        }
        // expression
        this.m_dblPhoneNumber = dblPhoneNumber;
    }

    protected CollaboratorPhoneNumber() {
        // for ORM
    }

    public static CollaboratorPhoneNumber valueOf(final double dblPhoneNumber) {
        return new CollaboratorPhoneNumber(dblPhoneNumber);
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
        return this.m_dblPhoneNumber == that.m_dblPhoneNumber;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(this.m_dblPhoneNumber).hashCode();
    }

    @Override
    public String toString() {
        return Double.toString(this.m_dblPhoneNumber);
    }

    @Override
    public int compareTo(final CollaboratorPhoneNumber arg0) {
        return (int) Math.round(m_dblPhoneNumber) - (int) Math.round(arg0.m_dblPhoneNumber);
    }
}
