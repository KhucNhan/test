package CaseStudyOOP.StaffManeger;

public class Worker extends Staff {
    private String role = "Worker";
    private int experience;

    Worker() {
        super();
    }

    Worker(int experience) {
        super();
        this.experience = experience;
    }

    Worker(String name, int age, String address) {
        super(name, age, address);
    }

    Worker(String name, int age, String address, int experience) {
        super(name, age, address);
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "Name: " + getName()
                + "  ||  Age: " + getAge()
                + "  ||  Address: " + getAddress()
                + "  ||  Role: " + getRole()
                + "  ||  Year experience: " + getExperience();
    }
}
