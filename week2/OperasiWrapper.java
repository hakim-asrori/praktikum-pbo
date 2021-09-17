public class OperasiWrapper {
    String str = "Yayaya nama saya Hakim";

    public int hitungJumlahHuruf() {
        return str.length();
    }

    public static void main(String[] args) {
        OperasiWrapper operasi = new OperasiWrapper();

        System.out.println("Jumlah string = "+operasi.hitungJumlahHuruf());
    }
}
