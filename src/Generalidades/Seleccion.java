package Generalidades;


import java.util.ArrayList;

public class Seleccion {
	// tipos de datos primitivos
	// int, byte, short, long, float, double, boolean, char
	
	
	String nombreEquipo;
	char grupo;
	boolean clasificadoOctavos;
	
	void clasifico() {
		// tambien hay else if
		if(clasificadoOctavos == true) {
			System.out.println("Estado: clasificados");
		}
		else {
			System.out.println("Estado: no clasificados");
		}
		
	}
	
	void imprimirEquipo() {
		System.out.println("Equipo: " + nombreEquipo);
		System.out.println("Grupo: " + grupo);
		clasifico();
		
	}
	
	
	public static void main(String[] args) {
//		Seleccion argentina = new Seleccion();
//		argentina.nombreEquipo = "Seleccion Argentina";
//		argentina.grupo = 'C';
//		argentina.clasificadoOctavos = true;
//		argentina.imprimirEquipo();
		
		
		// for-loop
//		for(int i = 0; i<11; i++) {
//			System.out.println("Asiento: " + i);
//		}
		
		// while-loop
//		byte j = 1;
//		while (j<11) {
//			System.out.println("Asiento: " + j);
//			j++;
//		}
		
		//Excepciones
		int x = 0;
		int z = 5;
		
		// Try-catch
		try {
		System.out.println(z/x);
		} catch(Exception exception) {
			System.out.println("Imposible dividir por 0.");
		}
		
		// Librerias
		
		
		ArrayList<String> selecciones = new ArrayList<>();
		selecciones.add("Francia");
		selecciones.add("Portugal");
		selecciones.add("Argentina");
		selecciones.add("Brasil");
		System.out.println(selecciones);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
