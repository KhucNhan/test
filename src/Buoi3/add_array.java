package Buoi3;

import java.util.Arrays;

public class add_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {7, 8 ,9};
        int[] arr2;
        arr2 = new int[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i + arr.length] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
