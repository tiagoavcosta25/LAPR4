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
public class ColaboradorNomeCurto implements ValueObject, Comparable<ColaboradorNomeCurto> {

    private static final long serialVersionUID = 1L;

    private String m_strNomeCurto;

    public ColaboradorNomeCurto(final String strNomeCurto) {
        if (StringPredicates.isNullOrEmpty(strNomeCurto)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_strNomeCurto = strNomeCurto;
    }

    protected ColaboradorNomeCurto() {
        // for ORM
    }

    public static ColaboradorNomeCurto valueOf(final String strNomeCurto) {
        return new ColaboradorNomeCurto(strNomeCurto);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorNomeCurto)) {
            return false;
        }

        final ColaboradorNomeCurto that = (ColaboradorNomeCurto) o;
        return this.m_strNomeCurto.equals(that.m_strNomeCurto);
    }

    @Override
    public int hashCode() {
        return this.m_strNomeCurto.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strNomeCurto;
    }

    @Override
    public int compareTo(final ColaboradorNomeCurto arg0) {
        return m_strNomeCurto.compareTo(arg0.m_strNomeCurto);
    }
}
