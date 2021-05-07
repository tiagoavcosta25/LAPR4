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
public class ServiceCompleteDescription implements ValueObject, Comparable<ServiceCompleteDescription> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 500;

    private String m_strDescription;

    public ServiceCompleteDescription(final String strDescription) {
        if (StringPredicates.isNullOrEmpty(strDescription) || !(strDescription.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Attribute Complete Description should not be null, empty nor have more than 500 characters");
        }
        // expression
        this.m_strDescription = strDescription;
    }

    protected ServiceCompleteDescription() {
        // for ORM
    }

    public static ServiceCompleteDescription valueOf(final String strDescription) {
        return new ServiceCompleteDescription(strDescription);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCompleteDescription)) {
            return false;
        }

        final ServiceCompleteDescription that = (ServiceCompleteDescription) o;
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
    public int compareTo(final ServiceCompleteDescription arg0) {
        return m_strDescription.compareTo(arg0.m_strDescription);
    }
}
