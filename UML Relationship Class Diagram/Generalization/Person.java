package Generalization;

public class Person {
    private String nama;  
    private int umur;
    
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void showPerson() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}