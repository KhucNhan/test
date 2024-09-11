package DemoExam.Cau1;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("Rectangle 1", "Yellow", 1, 1);
        Shape rec2 = new Rectangle("Rectangle 2", "Red", 5, 5);

        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
    }
}
