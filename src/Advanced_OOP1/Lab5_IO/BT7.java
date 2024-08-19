package Advanced_OOP1.Lab5_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BT7 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\ADMIN\\IdeaProjects\\Mobile\\src\\BT7.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    System.out.println(parts[5]);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
