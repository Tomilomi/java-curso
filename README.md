# Curso de JAVA desde 0

> ***Estas son mis anotaciones sobre JAVA desde 0, aprendiendo de manera autodidacta.***

## Temas

- 🖥️ **Java en general**  
  (Estructuras de control, Estructuras de datos, etc.)

- ☕ **Java en POO**  
  Programación orientada a objetos en Java: Clases, objetos, herencia, polimorfismo y encapsulamiento.

- 🛠️ **Maven**  
  Herramienta de gestión de dependencias y construcción de proyectos.

- 🌱 **Spring Framework**  
  Framework para el desarrollo de aplicaciones empresariales, que facilita la gestión de dependencias, la inyección de dependencias y el desarrollo modular.

- 🗃️ **Hibernate**  
  Framework para trabajar con bases de datos, facilitando la persistencia de datos utilizando el mapeo objeto-relacional (ORM).

- 🐘 **PostgreSQL**  
  Sistema de gestión de bases de datos relacional utilizado como base de datos principal.

- 🐋 **Docker**  
  Herramienta de contenedorización para empaquetar aplicaciones y sus dependencias.

- 🚀 **Railway**  
  Plataforma para desplegar aplicaciones fácilmente en la nube.

---

## Conceptos Clave

### **JDBC (Java Database Connectivity)**  
JDBC es una API de Java que permite a las aplicaciones conectarse y ejecutar consultas en bases de datos. Es la base para interactuar con bases de datos desde Java. Sin embargo, su implementación manual puede ser tediosa, por lo que frameworks como Hibernate simplifican este trabajo.

**Aplicación**: Usado para entender la conexión básica con bases de datos antes de usar frameworks avanzados como Hibernate.

---

### **DAO (Data Access Object)**  
El patrón DAO se utiliza para abstraer la lógica de acceso a datos, separándola del resto de la aplicación. Cada clase DAO maneja operaciones CRUD específicas para una entidad.

**Ejemplo**: Una clase `UsuarioDAO` podría manejar métodos como `guardarUsuario()`, `obtenerUsuarioPorId()`, etc.

---

### **Maven**  
Maven es una herramienta de gestión de proyectos y dependencias. Permite configurar bibliotecas externas como Spring o Hibernate mediante un archivo `pom.xml`.

**Uso en el curso**:  
- Aprenderás cómo configurar proyectos con Maven.
- Agregar dependencias como Spring y Hibernate para automatizar la gestión de bibliotecas.

---

### **Spring Framework**  
Spring es un framework para el desarrollo de aplicaciones empresariales. Sus características principales incluyen:  
- **Inyección de dependencias (DI)**: Facilita la creación de componentes modulares.  
- **Spring Boot**: Simplifica la configuración de aplicaciones Spring.  

**Uso en el curso**:  
- Configurar un proyecto básico con Spring Boot.  
- Crear una aplicación que siga el patrón **MVC (Modelo-Vista-Controlador)**.

---

### **Hibernate**  
Hibernate es una herramienta de mapeo objeto-relacional (ORM) que permite trabajar con bases de datos utilizando objetos Java en lugar de escribir consultas SQL manuales.

**Ventajas**:  
- Reducción de código SQL repetitivo.  
- Simplificación de operaciones CRUD.  
- Mapeo de clases a tablas con anotaciones como `@Entity`, `@Table`, etc.

**Uso en el curso**:  
- Configurar Hibernate para manejar entidades.  
- Implementar un DAO con Hibernate.

---

### **Persistencia de Datos**  
Este concepto implica almacenar y recuperar datos de una base de datos. En Java, se logra usando frameworks como Hibernate o directamente con JDBC.

- **Entidades**: Clases que representan tablas de una base de datos (por ejemplo, `Usuario`, `Producto`).  
- **Repositorios**: Interfaces o clases para realizar operaciones CRUD sobre las entidades.  
- **Servicios**: Contienen la lógica de negocio y utilizan repositorios para acceder a los datos.  
- **Controladores**: Manejan las solicitudes del usuario y coordinan las respuestas usando los servicios.

**Relación con Spring**:  
Spring facilita la implementación de esta estructura a través de su módulo **Spring Data JPA**.

---

### **MVC (Modelo-Vista-Controlador)**  
MVC es un patrón de diseño que separa la lógica de negocio, la presentación y las interacciones del usuario:  
- **Modelo**: Gestiona los datos de la aplicación (Ej: Clases y entidades).  
- **Vista**: Presenta los datos al usuario (Ej: HTML, Thymeleaf).  
- **Controlador**: Maneja las solicitudes y coordina entre el modelo y la vista.

