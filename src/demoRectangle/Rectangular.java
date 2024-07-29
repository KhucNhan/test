package demoRectangle;

import demoRectangle.Rectangle;

public class Rectangular extends Rectangle {
    private int height;

    public Rectangular(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return (super.getPerimeter() * 4 + (getWidth() + height) * 2 * 2);
    }

    @Override
    public int getArea() {
        return super.getArea() * height;
    }
}

//class Main {
//    public static void main(String[] args) {
//        demoRectangle.Rectangle rec1 = new demoRectangle.Rectangle(5,6);
//        System.out.println(rec1.getArea());
//
//        demoRectangle.Rectangular relar2 = new demoRectangle.Rectangular(5,6,7);
//        System.out.println(relar2.getArea());
//    }
//}