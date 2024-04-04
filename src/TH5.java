import java.util.Scanner;

public class TH5 {
    public static void main(String[] args) {
        double h, w, bmi;
        System.out.println("Enter your height (meters)");
        h = new Scanner(System.in).nextDouble();
        System.out.println("Enter your weight (kilograms)");
        w = new Scanner(System.in).nextDouble();
        bmi = w / Math.pow(h,2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gay");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Binh thuong");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "Beo phi");
    }
}
