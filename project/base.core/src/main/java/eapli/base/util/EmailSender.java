package eapli.base.util;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EmailSender {
    private static final String DIR = ".\\email_log";

    public static void send(String strSender, String strReceiver, String strSubject, String strContent, String strFileName) {
        try {
            String strEmail = "From: " + strSender + "\nTo: " + strReceiver + "\n\nSubject: " + strSubject + "\n\n" + strContent;

            File oFile = new File(DIR + "\\" + strFileName + ".txt");
            PrintWriter oPrintWriter = new PrintWriter(oFile);
            oPrintWriter.println(strEmail);
            oPrintWriter.flush();
            oPrintWriter.close();
            System.out.println("\n\nEmail Sent to " + strReceiver + "!\n\n Email Content: " + strContent +"\n");
        } catch (FileNotFoundException e){
            System.out.println("Email Error!");
        }
    }

}
