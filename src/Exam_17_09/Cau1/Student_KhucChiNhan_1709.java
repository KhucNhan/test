package Exam_17_09.Cau1;

public class Student_KhucChiNhan_1709 extends Person_KhucChiNhan_1709 {
    private double markAvg_KhucChiNhan_1709;

    public Student_KhucChiNhan_1709(String personID, String personName, String dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        markAvg_KhucChiNhan_1709 = markAvg;
    }

    public double getMarkAvg_KhucChiNhan_1709() {
        return markAvg_KhucChiNhan_1709;
    }

    public void setMarkAvg_KhucChiNhan_1709(double markAvg) {
        markAvg_KhucChiNhan_1709 = markAvg;
    }

    @Override
    public String toString_KhucChiNhan_1709() {
        return "Student {" +
                "personID ='" + getID_KhucChiNhan_1709() + '\'' +
                ", personName ='" + getName_KhucChiNhan_1709() + '\'' +
                ", dateOfBirth ='" + getDateOfBirth_KhucChiNhan_1709() + '\'' +
                ", markAvg ='" + getMarkAvg_KhucChiNhan_1709() + '\'' +
                '}';
    }
}
