package eapli.base.teammanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.domain.model.DomainFactory;

import java.util.HashSet;
import java.util.Set;

public class TeamBuilder implements DomainFactory<Team> {

    private TeamID m_oTeamID;

    private TeamType m_enumTeamType;

    private Acronym m_oAcronym;

    private TeamDescription m_oTeamDescription;

    private Set<Collaborator> m_setRepresentation;

    public TeamBuilder withTeamID(TeamID oTeamID) {
        this.m_oTeamID = oTeamID;
        return this;
    }

    public TeamBuilder withTeamType(TeamType enumTeamType) {
        this.m_enumTeamType = enumTeamType;
        return this;
    }

    public TeamBuilder withAcronym(Acronym oAcronym) {
        this.m_oAcronym = oAcronym;
        return this;
    }

    public TeamBuilder withTeamDescription(TeamDescription oTeamDescription) {
        this.m_oTeamDescription = oTeamDescription;
        return this;
    }

    public TeamBuilder withRepresentation(Set<Collaborator> setRepresentation) {
        this.m_setRepresentation = new HashSet<>(setRepresentation);
        return this;
    }

    @Override
    public Team build() {
        return new Team(m_oTeamID, m_enumTeamType, m_oAcronym, m_oTeamDescription, m_setRepresentation);
    }
}
