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
public class ServiceTitle implements ValueObject, Comparable<ServiceTitle> {

    private static final long serialVersionUID = 1L;

    private String m_strTitle;

    public ServiceTitle(final String strTitle) {
        if (StringPredicates.isNullOrEmpty(strTitle)) {
            throw new IllegalArgumentException(
                    "Service Title should neither be null nor empty");
        }
        // expression
        this.m_strTitle = strTitle;
    }

    protected ServiceTitle() {
        // for ORM
    }

    public static ServiceTitle valueOf(final String strTitle) {
        return new ServiceTitle(strTitle);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceTitle)) {
            return false;
        }

        final ServiceTitle that = (ServiceTitle) o;
        return this.m_strTitle.equals(that.m_strTitle);
    }

    @Override
    public int hashCode() {
        return this.m_strTitle.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strTitle;
    }

    @Override
    public int compareTo(final ServiceTitle arg0) {
        return m_strTitle.compareTo(arg0.m_strTitle);
    }
}
