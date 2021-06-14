package eapli.base.util;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class PickedFile {

    private final String path;

    private final String content;

    public PickedFile(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public String getContent() {
        return content;
    }
}
