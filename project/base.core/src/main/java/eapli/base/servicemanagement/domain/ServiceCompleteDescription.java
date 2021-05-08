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
public class ServiceCompleteDescription implements ValueObject, Comparable<ServiceCompleteDescription> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 500;

    @Column(name = "serviceCompleteDescription")
    private String m_strCompleteDescription;

    public ServiceCompleteDescription(final String strDescription) {
        if (StringPredicates.isNullOrEmpty(strDescription) || !(strDescription.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Attribute Complete Description should not be null, empty nor have more than 500 characters");
        }
        // expression
        this.m_strCompleteDescription = strDescription;
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
        return this.m_strCompleteDescription.equals(that.m_strCompleteDescription);
    }

    @Override
    public int hashCode() {
        return this.m_strCompleteDescription.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strCompleteDescription;
    }

    @Override
    public int compareTo(final ServiceCompleteDescription arg0) {
        return m_strCompleteDescription.compareTo(arg0.m_strCompleteDescription);
    }
}
