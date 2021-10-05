package generalitation;

public class Hero {
    private String nama;
    private String kostum;

    public Hero(String nama, String kostum) {
        this.nama = nama;
        this.kostum = kostum;
    }

    public void savePeople() {
        System.out.println("Hero " + this.nama + " sedang menyelamatkan seseorang");
    }

    public void fight() {
        System.out.println("Hero " + this.nama + " sedang bertarung menggunakan kostum " + this.kostum);
    }
}
