public class Main2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 28) {
            if (i % 7 == 0) {
                if (i % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("N");
                }
                System.out.println();
            }
            i++;
        }
    }
}
