package CaseStudyOOP.PlaneTicket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("D101",2,6,2024,"Viet Nam","United State",1200000);
        Ticket ticket2 = new Ticket("D202",26,10,2024,"Viet Nam","Sweden",600000);
        Customer cus1 = new Customer("Khuc Chi Nhan",18,true);

        cus1.buyTicket(ticket1);
        cus1.buyTicket(ticket2);
        cus1.buyTicket(ticket2);

        cus1.seeAllTicket();
        System.out.println(cus1.getTotalTicketPrice());
    }

}
