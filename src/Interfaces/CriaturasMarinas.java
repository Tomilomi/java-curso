package Interfaces;

public abstract class CriaturasMarinas {

    // Atributo
    String nombre;

    // Constructor
    public CriaturasMarinas(String nombre){
        this.nombre = nombre;
    }

    // Esto obliga a sobreescribir en las clases que hereden de CriaturasMarinas
    abstract void nadar();

}
