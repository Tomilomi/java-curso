package Generalidades;


public class Bucles {
	public static void main(String[] args) throws Exception {
		
		
		// for (inicializacion; condicion; actualizacion)
		int i;
		int j;
		
		for (i = 1; i <= 5; i++) {
			
			for (j = 1; j <= 5; j++) {
				System.out.print("i: ");
				System.out.print(i);
				System.out.print(" j: ");
				System.out.println(j);
			}
		}
		
	
		// while 
		System.out.println("-------------------------------");
		int contador = 1;
		
		while (contador <= 5) {
			System.out.println(contador);
			contador ++;
			
		}
		System.err.println(contador);
		System.err.println("-----------------------------------");
		
		// do while, permite hacer acciones ante de chekear la condicion.
		
		int cont = 1;
		do {
			System.out.println("Esto sucede antes de la condicion");
			System.out.println(cont);
			cont ++;
			
		} while (cont <= 5);
		
		
		System.err.println(cont);
		
		
	}
}
