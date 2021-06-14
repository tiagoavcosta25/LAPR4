package eapli.base.util;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class FileUtils {
    public static boolean verifyExtension(String filename, String extension) {
        Optional<String> ext = Optional.ofNullable(filename)
                .filter(f -> f.contains("."))
                .map(f -> f.substring(filename.lastIndexOf(".") + 1));
        return ext.map(s -> s.equals(extension)).orElse(false);
    }
}
