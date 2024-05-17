package CaseStudyOOP.Staff;

import java.util.ArrayList;
import java.util.Objects;

public class StaffManager {
    ArrayList<Staff> staffList = new ArrayList<>(1000);

    public void addStaff(Staff staff) {
        if (checkStaff(staff)) {
            System.out.println("This staff is already exist.");
        } else {
            staffList.add(staff);
        }
    }

    public boolean checkStaff(Staff staff) {
        boolean check = false;
        for (Staff i : staffList) {
            check = i == staff;
        }
        return check;
    }

    public void firedStaff(Staff staff) {
        staffList.remove(staff);
    }

    public void firedStaff(String name) {
        staffList.removeIf(i -> compare(i, name));
    }

    public String searchStaff(String name) {
        for (Staff i : staffList) {
            if (compare(i, name)) {
                return "Result of searching for " + "\"" +name + "\"" + " is: " + i;
            }
        }
        return "Can not find this staff.";
    }

    public boolean compare(Staff staff, String name) {
       return (staff.getName()).equalsIgnoreCase(name);
    }

    public void showAllStaff() {
        for (Staff i : staffList) {
            System.out.println(i.toString());
        }
    }
}
