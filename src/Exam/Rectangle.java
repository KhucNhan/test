package Exam;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double[] getXY() {
        return new double[]{this.x, this.y};
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calArea() {
        return this.width * this.height;
    }

    public String render() {
        return "demoRectangle.Rectangle: X: " + getX() +
                ", Y: " + getY() +
                ", Width: " + getWidth() +
                ", Height: " + getHeight() +
                ", Color: " + getColor();
    }
}
