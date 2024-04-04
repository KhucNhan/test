import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        System.out.println("Nhap diem chuyen can:");
        double cc = new Scanner(System.in).nextDouble();

        System.out.println("Nhap diem kiem tra:");
        double kt = new Scanner(System.in).nextDouble();

        System.out.println("Nhap diem thi:");
        double t = new Scanner(System.in).nextDouble();

        double avg = (cc / 10) + (kt * 2 / 5) + (t / 2) ;

        if (avg >= 8.5 ) {
            System.out.println("DTB: " + avg + " - rank A");
        } else if (avg >= 7) {
            System.out.println("DTB: " + avg + " - rank B");
        } else if (avg >= 5.5) {
            System.out.println("DTB: " + avg + " - rank C");
        } else if (avg >= 4) {
            System.out.println("DTB: " + avg + " - rank D");
        } else {
            System.out.println("DTB: " + avg + " - rank F");
        }
    }
}
