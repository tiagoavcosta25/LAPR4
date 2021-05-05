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
public class ColaboradorNumeroMecanografico implements ValueObject, Comparable<ColaboradorNumeroMecanografico> {

    private static final long serialVersionUID = 1L;

    private String m_strNumeroMecanografico;

    public ColaboradorNumeroMecanografico(final String strNumeroMecanografico) {
        if (StringPredicates.isNullOrEmpty(strNumeroMecanografico)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_strNumeroMecanografico = strNumeroMecanografico;
    }

    protected ColaboradorNumeroMecanografico() {
        // for ORM
    }

    public static ColaboradorNumeroMecanografico valueOf(final String strNumeroMecanografico) {
        return new ColaboradorNumeroMecanografico(strNumeroMecanografico);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorNumeroMecanografico)) {
            return false;
        }

        final ColaboradorNumeroMecanografico that = (ColaboradorNumeroMecanografico) o;
        return this.m_strNumeroMecanografico.equals(that.m_strNumeroMecanografico);
    }

    @Override
    public int hashCode() {
        return this.m_strNumeroMecanografico.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strNumeroMecanografico;
    }

    @Override
    public int compareTo(final ColaboradorNumeroMecanografico arg0) {
        return m_strNumeroMecanografico.compareTo(arg0.m_strNumeroMecanografico);
    }
}
