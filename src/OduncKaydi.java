import java.time.LocalDate;

public class OduncKaydi {
    private String kayitId;
    private LocalDate oduncTarihi;
    private LocalDate teslimTarihi;
    
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = LocalDate.now();
        this.teslimTarihi = oduncTarihi.plusDays(15);
    }

    public void kayitOlustur() {
        if (kitapKopyasi.isDurum()) {
            kitapKopyasi.setDurum(false);
            System.out.println(kullanici.getAd() + " adlı kullanıcıya " + kitapKopyasi.getBarkodNo() + " barkodlu kitap başarıyla ödünç verildi.");
        } else {
            System.out.println("Bu kitap kopyası şu an başkasında!");
        }
    }
}