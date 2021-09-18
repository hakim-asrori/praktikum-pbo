package tugas;
import java.util.Scanner;
public class SegiEnam {
    int sisi;
    // Method mencari luas berfungsi untuk mencari luas
    public double mencariLuas(int sisi) {
        return ((1.5 * Math.sqrt(3)) * (sisi ^ 2));
    }
    // Method mencari luas berfungsi untuk mencari keliling
    public double mencariKeliling(int sisi) {
        return (6*sisi);
    }
    // Method mencari luas berfungsi untuk mencari diagonal
    public double mencariDiagonal(int sisi) {
        return (2*sisi);
    }
    // Method mencari luas berfungsi untuk mencari tinggi
    public double mencariTinggi(int sisi) {
        return (Math.sqrt(3)*sisi);
    }
    // Method main berfungsi untuk menampilkan hasil fungsi atau operasi operasi yang telah dibuat
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SegiEnam se = new SegiEnam();

        System.out.print("Masukan nilai sisi : ");
        se.sisi = scanner.nextInt();

        System.out.println("Keliling : " + se.mencariKeliling(se.sisi));
        System.out.println("Luas : " + se.mencariLuas(se.sisi));
        System.out.println("Diagonal : " + se.mencariDiagonal(se.sisi));
        System.out.println("Tinggi : " + se.mencariTinggi(se.sisi));

        scanner.close();
    }
}
