package Advanced_OOP1.String_Regex;

public class ReplaceFirst {
    public static void main(String[] args) {
//      replaceFirst(): Chỉ thay thế phần tử đầu tiên trong chuỗi khớp với mẫu Regex bằng một chuỗi khác.

        String text = "Java is fun. Java is powerful.";
        // Chỉ thay thế từ "Java" đầu tiên bằng "Python"
        String replacedText = text.replaceFirst("Java", "Python");

        System.out.println(replacedText);
    }
}