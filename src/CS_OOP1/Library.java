package CS_OOP1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    final int MAX_LIMITE = 1000;
    private int count = 0;
    private Ebook[] Ebooks = new Ebook[MAX_LIMITE];


    public boolean add(Ebook ebook) {
        if (isExist(ebook)) {
            return false;
        }

        Ebooks[count++] = ebook;
        return true;
    }

    public boolean isExist(Ebook ebook) {
        for (int i = 0; i < count; i++) {
            return Ebooks[i] == ebook;
        }
        return false;
    }

    public boolean isExist(String bookID) {
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

    public boolean remove(String bookID) {
        if (!isExist(bookID)) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (Objects.equals((Ebooks[i].getBookID()).toLowerCase(), bookID.toLowerCase())) {
                remove(i);
                break;
            }
        }
        return !isExist(bookID);
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

    public boolean setEbook(String bookID, String author, String title, String genre, String release_year, String size, String format) {
        if (isExist(bookID)) {
            findEbook(bookID).setEbook(bookID, author, title, genre, release_year, size, format);
            return true;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(Ebooks[i]);
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Ebook[] searchEbooks(EbookSearch ebookSearch, String text) {
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

    public void sort(EbookSort ebookSort) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ebookSort.compare(Ebooks[i],Ebooks[j]) > 0) {
                    Ebook temp = Ebooks[i];
                    Ebooks[i] = Ebooks[j];
                    Ebooks[j] = temp;
                }
            }
        }
    }
}
