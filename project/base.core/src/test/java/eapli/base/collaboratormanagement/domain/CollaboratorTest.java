package eapli.base.collaboratormanagement.domain;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import junit.framework.TestCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CollaboratorTest extends TestCase {


    Date dtBirthDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/1/2000");

    public final Collaborator c = getDummyCollaborator(dummyUser("dummy", BaseRoles.ADMIN), null, 919191919d,
            dtBirthDate, "Lorem", "Ipsum", "Lorem", "Ipsum");

    public CollaboratorTest() throws ParseException {
    }

    public static SystemUser dummyUser(final String username, final Role... roles) {
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    public static Collaborator getDummyCollaborator(final SystemUser oSystemUser, final Collaborator oManager, final Double dblPhoneNumber,
                                                    final Date dtBirthDate, final String strAddress, final String strCompleteName,
                                                    final String strShortName, final String strMechanographicNumber) {
        CollaboratorBuilder collaboratorBuilder = new CollaboratorBuilder();
        collaboratorBuilder = collaboratorBuilder.withSystemUser(oSystemUser);
        collaboratorBuilder = collaboratorBuilder.withManager(oManager);
        collaboratorBuilder = collaboratorBuilder.withPhoneNumber(dblPhoneNumber);
        collaboratorBuilder = collaboratorBuilder.withBirthDate(dtBirthDate);
        collaboratorBuilder = collaboratorBuilder.withAddress(strAddress);
        collaboratorBuilder = collaboratorBuilder.withCompleteName(strCompleteName);
        collaboratorBuilder = collaboratorBuilder.withShortName(strShortName);
        collaboratorBuilder = collaboratorBuilder.withMechanographicNumber(strMechanographicNumber);
        return collaboratorBuilder.build();
    }

    public void testPhoneNumber() {
        CollaboratorPhoneNumber real = c.phoneNumber();
        Double expected = 919191919d;
        assertEquals(real.toString(), expected);
    }

    public void testBirthDate() throws ParseException {
        CollaboratorBirthDate real = c.birthDate();
        Date dtBirthDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/1/2000");
        Date expected = dtBirthDate;
        assertEquals(real.toString(), expected);
    }

    public void testAddress() {
        CollaboratorAddress real = c.address();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    public void testCompleteName() {
        CollaboratorCompleteName real = c.completeName();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    public void testShortName() {
        CollaboratorShortName real = c.shortName();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    public void testMechanographicNumber() {
        CollaboratorMechanographicNumber real = c.mechanographicNumber();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }
}