package view;

import java.util.*;
import controller.BukuController;

public class BukuView {
	private BukuController bc = new BukuController();

	public void create() {
		System.out.print("\nMasukan data yang ingin ditambahkan : ");
		try {
				System.out.print("\nMasukan kode buku : ");
				String kode = new Scanner(System.in).nextLine();

				System.out.print("Masukan judul buku : ");
				String judul = new Scanner(System.in).nextLine();

				System.out.print("Masukan pengarang buku : ");
				String pengarang = new Scanner(System.in).nextLine();

				System.out.print("Masukan penerbit buku : ");
				String penerbit = new Scanner(System.in).nextLine();

				this.bc.store(kode, judul, pengarang, penerbit);

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
		int index = new Scanner(System.in).nextInt();

		System.out.print("Masukan kode buku : ");
		String kodeNew = new Scanner(System.in).next();

		System.out.print("Masukan judul buku : ");
		String judulNew = new Scanner(System.in).nextLine();

		System.out.print("Masukan pengarang buku : ");
		String pengarangNew = new Scanner(System.in).nextLine();

		System.out.print("Masukan penerbit buku : ");
		String penerbitNew = new Scanner(System.in).nextLine();

		this.bc.edit(index, kodeNew, judulNew, pengarangNew, penerbitNew);
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void delete() {
		this.bc.show();

		System.out.println("\n Masukan index (0..) : ");
		int index = new Scanner(System.in).nextInt();

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

				default :
				System.out.println("Pilih menu sesuai angka yang tertera");
				break;
			}
		} catch (Exception e) {
			System.out.println("Pilih menu sesuai angka yang tertera");
		}
	}
}