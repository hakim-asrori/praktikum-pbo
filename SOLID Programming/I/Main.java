public class Main {
    public static void main(String[] args) {
        Bidikmisi b1 = new Bidikmisi();
        Reguler r1 = new Reguler();

        b1.mendaftar();

        System.out.println();

        r1.mendaftar();
        r1.membayar();
    }
}
