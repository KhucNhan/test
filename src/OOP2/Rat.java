package OOP2;

public class Rat {
    public String name;
    public double weight;
    public int speed;
    public Boolean condition;
    Rat(String name, double weight, int speed, Boolean condition) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.condition = condition;
    }

    public void sound() {
        System.out.println("Chit chit chit");
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
