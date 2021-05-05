/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.servicemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class ServicoID implements ValueObject, Comparable<ServicoID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public ServicoID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "Service ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.m_strID = strID;
    }

    protected ServicoID() {
        // for ORM
    }

    public static ServicoID valueOf(final String strID) {
        return new ServicoID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServicoID)) {
            return false;
        }

        final ServicoID that = (ServicoID) o;
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
    public int compareTo(final ServicoID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
