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

    public Ebook(String id, String title, String author, String release_year, String genre, String size, String format) {
        super(id, title, author, release_year, genre);
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

    public void setEbook(String id, String author, String title, String genre, String release_year, String size, String format) {
        setId(id);
        setAuthor(author);
        setGenre(genre);
        setRelease_year(release_year);
        setSize(size);
        setFormat(format);
    }

    public String toString() {
        return "ID: " + getId()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getRelease_year()
                + "  ||  File size: " + getSize()
                + "  ||  File format: " + getFormat();
    }
}
