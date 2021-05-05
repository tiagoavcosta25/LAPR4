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
public class CollaboratorBirthDate implements ValueObject, Comparable<CollaboratorBirthDate> {

    private static final long serialVersionUID = 1L;

    private String m_strBirthDate;

    public CollaboratorBirthDate(final String strBirthDate) {
        if (StringPredicates.isNullOrEmpty(strBirthDate)) {
            throw new IllegalArgumentException(
                    "Birth Date can't be null nor empty.");
        }
        // expression
        this.m_strBirthDate = strBirthDate;
    }

    protected CollaboratorBirthDate() {
        // for ORM
    }

    public static CollaboratorBirthDate valueOf(final String strBirthDate) {
        return new CollaboratorBirthDate(strBirthDate);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorBirthDate)) {
            return false;
        }

        final CollaboratorBirthDate that = (CollaboratorBirthDate) o;
        return this.m_strBirthDate.equals(that.m_strBirthDate);
    }

    @Override
    public int hashCode() {
        return this.m_strBirthDate.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strBirthDate;
    }

    @Override
    public int compareTo(final CollaboratorBirthDate arg0) {
        return m_strBirthDate.compareTo(arg0.m_strBirthDate);
    }
}
