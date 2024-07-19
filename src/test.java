import java.util.Arrays;

public class test {
    public static boolean isPalindrome(String text) {
        for (int i = 0, j = text.length() - 1; i <= j; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int findMaxStringLength(String[] a) {
        int max = a[0].length();
        for (String s : a) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    public static int findSecondLargestI(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = -1;
            }
        }
        return a[1];
    }

    public static int findSecondLargestII(int[] a) {
        int max = findMax(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) a[i] = -Integer.MAX_VALUE;
        }
        return findMax(a);
    }

    public static int findSecondLargestIII(int[] c) {
        int second = 0;
        for (int j : c) {
            if (j > second && j != findMax(c)) second = j;
        }
        return second;
    }

    public static int findSecondLargestIV(int[] a) {
        int second = a[0];
        for (int i = 1; i < a.length; i++) {
            if (i != findMaxIndex(a)) {
                if (a[i] > second) second = a[i];
            }
        }
        return second;
    }

    public static int findSecondLargestV(int[] a) {
        int max = a[0];
        int second = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            }
            if (a[i] > second && a[i] < max) {
                second = a[i];
            }
        }
        return second;
    }

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static int findMaxIndex(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome(""));
//
//        String[] a = {"1", "11", "111"};
//        System.out.println(findMaxStringLength(a));

//        int[] a = {1,3,6,8,4,37,6};
//        int[] b = {1,3,6,8,4,37,6};
//        int[] c = {1,3,6,8,4,37,6};
//        int[] d = {1,3,6,8,4,37,6};

        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            double x = Math.random() * 1000000 + 1;
            a[i] = (int) x;
        }

        int[] b = new int[1000];
        for (int i = 0; i < b.length; i++) {
            double x = Math.random() * 1000000 + 1;
            b[i] = (int) x;
        }

        int[] c = new int[1000];
        for (int i = 0; i < c.length; i++) {
            double x = Math.random() * 1000000 + 1;
            c[i] = (int) x;
        }

        int[] d = new int[1000];
        for (int i = 0; i < d.length; i++) {
            double x = Math.random() * 1000000 + 1;
            d[i] = (int) x;
        }

        int[] e = new int[1000];
        for (int i = 0; i < e.length; i++) {
            double x = Math.random() * 1000000 + 1;
            e[i] = (int) x;
        }

        long start, end;

        start = System.nanoTime();
        System.out.println(findSecondLargestI(a));
        end = System.nanoTime();
        System.out.println("Time Nano 1: " + (end - start));

        start = System.nanoTime();
        System.out.println(findSecondLargestII(b));
        end = System.nanoTime();
        System.out.println("Time Nano 2: " + (end - start));

        start = System.nanoTime();
        System.out.println(findSecondLargestIII(c));
        end = System.nanoTime();
        System.out.println("Time Nano 3: " + (end - start));

        start = System.nanoTime();
        System.out.println(findSecondLargestIV(d));
        end = System.nanoTime();
        System.out.println("Time Nano 4: " + (end - start));

        start = System.nanoTime();
        System.out.println(findSecondLargestV(e));
        end = System.nanoTime();
        System.out.println("Time Nano 5: " + (end - start));
    }
}
