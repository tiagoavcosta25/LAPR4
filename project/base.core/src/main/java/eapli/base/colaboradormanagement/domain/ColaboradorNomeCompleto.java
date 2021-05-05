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
public class ColaboradorNomeCompleto implements ValueObject, Comparable<ColaboradorNomeCompleto> {

    private static final long serialVersionUID = 1L;

    private String m_strNomeCompleto;

    public ColaboradorNomeCompleto(final String strNomeCompleto) {
        if (StringPredicates.isNullOrEmpty(strNomeCompleto)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_strNomeCompleto = strNomeCompleto;
    }

    protected ColaboradorNomeCompleto() {
        // for ORM
    }

    public static ColaboradorNomeCompleto valueOf(final String strNomeCompleto) {
        return new ColaboradorNomeCompleto(strNomeCompleto);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorNomeCompleto)) {
            return false;
        }

        final ColaboradorNomeCompleto that = (ColaboradorNomeCompleto) o;
        return this.m_strNomeCompleto.equals(that.m_strNomeCompleto);
    }

    @Override
    public int hashCode() {
        return this.m_strNomeCompleto.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strNomeCompleto;
    }

    @Override
    public int compareTo(final ColaboradorNomeCompleto arg0) {
        return m_strNomeCompleto.compareTo(arg0.m_strNomeCompleto);
    }
}
