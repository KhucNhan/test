package OOP4;

public class Shape {
    private static String color;
    private static boolean filled;

    Shape() {
        color = "green";
        filled = true;
    }

    Shape(String color, boolean filled) {
        Shape.color = color;
        Shape.filled = filled;
    }

    public static void setColor(String color) {
        Shape.color = color;
    }

    public static void setFilled(boolean filled) {
        Shape.filled = filled;
    }

    public static String getColor() {
        return color;
    }

    public static boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}