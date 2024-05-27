package CS_OOP1;

public class EbookSortByTitle implements EbookSort{
    @Override
    public int compare(Ebook ebook1, Ebook ebook2) {
        return ebook1.getTitle().compareTo(ebook2.getTitle());
    }
}
