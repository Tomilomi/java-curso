package Interfaces;

import Interfaces.interfaces.Alimentable;
import Interfaces.interfaces.Comunicable;
// No se puede extender mas de una clase ABSTRACTA
// Pero si se puede implementar mas de una interfaz
public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{

    int cantidadTentaculos;

    public Pulpo(String nombre, int cantidadTentaculos){
        super(nombre);
        this.cantidadTentaculos = cantidadTentaculos;
    }


    @Override
    void nadar(){
        System.out.println(nombre + " esta nadando con sus " + cantidadTentaculos + " tentaculos.");
    }


    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantidadTentaculos + " tentaculos.");
    }


    @Override
    public void alimentar() {
        System.out.println(nombre + " se alimenta con peces.");
    }
    


}


