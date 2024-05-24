package CS_OOP1;

public class Ebook extends Book {
    private double size;
    private String format;

    public Ebook() {
    }

    public Ebook(double size, String format) {
        this.size = size;
        this.format = format;
    }

    public Ebook(String bookID, String title, String author, String release_year, String genre, double size, String format) {
        super(bookID, title, author, release_year, genre);
        this.size = size;
        this.format = format;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setEbook(String bookID, String author, String title, String genre, String release_year, int size, String format) {
        setBookID(bookID);
        setAuthor(author);
        setGenre(genre);
        setRelease_year(release_year);
        setSize(size);
        setFormat(format);
    }

    public String toString() {
        return "ID: " + getBookID()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getRelease_year()
                + "  ||  File size: " + getSize()
                + "  ||  File format: " + getFormat();
    }
}
