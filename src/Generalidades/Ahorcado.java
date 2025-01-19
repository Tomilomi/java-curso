package Generalidades;

import java.util.Scanner;


public class Ahorcado {

	public static void main(String[] args) throws Exception {
		
		// Clase scanner para escribir
		Scanner scanner = new Scanner(System.in);
		// Declaraciones y asignaciones
		String palabraSecreta = "inteligencia";
		int intentosMaximos = 10;
		int intentos = 0;
		boolean esAdivinada = false;
		// Arreglos:
		char[] letrasAdivinadas = new char[palabraSecreta.length()];
		
		for (int i = 0; i < letrasAdivinadas.length; i++) {
			letrasAdivinadas[i] = '_';
		}
		
		
		while(!esAdivinada && intentos < intentosMaximos){
			System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
			System.out.println("Ingrese una letra, porfavor");
			
			char letra = Character.toLowerCase(scanner.next().charAt(0));
			
			boolean letraCorrecta = false;
			
			for (int i = 0; i < palabraSecreta.length(); i++) {
				
				if(palabraSecreta.charAt(i) == letra) {
					letrasAdivinadas[i] = letra;
					letraCorrecta = true;
				}
			}
			
			
			if (!letraCorrecta)	{
				intentos ++;
				System.out.println("Incorrecto, te quedan " + (intentosMaximos - intentos) + " intentos.");
			}
			
			if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
				
				esAdivinada = true;
				System.out.println("Felicidades, adivinaste la palabra secreta: " + palabraSecreta);
				
			}
				
			}
		
		if (!esAdivinada) {
			System.out.println("Game Over");
			
		}
		scanner.close();
		}
		
		
		
	}


