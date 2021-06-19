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
    private Long m_LongProgress;

    public ActivityFluxExecutionProgress(final Long longProgress) {
        this.m_LongProgress = longProgress;
    }

    protected ActivityFluxExecutionProgress() {
        // for ORM
    }

    public static ActivityFluxExecutionProgress valueOf(final Long longProgress) {
        return new ActivityFluxExecutionProgress(longProgress);
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
        return this.m_LongProgress.equals(that.m_LongProgress);
    }

    public Long currentProgress() {
        return this.m_LongProgress;
    }

    @Override
    public int hashCode() {
        return this.m_LongProgress.hashCode();
    }

    @Override
    public String toString() {
        return this.m_LongProgress.toString();
    }

    @Override
    public int compareTo(final ActivityFluxExecutionProgress arg0) {
        return m_LongProgress.compareTo(arg0.m_LongProgress);
    }
}