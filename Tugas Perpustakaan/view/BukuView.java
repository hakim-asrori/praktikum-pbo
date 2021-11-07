package view;

import java.util.*;
import view.MainView;
import controller.BukuController;

public class BukuView {
	private Scanner input = new Scanner(System.in);
	private BukuController bc = new BukuController();

	public void create() {
		System.out.print("\nMasukan data yang ingin ditambahkan : ");
		try {
			int jumlah = this.input.nextInt();

			for (int i = 0; i < jumlah; i++) {
				System.out.print("\nMasukan kode buku : ");
				String kode = this.input.next();

				System.out.print("Masukan judul buku : ");
				String judul = this.input.next();

				System.out.print("Masukan pengarang buku : ");
				String pengarang = this.input.next();

				System.out.print("Masukan penerbit buku : ");
				String penerbit = this.input.next();

				this.bc.store(kode, judul, pengarang, penerbit);
			}
			System.out.print("\033[H\033[2J");
			System.out.flush();
		} catch (Exception e) {
			System.out.println("Error = " + e.getMessage());
		}
	}

	public void show() {
		System.out.println("Data Buku : \n");
		this.bc.show();
	}

	public void edit() {
		this.bc.show();

		System.out.print("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		System.out.print("\nMasukan kode buku : ");
		String kodeNew = this.input.next();

		System.out.print("Masukan judul buku : ");
		String judulNew = this.input.next();

		System.out.print("Masukan pengarang buku : ");
		String pengarangNew = this.input.next();

		System.out.print("Masukan penerbit buku : ");
		String penerbitNew = this.input.next();

		this.bc.edit(index, kodeNew, judulNew, pengarangNew, penerbitNew);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void delete() {
		this.bc.show();

		System.out.println("\n Masukan index (0..) : ");
		int index = this.input.nextInt();

		this.bc.delete(index);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void showMenu() {
		System.out.println("Menu Buku : \n");

		System.out.println("1. Tambah Buku");
		System.out.println("2. Lihat Buku");
		System.out.println("3. Edit Buku");
		System.out.println("4. Hapus Buku");
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