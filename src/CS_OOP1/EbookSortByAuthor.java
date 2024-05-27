package CS_OOP1;

public class EbookSortByAuthor implements EbookSort{

    @Override
    public int compare(Ebook ebook1, Ebook ebook2) {
        return ebook1.getAuthor().compareTo(ebook2.getAuthor());
    }
}
