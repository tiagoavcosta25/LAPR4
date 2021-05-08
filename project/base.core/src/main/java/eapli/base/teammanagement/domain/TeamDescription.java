package eapli.base.teammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Embeddable
public class TeamDescription implements ValueObject, Comparable<TeamDescription> {

    private static final long serialVersionUID = 1L;

    @Column(name = "teamDescription", nullable = false)
    private String m_strTeamDescriptrion;

    public TeamDescription(final String strTeamDescriptrion) {
        if(StringPredicates.isNullOrEmpty(strTeamDescriptrion)) {
            throw new IllegalArgumentException(
                    "Team description should neither be null nor empty.");
        }
        this.m_strTeamDescriptrion = strTeamDescriptrion;
    }

    protected TeamDescription() {
        //for ORM only
    }

    public static TeamDescription valueOf(final String strTeamDescriptrion) {
        return new TeamDescription(strTeamDescriptrion);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof TeamDescription)) return false;
        final TeamDescription that = (TeamDescription) o;
        return this.m_strTeamDescriptrion.equals(that.m_strTeamDescriptrion);
    }

    @Override
    public int hashCode() {
        return this.m_strTeamDescriptrion.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strTeamDescriptrion;
    }

    @Override
    public int compareTo(final TeamDescription arg0) {
        return m_strTeamDescriptrion.compareTo(arg0.m_strTeamDescriptrion);
    }

}
