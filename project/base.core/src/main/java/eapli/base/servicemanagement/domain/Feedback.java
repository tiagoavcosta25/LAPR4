/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.servicemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class Feedback implements ValueObject, Comparable<Feedback> {

    private static final long serialVersionUID = 1L;

    @Column(name = "serviceFeedbackDuration")
    private Double m_dblDuration;

    public Feedback(final Double dblDuration) {
        if (dblDuration == null || dblDuration < 0) {
            throw new IllegalArgumentException(
                    "Feedback Duration should neither be null, empty nor less than zero");
        }
        // expression
        this.m_dblDuration = dblDuration;
    }

    protected Feedback() {
        // for ORM
    }

    public static Feedback valueOf(final Double dblDuration) {
        return new Feedback(dblDuration);
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
        return this.m_dblDuration.equals(that.m_dblDuration);
    }

    @Override
    public int hashCode() {
        return this.m_dblDuration.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(this.m_dblDuration);
    }

    @Override
    public int compareTo(final Feedback arg0) {
        return m_dblDuration.compareTo(arg0.m_dblDuration);
    }
}
