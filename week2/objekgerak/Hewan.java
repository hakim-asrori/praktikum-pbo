package objekgerak;

import objekdiam.Buah;

public class Hewan {

    public void memakanBuah() {
        Buah buah = new Buah();
        buah.memberikanEnergi();
    }

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.memakanBuah();
    }
    
}
