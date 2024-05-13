package OOP4.Circle_Cylinder;

public class Cylinder extends Circle{
    private static double height;
    Cylinder() {
        super();
        height = 1;
    }

    Cylinder(double height) {
        super();
        Cylinder.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius,color);
        Cylinder.height = height;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Cylinder.height = height;
    }

    public static double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + " , height: "
                + getHeight()
                + " and color: "
                + getColor();
    }
}
