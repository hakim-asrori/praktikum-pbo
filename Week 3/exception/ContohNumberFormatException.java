package exception;

public class ContohNumberFormatException {
    public static void main(String[] args) {
        int nilai = Integer.parseInt("abc");

        System.out.println("Nilai = " + nilai);
    }
}
