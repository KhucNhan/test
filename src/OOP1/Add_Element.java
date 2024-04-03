package OOP1;
import java.util.Arrays;
import java.util.Scanner;

public class Add_Element {
    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want ?");

        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size <= 0)
                System.out.println("Size must be above 0");
        } while (size <= 0);

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + " number in the array:");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Enter number to add: ");
        int num = scanner.nextInt();
        int[] new_arr = new int[arr.length + 1];

        for (int a =0, b = 0; b < size; b++) {
            new_arr[b] = arr[a];
            a++;
        }
        new_arr[size] = num;

        System.out.println("Array: " + Arrays.toString(new_arr));
    }
}