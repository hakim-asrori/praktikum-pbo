package view;

import java.util.*;

public class MainView {

	private static Scanner input = new Scanner(System.in);

	public void showMenu() {
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("Menu utama : \n");

		System.out.println("1. Data Dosen");
		System.out.println("2. Data Mahasiswa");
		System.out.println("3. Data Buku");
		System.out.println("4. Data Kategori Buku");
		System.out.println("5. Data Transaksi");
		System.out.println("0. Keluar\n");

		System.out.print("Pilih menu : ");
		
		try {
			int pilihan = input.nextInt();

			switch(pilihan) {
				case 0:
				System.exit(0);
				break;

				case 1:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				DosenView dv = new DosenView();
				dv.showMenu();
				break;

				case 2:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				MahasiswaView mv = new MahasiswaView();
				mv.showMenu();
				break;

				case 3:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				// Buku b = new Buku();
				break;

				case 4:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				BukuView b = new BukuView();
				b.showMenu();
				break;

				case 5:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				// Transaksi t = new Transaksi();
				break;

				default :
				System.out.println("Pilih menu sesuai angka yang tertera");
				break;
			}
		} catch (Exception e) {
			System.out.println("Pilih menu sesuai angka yang tertera!");
		}
	}
}