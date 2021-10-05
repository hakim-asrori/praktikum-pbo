package generalitation;

public class Batman extends Hero {
    private int pisau;

    public Batman(String nama, String kostum) {
        super(nama, kostum);
    }

    public void pisauShot(int pisau) {
        this.pisau -= pisau;
    }

    public void recoverPisau(int pisau) {
        this.pisau += pisau;
    }

    public int showSisaPisau() {
        return this.pisau;
    }
}
