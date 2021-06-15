package eapli.base.util;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class FileChooser {

    public static PickedFile chooseFile(String extension) {
        if(!OsUtils.isWindows())
            return new PickedFile("", "");
        File file;
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            // Do nothing
        }
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension, extension);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(filter);
        int response = chooser.showOpenDialog(null);
        String path = "";
        String content = "";
        if (response == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            try{
                if(file.isFile()) {
                    if(!(FileUtils.verifyExtension(file.getName(), extension))) return new PickedFile("", "");
                    path = file.getPath();
                    content = FileUtils.readFileToString(path);
                }
            } catch (Exception e) {
                // Do nothing
            }
        }
        return new PickedFile(path, content);
    }
}
