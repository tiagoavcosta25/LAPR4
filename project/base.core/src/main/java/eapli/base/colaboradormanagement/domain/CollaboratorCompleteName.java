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
public class CollaboratorCompleteName implements ValueObject, Comparable<CollaboratorCompleteName> {

    private static final long serialVersionUID = 1L;

    private String m_strCompleteName;

    public CollaboratorCompleteName(final String strCompleteName) {
        if (StringPredicates.isNullOrEmpty(strCompleteName)) {
            throw new IllegalArgumentException(
                    "Complete name can't be null nor empty.");
        }
        // expression
        this.m_strCompleteName = strCompleteName;
    }

    protected CollaboratorCompleteName() {
        // for ORM
    }

    public static CollaboratorCompleteName valueOf(final String strCompleteName) {
        return new CollaboratorCompleteName(strCompleteName);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorCompleteName)) {
            return false;
        }

        final CollaboratorCompleteName that = (CollaboratorCompleteName) o;
        return this.m_strCompleteName.equals(that.m_strCompleteName);
    }

    @Override
    public int hashCode() {
        return this.m_strCompleteName.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strCompleteName;
    }

    @Override
    public int compareTo(final CollaboratorCompleteName arg0) {
        return m_strCompleteName.compareTo(arg0.m_strCompleteName);
    }
}