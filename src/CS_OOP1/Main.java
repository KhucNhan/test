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
                    String eBookId = new Scanner(System.in).nextLine();
                    while (admin.isExist(eBookId)) {
                        System.out.println("This id have been existed.");
                        eBookId = new Scanner(System.in).nextLine();
                    }
                    System.out.print("Title: ");
                    String title = new Scanner(System.in).nextLine();
                    System.out.print("Author: ");
                    String author = new Scanner(System.in).nextLine();
                    System.out.print("Release year: ");
                    String releaseYear = new Scanner(System.in).nextLine();
                    System.out.print("Genre: ");
                    String genre = new Scanner(System.in).nextLine();
                    System.out.print("Size: ");
                    String size = new Scanner(System.in).nextLine();
                    System.out.print("Format: ");
                    String format = new Scanner(System.in).next();

                    admin.add(new Ebook(eBookId, title, author, releaseYear, genre, size, format));
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
                    String updateEbookId = new Scanner(System.in).next();
                    if (admin.findEbook(updateEbookId) != null) {
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
                        int updateNumber = new Scanner(System.in).nextInt();
                        switch (updateNumber) {
                            case 1:
                                System.out.println("Enter new id: ");
                                admin.findEbook(updateEbookId).setBookID(new Scanner(System.in).nextLine());
                                break;
                            case 2:
                                System.out.println("Enter new title: ");
                                admin.findEbook(updateEbookId).setTitle(new Scanner(System.in).nextLine());
                                break;
                            case 3:
                                System.out.println("Enter new author: ");
                                admin.findEbook(updateEbookId).setAuthor(new Scanner(System.in).nextLine());
                                break;
                            case 4:
                                System.out.println("Enter new release year: ");
                                admin.findEbook(updateEbookId).setRelease_year(new Scanner(System.in).next());
                                break;
                            case 5:
                                System.out.println("Enter new genre: ");
                                admin.findEbook(updateEbookId).setTitle(new Scanner(System.in).nextLine());
                                break;
                            case 6:
                                System.out.println("Enter new size: ");
                                admin.findEbook(updateEbookId).setSize(new Scanner(System.in).nextLine());
                                break;
                            case 7:
                                System.out.println("Enter new format: ");
                                admin.findEbook(updateEbookId).setTitle(new Scanner(System.in).next());
                                break;
                            case 8:
                                System.out.println("Enter new id: ");
                                String updateNewId = new Scanner(System.in).nextLine();
                                System.out.println("Enter new title: ");
                                String updateNewTitle = new Scanner(System.in).nextLine();
                                System.out.println("Enter new author: ");
                                String updateNewAuthor = new Scanner(System.in).nextLine();
                                System.out.println("Enter new release year: ");
                                String updateNewReleaseYear = new Scanner(System.in).next();
                                System.out.println("Enter new genre: ");
                                String updateNewGenre = new Scanner(System.in).nextLine();
                                System.out.println("Enter new size: ");
                                String updateNewSize = new Scanner(System.in).nextLine();
                                System.out.println("Enter new format: ");
                                String updateNewFormat = new Scanner(System.in).next();
                                admin.findEbook(updateEbookId).setEbook(updateNewId, updateNewTitle, updateNewAuthor, updateNewReleaseYear, updateNewGenre, updateNewSize, updateNewFormat);
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
                    int findNumber = new Scanner(System.in).nextInt();
                    switch (findNumber) {
                        case 1:
                            System.out.print("Enter title: ");
                            for (Ebook e : admin.searchEbooks(new EbookSearchByTitle(), new Scanner(System.in).nextLine())) {
                                System.out.println(e);
                            }
                            break;
                        case 2:
                            System.out.print("Enter author: ");
                            for (Ebook e : admin.searchEbooks(new EbookSearchByAuthor(), new Scanner(System.in).nextLine())) {
                                System.out.println(e);
                            }
                            break;
                        case 3:
                            System.out.print("Enter release year: ");
                            for (Ebook e : admin.searchEbooks(new EbookSearchByReleaseYear(), new Scanner(System.in).nextLine())) {
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
                    admin.display();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
