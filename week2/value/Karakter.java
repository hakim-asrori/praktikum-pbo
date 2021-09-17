package value;

public class Karakter {
    Helm helm;

    public void pakaiHelm(Helm helm) {
        this.helm = helm;
    }

    public void showHelmKarakter() {
        System.out.println("Objek karakter ini menggunakan helm " + helm.showHelm());
    }
}
