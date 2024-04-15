package OOP1;

import java.util.Scanner;

public class temperature {
    int num;
    temperature(int num) {
        this.num = num;
    }

    public void toF() {
        System.out.println("Fahrenheit: " + (num * 33.8));
    }

    public void toK() {
        System.out.println("Kelvin: " + num * 274.15);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter C:");
        int number = scanner.nextInt();
        temperature num = new temperature(number);

        num.toF();
        num.toK();
    }
}
