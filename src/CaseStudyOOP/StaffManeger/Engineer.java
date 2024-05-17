package CaseStudyOOP.StaffManeger;

public class Engineer extends Staff {
    private String role = "Engineer";
    private String certificate;

    Engineer() {
        super();
    }

    Engineer(String certificate) {
        super();
        this.certificate = certificate;
    }

    Engineer(String name, int age, String address) {
        super(name, age, address);
    }

    Engineer(String name, int age, String address, String certificate) {
        super(name, age, address);
        this.certificate = certificate;
    }

    public String getRole() {
        return role;
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
