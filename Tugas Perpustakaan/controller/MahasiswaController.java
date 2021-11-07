package controller;

import java.util.*;
import model.MahasiswaModel;

public class MahasiswaController {

	private ArrayList<MahasiswaModel> md = new ArrayList<MahasiswaModel>();

	public void store(String nama, String jurusan, String nim) {
		this.md.add(new MahasiswaModel(nama, jurusan, nim));
	}

	public void show() {
		int no = 0;
		for(MahasiswaModel hasil : md) {
			System.out.print(no++ + ")");
			System.out.println("\tNama : " + hasil.getNama());
			System.out.println("\tNIM : " + hasil.getNim());
			System.out.println("\tJurusan : " + hasil.getJurusan());
		}
	}

	public void edit(int index, String nama, String jurusan, String nim) {
		this.md.set(index, new MahasiswaModel(nama, jurusan, nim));
	}

	public void delete(int index) {
		this.md.remove(index);
	}
}