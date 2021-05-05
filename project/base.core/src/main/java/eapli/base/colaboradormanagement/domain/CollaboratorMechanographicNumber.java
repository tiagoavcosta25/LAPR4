/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.colaboradormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorMechanographicNumber implements ValueObject, Comparable<CollaboratorMechanographicNumber> {

    private static final long serialVersionUID = 1L;

    private String m_strMechanographicNumber;

    public CollaboratorMechanographicNumber(final String strMechanographicNumber) {
        if (StringPredicates.isNullOrEmpty(strMechanographicNumber)) {
            throw new IllegalArgumentException(
                    "Mechanographic number can't be null nor empty.");
        }
        // expression
        this.m_strMechanographicNumber = strMechanographicNumber;
    }

    protected CollaboratorMechanographicNumber() {
        // for ORM
    }

    public static CollaboratorMechanographicNumber valueOf(final String strMechanographicNumber) {
        return new CollaboratorMechanographicNumber(strMechanographicNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorMechanographicNumber)) {
            return false;
        }

        final CollaboratorMechanographicNumber that = (CollaboratorMechanographicNumber) o;
        return this.m_strMechanographicNumber.equals(that.m_strMechanographicNumber);
    }

    @Override
    public int hashCode() {
        return this.m_strMechanographicNumber.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strMechanographicNumber;
    }

    @Override
    public int compareTo(final CollaboratorMechanographicNumber arg0) {
        return m_strMechanographicNumber.compareTo(arg0.m_strMechanographicNumber);
    }
}
