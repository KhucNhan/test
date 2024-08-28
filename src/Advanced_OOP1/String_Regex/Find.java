package Advanced_OOP1.String_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    public static void main(String[] args) {
//        find(): Dùng để tìm kiếm các phần tử trong chuỗi khớp với mẫu Regex.
//        Phương thức này trả về true nếu tìm thấy phần tử khớp, false nếu không tìm thấy.

        Pattern pattern = Pattern.compile("is");
        Matcher matcher = pattern.matcher("This is a test.");

        // Tìm tất cả các vị trí khớp với mẫu "is"
        while (matcher.find()) {
            System.out.println("Found at: " + matcher.start());
            //matcher start() sẽ lấy vị trí ban đầu của nó sau khi đc tìm thấy.
        }
    }
}