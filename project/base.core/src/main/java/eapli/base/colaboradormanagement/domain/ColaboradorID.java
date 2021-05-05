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
public class ColaboradorID implements ValueObject, Comparable<ColaboradorID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public ColaboradorID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "ID do Colaborador não deverá ser null nem vazio.");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.m_strID = strID;
    }

    protected ColaboradorID() {
        // for ORM
    }

    public static ColaboradorID valueOf(final String strID) {
        return new ColaboradorID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorID)) {
            return false;
        }

        final ColaboradorID that = (ColaboradorID) o;
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
    public int compareTo(final ColaboradorID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
