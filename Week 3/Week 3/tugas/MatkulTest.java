import java.util.*;

public class MatkulTest {
  public static void main(String[] args) {
    try {
      ArrayList<Matkul> dataMatkul = new ArrayList<>();

      Scanner scanner = new Scanner(System.in);

      System.out.print("Masukan jumlah matkul : ");
      String jml = scanner.next("^\\d+$");

      int angka = Integer.valueOf(jml);

      for (int i = 0; i < angka; i++) {
        System.out.print("Masukan id matkul : ");
        String id = scanner.next();
        System.out.print("Masukan nama matkul : ");
        String nama = scanner.next();

        dataMatkul.add(new Matkul(id, nama));
      }

      System.out.println();

      for (Matkul hasil : dataMatkul) {
        System.out.println("ID " + hasil.getId() + " = Mata Kuliah " + hasil.getNama());
      }

    } catch (InputMismatchException e) {
      System.out.println("Eksekusi gagal");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
