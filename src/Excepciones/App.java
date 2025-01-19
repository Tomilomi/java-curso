package Excepciones;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Excepciones: evento que interrumpen el flujo normal de la aplicacion
        // Unchecked y checked

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        // numero1/numero2
        // Esta es una uncheked exception                         
        // Ya que no se ve o se tiene que verificar antes
        // Para solventar estas situaciones se hace uso de 'try catch'.


        Calculadora calculadora = new Calculadora();


        try {
            resultado =  calculadora.dividir(numero1, numero2);
            System.out.println(resultado);


        } catch (CalculadoraException e){
            e.printStackTrace();
            System.out.println("Esto va despues de la excepcion.");

        // para mensaje final o ejecutar un bloque de codigo despues del try/catch
        } finally {
            System.out.println("Hemos finalizado el calculo ya sea exitoso o no.");
        }



    }

}
