package controller;

import java.util.*;
import model.DosenModel;

public class DosenController {

	private ArrayList<DosenModel> md = new ArrayList<DosenModel>();

	public void store(String nama, String jurusan, String nidn) {
		this.md.add(new DosenModel(nama, jurusan, nidn));
	}

	public void show() {
		int no = 0;
		for(DosenModel hasil : md) {
			System.out.print(no++ + ")");
			System.out.println("\tNama : " + hasil.getNama());
			System.out.println("\tNIDN : " + hasil.getNidn());
			System.out.println("\tJurusan : " + hasil.getJurusan());
		}
	}

	public void edit(int index, String nama, String jurusan, String nidn) {
		this.md.set(index, new DosenModel(nama, jurusan, nidn));
	}

	public void delete(int index) {
		this.md.remove(index);
	}
}