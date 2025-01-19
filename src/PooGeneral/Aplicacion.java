package PooGeneral;

public class Aplicacion {

	public static void main(String[] args) throws Exception {
		
		Persona persona1 = new Persona("Pedro", "Pascal", 48);

		//persona1.nombre = "Ricardo"; No funcion porque ya no se puede setear o cambiar el nombre,
		// ya que estan en privado los atributos.
		
		persona1.setNombre("Ricardo");
		persona1.setApellido("Darin");
		persona1.setEdad(20);
		
		
		//Carrera carrera1 = new Carrera();
		//carrera1.nombre = "Ing. en Sist.";
		//carrera1.duracion = 5;
		//carrera1.estaEnCurso = true;	
		
		//persona1.carrera = carrera1;
				
				
		//-----------------------------		
				
		//Persona persona2 = new Persona();
		//persona2.nombre = "Mariano";
		//persona2.apellido = "Lopez";
		//persona2.edad = 23;
		
		//Carrera carrera2 = new Carrera();
		
		//carrera2.nombre = "Lic. en Psicologia";
		//carrera2.duracion = 5;//
		//carrera2.estaEnCurso = false;	
		
		//persona2.carrera = carrera2;
		
		System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años."); // getEdad es publico
		
		
		//System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y estudia "+ persona2.carrera.nombre);
		//System.out.println("-"+ persona1.nombre + ": " + persona1.enviarSaludo("Luke Skywalker"));
		

		
	}

}
