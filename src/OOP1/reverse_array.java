package OOP1;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        arr = new int[size];
        int a = 0;
        while (a < arr.length) {
            System.out.print("Enter element " + (a + 1) + ": ");
            arr[a] = scanner.nextInt();
            a++;
        }
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        for (int i = 0; i < (double) ((arr.length) / 2); i++) {
            int x = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = x;
        }
        System.out.print("Array after reverse: " + Arrays.toString(arr));
    }
}