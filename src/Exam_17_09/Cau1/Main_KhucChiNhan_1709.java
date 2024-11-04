package Exam_17_09.Cau1;

public class Main_KhucChiNhan_1709 {
    public static void main(String[] args) {
        Student_KhucChiNhan_1709 student1 = new Student_KhucChiNhan_1709("STD001", "Khuc Chi Nhan", "02-06-2005", 10.0);
        Person_KhucChiNhan_1709 student2 = new Student_KhucChiNhan_1709("STD002", "Tran Thi B", "26-10-2005", 8.0);

        System.out.println(student1.toString_KhucChiNhan_1709());
        System.out.println(student2.toString_KhucChiNhan_1709());
    }
}
