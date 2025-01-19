package Excepciones;

public class Calculadora {

    public int dividir (int dividendo, int divisor) throws CalculadoraException{
        if (divisor == 0) throw new CalculadoraException("No es posible dividir por cero");

        return dividendo / divisor;
    }







}
