package Buoi3;

import java.util.Scanner;

public class sum_col {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {1, 3, 5, 7, 9},
                {0, 2, 4, 6, 8}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which column do you want to plus?");
        int col = scanner.nextInt();
        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (j == col - 1) {
                    sum += ints[j];
                }
            }
        }
        System.out.println("Total of column " + col + " is: " + sum);
    }
}
