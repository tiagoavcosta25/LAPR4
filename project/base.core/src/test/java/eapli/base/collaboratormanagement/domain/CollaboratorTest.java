package eapli.base.collaboratormanagement.domain;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import junit.framework.TestCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CollaboratorTest extends TestCase {


    public final Collaborator c = getDummyCollaborator(dummyUser("dummy", BaseRoles.ADMIN), null, 919191919d,
            "+351", LocalDate.of(2000,01,01), "Lorem", "Ipsum", "Lorem", 123456l);

    public CollaboratorTest() throws ParseException {
    }

    public static SystemUser dummyUser(final String username, final Role... roles) {
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

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

    public void testPhoneNumber() {
        String real = c.phoneNumber().toString();
        String expected = "+3519.19191919E8";
        assertEquals(real, expected);
    }

    public void testBirthDate() {
        String real = c.birthDate().toString();
        String expected = LocalDate.of(2000,01,01).toString();
        assertEquals(real, expected);
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
        String expected = "Lorem Lorem";
        assertEquals(real.toString(), expected);
    }

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
        boolean real = c.sameAs(c);
        assertTrue(real);
    }

    public void testId() {
        String real = c.id().toString();
        String excepted = "123456";
        assertEquals(excepted, real);
    }

    public void testIdentity() {
        String real = c.identity().toString();
        String excepted = "123456";
        assertEquals(excepted, real);
    }
}