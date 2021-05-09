package eapli.base.cataloguemanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorBuilder;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import junit.framework.TestCase;

import java.time.LocalDate;


public class CatalogueTest extends TestCase {


    public static SystemUser dummyUser(final String username, final Role... roles) {
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }


    public final Collaborator c = getDummyCollaborator(dummyUser("dummy", BaseRoles.ADMIN), null, 919191919d,
            "+351", LocalDate.of(2000,01,01), "Lorem", "Ipsum",
            "Lorem", 123456l);



    public static Collaborator getDummyCollaborator(final SystemUser oSystemUser, final Collaborator oManager, final Double dblPhoneNumber, final String strPhoneCode,
                                                    final LocalDate dtBirthDate, final String strAddress, final String strCompleteName,
                                                    final String strShortName, final Long lngMechanographicNumber) {
        CollaboratorBuilder collaboratorBuilder = new CollaboratorBuilder();
        collaboratorBuilder = collaboratorBuilder.withSystemUser(oSystemUser);
        collaboratorBuilder = collaboratorBuilder.withManager(oManager);
        collaboratorBuilder = collaboratorBuilder.withPhoneNumber(dblPhoneNumber, strPhoneCode);
        collaboratorBuilder = collaboratorBuilder.withBirthDate(dtBirthDate);
        collaboratorBuilder = collaboratorBuilder.withAddress(strAddress);
        collaboratorBuilder = collaboratorBuilder.withCompleteName(strCompleteName);
        collaboratorBuilder = collaboratorBuilder.withShortName(strShortName, strShortName);
        collaboratorBuilder = collaboratorBuilder.withMechanographicNumber(lngMechanographicNumber);
        return collaboratorBuilder.build();
    }

    public static Catalogue getDummyCatalogue(final String strBriefDescription, final String strCompleteDescription,
                                              final String strTitle, Collaborator oCollaborator) {
        CatalogueBuilder catalogueBuilder = new CatalogueBuilder();
        catalogueBuilder = catalogueBuilder.withTitle(strTitle);
        catalogueBuilder = catalogueBuilder.withBriefDescription(strBriefDescription);
        catalogueBuilder = catalogueBuilder.withCompleteDescription(strCompleteDescription);
        catalogueBuilder = catalogueBuilder.withCollaborator(oCollaborator);
        return catalogueBuilder.build();
    }
    public final Catalogue ct = getDummyCatalogue("Desc1", "Desc2","titulo",c);


    public void testTestEquals() {
        boolean real = c.equals(c);
        assertTrue(real);
    }

    public void testTestHashCode() {
        int real = c.hashCode();
        int expected = c.hashCode();
        assertEquals(real, expected);
    }


    public void testSameAs() {
        boolean real = ct.sameAs(ct);
        assertTrue(real);
    }
    
    public void testAccess() {
    }

    public void testIdentity() {
        Long real = ct.identity();
        assertNull(real);
    }

    public void testCatalogueTitle() {
        CatalogueTitle real = ct.catalogueTitle();
        String expected = "titulo";
        assertEquals(real.toString(), expected);
    }

    public void testCatalogueBriefDescription() {
        CatalogueBriefDescription real = ct.catalogueBriefDescription();
        String expected = "Desc1";
        assertEquals(real.toString(), expected);
    }

    public void testCatalogueCompleteDescription() {
        CatalogueCompleteDescription real = ct.catalogueCompleteDescription();
        String expected = "Desc2";
        assertEquals(real.toString(), expected);
    }


}