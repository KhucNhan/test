package CS_OOP1;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private String release_year;
    private String genre;

    public Book() {

    }

    public Book(String bookID, String title, String author, String release_year, String genre) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.release_year = release_year;
        this.genre = genre;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "ID: " + getBookID()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getRelease_year();
    }
}
