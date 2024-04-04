import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap chieu rong");
        width = sc.nextFloat();
        
        System.out.println("Nhap chieu dai");
        height = sc.nextFloat();

        float result = width * height;
        System.out.println("Result is: " + result);
    }
}
