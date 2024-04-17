package OOP2;
public class Tom_And_Jerry {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 4, 5);
        Rat rat = new Rat("Jerry", 0.5, 4, true);
        cat.sound();
        rat.sound();
        cat.name();
        rat.name();
//        cat.weight();
//        rat.weight();
        hunt(cat,rat);
        cat.weight();
    }

    public static void hunt(Cat cat, Rat rat) {
        if ((cat.speed > rat.speed) && (rat.condition)) {
            System.out.println(rat.name + " has been eaten.");
            cat.weight += rat.weight;
        } else if ((cat.speed < rat.speed) && (rat.condition)) {
            System.out.println(rat.name + " has been escape.");
        } else {
            System.out.println(rat.name + " is already dead.");
        }
    }
}

class Rat {
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

class Cat {
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