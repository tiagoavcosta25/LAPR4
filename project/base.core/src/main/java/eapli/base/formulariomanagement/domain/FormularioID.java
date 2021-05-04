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
public class FormularioID implements ValueObject, Comparable<FormularioID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public FormularioID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "Form ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.m_strID = strID;
    }

    protected FormularioID() {
        // for ORM
    }

    public static FormularioID valueOf(final String strID) {
        return new FormularioID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormularioID)) {
            return false;
        }

        final FormularioID that = (FormularioID) o;
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
    public int compareTo(final FormularioID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
