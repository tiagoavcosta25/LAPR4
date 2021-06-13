/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.activityfluxmanagement.execution.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
@Access(AccessType.FIELD)
public class ActivityFluxExecutionProgress implements ValueObject, Comparable<ActivityFluxExecutionProgress> {

    private static final long serialVersionUID = 1L;

    @Column(name = "fluxProgress")
    private Integer m_intProgress;

    public ActivityFluxExecutionProgress(final Integer intProgress) {
        if (intProgress < 0) {
            throw new IllegalArgumentException(
                    "Activity Flux Execution Progress should not be less than zero");
        }
        this.m_intProgress = intProgress;
    }

    protected ActivityFluxExecutionProgress() {
        // for ORM
    }

    public static ActivityFluxExecutionProgress valueOf(final Integer intProgress) {
        return new ActivityFluxExecutionProgress(intProgress);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityFluxExecutionProgress)) {
            return false;
        }

        final ActivityFluxExecutionProgress that = (ActivityFluxExecutionProgress) o;
        return this.m_intProgress == that.m_intProgress;
    }

    @Override
    public int hashCode() {
        return this.m_intProgress.hashCode();
    }

    @Override
    public String toString() {
        return this.m_intProgress.toString();
    }

    @Override
    public int compareTo(final ActivityFluxExecutionProgress arg0) {
        return m_intProgress.compareTo(arg0.m_intProgress);
    }
}
