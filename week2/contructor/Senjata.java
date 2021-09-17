package contructor;

public class Senjata {
    String nama;

    public Senjata(String nama) {
        this.nama = nama;
    }

    public String showSenjata() {
        return "Nama senjata ini adalah " + this.nama;
    }
}
