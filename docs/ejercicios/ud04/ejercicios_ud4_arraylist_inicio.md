# Ejercicios Unidad 4: Estructuras de Datos Dinámicas (ArrayList)

**Objetivo:** Dominar el uso de la clase `ArrayList` en Java, comprendiendo sus métodos principales y cómo iterar sobre ella de forma eficiente.

**Nota Importante:** Para recorrer las listas, intenta utilizar **Iteradores (`Iterator`)** siempre que sea posible, especialmente cuando necesites modificar la lista mientras la recorres. También es buena práctica familiarizarse con el bucle `for-each` para lecturas simples.

## 1. Creación y Rellenado Básico

**Enunciado:** Escribe un programa Java que cree un nuevo `ArrayList` para almacenar cadenas de texto (Strings). Añade varios nombres de colores (ej: "Rojo", "Verde", "Azul") e imprime la colección completa por consola.

## 2. Iteración de Elementos

**Enunciado:** Usando la lista de colores del ejercicio anterior, escribe un programa que recorra e imprima cada uno de los elementos utilizando un **Iterador** (`Iterator`).

* *Reto extra:* Intenta hacerlo también con un bucle `for-each`.

## 3. Inserción en Posición Específica

**Enunciado:** Tienes una lista de colores. Escribe un programa que inserte un nuevo color (ej: "Amarillo") en la **primera posición** (índice 0) de la lista, desplazando los demás elementos.

* *Pista:* Utiliza el método sobrecargado `add(index, element)`.

## 4. Recuperación de Elementos (Acceso Posicional)

**Enunciado:** Escribe un programa que recupere y muestre el elemento que se encuentra en una posición específica (por ejemplo, el índice 2) de tu `ArrayList`.

* *Pista:* El método `get(index)` es tu amigo.

## 5. Actualización de Elementos

**Enunciado:** Escribe un programa que busque un elemento específico en la lista (por su índice) y lo sustituya por un nuevo valor. Por ejemplo, cambia el color que esté en la segunda posición por "Negro".

* *Pista:* Utiliza el método `set(index, element)`.

## 6. Eliminación de Elementos

**Enunciado:** Escribe un programa que elimine el **tercer elemento** de tu `ArrayList`. Muestra la lista antes y después de la eliminación para verificar que los índices se han reajustado correctamente.

## 7. Búsqueda de Elementos

**Enunciado:** Escribe un programa que busque si un elemento concreto (ej: "Blanco") existe en el `ArrayList`. El programa debe indicar si se ha encontrado o no.

* *Pista:* El método `contains(object)` devuelve un booleano muy útil aquí.

## 8. Ordenación de Listas

**Enunciado:** Escribe un programa que ordene alfabéticamente tu `ArrayList` de colores.

* *Pista:* La clase de utilidad `Collections` tiene un método estático `sort()` que te facilitará la vida.

## 9. Copia de Listas

**Enunciado:** Escribe un programa que copie todo el contenido de un `ArrayList` original en otro nuevo `ArrayList`. Verifica que ambos contienen los mismos datos al finalizar.

## 10. Mezcla de Elementos (Shuffle)

**Enunciado:** Escribe un programa que "baraje" o mezcle aleatoriamente los elementos de tu `ArrayList`.

* *Pista:* Investiga el método `Collections.shuffle()`.

## 11. Inversión de la Lista

**Enunciado:** Escribe un programa que invierta el orden de los elementos en el `ArrayList`. El último pasará a ser el primero, y viceversa.

* *Pista:* `Collections.reverse()` es la herramienta adecuada.

## 12. Extracción de Sublistas

**Enunciado:** Escribe un programa que extraiga una porción de tu lista original (por ejemplo, desde el índice 1 hasta el 3) y la guarde en una nueva lista.

* *Pista:* El método `subList(fromIndex, toIndex)` crea una vista de la lista original.

## 13. Comparación de Listas

**Enunciado:** Dados dos `ArrayList` diferentes, escribe un programa que los compare y determine si son iguales (tienen los mismos elementos en el mismo orden) o no.

## 14. Intercambio de Elementos (Swap)

**Enunciado:** Escribe un programa que intercambie de posición dos elementos dentro del mismo `ArrayList`. Por ejemplo, intercambia el elemento de la posición 0 con el de la posición 2.

* *Pista:* `Collections.swap()` hace esto directamente.

## 15. Unión de Listas

**Enunciado:** Tienes dos `ArrayList` distintos. Escribe un programa que una ambos en una sola lista, añadiendo todos los elementos del segundo al final del primero.

* *Pista:* El método `addAll()` es ideal para esto.

## 16. Clonación de Listas

**Enunciado:** Escribe un programa que clone un `ArrayList` en otro nuevo. A diferencia de la copia simple, investiga cómo funciona el método `clone()` de `ArrayList`.

## 17. Vaciado de la Lista

**Enunciado:** Escribe un programa que elimine **todos** los elementos de un `ArrayList` de golpe, dejándolo vacío.

## 18. Comprobación de Lista Vacía

**Enunciado:** Escribe un programa que compruebe si un `ArrayList` está vacío o contiene elementos, e imprima un mensaje acorde.

* *Pista:* `isEmpty()` es más legible que comprobar si `size() == 0`.