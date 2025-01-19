package Generalidades;

import java.util.Scanner;

public class Practica1 {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		

		
		System.out.println("------------------------------");
		System.out.println("1. Cafe");
		System.out.println("2. Vino");
		System.out.println("3. Mate");
		System.out.println("4. Gaseosa");
		System.out.println("------------------------------");
		System.out.println("Seleccione una opcion: ");
		
		int opcion = scan.nextInt();
		
	switch (opcion) {
		case 1:
			System.out.println("Disfruta tu cafe.");
			break;
		
		case 2:
			System.out.println("Disfruta tu Vino y no manejes..");
			break;
		
		case 3:
			System.out.println("Disfruta tu mate.");
			break;
		
		case 4:
			System.out.println("Cuidado con el azucar.");
			break;
		
		default:
			System.out.println("Disfruta tu bebida.");
			break;	
	
	}
	
	
	System.out.println("Ok.");
	scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}