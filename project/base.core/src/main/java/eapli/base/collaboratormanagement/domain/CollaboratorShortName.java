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
public class CollaboratorShortName implements ValueObject, Comparable<CollaboratorShortName> {

    private static final long serialVersionUID = 1L;

    @Column(name = "firstName")
    private String m_strFirstName;

    @Column(name = "lasttName")
    private String m_strLastName;
    private static final String m_strRegex = "[a-zA-Z ]+";
    private static final Integer m_intMaxLength = 15;

    public CollaboratorShortName(final String strFirstName, final String strLastName) {
        if (StringPredicates.isNullOrEmpty(strFirstName) || !strFirstName.matches(m_strRegex) || !(strFirstName.length() < m_intMaxLength) ||
                StringPredicates.isNullOrEmpty(strLastName) || !strFirstName.matches(m_strRegex) || !(strLastName.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Name should neither be null, empty, contain other characters besides letters nor have more then 80 characters.");
        }
        // expression
        this.m_strFirstName = strFirstName;
        this.m_strLastName = strLastName;
    }

    protected CollaboratorShortName() {
        // for ORM
    }

    public static CollaboratorShortName valueOf(final String strFirstName, final String strLastName) {
        return new CollaboratorShortName(strFirstName, strLastName);
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
        return this.m_strFirstName.equals(that.m_strFirstName) && this.m_strLastName.equals(that.m_strLastName) ;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return this.m_strFirstName + " " + this.m_strLastName;
    }

    @Override
    public int compareTo(final CollaboratorShortName arg0) {
        return this.toString().compareTo(arg0.toString());
    }
}
