package CS_OOP1;

public class EbookSearchByAuthor implements EbookSearch{
    public int compare(Ebook ebook1, String author) {
        return (ebook1.getAuthor()).toLowerCase().compareTo(author.toLowerCase());
    }
}
