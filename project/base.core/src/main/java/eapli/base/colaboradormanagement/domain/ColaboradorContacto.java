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
public class ColaboradorContacto implements ValueObject, Comparable<ColaboradorContacto> {

    private static final long serialVersionUID = 1L;

    private double m_dblContacto;

    public ColaboradorContacto(final double dblContacto) {
        if (StringPredicates.isNullOrEmpty(dblContacto)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // expression
        this.m_dblContacto = dblContacto;
    }

    protected ColaboradorContacto() {
        // for ORM
    }

    public static ColaboradorContacto valueOf(final double dblContacto) {
        return new ColaboradorContacto(dblContacto);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColaboradorContacto)) {
            return false;
        }

        final ColaboradorContacto that = (ColaboradorContacto) o;
        return this.m_dblContacto == that.m_dblContacto;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(this.m_dblContacto).hashCode();
    }

    @Override
    public String toString() {
        return Double.toString(this.m_dblContacto);
    }

    @Override
    public int compareTo(final ColaboradorContacto arg0) {
        return (int) m_dblContacto - (int) arg0.m_dblContacto;
    }
}
