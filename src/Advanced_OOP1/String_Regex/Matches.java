package Advanced_OOP1.String_Regex;

import java.util.regex.Pattern;

public class Matches {
//    matches(): Kiểm tra toàn bộ chuỗi có khớp với mẫu Regex hay không.
//    Phương thức này trả về true nếu chuỗi khớp hoàn toàn với mẫu, ngược lại trả về false.

    public static void main(String[] args) {
        // Kiểm tra chuỗi "aaaab" có khớp với mẫu "a*b" không
        boolean result = Pattern.matches("a*b", "aaaabb");
        matches(result);
    }

    public static void matches(Boolean result){
        if (result){
            System.out.println("Chuỗi có khớp với mẫu. " );
        }else {
            System.out.println("Chuỗi ko khớp với mẫu.");
        }
    }
}
