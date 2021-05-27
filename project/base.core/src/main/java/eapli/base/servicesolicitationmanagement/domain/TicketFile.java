/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.servicesolicitationmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
@Access(AccessType.FIELD)
public class TicketFile implements ValueObject, Comparable<TicketFile> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "([a-zA-Z]:)?(/[a-zA-Z0-9_.-]+)+/[a-zA-Z0-9_.-]+.bat";

    @Column(name = "ticketFilePath")
    private String m_strFilePath;

    public TicketFile(final String strFilePath) {
        if (StringPredicates.isNullOrEmpty(strFilePath) || !strFilePath.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Ticket File Path should neither be null nor empty and be a valid file path");
        }
        // expression
        this.m_strFilePath = strFilePath;
    }

    protected TicketFile() {
        // for ORM
    }

    public static TicketFile valueOf(final String strFilePath) {
        return new TicketFile(strFilePath);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TicketFile)) {
            return false;
        }

        final TicketFile that = (TicketFile) o;
        return this.m_strFilePath.equals(that.m_strFilePath);
    }

    @Override
    public int hashCode() {
        return this.m_strFilePath.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strFilePath;
    }

    @Override
    public int compareTo(final TicketFile arg0) {
        return m_strFilePath.compareTo(arg0.m_strFilePath);
    }
}
