package CS_OOP1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library admin = new Library();
        admin.add(new Ebook("01","Doraemon","Fujiko","2000","Animation","123 MB","pdf"));
        admin.add(new Ebook("02","Harry Potter","Khuc Chi Nhan","1995","Fantasy","1 GB","pdf"));
        admin.add(new Ebook("03","One Piece","Khuc Chi Nhan","1999","Animation","456 MB","pdf"));
        do {
            System.out.println("---------------------------------------");
            System.out.println("1. Add new ebook to library.");
            System.out.println("2. Delete ebook from library.");
            System.out.println("3. Update ebook information.");
            System.out.println("4. Search ebook.");
            System.out.println("5. Show all ebook in library.");
            System.out.println("6. Exit.");
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    System.out.print("Book ID: ");
                    String EbookID = new Scanner(System.in).nextLine();
                    while (admin.checkExistEbook(EbookID)) {
                        System.out.println("This id have been existed.");
                        EbookID = new Scanner(System.in).nextLine();
                    }
                    System.out.print("Title: ");
                    String title = new Scanner(System.in).nextLine();
                    System.out.print("Author: ");
                    String author = new Scanner(System.in).nextLine();
                    System.out.print("Release year: ");
                    String release_year = new Scanner(System.in).nextLine();
                    System.out.print("Genre: ");
                    String genre = new Scanner(System.in).nextLine();
                    System.out.print("Size: ");
                    String size = new Scanner(System.in).nextLine();
                    System.out.print("Format: ");
                    String format = new Scanner(System.in).next();

                    admin.add(new Ebook(EbookID, title, author, release_year, genre, size, format));
                    break;
                case 2:
                    if (admin.isEmpty()) {
                        System.out.println("The library is empty.");
                        break;
                    }
                    System.out.print("Enter book id to delete: ");
                    admin.remove(new Scanner(System.in).next());
                    break;
                case 3:
                    if (admin.isEmpty()) {
                        System.out.println("The library is empty.");
                        break;
                    }
                    System.out.print("Enter ebook id you want to update information: ");
                    String u_EbookID = new Scanner(System.in).next();
                    if (admin.findEbook(u_EbookID) != null) {
                        System.out.println("What information do you want to update?");
                        System.out.print("1. ID  ");
                        System.out.print("2. Title  ");
                        System.out.print("3. Author  ");
                        System.out.println("4. Release year.");
                        System.out.print("5. Genre  ");
                        System.out.print("6. Size  ");
                        System.out.print("7. Format  ");
                        System.out.println("8. All.");
                        System.out.println("9. Cancel.");
                        int u_number = new Scanner(System.in).nextInt();
                        switch (u_number) {
                            case 1:
                                System.out.println("Enter new id: ");
                                admin.findEbook(u_EbookID).setBookID(new Scanner(System.in).nextLine());
                                break;
                            case 2:
                                System.out.println("Enter new title: ");
                                admin.findEbook(u_EbookID).setTitle(new Scanner(System.in).nextLine());
                                break;
                            case 3:
                                System.out.println("Enter new author: ");
                                admin.findEbook(u_EbookID).setAuthor(new Scanner(System.in).nextLine());
                                break;
                            case 4:
                                System.out.println("Enter new release year: ");
                                admin.findEbook(u_EbookID).setRelease_year(new Scanner(System.in).next());
                                break;
                            case 5:
                                System.out.println("Enter new genre: ");
                                admin.findEbook(u_EbookID).setTitle(new Scanner(System.in).nextLine());
                                break;
                            case 6:
                                System.out.println("Enter new size: ");
                                admin.findEbook(u_EbookID).setSize(new Scanner(System.in).nextLine());
                                break;
                            case 7:
                                System.out.println("Enter new format: ");
                                admin.findEbook(u_EbookID).setTitle(new Scanner(System.in).next());
                                break;
                            case 8:
                                System.out.println("Enter new id: ");
                                String u_new_id = new Scanner(System.in).nextLine();
                                System.out.println("Enter new title: ");
                                String u_new_title = new Scanner(System.in).nextLine();
                                System.out.println("Enter new author: ");
                                String u_new_author = new Scanner(System.in).nextLine();
                                System.out.println("Enter new release year: ");
                                String u_new_ry = new Scanner(System.in).next();
                                System.out.println("Enter new genre: ");
                                String u_new_genre = new Scanner(System.in).nextLine();
                                System.out.println("Enter new size: ");
                                String u_new_size = new Scanner(System.in).nextLine();
                                System.out.println("Enter new format: ");
                                String u_new_format = new Scanner(System.in).next();
                                admin.findEbook(u_EbookID).setEbook(u_new_id, u_new_title, u_new_author, u_new_ry, u_new_genre, u_new_size, u_new_format);
                                break;
                            case 9:
                                break;
                        }
                    } else {
                        System.out.println("Your ebook id didn't match any id.");
                    }
                    break;
                case 4:
                    if (admin.isEmpty()) {
                        System.out.println("The library is empty.");
                        break;
                    }
                    System.out.println("You want to find ebook by what?");
                    System.out.println("1. Title.");
                    System.out.println("2. Author.");
                    System.out.println("3. Release year.");
                    System.out.println("4. Cancel.");
                    int f_number = new Scanner(System.in).nextInt();
                    switch (f_number) {
                        case 1:
                            System.out.print("Enter title: ");
                            for (Ebook e : admin.searchEbook(new EbookSearchByTitle(), new Scanner(System.in).nextLine())) {
                                System.out.println(e);
                            }
                            break;
                        case 2:
                            System.out.print("Enter author: ");
                            for (Ebook e : admin.searchEbook(new EbookSearchByAuthor(), new Scanner(System.in).nextLine())) {
                                System.out.println(e);
                            }
                            break;
                        case 3:
                            System.out.print("Enter release year: ");
                            for (Ebook e : admin.searchEbook(new EbookSearchByReleaseYear(), new Scanner(System.in).nextLine())) {
                                System.out.println(e);
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    if (admin.isEmpty()) {
                        System.out.println("The library is empty.");
                        break;
                    }
                    admin.displayAllBook();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
