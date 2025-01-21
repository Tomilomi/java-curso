### **Manejo de Archivos en Java**

El manejo de archivos en Java es una habilidad esencial para interactuar con los datos almacenados de forma persistente. En Java, se utilizan diversas clases y métodos proporcionados por el paquete `java.io` para crear, leer, escribir y eliminar archivos. A continuación, se explican los conceptos clave y las prácticas fundamentales que se ilustran en el código proporcionado.

---

#### **1. Crear Archivos**
Para crear un archivo, se utiliza la clase `File` junto con un flujo de salida (`PrintWriter`). El método `crearArchivo` del ejemplo verifica si el archivo existe y lo crea si es necesario:

```java
File archivo = new File(nombreArchivo);
PrintWriter salida = new PrintWriter(archivo);
```

- **Clase `File`**: Representa el archivo en el sistema.
- **Clase `PrintWriter`**: Se utiliza para escribir texto en un archivo.
- Si el archivo no existe, el método crea el archivo vacío.

---

#### **2. Escribir en Archivos**
Para escribir en un archivo, se utiliza `FileWriter` en combinación con `PrintWriter`. En el método `escribirArchivo`, se observa cómo añadir contenido al archivo:

```java
PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
salida.println(contenido);
```

- **Clase `FileWriter`**: Permite escribir en un archivo. El parámetro `true` en el constructor indica que se debe añadir contenido al final del archivo en lugar de sobrescribirlo.
- **Método `println`**: Escribe una línea de texto en el archivo.

---

#### **3. Leer Archivos**
El proceso de lectura de archivos utiliza un flujo de entrada basado en `BufferedReader` y `FileReader`. En el método `leerArchivo`, el archivo se lee línea por línea:

```java
BufferedReader entrada = new BufferedReader(new FileReader(archivo));
String lectura = entrada.readLine();
while (lectura != null) {
    System.out.println(lectura);
    lectura = entrada.readLine();
}
```

- **Clase `BufferedReader`**: Permite leer texto de manera eficiente.
- **Clase `FileReader`**: Se utiliza para leer el archivo.
- **Método `readLine`**: Lee una línea completa del archivo y devuelve `null` cuando no hay más líneas.

---

#### **4. Eliminar Archivos**
Para eliminar un archivo, se utiliza el método `delete` de la clase `File`. El método `eliminarArchivo` verifica si el archivo existe antes de eliminarlo:

```java
if (archivo.exists()) {
    archivo.delete();
    System.out.println("Se eliminó el archivo.");
}
```

- **Método `exists`**: Verifica si el archivo existe en la ruta especificada.
- **Método `delete`**: Elimina el archivo del sistema.

---

### **Aspectos Importantes a Considerar**
1. **Manejo de Excepciones:**
   - Muchas operaciones con archivos pueden generar excepciones como `FileNotFoundException` o `IOException`.
   - Es crucial manejar estas excepciones para evitar que el programa se detenga inesperadamente.

2. **Codificación de Archivos:**
   - Asegúrate de manejar correctamente la codificación (como UTF-8) si el archivo contiene caracteres especiales.

3. **Rutas de Archivos:**
   - Las rutas pueden ser relativas o absolutas. En este caso, se utiliza una ruta relativa: `src\\ManejoDeArchivos\\archivo\\hola.txt`.

4. **Cierre de Recursos:**
   - Es importante cerrar los flujos de entrada/salida después de usarlos para liberar recursos.

5. **Sobrecarga vs. Adición de Contenido:**
   - Usa el modo de sobrescritura (por defecto) o de adición (modo `true`) al escribir en un archivo según tus necesidades.

