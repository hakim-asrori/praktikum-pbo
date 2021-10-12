package association;

public class Jadwal {
    private String jamMulai;
    private String jamAkhir;
    private Matkul matkul;

    public Jadwal(String jamMulai, String jamAkhir) {
        this.jamMulai = jamMulai;
        this.jamAkhir = jamAkhir;
    }

    public void setJamMulai(String jm) {
        this.jamMulai = jm;
    }

    public String getJamMulai() {
        return this.jamMulai;
    }

    public void setJamAkhir(String ja) {
        this.jamAkhir = ja;
    }

    public String getJamAkhir() {
        return this.jamAkhir;
    }
}
