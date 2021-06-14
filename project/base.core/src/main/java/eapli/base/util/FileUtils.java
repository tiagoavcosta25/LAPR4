package eapli.base.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public static String readFileToString(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }
}
