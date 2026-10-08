import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private List<KitapKopyasi> kopyalar;

    public Kitap(String isbn, String baslik, String yazar) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.kopyalar = new ArrayList<>();
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        kopyalar.add(kopya);
    }

    public String getIsbn() { return isbn; }
    public String getBaslik() { return baslik; }
}