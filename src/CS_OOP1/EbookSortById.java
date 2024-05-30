package CS_OOP1;

public class EbookSortById implements EbookSort{
    @Override
    public int sort(Ebook ebook1, Ebook ebook2) {
        return ebook1.getId().compareTo(ebook2.getId());
    }
}
