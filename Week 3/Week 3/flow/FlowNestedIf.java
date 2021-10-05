package flow;

public class FlowNestedIf {
    public static void main(String[] args) {
        double nilai = 45.5;

        if (nilai < 60.1) {
            if (nilai > 40) {
                System.out.println("Percobaan");
            } else {
                System.out.println("Drop Out");
            }
        } else {
            System.out.println("Lanjut");
        }
    }
}
