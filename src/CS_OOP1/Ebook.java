package CS_OOP1;

public class Ebook extends Book {
    private String size;
    private String format;

    public Ebook() {
    }

    public Ebook(String size, String format) {
        this.size = size;
        this.format = format;
    }

    public Ebook(String id, String title, String author, String releaseYear, String genre, String size, String format) {
        super(id, title, author, releaseYear, genre);
        this.size = size;
        this.format = format;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setEbook(String id, String author, String title, String genre, String releaseYear, String size, String format) {
        setId(id);
        setAuthor(author);
        setGenre(genre);
        setReleaseYear(releaseYear);
        setSize(size);
        setFormat(format);
    }

    public String toString() {
        return "ID: " + getId()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getReleaseYear()
                + "  ||  File size: " + getSize()
                + "  ||  File format: " + getFormat();
    }
}
