package controller;

import java.util.*;
import model.BukuModel;

public class BukuController {

	private ArrayList<BukuModel> md = new ArrayList<BukuModel>();

	public void store(String kode, String judul, String pengarang, String penerbit) {
		this.md.add(new BukuModel(kode, judul, pengarang, penerbit));
	}

	public void show() {
		int no = 0;
		for(BukuModel hasil : md) {
			System.out.print(no++ + ")");
			System.out.println("\t Kode buku : " + hasil.getKode());
			System.out.println("\t Judul buku : " + hasil.getJudul());
			System.out.println("\t Pengarang buku : " + hasil.getPengarang());
			System.out.println("\t Penerbit buku : " + hasil.getPenerbit());
		}
	}

	public void edit(int index, String kode, String judul, String pengarang, String penerbit) {
		this.md.set(index, new BukuModel(kode, judul, pengarang, penerbit));
	}

	public void delete(int index) {
		this.md.remove(index);
	}
}