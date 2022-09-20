package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rent[] vect = new Rent[10];
		System.out.println("How many rooms will be rented ?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			Rent rent = new Rent(name, email);
			
			vect[roomNumber] = rent;
			
		}
		System.out.println("");
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				
				System.out.println(i+ ": " + vect[i]);
			}
		}

	}
	
	
}
