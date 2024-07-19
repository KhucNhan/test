package Exam;

import java.util.Arrays;

public class AppRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(1, 1, 2, 6);

        rec1.setColor("Yellow");
        rec2.setColor("Light blue");

        System.out.println(Arrays.toString(rec1.getXY()));
        System.out.println(Arrays.toString(rec2.getXY()));

        System.out.println(rec1.calArea());
        System.out.println(rec2.calArea());

        System.out.println(rec1.render());
        System.out.println(rec2.render());

        Square square1 = new Square(0, 0, 5);
        System.out.println(square1.calArea());
        System.out.println(square1.render());
    }
}
