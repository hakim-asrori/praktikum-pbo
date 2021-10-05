package belajar;

public class MahasiswaTest {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Hakim Asrori", "Asep123!");
        m1.showMahasiswa();
        m1.setUsername("Asep Saepullah");
        m1.setPassword("Asep090909!");

        System.out.println(m1.getUsername() + ":" + m1.getPassword());
    }
}
