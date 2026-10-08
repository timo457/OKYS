public class Kullanici {
    private String kullaniciId;
    private String ad;
    private String soyad;

    public Kullanici(String kullaniciId, String ad, String soyad) {
        this.kullaniciId = kullaniciId;
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getKullaniciId() { return kullaniciId; }
    public String getAd() { return ad; }
}