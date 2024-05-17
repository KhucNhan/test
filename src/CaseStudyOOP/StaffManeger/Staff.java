package CaseStudyOOP.StaffManeger;

public class Staff {
    private String name, address;
    private int age;

    Staff() {

    }

    Staff(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + getName()
                + "  ||  Age: " + getAge()
                + "  ||  Address: " + getAddress();
    }
}
