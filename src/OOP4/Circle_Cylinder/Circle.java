package OOP4.Circle_Cylinder;

public class Circle {

    private static double radius;
    private static String color;

    Circle() {
        radius = 1;
        color = "Yellow";
    }

    Circle(double radius, String color) {
        Circle.radius = radius;
        Circle.color = color;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
       Circle.radius = radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Circle.color = color;
    }

    public static double getArea() {
        return radius * radius * Math.PI;
    }

    public static double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " and color: "
                + getColor();
    }
}