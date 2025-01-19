package PooGeneral;

// Con esto especificamos que gato hereda de animal

public class Gato extends Animal{
	
	

	public Gato(String nombre, int edad) {
		// Con super estamos asignado los atributos heredados.
		super(nombre, edad);
	}
	
	
	@Override
	public String hacerSonido() {
		return "Miau";
	}
	
}
