package CaseStudyOOP.Staff;

public class Main {
    public static void main(String[] args) {
        StaffManager admin = new StaffManager();
        Worker khanh = new Worker("Khanh", 18, "Ha Noi", 0);
        Worker sam = new Worker("Sam", 18, "Dien Bien", 0);
        Worker dung = new Worker("Dung", 18, "Ha Noi", 0);
        Engineer enormous = new Engineer("Enormous" , 24, "US", "Professor");

        admin.addStaff(khanh);
        admin.addStaff(sam);
        admin.addStaff(dung);
        admin.addStaff(enormous);

        System.out.println(admin.searchStaff("sam"));
        admin.firedStaff(khanh);
        admin.showAllStaff();
    }
}
