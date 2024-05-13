package OOP4;

public class Rectangle extends Shape{
    private static double width, length;

    Rectangle() {
        Rectangle.width = 1;
        Rectangle.length = 1;
    }

    Rectangle(double width, double length) {
        Rectangle.width = width;
        Rectangle.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        Rectangle.width = width;
        Rectangle.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        Rectangle.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        Rectangle.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
