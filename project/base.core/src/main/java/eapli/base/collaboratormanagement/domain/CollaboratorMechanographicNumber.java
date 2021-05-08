/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorMechanographicNumber implements ValueObject, Comparable<CollaboratorMechanographicNumber> {

    private static final long serialVersionUID = 1L;

    @Column(name = "mechanographicNumber")
    private Long m_lngMechanographicNumber;

    public CollaboratorMechanographicNumber(final long lngMechanographicNumber) {
        if (lngMechanographicNumber < 0 || String.valueOf(lngMechanographicNumber).length() > 6) {
            throw new IllegalArgumentException(
                    "Mechanographic Number should neither be less than zero nor more than six digits.");
        }
        this.m_lngMechanographicNumber = lngMechanographicNumber;
    }

    protected CollaboratorMechanographicNumber() {
        // for ORM
    }

    public static CollaboratorMechanographicNumber valueOf(final long lngMechanographicNumber) {
        return new CollaboratorMechanographicNumber(lngMechanographicNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorMechanographicNumber)) {
            return false;
        }

        final CollaboratorMechanographicNumber that = (CollaboratorMechanographicNumber) o;
        return this.m_lngMechanographicNumber.equals(that.m_lngMechanographicNumber);
    }

    @Override
    public int hashCode() {
        return this.m_lngMechanographicNumber.hashCode();
    }

    @Override
    public String toString() {
        return Long.toString(this.m_lngMechanographicNumber);
    }

    @Override
    public int compareTo(final CollaboratorMechanographicNumber arg0) {
        return Math.round(m_lngMechanographicNumber) - Math.round(arg0.m_lngMechanographicNumber);
    }
}
