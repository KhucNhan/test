package OOP1;

import java.util.Scanner;

public class date {
    int day, month, year;

    date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void Date(int day, int month, int year) {

    }

    public int getDay() {
        return this.day;
    }

    public int getMonth () {
        return this.month;
    }

    public int getYear () {
        return this.year;
    }

    public void setDay (int day) {
        this.day = day;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        date date = new date(day, month, year);

        System.out.print(date.getDay());
    }
}
