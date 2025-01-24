package Colecciones;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
import java.util.Vector;


public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenido a la fiesta de los superheroes!");
        
        List<String> superHeroes = new Vector<>();
        superHeroes.add("SpiderMan");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("SuperMan");
        superHeroes.add("WonderWoman");
        superHeroes.add("WonderWoman");
        superHeroes.add("WonderWoman");


        superHeroes.add("IronMan");

        if (superHeroes.contains("SpiderMan")){
            System.out.println("SpiderMan esta en la fiesta");
        }

        System.out.println("Se fue " + superHeroes.get(5));
        superHeroes.set(8, "TonyStark");
        superHeroes.remove(5);


        if (!superHeroes.contains("Hulk")){
            System.out.println("Hulk se fue de la fiesta.");
        }

        superHeroes.add("SuperMan");

        if (superHeroes.isEmpty()){
            System.out.println("La fiesta termino.");
        } else {
            System.out.println("La fiesta continua, todavia hay " + superHeroes.size() + " super heroes.");
        }

        System.out.println("Quienes siguen en la fiesta?");

        for (String superHeroe : superHeroes){
            System.out.println(superHeroe);
        }

    }
}
