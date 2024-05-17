package CaseStudyOOP.PlaneTicket;

import java.util.Scanner;

public class Ticket {
    private int price, day, month, year;
    private String ID_Fly, from, to;

    Scanner sc = new Scanner(System.in);

    public Ticket(String idFly) {
        ID_Fly = idFly;
    }

    public Ticket(String idFly, int day, int month, int year, String from, String to, int price) {
        ID_Fly = idFly;
        this.day = day;
        this.month = month;
        this.year = year;
        this.price = price;
        this.from = from;
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getID_Fly() {
        return ID_Fly;
    }

    public void setID_Fly(String ID_Fly) {
        this.ID_Fly = ID_Fly;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDate() {
        setDay(sc.nextInt());
        setMonth(sc.nextInt());
        setYear(sc.nextInt());
    }

    public String getDate() {
        if (getDay() > 10 && getMonth() > 10) {
            return "Date: " + getDay() + "/" + getMonth() + "/" + getYear();
        } else if (getDay() < 10 && getMonth() > 10) {
            return "Date: 0" + getDay() + "/" + getMonth() + "/" + getYear();
        } else if (getDay() > 10 && getMonth() < 10) {
            return "Date: " + getDay() + "/0" + getMonth() + "/" + getYear();
        } else {
            return "Date: " + getDay() + "/" + getMonth() + "/" + getYear();
        }
    }

    public String toString() {
        return "Ticket ID: " + getID_Fly()
                + "  ||  From: " + getFrom()
                + " - To: " + getTo()
                + "  ||  Date: " + getDate()
                + "  ||  Price: " + getPrice();
    }
}
