package Buoi2;
public class first_20 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        boolean check = true;
        String index = "";

        while (count <= 20) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                index += num + ", ";
                count++;
            }
            check = true;
            num++;
        }
        System.out.println(index);
    }
}