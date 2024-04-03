package OOP1;
public class rectangle {
    int width, height;

    rectangle (int widht, int height) {
        this.width = widht;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width * this.height) * 2;
    }

    public int setWidth(int width) {
        return this.width = width;
    }

    public int setLong(int height) {
        return this.height = height;
    }

    public void draw() {
        for (int i = 0; i < this.height; i++) {
            System.out.print(" *");
            for (int j = 0; j < this.width; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(3, 5);
        System.out.println(rectangle1.getArea());

        rectangle1.draw();
    }
}