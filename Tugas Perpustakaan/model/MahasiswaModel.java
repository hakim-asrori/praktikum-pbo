package model;

public class MahasiswaModel extends Person {
	private String nim;

	public MahasiswaModel(String nama, String jurusan, String nim) {
		super(nama, jurusan);
		this.nim = nim;
	}

	public String getNim() {
		return this.nim;
	}
}