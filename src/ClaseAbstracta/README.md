# **Clases Abstractas en Java**

En Java, las clases abstractas son una herramienta clave en la programación orientada a objetos. Estas clases sirven como base para otras clases, definiendo una estructura común, pero dejando ciertos detalles de implementación a las subclases.

## **¿Qué es una Clase Abstracta?**

Una clase abstracta es aquella que no puede ser instanciada directamente, lo que significa que no puedes crear objetos de ella. Su propósito es definir métodos que serán implementados por sus subclases y, opcionalmente, incluir métodos concretos que puedan ser reutilizados.

```java
abstract class Figura {
    // Método abstracto
    abstract double calcularArea();
}
