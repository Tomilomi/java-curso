package Colecciones;
import java.util.Map;
//import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.TreeMap;

public class Verduleria {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenido a nuestra verduleria.");
        
        Map<String, Double> inventario = new LinkedHashMap<>();


        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla", 0.65);
        inventario.put("Pimiento", 0.77);

        System.out.println("Este es el inventario de frutas y verduras: ");

        //KeySet me da un arreglo con las keys
        for (String fruta : inventario.keySet()) {
                                // Con get y la key puedo acceder al valor asociado
            System.out.println(fruta + ": $" + inventario.get(fruta));

        }
        String frutaBuscada = "Banana";
        System.out.println("Un cliente pide: " + frutaBuscada);

        

        if (inventario.containsKey(frutaBuscada)){
            System.out.println("Esta en el inventario.");
        } else {
            System.out.println("Nos quedamos sin " + frutaBuscada);
        }

        String sinStock = "Frutilla";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin: " + sinStock);
        System.out.println("==========================================");

        System.out.println("Inventario actualizado: ");

        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("La cantidad de mercaderia es: " + inventario.size());

    }

}
