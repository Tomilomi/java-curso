package Generalidades;


public class EstructurasDeControl {
	public static void main(String[] args) throws Exception {
		
		int edad = 50;
		
		if (edad > 18 && edad <= 50) {
			System.out.println("Puedes entrar al boliche.");
		}
		
		
		else if (edad == 18) {
			System.out.println("Tenes la edad justa para entrar.");
		}
		
		else if (edad > 50) {
			System.out.println("No podes entrar sos muy mayor.");
		}
		
		else {
			System.out.println("No tienes edad suficiente.");
		}
		
		// Que tipo de bebida te gusta?
		
		String bebida = "Agua";
		
		
		switch (bebida) {
		
			case "Cafe":
				System.out.println("Eleccion refinada.");
				break;
			
			case "Mate":
				System.out.println("Buena eleccion..");
				break;
			
			case "Gaseosa":
				System.out.println("Tene cuidado con el azucar.");
				break;
			
			case "Vino":
				System.out.println("No manejes porfavor.");
				break;
			
			default:
				System.out.println("Disfruta de tu bebida.");
				break;
			
		}
		

		
		
		
		
		
		
	}
}
