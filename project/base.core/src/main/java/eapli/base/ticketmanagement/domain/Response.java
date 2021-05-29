/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class Response implements ValueObject, Comparable<Response> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 40;

    @Column(name = "ticketResponse")
    private String m_strResponse;

    public Response(final String strResponse) {
        if (StringPredicates.isNullOrEmpty(strResponse) || !(strResponse.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Response should not be null, empty nor have more than 40 characters");
        }
        // expression
        this.m_strResponse = strResponse;
    }

    protected Response() {
        // for ORM
    }

    public static Response valueOf(final String strResponse) {
        return new Response(strResponse);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Response)) {
            return false;
        }

        final Response that = (Response) o;
        return this.m_strResponse.equals(that.m_strResponse);
    }

    @Override
    public int hashCode() {
        return this.m_strResponse.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strResponse;
    }

    @Override
    public int compareTo(final Response arg0) {
        return m_strResponse.compareTo(arg0.m_strResponse);
    }
}
