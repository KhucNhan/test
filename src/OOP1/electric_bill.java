package OOP1;
import java.util.Scanner;

public class electric_bill {
    public static void main(String[] args) {
        System.out.println("Nhap so dien da tieu thu");
        int num;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num > 400) {
            total += (num - 400) * 2927;
            num = 400;
        } if (num > 300) {
            total += (num - 300) * 2834;
            num = 300;
        } if (num > 200) {
            total += (num - 200) * 2536;
            num = 200;
        } if (num > 100) {
            total += (num - 100) * 2014;
            num = 100;
        } if (num > 50) {
            total += (num - 50) * 1734;
            num = 50;
        } if (num > 0) {
            total += num * 1678;
        }

        System.out.println("tong so tien phai dong la: " + total);
    }
}
