package OOP1;
import java.util.Scanner;

public class Count_Graduated_Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] point;
        int size;
        int count = 0;

        do {
            System.out.print("Enter number of students:");
            size = scanner.nextInt();
            if (size > 30 || size < 0) {
                System.out.println("Number of students must under 30 and above 0");
            }
        } while (size > 30 || size < 0);

        point = new int[size];
        System.out.println("Enter student's point");

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " student: ");
            point[i] = scanner.nextInt();

            while (point[i] > 10 || point[i] < 0) {
                System.out.println("Please enter correct number");
                System.out.print((i + 1) + " student: ");
                point[i] = scanner.nextInt();
            }

            if (point[i] >= 5) {
                count += 1;
            }
        }

        System.out.println("Number of graduated students is: " + count);
    }
}