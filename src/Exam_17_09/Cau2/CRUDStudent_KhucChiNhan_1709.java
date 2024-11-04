package Exam_17_09.Cau2;

import Exam_17_09.Cau1.Student_KhucChiNhan_1709;

import java.io.*;
import java.util.ArrayList;

public class CRUDStudent_KhucChiNhan_1709 {
    private Student_KhucChiNhan_1709[] students_KhucChiNhan_1709;
    private static int numberOfStudent;

    public CRUDStudent_KhucChiNhan_1709() {
        students_KhucChiNhan_1709 = new Student_KhucChiNhan_1709[100];
        numberOfStudent = 0;
    }

    public boolean addStudent__KhucChiNhan_1709(Student_KhucChiNhan_1709 student) {
        students_KhucChiNhan_1709[numberOfStudent++] = student;
        return students_KhucChiNhan_1709.length == numberOfStudent;
    }

    public void he() {
        for(Student_KhucChiNhan_1709 student: students_KhucChiNhan_1709) {
            if (student != null) {
                System.out.println(student.toString_KhucChiNhan_1709());
            }
        }
    }

    public boolean addStudentToFile_KhucChiNhan_1709(Student_KhucChiNhan_1709 student, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student_KhucChiNhan_1709 getStudentFromFile_KhucChiNhan_1709(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Student_KhucChiNhan_1709) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addStudentListToFile_KhucChiNhan_1709(Student_KhucChiNhan_1709[] students_KhucChiNhan_1709, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student_KhucChiNhan_1709 studentKhucChiNhan1709 : students_KhucChiNhan_1709) {
                if (studentKhucChiNhan1709 != null) {
                    oos.writeObject(studentKhucChiNhan1709);
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student_KhucChiNhan_1709[] getAllStudentFromFile_KhucChiNhan_1709(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Student_KhucChiNhan_1709> students = new ArrayList<>();
            try {
                while (true) {
                    Student_KhucChiNhan_1709 student = (Student_KhucChiNhan_1709) ois.readObject();
                    students.add(student);
                }
            } catch (EOFException e) {
                e.printStackTrace();
            }
            return students.toArray(new Student_KhucChiNhan_1709[0]);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
