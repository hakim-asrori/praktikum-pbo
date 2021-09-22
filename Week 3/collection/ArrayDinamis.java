package collection;
import java.util.ArrayList;
public class ArrayDinamis {
    public static void main(String[] args) {
        ArrayList<String> matkul = new ArrayList<>();
        matkul.add("PBO");
        matkul.add("PW Lanjut");
        System.out.println("Penambahan data: \n" + matkul);
        matkul.add(0, "Proyek 2");
        System.out.println("Penambahan data by index: \n" + matkul);
        int index = matkul.indexOf("PW Lanjut");
        System.out.println("Pengembalian index by index: \n" + index);
        String data = matkul.get(2);
        System.out.println("Pengembalian dat by index: \n" + data);
        matkul.remove(2);
        System.out.println("Penghapusan data by index: \n" + matkul);
        matkul.set(1, "Basis Data Lanjut");
        System.out.println("Penimpaan data: \n" + matkul);
        System.out.println("panjang Arraylist: \n" + matkul.size());
    }
}
