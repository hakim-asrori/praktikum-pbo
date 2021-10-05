package flow;

public class FlowSwitchCase {
    public static void main(String[] args) {
        int pertemuan = 2;

        switch (pertemuan) {
            case 1:
                System.out.println("Pengenalan PBO");
                break;

            case 2:
                System.out.println("Java Dasar");
                break;

            case 3:
                System.out.println("Java Dasar Lanjutan");
                break;

            default:
                System.out.println("Data tidak valid");
                break;
        }
    }
}
