package belajar;

public class Mahasiswa {
    private String username;
    private String password;

    public Mahasiswa(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void showMahasiswa() {
        System.out.println("Daftar mahasiswa dan password");
        System.out.println(this.username + ":" + this.password);
    }
}
