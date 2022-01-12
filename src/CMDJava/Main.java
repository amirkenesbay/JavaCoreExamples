package CMDJava;

import java.awt.*;
import java.io.*;

public class Main {
    private final static String SEPARATOR = File.separator;
    private final static String CMDCOMMAND = "C:" + SEPARATOR + "Users" + SEPARATOR + "Admin" + SEPARATOR + "Maven.pdf";

    public static void main(String[] args) {
        try {
            File file = new File(CMDCOMMAND);
            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
