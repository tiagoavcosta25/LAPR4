package eapli.base.teamtypemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
@Embeddable
public final class TeamTypeId implements ValueObject, Comparable<TeamTypeId> {
    private static final long serialVersionUID = 1L;
    private static final Pattern ID_REGEX = Pattern.compile("^[A-Za-z0-9]{1,15}$");

    private String id;

    public TeamTypeId(final String id) {
        if (id == null || !ID_REGEX.matcher(id).matches())
            throw new IllegalArgumentException(
                "Team's type ID should be an alpha numeric string below 16 characters."
            );

        this.id = id;
    }

    protected TeamTypeId() {
    }

    public static TeamTypeId valueOf(final String id) {
        return new TeamTypeId(id);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        final TeamTypeId that = (TeamTypeId) object;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public int compareTo(TeamTypeId object) {
        return id.compareTo(object.id);
    }
}
