package DemoExam2.Cau2;

import DemoExam.Cau1.Rectangle;
import DemoExam2.Cau1.Student;

public class AppStudent {
    public static void main(String[] args) {
        CRUDStudent crud = new CRUDStudent();

        Student stu1 = new Student("2300655", "Khuc Nhan", 2, 10);
        Student stu2 = new Student("2300655", "Nhan", 2, 10);
        Student stu3 = new Student("2300655", "Khuc Chi Nhan", 2, 10);

        crud.addStudent(stu1);
        crud.addStudent(stu2);
        crud.addStudent(stu3);

        String filename = "Students.dat";
        crud.addStudentToFile(stu1, filename);
        crud.addStudentToFile(stu2, filename);
        crud.addStudentToFile(stu3, filename);

        System.out.println("Thông tin của 1 đối tượng từ file:");
        crud.getStudentFromFile(stu3.getName() + ".dat");

        crud.addStudentListToFile(new Student[]{stu1, stu2, stu3}, filename);

        System.out.println("Danh sách tất cả student từ file:");
        Student[] allStudents = crud.getAllStudentFromFile(filename);
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
}
