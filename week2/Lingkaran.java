public class Lingkaran {

    // Property
    double r = 24.5; // Variable
    final double PHI = 3.14; // Konstanta

    // Method Function
    public double hitungKeliling() {
        return 2*PHI*r;
    }

    public void tampilKeterangan() {
        System.out.println("Perhitungan keliling Lingkaran");
    }

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        ling.tampilKeterangan();
        ling.hitungKeliling();
    }
}
