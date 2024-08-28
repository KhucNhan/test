package Advanced_OOP1.String_Regex;

public class Split {
    // Split(): Dùng để tách một chuỗi thành các phần tử nhỏ hơn
    // dựa trên một mẫu Regex. Nó trả về một mảng các chuỗi con.

    public static void main(String[] args) {
        String text = "one,two,three";
        // Tách chuỗi dựa trên dấu phẩy
        String[] result = text.split(",");

        // In ra các chuỗi con
        for (String word : result) {
            System.out.println(word);
        }
    }
}