package composition;

public class Video {
    private String judul;
    private int ukuran;

    public Video(String judul, int ukuran) {
        this.judul = judul;
        this.ukuran = ukuran;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return this.ukuran;
    }
}
