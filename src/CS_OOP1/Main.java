package CS_OOP1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ebook b1 = new Ebook("D101", "Harry Potter 1", "Khuc Chi Nhan", "2005", "Fantasy", 10, "pdf");
        Ebook b2 = new Ebook("D102", "Doraemon", "Fujiko", "2000", "Animation", 20, "pdf");
        Ebook b3 = new Ebook("D103", "Harry Potter 2", "Khuc Chi Nhan", "2005", "Fantasy", 15, "pdf");
        Library admin = new Library();

        admin.add(b2);
        admin.add(b1);
        admin.add(b3);

        System.out.println(Arrays.toString(admin.searchEbook(new EbookSearchByTitle(), "Doraemon")));
        System.out.println(Arrays.toString(admin.searchEbook(new EbookSearchByAuthor(), "khuc chi nhan")));

    }
}
