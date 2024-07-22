package Advanced_OOP1;

public class Course {
    private int courseCode;
    private String courseName;
    private Student[] students = new Student[1000];
    private int i = 0;

    Course() {
        students = new Student[1000];
    }

    public boolean addStudent(Student a) {
        students[i++] = a;
        return isExist(a);
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void display() {
        if (students[0] == null) System.out.println("The list is empty.");
        for (int a = 0; a < i; a++) {
            System.out.println(students[a].toString());
        }
    }

    public boolean isExist(Student a) {
        for (int x = 0; x < i; x++) {
            if (students[x].getStudentID() == a.getStudentID()) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(Student a) {
        for (int x = 0; x < i; x++) {
            if (students[x] == a) return x;
        }
        return -1;
    }

    public boolean remove(Student a) {
        if (isExist(a)) {
            int y = getIndex(a);
            for (int x = y; x < i; x++) {
                students[x] = students[x + 1];
                i--;
            }
            return true;
        }
        return false;
    }

    public boolean update(Student a, String name, int age) {
        if (isExist(a)) {
            a.setName(name);
            a.setAge(age);
            return true;
        }
        return false;
    }
}