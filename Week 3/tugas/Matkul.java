public class Matkul {
    private String id;
    private String nama;

    public Matkul(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}
