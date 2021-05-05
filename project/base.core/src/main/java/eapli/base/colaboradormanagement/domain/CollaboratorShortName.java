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
public class CollaboratorShortName implements ValueObject, Comparable<CollaboratorShortName> {

    private static final long serialVersionUID = 1L;

    private String m_strShortName;

    public CollaboratorShortName(final String strShortName) {
        if (StringPredicates.isNullOrEmpty(strShortName)) {
            throw new IllegalArgumentException(
                    "Short name can't be null nor empty.");
        }
        // expression
        this.m_strShortName = strShortName;
    }

    protected CollaboratorShortName() {
        // for ORM
    }

    public static CollaboratorShortName valueOf(final String strShortName) {
        return new CollaboratorShortName(strShortName);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorShortName)) {
            return false;
        }

        final CollaboratorShortName that = (CollaboratorShortName) o;
        return this.m_strShortName.equals(that.m_strShortName);
    }

    @Override
    public int hashCode() {
        return this.m_strShortName.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strShortName;
    }

    @Override
    public int compareTo(final CollaboratorShortName arg0) {
        return m_strShortName.compareTo(arg0.m_strShortName);
    }
}
