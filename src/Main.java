public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("12345", "Java Programlama", "Ahmet Yılmaz");
        KitapKopyasi kopya1 = new KitapKopyasi("B-001", true);
        kitap.kopyaEkle(kopya1);

        Kullanici kullanici = new Kullanici("K-100", "Timuçin Efe", "Akbaş");

        OduncKaydi kayit = new OduncKaydi("OK-1", kullanici, kopya1);
        kayit.kayitOlustur();
    }
}