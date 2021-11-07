package model;

public class Person {
	private String nama;
	private String jurusan;

	public Person (String nama, String jurusan) {
		this.nama = nama;
		this.jurusan = jurusan;
	}

	public String getNama() {
		return this.nama;
	}

	public String getJurusan() {
		return this.jurusan;
	}
}