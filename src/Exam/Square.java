package Exam;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double x, double y) {
        super(x, y);
    }

    public Square(double x, double y, double side) {
        super(x, y, side, side);
    }

    public Square(double x, double y, double side, String color) {
        super(x, y, side, side, color);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }

    public double calArea() {
        return Math.pow(getSide(), 2);
    }

    public String render() {
        return "Square: X: " + getX() +
                ", Y: " + getY() +
                ", Side: " + getWidth() +
                ", Color: " + getColor();
    }
}
