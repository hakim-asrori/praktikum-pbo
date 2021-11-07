package view;

import java.util.*;
import view.MainView;
import controller.DosenController;

public class DosenView {
	private Scanner input = new Scanner(System.in);
	private DosenController dc = new DosenController();

	public void create() {
		System.out.print("\nMasukan data yang ingin ditambahkan : ");
		try {
			int jumlah = this.input.nextInt();

			for (int i = 0; i < jumlah; i++) {
				System.out.print("\nMasukan nama : ");
				String nama = this.input.next();
				System.out.print("Masukan jurusan : ");
				String jurusan = this.input.next();
				System.out.print("Masukan nidn : ");
				String nidn = this.input.next();

				this.dc.store(nama, jurusan, nidn);
			}
			System.out.print("\033[H\033[2J");
			System.out.flush();
		} catch (Exception e) {
			System.out.println("Error = " + e.getMessage());
		}
	}

	public void show() {
		System.out.println("Data Dosen : \n");
		this.dc.show();
	}

	public void edit() {
		this.dc.show();

		System.out.print("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		System.out.print("\nMasukan nama : ");
		String newNama = this.input.next();
		System.out.print("Masukan jurusan : ");
		String newJurusan = this.input.next();
		System.out.print("Masukan nidn : ");
		String newNidn = this.input.next();

		this.dc.edit(index, newNama, newJurusan, newNidn);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void delete() {
		this.dc.show();

		System.out.println("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		this.dc.delete(index);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void showMenu() {
		System.out.println("Menu Dosen : \n");

		System.out.println("1. Tambah Dosen");
		System.out.println("2. Lihat Dosen");
		System.out.println("3. Edit Dosen");
		System.out.println("4. Hapus Dosen");
		System.out.println("0. Keluar\n");

		System.out.print("Pilih menu : ");
		
		try {
			int pilihan = this.input.nextInt();

			switch(pilihan) {
				case 0:
				MainView mv = new MainView();
				mv.showMenu();
				break;

				case 1:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				create();
				showMenu();
				break;

				case 2:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				show();
				showMenu();
				break;

				case 3:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				edit();
				showMenu();
				break;

				case 4:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				delete();
				showMenu();
				break;

				default :
				System.out.println("Pilih menu sesuai angka yang tertera");
				break;
			}
		} catch (Exception e) {
			System.out.println("Pilih menu sesuai angka yang tertera");
		}
	}
}