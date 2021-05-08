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
public class CollaboratorCompleteName implements ValueObject, Comparable<CollaboratorCompleteName> {

    private static final long serialVersionUID = 1L;

    @Column(name = "completeName")
    private String m_strCompleteName;
    private static final String m_strRegex = "[a-zA-Z ]+";
    private static final Integer m_intMaxLength = 80;

    public CollaboratorCompleteName(final String strCompleteName) {
        if (StringPredicates.isNullOrEmpty(strCompleteName) || !strCompleteName.matches(m_strRegex) || !(strCompleteName.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Complete name should neither be null, empty, contain other characters besides letters nor have more then 80 characters.");
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
