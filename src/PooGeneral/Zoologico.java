package PooGeneral;


public class Zoologico {

	public static void main(String[] args) throws Exception {
		
		Animal animal = new Animal("Bestia", 200);
		Gato gato = new Gato("Sr.Gato", 15);
		Perro perro = new Perro("Fatiga", 3);
		
		System.out.println("El animal llamado " + animal.nombre + " hace:");
		System.out.println(animal.hacerSonido());
		
		System.out.println("El gato llamado " + gato.nombre + " hace:");
		System.out.println(gato.hacerSonido());
		
		System.out.println("El perro llamado " + perro.nombre + " hace:");
		System.out.println(perro.hacerSonido());
		
		// Para acceder a un metodo o atributo ESTATICO se debe de acceder a ellos de manera ESTATICA
		// Es decir desde la CLASE.
		
		System.out.println("La cantidad de animales instanciados es de: " + Animal.getCantidadAnimales());
		System.out.println("Yo atiendo a mis animales en " + Veterinaria.nombre);
	}

}
