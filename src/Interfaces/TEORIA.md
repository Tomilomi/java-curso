# **Interfaces en Java**

En Java, una **interfaz** es un contrato que define un conjunto de métodos que una clase debe implementar. Las interfaces son una parte fundamental de la programación orientada a objetos en Java, ya que permiten definir comportamientos que varias clases pueden compartir sin necesidad de una relación de herencia.

---

## **¿Qué es una Interfaz?**

Una interfaz es un tipo especial de clase en Java que solo contiene declaraciones de métodos (sin implementación) y constantes. A partir de **Java 8**, también se pueden incluir métodos con implementación predeterminada (`default`) y métodos estáticos.

```java
interface Animal {
    void emitirSonido(); // Método abstracto
}
