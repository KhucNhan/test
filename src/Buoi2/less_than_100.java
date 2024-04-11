package Buoi2;

public class less_than_100 {
    public static void main(String[] args) {
        int num = 2;
        boolean check = true;
        String index = "";

        while (num < 100) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                index += num + ", ";
            }
            check = true;
            num++;
        }
        System.out.println(index);
    }
}
