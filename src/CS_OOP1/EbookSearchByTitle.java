package CS_OOP1;

public class EbookSearchByTitle implements EbookSearch{
    @Override
    public int compare(Ebook ebook1, String title) {
        return (ebook1.getTitle()).toLowerCase().compareTo(title.toLowerCase());
    }
}
