package model;

public class BukuModel {
	private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;

	public BukuModel(String kode, String judul, String pengarang, String penerbit) {
		this.kode = kode;
		this.judul = judul;
		this.pengarang = pengarang;
		this.penerbit = penerbit;
	}

	public String getKode() {
		return this.kode;
	}

    public String getJudul() {
		return this.judul;
	}

    public String getPengarang() {
		return this.pengarang;
	}

    public String getPenerbit() {
		return this.penerbit;
	}
}