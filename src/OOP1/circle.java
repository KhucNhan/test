package OOP1;
public class circle {
    float radius;
    String color;
    circle (float radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public float getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public static void main(String[] args) {
        circle circle1 = new circle(5, "Black");

        System.out.print(circle1.getArea());
        System.out.print(circle1.getRadius());
    }
}