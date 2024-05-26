package CS_OOP1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book ID: ");
        String EbookID = sc.nextLine();
        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Release year: ");
        String release_year = sc.nextLine();
        System.out.println("Genre: ");
        String genre = sc.nextLine();
        System.out.println("Size: ");
        double size = sc.nextDouble();
        System.out.println("Format: ");
        String format = sc.next();
    }
}
