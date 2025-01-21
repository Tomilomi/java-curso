package ManejoDeArchivos;
import static ManejoDeArchivos.ManejoArchivos.*;


public class Main {
    public static void main(String[] args) throws Exception{
        String ruta = "src\\ManejoDeArchivos\\archivo\\hola.txt";


        crearArchivo(ruta);
        
        String texto = "\r\n" + //
                        "\r\n" + //
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam euismod varius blandit. Vestibulum at quam quis orci auctor dapibus sit amet at est. Nulla mollis est vel justo condimentum sagittis. Proin scelerisque tellus est, id iaculis erat scelerisque quis. Nulla pellentesque quis magna ut varius. Praesent tortor neque, dapibus sed finibus ut, rhoncus id neque. In et pellentesque diam, in volutpat nulla. Integer vel nunc maximus, porta nunc ut, tempus nisi. Fusce id aliquet tellus, vitae tincidunt neque. ";
        escribirArchivo(ruta, texto);

        leerArchivo(ruta);

        eliminarArchivo(ruta);
    }
}
