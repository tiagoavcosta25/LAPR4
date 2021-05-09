package eapli.base.teammanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorBuilder;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import junit.framework.TestCase;
import org.junit.BeforeClass;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class TeamTest extends TestCase {

    public Team t = getDummyTeam("ID1", "Acronimo", "Descricao", TeamType.HR.toString(), new HashSet<>());

    public static Team getDummyTeam(final String id, final String acronym, final String description,
                                    final String tt, Set<Collaborator> t) {
        TeamBuilder teamBuilder = new TeamBuilder();
        return teamBuilder.withTeamID(id).withAcronym(acronym).withTeamDescription(description).withTeamType(tt).withRepresentation(t).build();
    }

   public void testAcronym() {
        String real = t.acronym().toString();
        String expected = "Acronimo";
        assertEquals(expected, real);
   }

   public void testDescription() {
        String real = t.teamDescription().toString();
        String expected = "Descricao";
        assertEquals(expected, real);
   }

   public void testId() {
        String real = t.identity().toString();
        String expected = "ID1";
        assertEquals(expected, real);
   }

   public void testTeamType() {
        String real = t.teamType().toString();
        String expected = TeamType.HR.toString();
        assertEquals(expected, real);
   }
}