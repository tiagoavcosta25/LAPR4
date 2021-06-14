package eapli.base.util;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class OsUtils {

    private static String OS = null;

    public static String getOsName() {
        if(OS == null) { OS = System.getProperty("os.name").toLowerCase(); }
        return OS;
    }

    public static boolean isWindows() {
        return (getOsName().contains("win"));
    }

    public static boolean isMac() {
        return (getOsName().contains("mac"));
    }

    public static boolean isUnix() {
        String osName = getOsName();
        return (osName.contains("nix")
                || osName.contains("nux")
                || osName.indexOf("aix") > 0);
    }

    public static boolean isSolaris() {
        return (getOsName().contains("sunos"));
    }
}
