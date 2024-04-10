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
