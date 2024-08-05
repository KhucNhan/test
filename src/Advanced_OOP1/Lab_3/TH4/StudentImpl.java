package Advanced_OOP1.Lab_3.TH4;

public class StudentImpl extends People implements Student {


    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println("Eating...");
    }


    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }


    @Override
    public void registerCourse(String course) {
        System.out.println("Register " + course + "course successful!");
    }


    @Override
    public void attendClass() {
        System.out.println("Attend class successful!");
    }
}

