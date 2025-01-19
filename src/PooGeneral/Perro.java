package PooGeneral;

public class Perro extends Animal{
	
	

	public Perro(String nombre, int edad) {
		// Con super estamos asignado los atributos heredados.
		super(nombre, edad);
	}
	
	// Con el decorador override podemos sobreescribir un metodo.
	@Override
	public String hacerSonido() {
		return "Guau";
	}
	
}
