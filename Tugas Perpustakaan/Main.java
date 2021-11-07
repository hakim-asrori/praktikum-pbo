import java.util.*;
import view.MainView;

public class Main {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.println("::::::::::::::::::::::::::");
		System.out.println("::                      ::");
		System.out.println("::    Selamat Datang    ::");
		System.out.println("::  Perpustakaan Cinta  ::");
		System.out.println("::                      ::");
		System.out.println("::::::::::::::::::::::::::\n");

		// System.out.print("Masukan username : ");
		// String username = input.next();
		// System.out.print("Masukan password : ");
		// String password = input.next();

		// if (username.equals("admin") && password.equals("`")) {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		MainView mv = new MainView();
		mv.showMenu();
		// } else {
		// 	System.out.println("Login Failure");
		// }
	}
}