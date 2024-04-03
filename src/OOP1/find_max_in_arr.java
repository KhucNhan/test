package OOP1;
import java.util.Arrays;
import java.util.Scanner;

public class find_max_in_arr {
    public static void main(String[] args) {
        int size, max = 0, index = 0;
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

        System.out.println("Array: " + Arrays.toString(arr));

        for (int j : arr) {
            if (max < j) {
                max = j;
                index += 1;
            }
        }

        System.out.println("The largest number in the array is: " + max + " at position " + index);
    }
}