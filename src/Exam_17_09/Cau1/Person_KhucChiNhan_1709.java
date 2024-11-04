package Exam_17_09.Cau1;

public class Person_KhucChiNhan_1709 {
    private String personID_KhucChiNhan_1709;
    private String personName_KhucChiNhan_1709;
    private String dateOfBirth_KhucChiNhan_1709;

    public Person_KhucChiNhan_1709() {}

    public Person_KhucChiNhan_1709(String personID, String personName, String dateOfBirth) {
        personID_KhucChiNhan_1709 = personID;
        personName_KhucChiNhan_1709 = personName;
        dateOfBirth_KhucChiNhan_1709 = dateOfBirth;
    }

    public String getID_KhucChiNhan_1709() {
        return personID_KhucChiNhan_1709;
    }

    public void setID_KhucChiNhan_1709(String personID_KhucChiNhan_1709) {
        this.personID_KhucChiNhan_1709 = personID_KhucChiNhan_1709;
    }

    public String getName_KhucChiNhan_1709() {
        return personName_KhucChiNhan_1709;
    }

    public void setName_KhucChiNhan_1709(String personName_KhucChiNhan_1709) {
        this.personName_KhucChiNhan_1709 = personName_KhucChiNhan_1709;
    }

    public String getDateOfBirth_KhucChiNhan_1709() {
        return dateOfBirth_KhucChiNhan_1709;
    }

    public void setDateOfBirth_KhucChiNhan_1709(String dateOfBirth_KhucChiNhan_1709) {
        this.dateOfBirth_KhucChiNhan_1709 = dateOfBirth_KhucChiNhan_1709;
    }

    public String toString_KhucChiNhan_1709() {
        return "Person {" +
                "personID ='" + personID_KhucChiNhan_1709 + '\'' +
                ", personName ='" + personName_KhucChiNhan_1709 + '\'' +
                ", dateOfBirth ='" + dateOfBirth_KhucChiNhan_1709 + '\'' +
                '}';
    }
}
