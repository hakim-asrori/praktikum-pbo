package generalitation;

public class Spiderman extends Hero {
    private int jaring;

    public Spiderman(String nama, String kostum) {
        super(nama, kostum);
    }

    public void webShot(int jaring) {
        this.jaring -= jaring;
    }

    public void recoverJaring(int jaring) {
        this.jaring += jaring;
    }

    public int showSisaJaring() {
        return this.jaring;
    }

}
