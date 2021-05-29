package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class TicketCreationDate implements ValueObject, Comparable<TicketCreationDate> {

        private static final long serialVersionUID = 1L;

        @Column(name = "creationDate")
        private LocalDateTime m_dtCreationDate;

    public TicketCreationDate(final LocalDateTime dtCreationDate) {
            if (dtCreationDate.isAfter(LocalDateTime.now())) {
                throw new IllegalArgumentException(
                        "Creation Date can't be set in the future.");
            }
            // expression
            this.m_dtCreationDate = dtCreationDate;
        }

    protected TicketCreationDate() {
            // for ORM
        }

        public static TicketCreationDate valueOf(final LocalDateTime dtCreationDate) {
            return new TicketCreationDate(dtCreationDate);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TicketCreationDate)) {
                return false;
            }

            final TicketCreationDate that = (TicketCreationDate) o;
            return this.m_dtCreationDate.equals(that.m_dtCreationDate);
        }

        @Override
        public int hashCode() {
            return this.m_dtCreationDate.hashCode();
        }

        @Override
        public String toString() {
            return this.m_dtCreationDate.toString();
        }

        @Override
        public int compareTo(final TicketCreationDate arg0) {
            return m_dtCreationDate.compareTo(arg0.m_dtCreationDate);
        }

    }
