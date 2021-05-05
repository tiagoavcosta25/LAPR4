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
public class CollaboratorID implements ValueObject, Comparable<CollaboratorID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public CollaboratorID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "Collaborator's ID can't be null nor empty.");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.m_strID = strID;
    }

    protected CollaboratorID() {
        // for ORM
    }

    public static CollaboratorID valueOf(final String strID) {
        return new CollaboratorID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorID)) {
            return false;
        }

        final CollaboratorID that = (CollaboratorID) o;
        return this.m_strID.equals(that.m_strID);
    }

    @Override
    public int hashCode() {
        return this.m_strID.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strID;
    }

    @Override
    public int compareTo(final CollaboratorID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
