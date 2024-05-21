package CaseStudyOOP.StaffManeger;

public class Worker extends Staff {
    private int experience;

    Worker() {
        super();
        this.setRole("Worker");
    }

    Worker(int experience) {
        super();
        this.experience = experience;
        this.setRole("Worker");
    }

    Worker(String name, int age, String address) {
        super(name, age, address);
        this.setRole("Worker");
    }

    Worker(String name, int age, String address, int experience) {
        super(name, age, address);
        this.experience = experience;
        this.setRole("Worker");
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
