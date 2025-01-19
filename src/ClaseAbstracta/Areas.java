package ClaseAbstracta;

public class Areas {
    public static void main(String[] args) throws Exception {
        
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8, 6);

        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
    }
}
