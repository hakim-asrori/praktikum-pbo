package perulangan;

import java.util.ArrayList;

public class PerulanganForEach {
    public static void main(String[] args) {
        ArrayList<Integer> dataNilai = new ArrayList<>();

        dataNilai.add(23);
        dataNilai.add(7);
        dataNilai.add(4);

        for (Integer i : dataNilai) {
            System.out.println("Dta nilai = " + i);
        }
    }
}
