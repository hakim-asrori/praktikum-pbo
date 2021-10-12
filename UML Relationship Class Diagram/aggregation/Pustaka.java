package aggregation;

public class Pustaka {
    private String referensi;

    public Pustaka(String referensi) {
        this.referensi = referensi;
    }

    public void setReferensi(String referensi) {
        this.referensi = referensi;
    }

    public String getReferensi() {
        return this.referensi;
    }

    public void showReferensi() {
        System.out.println("Daftar referensi " + this.referensi);
    }
}
