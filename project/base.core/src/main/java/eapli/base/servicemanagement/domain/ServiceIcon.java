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
public class ServiceIcon implements ValueObject, Comparable<ServiceIcon> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "([a-zA-Z]:)?(/[a-zA-Z0-9_.-]+)+/[a-zA-Z0-9_.-]+.png";

    @Column(name = "serviceIconPath")
    private String m_strIconPath;

    public ServiceIcon(final String strIconPath) {
        if (StringPredicates.isNullOrEmpty(strIconPath) || !strIconPath.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Service Icon should neither be null nor empty and be a valid file path");
        }
        // expression
        this.m_strIconPath = strIconPath;
    }

    protected ServiceIcon() {
        // for ORM
    }

    public static ServiceIcon valueOf(final String strIconPath) {
        return new ServiceIcon(strIconPath);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceIcon)) {
            return false;
        }

        final ServiceIcon that = (ServiceIcon) o;
        return this.m_strIconPath.equals(that.m_strIconPath);
    }

    @Override
    public int hashCode() {
        return this.m_strIconPath.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strIconPath;
    }

    @Override
    public int compareTo(final ServiceIcon arg0) {
        return m_strIconPath.compareTo(arg0.m_strIconPath);
    }
}
