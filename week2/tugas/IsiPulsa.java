package tugas;
import tugas.Pulsa;
import java.util.Scanner;
public class IsiPulsa {
    int bayar;

    public int pembayaran(int bayar) {
        return (this.bayar + 2000);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsiPulsa ip = new IsiPulsa();
        Pulsa p = new Pulsa();

        System.out.print("Masukan harga : ");
        ip.bayar = scanner.nextInt();
        System.out.print("Masukan pembayaran : ");
        p.harga = scanner.nextInt();
        p.bayar = ip.bayar;

        System.out.println("Kembalian : " + p.kembalian(ip.pembayaran(p.bayar), p.harga));
        
    }
}
