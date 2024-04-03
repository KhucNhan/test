package OOP1;
import java.util.Scanner;

public class Sum_Main_Diagonal{
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {1, 3, 5},
                {0, 2, 4}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which diagonal do you want to plus?");
        System.out.println("1. Start from top-left");
        System.out.println("2. Start from top-right");
        int num = scanner.nextInt();
        while (num > 2 || num < 1) {
            System.out.println("Please enter correct number");
            num = scanner.nextInt();
        }
        int sum = 0;
        int length = arr.length;
        if (num == 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == i) {
                        sum += arr[i][j];
                    }
                }
            }
        } else {
            for (int[] ints : arr) {
                for (int j = ints.length - 1; j >= 0; j--) {
                    if (j == length - 1) {
                        sum += ints[j];
                        length -= 1;
                    }
                }
            }
        }
        System.out.println("Total is: " + sum);
    }
}