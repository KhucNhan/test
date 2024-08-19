package Advanced_OOP1.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\Mobile\\src\\Advanced_OOP1\\BufferedWriter\\ex.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("text");
            buffer.close();
            System.out.println("Success...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
