package Generalidades;


public class Operadores {
	public static void main(String[] args) throws Exception {
		
		// Aritmeticos
		
		double a = 5;
		double b = 4;
		
		double c = a / b;
		
		int d = 12;
		int e = d % 2;
		
		// Asignacion '='
		
		
		e--;
		
		System.out.println(c);
		System.out.println(e);
		
		// Comparacion
		
		boolean esMayor = a > b;
		boolean esMenor = a < b;
		boolean esIgual = a == b;
		
		// Logicos
		
		boolean condicion1 = true;
		boolean condicion2 = false;
		
		boolean resultadoAND = condicion1 && condicion2;
		boolean resultadoOR = condicion1 || condicion2;
		boolean resultadoNOT = !condicion1;

		System.out.println(esMayor);
		System.out.println(esMenor);
		System.out.println(esIgual);

		System.out.println(resultadoAND);
		System.out.println(resultadoOR);
		System.out.println(resultadoNOT);
		
	}
}
