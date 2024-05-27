package CS_OOP1;

public class EbookSearchByReleaseYear implements EbookSearch{
    public int search(Ebook ebook1, String release_year) {
        return ebook1.getRelease_year() - Integer.parseInt(release_year);
    }
}
