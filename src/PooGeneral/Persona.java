package PooGeneral;

public class Persona {

	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	//Carrera carrera;
	
	// Constructor (ojito con el this)
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	// Metodos
	
	public String darNombreCompleto() {
		return getApellido() + ", " + getNombre();
	}
	
	public String enviarSaludo(String saludado) {
		if(edad > 40) 
			return "Buenos dias, querido " + saludado;
		return "Hola, como estas " + saludado + "?";
	}
	
	// -------------------------------------
	
	// Getters
	public int getEdad() {
		return edad;
	}
	
	public String getApellido() {
		return apellido.toUpperCase();
	}
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	// Setters 
	public void setNombre(String nombre) { // Usamos void ya que no retorna nada
		this.nombre = nombre; // Ojo con this, this.nombre refiere al atributo de la clase, y nombre al parametro
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	//Sobrecarga del constructor.
	
	//public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso) {
	//	carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
	//	this.nombre = nombre;
	//	this.apellido = apellido;
	//	this.edad = edad;
	//}
	
	
	// Sobrecarga de constructor, pidiendo solo el nombre de la carrera.
	
	//public Persona(String nombre, String apellido, int edad, String nombreCarrera) {
	//	carrera = new Carrera(nombreCarrera);
	//	this.nombre = nombre;
	//	this.apellido = apellido;
	//	this.edad = edad;
	//}
	
	

}
