/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class CollaboratorBirthDate implements ValueObject, Comparable<CollaboratorBirthDate> {

    private static final long serialVersionUID = 1L;

    @Column(name = "birthDate")
    private LocalDate m_dtBirthDate;

    public CollaboratorBirthDate(final LocalDate dtBirthDate) {
        if (dtBirthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Birth Date can't be set in the future.");
        }
        // expression
        this.m_dtBirthDate = dtBirthDate;
    }

    protected CollaboratorBirthDate() {
        // for ORM
    }

    public static CollaboratorBirthDate valueOf(final LocalDate dtBirthDate) {
        return new CollaboratorBirthDate(dtBirthDate);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaboratorBirthDate)) {
            return false;
        }

        final CollaboratorBirthDate that = (CollaboratorBirthDate) o;
        return this.m_dtBirthDate.equals(that.m_dtBirthDate);
    }

    @Override
    public int hashCode() {
        return this.m_dtBirthDate.hashCode();
    }

    @Override
    public String toString() {
        return this.m_dtBirthDate.toString();
    }

    @Override
    public int compareTo(final CollaboratorBirthDate arg0) {
        return m_dtBirthDate.compareTo(arg0.m_dtBirthDate);
    }
}
