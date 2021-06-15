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


}
