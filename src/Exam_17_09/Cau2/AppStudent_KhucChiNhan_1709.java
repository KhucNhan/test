package Exam_17_09.Cau2;

import Exam_17_09.Cau1.Student_KhucChiNhan_1709;

public class AppStudent_KhucChiNhan_1709 {
    public static void main(String[] args) {
        CRUDStudent_KhucChiNhan_1709 crud = new CRUDStudent_KhucChiNhan_1709();

        Student_KhucChiNhan_1709 student1 = new Student_KhucChiNhan_1709("STD001", "Khuc Chi Nhan", "02-06-2005", 10.0);
        Student_KhucChiNhan_1709 student2 = new Student_KhucChiNhan_1709("STD002", "Nguyen Van A", "11-07-2005", 9.0);
        Student_KhucChiNhan_1709 student3 = new Student_KhucChiNhan_1709("STD003", "Tran Thi B", "26-10-2005", 8.0);

        crud.addStudent__KhucChiNhan_1709(student1);
        crud.addStudent__KhucChiNhan_1709(student2);
        crud.addStudent__KhucChiNhan_1709(student3);

//        crud.addStudentToFile_KhucChiNhan_1709(student1, student1.getID_KhucChiNhan_1709() + ".dat");
//        crud.addStudentToFile_KhucChiNhan_1709(student2, student2.getID_KhucChiNhan_1709() + ".dat");
//        crud.addStudentToFile_KhucChiNhan_1709(student3, student3.getID_KhucChiNhan_1709() + ".dat");

        crud.getStudentFromFile_KhucChiNhan_1709(student1.getID_KhucChiNhan_1709() + ".dat");


//        String filename = "Students_KhucChiNhan_1709.dat";
////        crud.addStudentListToFile_KhucChiNhan_1709(new Student_KhucChiNhan_1709[]{student1, student2, student3}, filename);
//
//        Student_KhucChiNhan_1709[] students;
//        students = crud.getAllStudentFromFile_KhucChiNhan_1709(filename);
//        for(Student_KhucChiNhan_1709 student : students) {
//            System.out.println(student.toString_KhucChiNhan_1709());
//        }
    }
}
