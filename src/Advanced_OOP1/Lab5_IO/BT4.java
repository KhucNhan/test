package Advanced_OOP1.Lab5_IO;

import java.io.File;
import java.io.IOException;

public class BT4 {
    public static void main(String[] args) {
        File file = new File("BT4.txt");
        if (file.exists()) {
            System.out.println("true");
        }
        if (file.isFile()) {
            System.out.println("this is file");
        }
        System.out.println(file.getAbsolutePath());
    }
}
