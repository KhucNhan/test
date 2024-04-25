package OOP3;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double r) {
        radius = r;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir.getRadius());
        System.out.println(cir.getArea());
    }
}
