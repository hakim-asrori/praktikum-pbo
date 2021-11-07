package view;

import java.util.*;
import view.MainView;
import controller.MahasiswaController;

public class MahasiswaView {
	private Scanner input = new Scanner(System.in);
	private MahasiswaController mc = new MahasiswaController();

	public void create() {
		System.out.print("\nMasukan data yang ingin ditambahkan : ");
		try {
			int jumlah = this.input.nextInt();

			for (int i = 0; i < jumlah; i++) {
				System.out.print("\nMasukan nama : ");
				String nama = this.input.next();
				System.out.print("Masukan jurusan : ");
				String jurusan = this.input.next();
				System.out.print("Masukan nim : ");
				String nim = this.input.next();

				this.mc.store(nama, jurusan, nim);
			}
			System.out.print("\033[H\033[2J");
			System.out.flush();
		} catch (Exception e) {
			System.out.println("Error = " + e.getMessage());
		}
	}

	public void show() {
		System.out.println("Data Mahasiswa : \n");
		this.mc.show();
	}

	public void edit() {
		this.mc.show();

		System.out.println("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		System.out.print("\nMasukan nama : ");
		String newNama = this.input.next();
		System.out.print("Masukan jurusan : ");
		String newJurusan = this.input.next();
		System.out.print("Masukan nim : ");
		String newNim = this.input.next();

		this.mc.edit(index, newNama, newJurusan, newNim);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void delete() {
		this.mc.show();

		System.out.print("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		this.mc.delete(index);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void showMenu() {
		System.out.println("Menu Mahasiswa : \n");

		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Lihat Mahasiswa");
		System.out.println("3. Edit Mahasiswa");
		System.out.println("4. Hapus Mahasiswa");
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