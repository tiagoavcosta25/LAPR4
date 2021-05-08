package eapli.base.teamtypemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
@Embeddable
public final class TeamTypeDescription implements ValueObject {
    private static final long serialVersionUID = 1L;

    private String description;

    public TeamTypeDescription(final String description) {
        if (StringPredicates.isNullOrEmpty(description))
            throw new IllegalArgumentException(
                "Team's type description shouldn't be null nor empty"
            );

        this.description = description;
    }

    protected TeamTypeDescription() {
    }

    public static TeamTypeDescription valueOf(final String description) {
        return new TeamTypeDescription(description);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        final TeamTypeDescription that = (TeamTypeDescription) object;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }

    @Override
    public String toString() {
        return description;
    }
}
