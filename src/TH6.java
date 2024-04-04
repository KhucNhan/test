import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        System.out.println("Enter month:");
        int month = new Scanner(System.in).nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month have 30 days");
                break;
            case 2:
                System.out.println("This month have 28 days or 29 days");
        }
    }
}
