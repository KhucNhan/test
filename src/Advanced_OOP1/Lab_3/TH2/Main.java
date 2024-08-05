package Advanced_OOP1.Lab_3.TH2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
