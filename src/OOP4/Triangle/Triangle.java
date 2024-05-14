package OOP4.Triangle;

public class Triangle extends Shape {
    double side1, side2, side3;
    Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "3 sides of triangle: " + side1 + " " + side2 + " " + side3;
    }
}
