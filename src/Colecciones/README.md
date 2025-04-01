
| **Característica**      | **Set**                                                                                      | **List**                                                        | **Map**                                                                          |
|--------------------------|---------------------------------------------------------------------------------------------|-----------------------------------------------------------------|----------------------------------------------------------------------------------|
| **Orden**               | No hay garantía de orden.                                                                   | Ordenado.                                                      | No hay garantía de orden en las claves, pero las claves-valor están asociadas.  |
| **Duplicados**          | No permite elementos duplicados.                                                            | Permite elementos duplicados.                                  | No permite claves duplicadas, pero los valores pueden ser iguales.              |
| **Implementaciones**    | `HashSet`, `TreeSet`, `LinkedHashSet`, etc.                                                 | `ArrayList`, `LinkedList`, `Vector`, etc.                      | `HashMap`, `TreeMap`, `LinkedHashMap`, etc.                                      |
| **Acceso por índice**   | No permite acceso por índice.                                                               | Permite acceso por índice.                                     | No permite acceso por índice, se accede por clave.                              |
| **Búsqueda rápida**     | Buena eficiencia en búsqueda de elementos.                                                  | La eficiencia depende de la implementación.                    | Buena eficiencia en búsqueda de claves, pero no de valores.                     |
| **Uso**                 | Útil para asegurar elementos únicos.                                                        | Útil para almacenar una secuencia de elementos donde el orden es importante. | Útil para almacenar asociaciones entre claves y valores.                        |
| **Ejemplo de uso**      | Eliminar duplicados en una lista.                                                           | Mantener una secuencia de elementos en orden.                  | Almacenar pares de datos relacionados.                                          |


| **Implementación**     | **Características**                                                                                                 |
|-------------------------|--------------------------------------------------------------------------------------------------------------------|
| **`HashSet`**           | - No garantiza orden.                                                                                              |
|                         | - Basado en una tabla hash, ofrece buena eficiencia en operaciones básicas (O(1) promedio).                         |
| **`TreeSet`**           | - Garantiza un orden natural (o definido por un comparador).                                                        |
|                         | - Implementa la interfaz `NavigableSet` y está basado en un árbol rojo-negro.                                       |
| **`LinkedHashSet`**     | - Mantiene el orden de inserción.                                                                                   |
|                         | - Útil cuando se requiere mantener un orden predecible junto con la eliminación de duplicados.                      |


| **Implementación**     | **Características**                                                                                                 |
|-------------------------|--------------------------------------------------------------------------------------------------------------------|
| **`ArrayList`**         | - Implementación basada en arrays dinámicos.                                                                       |
|                         | - Permite acceso rápido por índice (O(1) promedio).                                                                |
|                         | - Ideal para operaciones frecuentes de lectura.                                                                    |
| **`LinkedList`**        | - Implementación basada en una lista doblemente enlazada.                                                          |
|                         | - Más eficiente que `ArrayList` para operaciones de inserción o eliminación en cualquier posición de la lista.      |
| **`Vector`**            | - Similar a `ArrayList`, pero es sincronizado (thread-safe).                                                       |
|                         | - Menos utilizado actualmente debido a su costo en términos de rendimiento frente a `ArrayList`.                   |


| **Implementación**     | **Características**                                                                                                 |
|-------------------------|--------------------------------------------------------------------------------------------------------------------|
| **`HashMap`**           | - No garantiza orden.                                                                                              |
|                         | - Basado en una tabla hash, es eficiente para búsqueda y almacenamiento (O(1) promedio).                            |
| **`TreeMap`**           | - Garantiza un orden natural (o definido por un comparador) para las claves.                                       |
|                         | - Implementa la interfaz `NavigableMap`, basado en un árbol rojo-negro.                                            |
| **`LinkedHashMap`**     | - Mantiene el orden de inserción de las claves.                                                                    |
|                         | - Útil para aplicaciones que requieren iteración en el mismo orden en que se insertaron las claves.                 |

