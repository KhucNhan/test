package CS_OOP1;

public class EbookSearchById implements EbookSearch{
    @Override
    public int search(Ebook ebook1, String text) {
        return ebook1.getId().compareTo(text);
    }
}
