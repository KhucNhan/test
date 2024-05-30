package CS_OOP1;

public class EbookSearchByReleaseYear implements EbookSearch{
    public int search(Ebook ebook1, String releaseYear) {
        return ebook1.getReleaseYear() - Integer.parseInt(releaseYear);
    }
}
