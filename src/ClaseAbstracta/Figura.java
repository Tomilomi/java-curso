package ClaseAbstracta;
// Clase abstracta
public abstract class Figura {

    // No puedo definir el comportamiento del metodo
    // ya que es ABSTRACTO

    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta informacion viene desde la clase abstracta");
    }
}
