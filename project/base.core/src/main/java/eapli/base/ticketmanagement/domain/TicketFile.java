/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
@Access(AccessType.FIELD)
public class TicketFile implements ValueObject, Comparable<TicketFile> {

    private static final long serialVersionUID = 1L;
    //private static final String m_strRegex = "([a-zA-Z]:)?(/[a-zA-Z0-9_.-]+)+/[a-zA-Z0-9_.-]+.xml";

    @Lob
    @Column(name = "ticketFile")
    private String m_strFile;

    public TicketFile(final String strFileContent) {
        if (StringPredicates.isNullOrEmpty(strFileContent)) {
            throw new IllegalArgumentException(
                    "Ticket File should be a valid");
        }
        // expression
        this.m_strFile = strFileContent;
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
        return this.m_strFile.equals(that.m_strFile);
    }

    @Override
    public int hashCode() {
        return this.m_strFile.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strFile;
    }

    @Override
    public int compareTo(final TicketFile arg0) {
        return m_strFile.compareTo(arg0.m_strFile);
    }
}
