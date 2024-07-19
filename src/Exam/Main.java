package Exam;

public class Main {
    public static boolean isSquare(int number) {
        double sqrtNumber = Math.sqrt(number);
        return sqrtNumber - Math.floor(sqrtNumber) == 0;
    }

    public static double findMinScore(double[] numbers) {
        double min = numbers[0];
        for (double index : numbers) {
            if (index < min) min = index;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(-4));

        double[] numbers = {3.1, 6.6, 3.2, 1.7, 0, -1};
        System.out.println(findMinScore(numbers));
    }
}
