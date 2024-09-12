package AdvancedDemoExam.Cau2;

import java.util.regex.Pattern;

public class RegexName {
    private static final String NAME_REGEX = "^[a-zA-ZÀ-ỹ\\s-]+$";

    public static boolean isValidName(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }

    public static void main(String[] args) {
        String bookName = "Cuốn sách - Tác giả";
        String authorName = "Nguyễn Văn A";

        System.out.println(isValidName(bookName));
        System.out.println(isValidName(authorName));
    }
}
