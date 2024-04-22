package OOP2;

public class Apple {
    static int weight = 10;

    Apple(int weight) {
        Apple.weight = weight;
    }

    public void decrease() {

    }

//    public boolean isEmpty() {
//
//    }

    public int getWeight() {
        return Apple.weight;
    }

    public static void main(String[] args) {

    }
}

class Human {
    int weight;
    String name;
    boolean gender;

    Human(String name, boolean gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void say() {
        System.out.println(this.name + " saying: damn, this person so damn hot <3");
    }

    public String getName() {
        if (this.gender) {
            return "he is " + this.name;
        } else {
            return "she is " + this.name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(Apple apple) {
        System.out.println(this.name + " is eating " + apple);
    }

//    public boolean checkApple(Apple apple) {
//        return ;
//    }
}