import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        System.out.println("Hay nhap nam hien tai:");
        double year = new Scanner(System.in).nextDouble();
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("Nam " + year + " la nam nhuan");
        } else {
            System.out.println("Nam " + year + " khong phai nam nhuan");
        }
    }
}
