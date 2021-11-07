package model;

public class DosenModel extends Person {
	private String nidn;

	public DosenModel(String nama, String jurusan, String nidn) {
		super(nama, jurusan);
		this.nidn = nidn;
	}

	public String getNidn() {
		return this.nidn;
	}
}