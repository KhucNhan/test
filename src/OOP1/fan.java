package OOP1;

public class fan {
    private int speed;
    private boolean on;
    private String color;
    private int radius = 5;
    fan(int speed, int radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public void getSpeed() {
        System.out.println("Speed: " + speed);
    }

    public void getRadius() {
        System.out.println("Radius" + radius);
    }

    public void getColor() {
        System.out.println("Color" + color);
    }

    public void getStatus() {
        System.out.println("Status" + on);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(boolean on) {
        this.on = on;
    }

    public String toString() {
        String infor = "speed: " + speed + ", radius: " + radius + ", color: " + color + ", status: " + on;
        System.out.println(infor);
        return infor;
    }
    public static void main(String[] args) {
        fan fan1 = new fan(5, 10, "red", true);
        fan fan2 = new fan(7,7,"blue",false);
        fan1.toString();
    }
}
