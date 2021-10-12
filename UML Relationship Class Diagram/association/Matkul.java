package association;

public class Matkul {
    private String kode;
    private String nama;
    private Jadwal jadwal;

    public Matkul(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return this.kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}
