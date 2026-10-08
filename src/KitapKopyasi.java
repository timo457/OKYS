public class KitapKopyasi {
    private String barkodNo;
    private boolean durum;

    public KitapKopyasi(String barkodNo, boolean durum) {
        this.barkodNo = barkodNo;
        this.durum = durum;
    }

    public boolean isDurum() { return durum; }
    public void setDurum(boolean durum) { this.durum = durum; }
    public String getBarkodNo() { return barkodNo; }
}