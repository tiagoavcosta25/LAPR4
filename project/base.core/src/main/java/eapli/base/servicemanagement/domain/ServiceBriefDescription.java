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
public class ServiceBriefDescription implements ValueObject, Comparable<ServiceBriefDescription> {

    private static final long serialVersionUID = 1L;

    private String m_strDescription;

    public ServiceBriefDescription(final String strDescription) {
        if (StringPredicates.isNullOrEmpty(strDescription)) {
            throw new IllegalArgumentException(
                    "Service Brief Description should neither be null nor empty");
        }
        // expression
        this.m_strDescription = strDescription;
    }

    protected ServiceBriefDescription() {
        // for ORM
    }

    public static ServiceBriefDescription valueOf(final String strDescription) {
        return new ServiceBriefDescription(strDescription);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceBriefDescription)) {
            return false;
        }

        final ServiceBriefDescription that = (ServiceBriefDescription) o;
        return this.m_strDescription.equals(that.m_strDescription);
    }

    @Override
    public int hashCode() {
        return this.m_strDescription.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strDescription;
    }

    @Override
    public int compareTo(final ServiceBriefDescription arg0) {
        return m_strDescription.compareTo(arg0.m_strDescription);
    }
}
