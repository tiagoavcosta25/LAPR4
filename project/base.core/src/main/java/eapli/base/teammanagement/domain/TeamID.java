package eapli.base.teammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Embeddable
public class TeamID implements ValueObject, Comparable<TeamID> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "[a-z-A-Z0-9]{1,15}";

    @Column(name = "teamID")
    private String m_strID;

    public TeamID(final String strID) {
        if(StringPredicates.isNullOrEmpty(strID) || !strID.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "TeamID should neither be null, empty, nor contain characters besides letters and numbers. " +
                    "It also should have a max of 15 characters");
        }
        this.m_strID = strID;
    }

    protected TeamID() {
        //for ORM only
    }

    public static TeamID valueOf(final String strID) {
        return new TeamID(strID);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof TeamID)) return false;
        final TeamID that = (TeamID) o;
        return this.m_strID.equals(that.m_strID);
    }

    @Override
    public int hashCode() {
        return this.m_strID.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strID;
    }

    @Override
    public int compareTo(final TeamID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
