package Advanced_OOP1;

public class Student {
    private String name;
    private int age;
    private int studentID;

    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", studentID = " + studentID +
                '}';
    }
}
