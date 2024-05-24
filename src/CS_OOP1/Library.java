package CS_OOP1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    final int MAX_LIMITED = 1000;
    private int count = 0;
    private Ebook[] Ebooks = new Ebook[MAX_LIMITED];


    public boolean add(Ebook ebook) {
        if (checkExcistEbook(ebook)) {
            return false;
        }

        Ebooks[count++] = ebook;
        return true;
    }

    public boolean checkExcistEbook(Ebook ebook) {
        for (int i = 0; i < count; i++) {
            return Ebooks[i] == ebook;
        }
        return false;
    }

    public boolean checkExcistEbook(String bookID) {
        for (int i = 0; i < count; i++) {
            return Objects.equals(Ebooks[i].getBookID(), bookID);
        }
        return false;
    }

    public Ebook findEbook(String IDorTITLE) {
        for (int i = 0; i < count; i++) {
            if (((Ebooks[i].getBookID()).equalsIgnoreCase((IDorTITLE))) || (Ebooks[i].getTitle().equalsIgnoreCase(IDorTITLE))) {
                return Ebooks[i];
            }
        }

        return null;
    }

    public boolean remove(Ebook a) {
        if (!checkExcistEbook(a)) {
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
        if (checkExcistEbook(bookID)) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (Objects.equals(Ebooks[i].getBookID(), bookID)) {
                remove(i);
                break;
            }
        }
        return !checkExcistEbook(bookID);
    }

    public void remove(int index) {
        for (int i = index; i < count; i++) {
            Ebooks[i] = Ebooks[i + 1];
        }
        count--;
    }

    public void setEbooks(Ebook ebook, String bookID, String author, String title, String genre, String release_year, int size, String format) {
        if (checkExcistEbook(ebook)) {
            throw new RuntimeException("Not found Ebook.");
        }
        ebook.setEbook(bookID,author,title,genre,release_year,size,format);
    }

    public void setEbooks(String bookID, String author, String title, String genre, String release_year, int size, String format) {
        if (checkExcistEbook(bookID)) {
            throw new RuntimeException("Not found Ebook.");
        }
        findEbook(bookID).setEbook(bookID,author,title,genre,release_year,size,format);
    }

    public void displayAllBook() {
        for (int i = 0; i < count; i++) {
            System.out.println(Ebooks[i]);
        }
    }

    public Ebook[] findEbook(String findBy, String word) {
        Ebook[] searchList = new Ebook[0];
        int countSearchList = 0;
            switch (findBy.toLowerCase()) {
                case "title":
                    for (int i = 0; i < count; i++) {
                        if (Ebooks[i].getTitle().equalsIgnoreCase(word)) {
                            searchList = Arrays.copyOf(searchList, countSearchList + 1);
                            searchList[countSearchList++] = Ebooks[i];
                        }
                    }
                    break;
                case "author":
                    for (int i = 0; i < count; i++) {
                        if (Ebooks[i].getAuthor().equalsIgnoreCase(word)) {
                            searchList = Arrays.copyOf(searchList, countSearchList + 1);
                            searchList[countSearchList++] = Ebooks[i];
                        }
                    }
                    break;
                case "release year":
                    for (int i = 0; i < count; i++) {
                        if (Ebooks[i].getRelease_year().equalsIgnoreCase(word)) {
                            searchList = Arrays.copyOf(searchList, countSearchList + 1);
                            searchList[countSearchList++] = Ebooks[i];
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("Not found.");
            }

        return searchList;
    }
}
