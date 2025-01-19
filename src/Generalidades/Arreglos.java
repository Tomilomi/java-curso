package Generalidades;


public class Arreglos {

	public static void main(String[] args) throws Exception {
		
		// Arreglos, estructura de datos que tinen valores del mismo tipo bajo un mismo nombre
		// Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos
		// mediante una matriz                               
		// Los arreglos son tambien llamados vectores o matrices
		
		//int[] numeros = new int[5];
		
		// numeros[0] = 12;
		// numeros[1] = 22;
		// numeros[3] = 43;
		// numeros[4] = 52;
		
		//Tipo nombre       Indices
		//Dato0          0  1  2  3  4
		int[] numeros = {10,20,30,40,50};
		
		//System.out.println(numeros[0]);
		//System.out.println(numeros[1]);
		// No ingresamos un valor para numeros[2], asi que por default es 0 y NO INDEFINIDO.
		//System.out.println(numeros[2]);
		//System.out.println(numeros[3]);
		//System.out.println(numeros[4]);
		
		//System.out.println(numeros.length);
		
		numeros[2] = 70;
		
		for (int index = 0; index < numeros.length; index ++) {
			System.err.println(numeros[index]);
		}
		
		
		int indice = 0;
		// for Each
		//   un elemento de arreglo
		for (int numero : numeros) {
			System.out.println(numero);
			System.out.println(indice);
			indice++;
		}
		
		String palabra = "Abecedario";
		
		System.out.println(palabra.length());
		// denotar que length() != length, se llaman igual sin embargo uno es metodo de array
		// y el otro es un metodo de String
	}

}
