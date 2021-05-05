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
public class Feedback implements ValueObject, Comparable<Feedback> {

    private static final long serialVersionUID = 1L;

    private Double m_dblDuracao;

    public Feedback(final Double dblDuracao) {
        if (dblDuracao == null) {
            throw new IllegalArgumentException(
                    "Feedback should neither be null nor empty");
        }
        // expression
        this.m_dblDuracao = dblDuracao;
    }

    protected Feedback() {
        // for ORM
    }

    public static Feedback valueOf(final Double dblDuracao) {
        return new Feedback(dblDuracao);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Feedback)) {
            return false;
        }

        final Feedback that = (Feedback) o;
        return this.m_dblDuracao.equals(that.m_dblDuracao);
    }

    @Override
    public int hashCode() {
        return this.m_dblDuracao.hashCode();
    }

    @Override
    public String toString() {
        return this.m_dblDuracao;
    }

    @Override
    public int compareTo(final Feedback arg0) {
        return m_dblDuracao.compareTo(arg0.m_dblDuracao);
    }
}
