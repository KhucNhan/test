package Advanced_OOP1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Student nhan = new Student("Nhan", 19, 2300655);
        Student huyen = new Student("Huyen", 19, 2300888);
        nhan.getStudentID();
        huyen.getName();

        Course advanced_OOP = new Course();
        advanced_OOP.addStudent(nhan);
        advanced_OOP.addStudent(huyen);
        advanced_OOP.display();

        advanced_OOP.remove(nhan);
        advanced_OOP.update(huyen,"Nguyen Huyen", 20);
        advanced_OOP.display();
    }
}
