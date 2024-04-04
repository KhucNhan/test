import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        System.out.println("PT bac nhat co dang: ax + b = c");
        System.out.println("Hay nhap a:");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Hay nhap b:");
        b = new Scanner(System.in).nextDouble();
        System.out.println(("Hay nhap c:"));
        c = new Scanner(System.in).nextDouble();
        System.out.println("PT co dang la: " + a + "x + " + b + " = " + c);

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("x: " + answer);
        } else {
            if (b == c) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}
