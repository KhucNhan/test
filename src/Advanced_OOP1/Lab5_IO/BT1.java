package Advanced_OOP1.Lab5_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BT1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test.txt")) {
            reader.read();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
