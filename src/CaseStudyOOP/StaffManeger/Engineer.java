package CaseStudyOOP.StaffManeger;

public class Engineer extends Staff {
    private String certificate;

    Engineer() {
        super();
        setRole("Engineer");
    }

    Engineer(String certificate) {
        super();
        this.certificate = certificate;
        setRole("Engineer");
    }

    Engineer(String name, int age, String address) {
        super(name, age, address);
        setRole("Engineer");
    }

    Engineer(String name, int age, String address, String certificate) {
        super(name, age, address);
        this.certificate = certificate;
        setRole("Engineer");
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String toString() {
        return "Name: " + getName()
                + "  ||  Age: " + getAge()
                + "  ||  Address: " + getAddress()
                + "  ||  Role: " + getRole()
                + "  ||  Certificate: " + getCertificate();
    }
}
