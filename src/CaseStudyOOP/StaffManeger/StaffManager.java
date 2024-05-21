package CaseStudyOOP.StaffManeger;

import java.util.ArrayList;

public class StaffManager {
    ArrayList<Staff> staffList = new ArrayList<>();

    public boolean addStaff(Staff staff) {
        if (checkStaff(staff)) {
            return false;
        }

        staffList.add(staff);
        return true;
    }

    public boolean checkStaff(Staff staff) {
        boolean check = false;
        for (Staff i : staffList) {
            check = i == staff;
        }
        return check;
    }

    public boolean firedStaff(Staff staff) {
        if (checkStaff(staff)) {
            staffList.remove(staff);
            return true;
        }
        return false;
    }

    public boolean firedStaff(String name) {
        if (searchStaff(name)) {
            staffList.removeIf(i -> compare(i, name));
            return true;
        }
        return false;
    }

    public boolean searchStaff(String name) {
        for (Staff i : staffList) {
            if (compare(i, name)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(Staff staff, String name) {
        return (staff.getName()).equalsIgnoreCase(name);
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
}
