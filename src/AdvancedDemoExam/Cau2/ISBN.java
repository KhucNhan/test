package AdvancedDemoExam.Cau2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ISBN {
    private static final String ISBN_10_REGEX = "^(\\d{9}[\\dX])$|^(\\d{1}-\\d{3}-\\d{5}-[\\dX])$";

    private static final String ISBN_13_REGEX = "^(\\d{13})$|^(\\d{3}-\\d-\\d{3}-\\d{5}-\\d)$";

// ký tự $ ở cuối để kiểm tra xem chuỗi đã hết sau khi kiểm tra xong chưa
// nếu không có: khi định dạng ở đầu đúng, nhưng có ký tự thứ 11 hoặc 14 thì chuỗi sai nhưng kết quả trả đúng

    public static boolean isValidISBN(String isbn) {
        return Pattern.matches(ISBN_10_REGEX, isbn) || Pattern.matches(ISBN_13_REGEX, isbn);
    }

    public static void main(String[] args) {
        String isbn1 = "978-0-306-40615-7";
        String isbn2 = "0-306-40615-2";

        System.out.println(isValidISBN(isbn1));
        System.out.println(isValidISBN(isbn2));
    }
}
