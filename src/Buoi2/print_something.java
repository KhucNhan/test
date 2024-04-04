package Buoi2;
import java.util.Scanner;

public class print_something {
    public static void main(String[] args) {
        int number = -1;
        System.out.println("0. Exit");
        System.out.println("1. rectangle");
        System.out.println("2. square triangle - top-left");
        System.out.println("3. square triangle - bottom-left");
        System.out.println("4. square triangle - top-right");
        System.out.println("5. square triangle - bottom-right");
        System.out.println("6. isosceles triangle");
        while (number != 0) {
            System.out.println("-------------------------------------");
            System.out.println("Enter number:");
            number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 5; i >= 1; i--) {
                        for (int x = 4; x >= i; x--) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        for (int x = 4; x >= i; x--) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
//                    for (int i = 5; i >= 1; i--) {
//                        for (int j = 1; j <= i; j++) {
//                            System.out.print(" ");
//                        }
//                        for (int j = 5; j >= i; j--) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
                    for (int i = 1; i <= 5; ++i) {
                        for (int space = 1; space <= 5 - i; ++space) {
                            System.out.print("  ");
                        }
                        int k = 0;
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}