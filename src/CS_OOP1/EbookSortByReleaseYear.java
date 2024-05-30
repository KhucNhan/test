package CS_OOP1;

public class EbookSortByReleaseYear implements EbookSort{
    @Override
    public int sort(Ebook ebook1, Ebook ebook2) {
        return ebook1.getReleaseYear() - ebook2.getReleaseYear();
    }
}
