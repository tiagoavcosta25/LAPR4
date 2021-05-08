package eapli.base.teamtypemanagement.domain;

import eapli.framework.domain.model.DomainFactory;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
public final class TeamTypeBuilder implements DomainFactory<TeamType> {
    private TeamTypeId id;
    private TeamTypeDescription description;
    private TeamTypeColor color;

    public TeamTypeBuilder withId(final String id) {
        this.id = TeamTypeId.valueOf(id);
        return this;
    }

    public TeamTypeBuilder withDescription(final String description) {
        this.description = TeamTypeDescription.valueOf(description);
        return this;
    }

    public TeamTypeBuilder withColor(final String color) {
        this.color = TeamTypeColor.valueOf(color);
        return this;
    }

    @Override
    public TeamType build() {
        return new TeamType(id, description, color);
    }
}
