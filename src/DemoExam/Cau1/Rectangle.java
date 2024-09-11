package DemoExam.Cau1;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private double width;
    private double height;
    public Rectangle (String name, String color, float width, float height) {
        super(name, color);
        this.width = width;
        this.height = height;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    public double calArea() {
        return width * height;
    }
}
