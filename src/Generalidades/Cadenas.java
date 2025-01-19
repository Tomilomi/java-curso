package Generalidades;

public class Cadenas {
	public static void main(String[] args) throws Exception {
		
		String texto = "Texto LArGO";
		System.out.println(texto);
		
		int longitud = texto.length();
		System.out.println(longitud);
		
		char caracter = texto.charAt(1);
		System.out.println(caracter);
		String subString = texto.substring(6, 11);
		System.out.println(subString);
		
		String minuscula = subString.toLowerCase();
		System.out.println(minuscula);
		String mayuscula = subString.toUpperCase();
		System.out.println(mayuscula);
		
		int indice = texto.indexOf("exto");
		System.out.println(indice);
		
		String reemplazado = texto.replace("Texto", "Parrafo");
		System.out.println(reemplazado);
		
		boolean contiene = texto.contains("Texto");

		System.out.println("Tiene la palabra parrafo? " + contiene);
		
		String textoEspacio = "   Hay muchos espacios en este texto.           ";
		String textoSinEspacio = textoEspacio.trim();
		System.out.println(textoSinEspacio);
	}
}
