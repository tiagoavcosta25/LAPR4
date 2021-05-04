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
public class ColaboradorDataNascimento implements ValueObject, Comparable<ColaboradorDataNascimento> {

    private static final long serialVersionUID = 1L;

    private String m_strDataNascimento;

    public ColaboradorDataNascimento(final String strDataNascimento) {
        if (StringPredicates.isNullOrEmpty(strDataNascimento)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_strDataNascimento = strDataNascimento;
    }

    protected ColaboradorDataNascimento() {
        // for ORM
    }

    public static ColaboradorDataNascimento valueOf(final String strDataNascimento) {
        return new ColaboradorDataNascimento(strDataNascimento);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorDataNascimento)) {
            return false;
        }

        final ColaboradorDataNascimento that = (ColaboradorDataNascimento) o;
        return this.m_strDataNascimento.equals(that.m_strDataNascimento);
    }

    @Override
    public int hashCode() {
        return this.m_strDataNascimento.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strDataNascimento;
    }

    @Override
    public int compareTo(final ColaboradorDataNascimento arg0) {
        return m_strDataNascimento.compareTo(arg0.m_strDataNascimento);
    }
}
