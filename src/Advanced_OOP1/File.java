package Advanced_OOP1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Dell\\testfile.txt", true);
            fw.append("hehe \n");
            FileReader fr = new FileReader("C:\\Dell\\testfile.txt");
            BufferedReader reader = new BufferedReader(fr);
            if (reader.readLine().equals("hehe")) {

            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
