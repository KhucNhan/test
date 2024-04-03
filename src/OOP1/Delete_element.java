package OOP1;
import java.util.Arrays;
import java.util.Scanner;

public class Delete_element {
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
        System.out.println("Enter delete number (not position) : ");
        int num = scanner.nextInt();

        int a = 0;
        int[] new_arr = new int[arr.length - 1];

        for (int b = 0; b < size; b++) {
            if (arr[b] != num) {
                new_arr[a] = arr[b];
                a++;
            }
        }

//        for (int i = 0; i < size; i++) {
//            if (arr[i] == num) {
//                size -= 1;
//                for (int j = i; j < size; j++) {
//                    arr[j] = arr[j + 1];
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
        System.out.print("Array after remove " + num + " is: " + Arrays.toString(new_arr) + "length: " + new_arr.length);
    }
}