package Advanced_OOP1.Regax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

        Pattern pattern = Pattern.compile(phoneNumberRegex);

        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {
                "(84)-(0123456789)",
                "(01)-(0987654321)",
                "(99)-(0123456789)",
                "84-0123456789",
                "(84)-123456789",
                "(841)-(0123456789)",
                "(84)-(01234a6789)",
        };

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber + " là số điện thoại hợp lệ.");
            } else {
                System.out.println(phoneNumber + " không phải là số điện thoại hợp lệ.");
            }
        }
    }
}