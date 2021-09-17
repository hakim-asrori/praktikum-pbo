import java.util.Scanner;

public class Transaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Produk : ");
        String produk = input.nextLine();
        System.out.print("Harga : ");
        double harga = input.nextDouble();
        System.out.print("Quantity : ");
        int qty = input.nextInt();
        double total = harga * qty;
        System.out.print("Total pembelian " + produk + " sejumlah " + qty + " buah");
        System.out.println(" adalah " + total);
        input.close();
    }
}
