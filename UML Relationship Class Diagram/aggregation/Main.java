package aggregation;

public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku("Harry Potter", "J.K Rowling");

        Pustaka p1 = new Pustaka("Google.com");

        b1.setPustaka(p1);

        System.out.println("Judul : " + b1.getJudul());
        System.out.println("Pengarang : " + b1.getPengarang());
        b1.getPustaka();
    }
}