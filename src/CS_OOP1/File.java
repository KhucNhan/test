package CS_OOP1;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Dell\\testfile.txt", true);
            fw.append("hehe \n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
