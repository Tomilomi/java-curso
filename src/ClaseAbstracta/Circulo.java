package ClaseAbstracta;
public class Circulo extends Figura{

    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double calcularArea(){
        return Math.PI * radio * radio;
    }
}
