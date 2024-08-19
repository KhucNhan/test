package Advanced_OOP1.Lab5_IO;

import java.io.File;

import javax.swing.plaf.PanelUI;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BT5 {
    public static void main(String[] args) throws IOException {
        File file = new File("BT5.txt");
        writeToFile(file,"hello world");
        readFile(file);
    }

    public static void readFile(File file) throws IOException {
        FileReader reader = new FileReader(String.valueOf(file));
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
    }

    public static boolean writeToFile (File file, String text) throws IOException {
        FileWriter writer = new FileWriter(String.valueOf(file));
        try {
            writer.write(text);
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
