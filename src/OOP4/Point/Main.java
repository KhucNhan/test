package OOP4.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Point a = new Point(5,9);
        MoveablePoint b = new MoveablePoint(2,2);

//        System.out.println(Arrays.toString(a.getXY()));
//        a.setXY(4,4);


        System.out.println(Arrays.toString(b.getXY()));
        b.move();
        //chain -> xich
        System.out.println(Arrays.toString(b.getXY()));
    }
}
