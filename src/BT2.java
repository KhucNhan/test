import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        double vnd;
        double usd;
        System.out.println("USD:");
        usd = new Scanner(System.in).nextDouble();
        vnd = usd * 23000;
        System.out.println("VND: " + vnd);
    }
}
