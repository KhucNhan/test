package Advanced_OOP1.String_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartternAndMatcher {
//    Pattern: Đại diện cho một mẫu (pattern) biểu thức chính quy (Regex) đã được biên dịch.
//    Pattern giúp kiểm tra một chuỗi có tuân theo một quy tắc cụ thể nào đó hay không.
//    Matcher: Là đối tượng giúp tìm kiếm và khớp mẫu Pattern với chuỗi cần kiểm tra.

    public static void main(String[] args) {
        // Biên dịch một mẫu Regex thành Pattern
        Pattern pattern = Pattern.compile("a*b");

        // Tạo Matcher để kiểm tra chuỗi với mẫu Pattern
        //xem xét liệu a có lặp lại nhiều lận rồi đến b hay không ?
        Matcher matcher = pattern.matcher("aaaab");

        // Kiểm tra xem chuỗi có khớp với mẫu không
        boolean matchFound = matcher.matches();

        if (matchFound) {
            System.out.println("Chuỗi khớp với mẫu Regex!");
        } else {
            System.out.println("Chuỗi không khớp với mẫu Regex.");
        }
    }
}
