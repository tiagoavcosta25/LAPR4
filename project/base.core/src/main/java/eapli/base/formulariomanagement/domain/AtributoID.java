/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt
 */
@Embeddable
public class AtributoID implements ValueObject, Comparable<AtributoID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public AtributoID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "Attribute ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.m_strID = strID;
    }

    protected AtributoID() {
        // for ORM
    }

    public static AtributoID valueOf(final String strID) {
        return new AtributoID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AtributoID)) {
            return false;
        }

        final AtributoID that = (AtributoID) o;
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
    public int compareTo(final AtributoID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
