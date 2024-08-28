package Advanced_OOP1.String_Regex;

public class ReplaceAll {
    //replaceAll(): Thay thế tất cả các phần của chuỗi khớp với mẫu Regex bằng một chuỗi khác.
    public static void main(String[] args) {
        String text = "Java is fun. Java is powerful.";
        // Thay thế tất cả các từ "Java" bằng "Python"
        String replacedText = text.replaceAll("Java", "Python");

        System.out.println(replacedText); // Kết quả: Python is fun. Python is powerful.
    }
}


