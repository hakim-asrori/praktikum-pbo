package association;

public class Main {
    public static void main(String[] args) {
        Matkul m1 = new Matkul("KD1", "PBO");
        Jadwal j1 = new Jadwal("12.00", "13.20");

        System.out.println("Kode : " + m1.getKode());
        System.out.println("Matkul : " + m1.getNama());
        System.out.println("Jam Mulai : " + j1.getJamMulai());
        System.out.println("Jam Akhir : " + j1.getJamAkhir());
    }
}
