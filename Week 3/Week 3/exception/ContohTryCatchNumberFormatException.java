package exception;

public class ContohTryCatchNumberFormatException {
    public static void main(String[] args) {
        try {
            int nilai = Integer.parseInt("abc");
            System.out.println("Nilai = " + nilai);
        } catch (Exception e) {
            System.out.println("Eksekusi gagal\n" + e.getMessage());
        }
    }
}
