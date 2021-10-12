package aggregation;

public class Buku {
    private String judul;
    private String pengarang;
    private Pustaka pustaka;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void setPustaka(Pustaka pustaka) {
        this.pustaka = pustaka;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return this.judul;
    }

    public void getPustaka() {
        this.pustaka.showReferensi();
    }
}
