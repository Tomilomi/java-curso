package ManejoDeArchivos;

import java.io.*;


public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        // Si no existe el archivo lo crea.
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);;
        }
    }


    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
    
        // Si no existe el archivo lo crea y le introduce el contenido.
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);;
        } catch (IOException ex){
            ex.printStackTrace(System.out);;
        }
    }


    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
    
        // Si no existe el archivo lo crea y le introduce el contenido.
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
                
            }            
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);;
        } catch (IOException ex){
            ex.printStackTrace(System.out);;
        }
    }
    

    public static void eliminarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
            System.out.println("Se elimino el archivo.");
        }
        else{
            System.out.println("El archivo no existe");
        }
        
    }


    

    


}

