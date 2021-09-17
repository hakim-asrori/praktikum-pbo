public class Persegi {
    float sisi = 24.5f;

    public float hitungLuas() {
        return sisi * sisi;
    }

    public void tampilKeterangan() {
        System.out.println("Perhitungan luas persegi");
    }

    public static void main(String[] args) {
        Persegi p = new Persegi();

        p.tampilKeterangan();
        p.hitungLuas();
    }
}
