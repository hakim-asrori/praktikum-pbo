package view;

import java.util.*;
import controller.DosenController;

public class DosenView {
	private DosenController dc = new DosenController();

	public void create() {
		System.out.print("\nMasukan data yang ingin ditambahkan : ");
		try {
				System.out.print("\nMasukan nama : ");
				String nama = new Scanner(System.in).nextLine();
				System.out.print("Masukan jurusan : ");
				String jurusan = new Scanner(System.in).nextLine();
				System.out.print("Masukan nidn : ");
				String nidn = new Scanner(System.in).nextLine();

				this.dc.store(nama, jurusan, nidn);
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
		int index = new Scanner(System.in).nextInt();

		System.out.print("\nMasukan nama : ");
		String newNama = new Scanner(System.in).nextLine();
		System.out.print("Masukan jurusan : ");
		String newJurusan = new Scanner(System.in).nextLine();
		System.out.print("Masukan nidn : ");
		String newNidn = new Scanner(System.in).nextLine();

		this.dc.edit(index, newNama, newJurusan, newNidn);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void showBy() {
		this.dc.showBy();
	}

	public void delete() {
		this.dc.show();

		System.out.println("\n Masukan index (0..) : ");
		int index = new Scanner(System.in).nextInt();

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
			int pilihan = new Scanner(System.in).nextInt();

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

				case 5:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				showBy();
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