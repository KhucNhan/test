package OOP2;
public class Cat {
    public String name;
    public double weight;
    public int speed;
    Cat(String name, double weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public void sound() {
        System.out.println("Meow meow");
    }

    public void name() {
        System.out.println(this.name);
    }

    public void speed() {
        System.out.println(this.speed);
    }

    public void weight() {
        System.out.println(this.weight);
    }
}
