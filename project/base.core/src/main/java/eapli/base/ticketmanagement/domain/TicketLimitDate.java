package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class TicketLimitDate implements ValueObject, Comparable<TicketLimitDate> {

        private static final long serialVersionUID = 1L;

        @Column(name = "limitDate")
        private LocalDate m_dtLimitDate;

    public TicketLimitDate(final LocalDate dtBirthDate) {
            if (dtBirthDate.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException(
                        "Limit Date can't be set in the past.");
            }
            // expression
            this.m_dtLimitDate = dtBirthDate;
        }

    protected TicketLimitDate() {
            // for ORM
        }

        public static TicketLimitDate valueOf(final LocalDate dtLimitDate) {
            return new TicketLimitDate(dtLimitDate);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TicketLimitDate)) {
                return false;
            }

            final TicketLimitDate that = (TicketLimitDate) o;
            return this.m_dtLimitDate.equals(that.m_dtLimitDate);
        }

        @Override
        public int hashCode() {
            return this.m_dtLimitDate.hashCode();
        }

        @Override
        public String toString() {
            return this.m_dtLimitDate.toString();
        }

        @Override
        public int compareTo(final TicketLimitDate arg0) {
            return m_dtLimitDate.compareTo(arg0.m_dtLimitDate);
        }

    }
