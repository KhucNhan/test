package CS_OOP1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    final int MAX_LIMITE = 1000;
    private int count = 0;
    private Ebook[] Ebooks = new Ebook[MAX_LIMITE];


    public boolean add(Ebook ebook) {
        if (checkExistEbook(ebook)) {
            return false;
        }

        Ebooks[count++] = ebook;
        return true;
    }

    public boolean checkExistEbook(Ebook ebook) {
        for (int i = 0; i < count; i++) {
            return Ebooks[i] == ebook;
        }
        return false;
    }

    public boolean checkExistEbook(String bookID) {
        for (int i = 0; i < count; i++) {
            return Objects.equals(Ebooks[i].getBookID(), bookID);
        }
        return false;
    }

    public Ebook findEbook(String text) {
        for (int i = 0; i < count; i++) {
            if (((Ebooks[i].getBookID()).equalsIgnoreCase((text)) || (Ebooks[i].getTitle().equalsIgnoreCase(text)))) {
                return Ebooks[i];
            }
        }

        return null;
    }

    public boolean remove(Ebook a) {
        if (!checkExistEbook(a)) {
            return false;
        }

        for (int i = 0; i < Ebooks.length; i++) {
            if (Ebooks[i] == a) {
                remove(i);
                break;
            }
        }

        return true;
    }

    public boolean remove(String bookID) {
        if (checkExistEbook(bookID)) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (Objects.equals(Ebooks[i].getBookID(), bookID)) {
                remove(i);
                break;
            }
        }
        return !checkExistEbook(bookID);
    }

    private boolean remove(int index) {
        if (index > count) {
            return false;
        }
        for (int i = index; i < count; i++) {
            Ebooks[i] = Ebooks[i + 1];
        }
        count--;
        return true;
    }

    public boolean setEbook(Ebook ebook, String bookID, String author, String title, String genre, String release_year, int size, String format) {
        if (checkExistEbook(ebook)) {
            ebook.setEbook(bookID, author, title, genre, release_year, size, format);
            return true;
        }
        return false;
    }

    public boolean setEbook(String bookID, String author, String title, String genre, String release_year, int size, String format) {
        if (checkExistEbook(bookID)) {
            findEbook(bookID).setEbook(bookID, author, title, genre, release_year, size, format);
            return true;
        }
        return false;
    }

    public void displayAllBook() {
        for (int i = 0; i < count; i++) {
            System.out.println(Ebooks[i]);
        }
    }

    public Ebook[] searchEbook(EbookSearch ebookSearch, String text) {
        Ebook[] searchList = new Ebook[0];
        int countSearchList = 0;
        for (int i = 0; i < count; i++) {
            if (ebookSearch.compare(Ebooks[i],text) == 0) {
                searchList = Arrays.copyOf(searchList, countSearchList + 1);
                searchList[countSearchList++] = Ebooks[i];
            }
        }
        return searchList;
    }
}
