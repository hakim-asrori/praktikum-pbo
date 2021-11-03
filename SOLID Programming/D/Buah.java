public class Buah {
    private Pupuk pupuk;

    public Buah(Pupuk pupuk) {
        this.pupuk = pupuk;
    }

    public void show() {
        pupuk.menyiram();
    }
}
