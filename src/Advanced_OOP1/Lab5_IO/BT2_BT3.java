package Advanced_OOP1.Lab5_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BT2_BT3 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Khuc Nhan");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        try (FileReader reader = new FileReader("test.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
