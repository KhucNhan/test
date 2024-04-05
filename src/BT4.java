import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("enter number");
        String num = new Scanner(System.in).next();
        int number = parseInt(num);
        while ((number >= 1000) || (number < 0)) {
            System.out.println("vui long nhap so nguyen duong co tu 1 den 3 chu so");
            num = new Scanner(System.in).next();
            number = parseInt(num);
        }
        String tens, ones, hundreds;
        ones = one(num.charAt(num.length() - 1) - '0');
        tens = ten(num.charAt(num.length() - 2) - '0');
        hundreds = hundred(num.charAt(num.length() - 3) - '0');

        if (num.length() == 3) {
            System.out.println(hundreds + tens + ones);
        } else if ((num.length() == 2) && (number >= 20)) {
            System.out.println(tens + ones);
        } else if ((11 <= number) && (number < 20)) {
            switch (number) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else {
            System.out.println(ones);
        }
    }

    public static String hundred(int hundredsNumLength) {
        return switch (hundredsNumLength) {
            case 9 -> "nine hundred ";
            case 8 -> "eight hundred ";
            case 7 -> "seventy hundred ";
            case 6 -> "sixty hundred ";
            case 5 -> "five hundred ";
            case 4 -> "four hundred ";
            case 3 -> "three hundred ";
            case 2 -> "two hundred ";
            case 1 -> "one hundred ";
            case 0 -> " ";
            default -> "";
        };
    }

    public static String ten(int tensNumLength) {
        return switch (tensNumLength) {
            case 9 -> "ninety ";
            case 8 -> "eighty ";
            case 7 -> "seventy ";
            case 6 -> "sixty ";
            case 5 -> "fifty ";
            case 4 -> "forty ";
            case 3 -> "thirty ";
            case 2 -> "twenty ";
            default -> "";
        };
    }

    public static String one(int onesNumLength) {
        return switch (onesNumLength) {
            case 9 -> "nine";
            case 8 -> "eight";
            case 7 -> "seven";
            case 6 -> "six";
            case 5 -> "five";
            case 4 -> "four";
            case 3 -> "three";
            case 2 -> "two";
            case 1 -> "one";
            default -> "";
        };
    }
}