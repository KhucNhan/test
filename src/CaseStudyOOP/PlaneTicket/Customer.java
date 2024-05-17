package CaseStudyOOP.PlaneTicket;

import java.util.ArrayList;

public class Customer extends People {
    private ArrayList<Ticket> ticketList = new ArrayList<>(1000);
    private Ticket ticket;
    private int amount;

    Customer() {
        super();
    }

    Customer(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    Customer(Ticket ticket, int amount, String name, int age, boolean gender) {
        super(name, age, gender);
        this.ticket = ticket;
        this.amount = amount;
    }

    public void buyTicket(Ticket ticket) {
        if (checkTicket(ticket)) {
            System.out.println("You already buy this ticket.");
        } else {
            ticketList.add(ticket);
        }
    }

    public String getTicketInfo(Ticket ticket) {
        return ticket.toString();
    }

    public void seeAllTicket() {
        for (Ticket i : ticketList) {
            System.out.println(i.toString());
        }
    }

    public int getTotalTicketPrice() {
        int total = 0;
        for (Ticket i : ticketList) {
            total += i.getPrice();
        }
        return total;
    }

    public boolean checkTicket(Ticket ticket) {
        boolean check = false;
        for (Ticket i : ticketList) {
            check = i == ticket;
        }
        return check;
    }

    public void sortPriceHighToLow() {
        for (int i = 0; i < ticketList.size() - 1; i++) {
            if (ticketList.get(i).getPrice() < ticketList.get(i + 1).getPrice()) {
                Ticket x = ticketList.get(i);
                ticketList.set(i, ticketList.get(i + 1));
                ticketList.set(i + 1, x);
                i = -1;
            }
        }
    }
}
