package PooGeneral;

public class Animal {

	//Atributos
	String nombre;
	int edad;
	static int contadorAnimales = 0;
	
	//Constructor
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contadorAnimales ++;
	}
	
	
	
	//Metodos
	public String hacerSonido() {
		return "#$*$@#$^%&";
	}
	
	public static int getCantidadAnimales() {
		return contadorAnimales;
	}
}
