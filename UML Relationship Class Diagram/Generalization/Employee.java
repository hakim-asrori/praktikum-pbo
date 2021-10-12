package Generalization;

public class Employee extends Person {
    private String jabatan;

    public Employee(String nama, int umur) {
        super(nama, umur);
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public void showEmployee() {
        System.out.println("Jabatan : " + this.getJabatan());
    }
}
