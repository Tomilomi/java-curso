package Interfaces.interfaces;

public interface Comunicable {
    
    // La clase que implemente esta interfaz estara obligada a usar este metodo
    // No pueden tener constructores a diferencia de las clases abstractas
    // Puede tener atributos pero deben ser constantes, del tipo 'final'.
    // final num = 3;
    // Podemos tener static, public y final pero NUNCA private 
    //               (Implicando que no podemos tener getters y setters)

    
    void comunicarse();

}
