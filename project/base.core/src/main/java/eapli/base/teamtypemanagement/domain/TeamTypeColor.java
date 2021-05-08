package eapli.base.teamtypemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
@Embeddable
public final class TeamTypeColor implements ValueObject {
    private static final long serialVersionUID = 1L;
    private static final Pattern HEX_REGEX = Pattern.compile("^#[a-fA-F0-9]{6}$");

    private String hex;

    public TeamTypeColor(final String hex) {
        if (hex == null || !HEX_REGEX.matcher(hex).matches())
            throw new IllegalArgumentException("Team's type color must be a HEX color.");

        this.hex = hex;
    }

    protected TeamTypeColor() {
    }

    public static TeamTypeColor valueOf(final String hex) {
        return new TeamTypeColor(hex);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        final TeamTypeColor that = (TeamTypeColor) object;
        return Objects.equals(hex, that.hex);
    }

    @Override
    public int hashCode() {
        return hex != null ? hex.hashCode() : 0;
    }

    @Override
    public String toString() {
        return hex;
    }
}
