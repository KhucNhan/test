import java.util.ArrayList;
import java.util.Scanner;

public class DSAndA {
//    private static boolean isGreaterOrEqual(String num1, String num2) {
//        return (num1 + num2).compareTo(num2 + num1) > 0;
//    }
//
//    private static void sortByComparator(String[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (!isGreaterOrEqual(numbers[i], numbers[j])) {
//                    String temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] numbers = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.next();
//        }
//
//        sortByComparator(numbers);
//
//        for (String num : numbers) {
//            System.out.print(num);
//        }
//    }

//    public static int bakedTime(int n, int k) {
//        double time = (double) (n * 2) / k;
//        if (time - Math.floor(time) > 0) {
//            return (int) time * 5 + 5;
//        }
//        return (int) time * 5;
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Enter n cake need to bake: ");
//        int n = new Scanner(System.in).nextInt();
//        System.out.print("Enter k cake can bake in 5 minutes: ");
//        int k = new Scanner(System.in).nextInt();
//
//        System.out.println(bakedTime(n,k));
//    }

    public static int findMaxPow(int n) {
        StringBuilder num = new StringBuilder("" + n);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                char temp = num.charAt(i);
                num.setCharAt(i, num.charAt(j));
                num.setCharAt(j, temp);
                numbers.add(Integer.parseInt(num.toString()));
            }
        }
        int max = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max && numbers.get(i) % 45 == 0) {
                max = numbers.get(i);
            }
        }
        if (max != -1) {
            return max;
        }
        return -1;
    }

    public static boolean canDivide(int n) {
        return n % 45 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println(findMaxPow(n));
    }
}
