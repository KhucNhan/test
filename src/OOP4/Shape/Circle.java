package OOP4.Shape;

public class Circle extends Shape {
    private static double radius;
    Circle() {
        radius = 1;
    }

    Circle(double radius) {
        Circle.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color,filled);
        Circle.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
