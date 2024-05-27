package CS_OOP1;

public class Book {
    private String id;
    private String title;
    private String author;
    private String release_year;
    private String genre;

    public Book() {

    }

    public Book(String id, String title, String author, String release_year, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.release_year = release_year;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getRelease_year() {
        return Integer.parseInt(release_year);
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
        return "ID: " + getId()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getRelease_year();
    }
}
