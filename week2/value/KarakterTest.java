package value;

public class KarakterTest {
    public static void main(String[] args) {
        Helm h1 = new Helm("Full Face");
        Helm h2 = new Helm("Half Face");

        Karakter k1 = new Karakter();
        k1.pakaiHelm(h1);
        k1.showHelmKarakter();

        k1.pakaiHelm(h2);
        k1.showHelmKarakter();
    }
}
