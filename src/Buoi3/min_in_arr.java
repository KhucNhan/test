package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class min_in_arr {
    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want ?");

        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20 || size < 0) {
                System.out.println("Size must be under 21 and above 1");
            }
        } while (size > 20 || size < 0);

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + " number in the array:");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        System.out.println("The smallest number in the array is: " + min);
    }
}
