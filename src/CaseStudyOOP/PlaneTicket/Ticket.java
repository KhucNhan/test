package CaseStudyOOP.PlaneTicket;
public class Ticket {
    private int price;
    private int day;
    private int month;
    private int year;
    private String FlyID;
    private String from;
    private String to;
    private boolean status = true;

    public Ticket(String idFly) {
        FlyID = idFly;
    }

    public Ticket(String idFly, int day, int month, int year, String from, String to, int price) {
        FlyID = idFly;
        this.day = day;
        this.month = month;
        this.year = year;
        this.price = price;
        this.from = from;
        this.to = to;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getFlyID() {
        return FlyID;
    }

    public void setFlyID(String FlyID) {
        this.FlyID = FlyID;
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

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
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
        return "Ticket ID: " + getFlyID()
                + "  ||  From: " + getFrom()
                + " - To: " + getTo()
                + "  ||  Date: " + getDate()
                + "  ||  Price: " + getPrice();
    }
}
