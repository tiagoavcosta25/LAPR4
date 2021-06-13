package eapli.base.collaboratormanagement.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class CollaboratorTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullPhoneNumber() {
        System.out.println("\nCollaborator With Null Phone Number.\n");
        final Collaborator subject = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongPhoneNumberLength() {
        System.out.println("\nCollaborator With Wrong Phone Number Length.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 9666666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullBirthDate() {
        System.out.println("\nCollaborator With Null Birth Date.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d), null,
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongBirthDate() {
        System.out.println("\nCollaborator With Birth Date Set in the Future.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullAddress() {
        System.out.println("\nCollaborator With Null Address.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                null, CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithEmptyAddress() {
        System.out.println("\nCollaborator With Empty Address.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf(""), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullCompleteName() {
        System.out.println("\nCollaborator With Null Complete Name.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),null,
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithEmptyCompleteName() {
        System.out.println("\nCollaborator With Empty Complete Name.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf(""),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongCompleteNameRegex() {
        System.out.println("\nCollaborator With Wrong Complete Name Regex.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("N4M3"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullShortName() {
        System.out.println("\nCollaborator With Null Short Name.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("Complete Name"),null,
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithEmptyShortName() {
        System.out.println("\nCollaborator With Empty Short Name.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("", ""),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongShortNameRegex() {
        System.out.println("\nCollaborator With Wrong Short Name Regex.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("N4M3"),
                CollaboratorShortName.valueOf("F1rst", "L4st"),
                CollaboratorMechanographicNumber.valueOf(1919l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithNullMechanographicNumber() {
        System.out.println("\nCollaborator With Null Mechanographic Number.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"), null);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongMechanographicNumberNegative() {
        System.out.println("\nCollaborator With Wrong Mechanographic Number Negative.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("N4M3"),
                CollaboratorShortName.valueOf("F1rst", "L4st"),
                CollaboratorMechanographicNumber.valueOf(-12l));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildCollaboratorWithWrongMechanographicNumberLength() {
        System.out.println("\nCollaborator With Wrong Mechanographic Number Length.\n");
        final Collaborator subject = new Collaborator(null, null,
                CollaboratorPhoneNumber.valueOf("+351", 966666666d),
                CollaboratorBirthDate.valueOf(LocalDate.of(2023,01,01)),
                CollaboratorAddress.valueOf("Address Street"),CollaboratorCompleteName.valueOf("N4M3"),
                CollaboratorShortName.valueOf("F1rst", "L4st"),
                CollaboratorMechanographicNumber.valueOf(12121212l));
        assertTrue(subject != null);
    }

}