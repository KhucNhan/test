package Buoi3;

public class max_in_two_dimentional_arr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        int max = arr[0][0];

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }

        System.out.println(max);
    }
}
