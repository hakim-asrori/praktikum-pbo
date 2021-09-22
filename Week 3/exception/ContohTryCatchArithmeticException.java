package exception;

public class ContohTryCatchArithmeticException {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Eksekusi gagal\n" + e.getMessage());
        }
    }
}
