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
public class CollaboratorAddress implements ValueObject, Comparable<CollaboratorAddress> {

    private static final long serialVersionUID = 1L;

    @Column(name = "address")
    private String m_strAddress;

    public CollaboratorAddress(final String strAddress) {
        if (StringPredicates.isNullOrEmpty(strAddress)) {
            throw new IllegalArgumentException(
                    "Address can't be null nor empty.");
        }
        // expression
        this.m_strAddress = strAddress;
    }

    protected CollaboratorAddress() {
        // for ORM
    }

    public static CollaboratorAddress valueOf(final String strAddress) {
        return new CollaboratorAddress(strAddress);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorAddress)) {
            return false;
        }

        final CollaboratorAddress that = (CollaboratorAddress) o;
        return this.m_strAddress.equals(that.m_strAddress);
    }

    @Override
    public int hashCode() {
        return this.m_strAddress.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strAddress;
    }

    @Override
    public int compareTo(final CollaboratorAddress arg0) {
        return m_strAddress.compareTo(arg0.m_strAddress);
    }
}
