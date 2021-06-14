package eapli.base.util;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class FileChooser {

    public static boolean chooseFile(String extension) {
        if(!OsUtils.isWindows())
            return false;
        File file;
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            // Do nothing
        }
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(true);
        int response = chooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            try{
                if(file.isFile()) {
                    if(!(FileUtils.verifyExtension(file.getName(), extension))) return false;
                    String content = FileUtils.readFileToString(file.getPath());
                    System.out.println(content);
                }
            } catch (Exception e) {
                // Do nothing
            }
        }
        return true;
    }
}
