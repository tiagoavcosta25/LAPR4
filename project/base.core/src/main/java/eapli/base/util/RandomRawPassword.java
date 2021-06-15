package eapli.base.util;

import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.PasswordPolicy;
import eapli.framework.strings.util.Strings;

public class RandomRawPassword {
    private static final int DEFAULT_LENGTH = 12;
    private static final String LOWER_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CHARS = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "_-+*/=#?!.&$€";
    public static final String ALLOWED_CHARS;
    private final String rawPassword;

    static {
        ALLOWED_CHARS = LOWER_CHARS + UPPER_CHARS + NUMBERS + SPECIAL;
    }

    public RandomRawPassword() {
        this(DEFAULT_LENGTH);
    }

    public RandomRawPassword(final int length) {
        PasswordPolicy pp = new BasePasswordPolicy();
        String tmp = Strings.randomString(length, ALLOWED_CHARS);
        while(!pp.isSatisfiedBy(tmp)) tmp = Strings.randomString(length, ALLOWED_CHARS);
        this.rawPassword = tmp;
    }

    public String toString() {
        return this.rawPassword;
    }
}
