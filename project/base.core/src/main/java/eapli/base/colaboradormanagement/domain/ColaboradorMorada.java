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
 * @author Jorge Santos ajs@isep.ipp.pt
 */
@Embeddable
public class ColaboradorMorada implements ValueObject, Comparable<ColaboradorMorada> {

    private static final long serialVersionUID = 1L;

    private String m_strMorada;

    public ColaboradorMorada(final String strMorada) {
        if (StringPredicates.isNullOrEmpty(strMorada)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_strMorada = strMorada;
    }

    protected ColaboradorMorada() {
        // for ORM
    }

    public static ColaboradorMorada valueOf(final String strMorada) {
        return new ColaboradorMorada(strMorada);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorMorada)) {
            return false;
        }

        final ColaboradorMorada that = (ColaboradorMorada) o;
        return this.m_strMorada.equals(that.m_strMorada);
    }

    @Override
    public int hashCode() {
        return this.m_strMorada.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strMorada;
    }

    @Override
    public int compareTo(final ColaboradorMorada arg0) {
        return m_strMorada.compareTo(arg0.m_strMorada);
    }
}
