package Advanced_OOP1.Lab5_IO;

import Advanced_OOP1.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BT8 {
    public static void main(String[] args) throws IOException {
        // Đường dẫn của tệp nguồn và tệp đích
        String sourceFilePath = "C:\\Users\\ADMIN\\IdeaProjects\\Mobile\\src\\source.txt";
        String targetFilePath = "C:\\Users\\ADMIN\\IdeaProjects\\Mobile\\src\\target.txt";

        // Kiểm tra nếu tệp nguồn tồn tại
        java.io.File sourceFile = new java.io.File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }

        // Kiểm tra nếu tệp đích đã tồn tại
        java.io.File targetFile = new java.io.File(targetFilePath);
        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại!");
        }

        try (
                FileReader reader = new FileReader(sourceFilePath);
                FileWriter writer = new FileWriter(targetFilePath);
        ) {
            int charCount = 0;
            int c;

            // Đọc từ tệp nguồn và ghi vào tệp đích
            while ((c = reader.read()) != -1) {
                writer.write(c);
                charCount++;
            }
            writer.close();
            // Hiển thị số ký tự đã sao chép
            System.out.println("Đã sao chép " + charCount + " ký tự.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
