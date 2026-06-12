# Ejercicios Unidad 4: Estructuras de Datos Dinámicas (ArrayList)

!!! info "Resultados de Aprendizaje"
    Este boletín trabaja el siguiente RA del módulo de **Programación**:

    - **RA6** — Reconoce y utiliza las librerías de clases relacionadas con tipos de datos avanzados. Utiliza listas dinámicas para almacenar, recorrer, buscar y ordenar colecciones de objetos.

!!! abstract "Objetivo"
    Dominar el uso de la clase `ArrayList` en Java, comprendiendo sus métodos principales y cómo iterar sobre ella de forma eficiente. Al final del documento encontrarás una **tabla de referencia** con los métodos usados en estos ejercicios.

!!! warning "Eliminación de elementos durante el recorrido"
    Para eliminar elementos concretos de las listas mientras las recorremos, utilizamos **Iteradores (`Iterator`)**. También es buena práctica familiarizarse con el bucle `for-each` para lecturas simples.

---

## 1. Creación y Rellenado Básico

**Enunciado:** Escribe un programa Java que cree un nuevo `ArrayList` para almacenar cadenas de texto (Strings). Añade varios nombres de colores (ej: "Rojo", "Verde", "Azul") e imprime la colección completa por consola.

## 2. Iteración de Elementos

**Enunciado:** Usando la lista de colores del ejercicio anterior, escribe un programa que recorra e imprima cada uno de los elementos con un bucle `for-each`.

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

## 8. Búsqueda y Eliminación

**Enunciado:** Escribe un programa que busque un elemento concreto (ej: "Blanco") usando **Iteratores** `Iterator`. Si lo encuentra, debe eliminarlo de forma segura.

* *Pista:* Usa un bucle `while(it.hasNext())`

## 9. Ordenación de Listas

**Enunciado:** Escribe un programa que ordene alfabéticamente tu `ArrayList` de colores.

* *Pista:* La clase de utilidad `Collections` tiene un método estático `sort()` que te facilitará la vida.

## 10. Copia de Listas

**Enunciado:** Escribe un programa que copie todo el contenido de un `ArrayList` original en otro nuevo `ArrayList`. Verifica que ambos contienen los mismos datos al finalizar.

## 11. Mezcla de Elementos (Shuffle)

**Enunciado:** Escribe un programa que "baraje" o mezcle aleatoriamente los elementos de tu `ArrayList`.

* *Pista:* Investiga el método `Collections.shuffle()`.

## 12. Inversión de la Lista

**Enunciado:** Escribe un programa que invierta el orden de los elementos en el `ArrayList`. El último pasará a ser el primero, y viceversa.

* *Pista:* `Collections.reverse()` es la herramienta adecuada.

## 13. Extracción de Sublistas

**Enunciado:** Escribe un programa que extraiga una porción de tu lista original (por ejemplo, desde el índice 1 hasta el 3) y la guarde en una nueva lista.

* *Pista:* El método `subList(fromIndex, toIndex)` crea una vista de la lista original.

## 14. Comparación de Listas

**Enunciado:** Dados dos `ArrayList` diferentes, escribe un programa que los compare y determine si son iguales (tienen los mismos elementos en el mismo orden) o no.

## 15. Intercambio de Elementos (Swap)

**Enunciado:** Escribe un programa que intercambie de posición dos elementos dentro del mismo `ArrayList`. Por ejemplo, intercambia el elemento de la posición 0 con el de la posición 2.

* *Pista:* `Collections.swap()` hace esto directamente.

## 16. Unión de Listas

**Enunciado:** Tienes dos `ArrayList` distintos. Escribe un programa que una ambos en una sola lista, añadiendo todos los elementos del segundo al final del primero.

* *Pista:* El método `addAll()` es ideal para esto.

## 17. Clonación de Listas

**Enunciado:** Escribe un programa que clone un `ArrayList` en otro nuevo. A diferencia de la copia simple, investiga cómo funciona el método `clone()` de `ArrayList`.

## 18. Vaciado de la Lista

**Enunciado:** Escribe un programa que elimine **todos** los elementos de un `ArrayList` de golpe, dejándolo vacío.

## 19. Comprobación de Lista Vacía

**Enunciado:** Escribe un programa que compruebe si un `ArrayList` está vacío o contiene elementos, e imprima un mensaje acorde.

* *Pista:* `isEmpty()` es más legible que comprobar si `size() == 0`.

---

### 📋 Referencia Rápida: Métodos de ArrayList y Collections

Aquí tienes un resumen de los métodos que necesitarás para resolver estos ejercicios. Supongamos una lista llamada `lista`.

| Clase | Método | Descripción | Ejemplo de Código |
| :--- | :--- | :--- | :--- |
| **ArrayList** | `add(E e)` | Añade al final. | `lista.add("Rojo");` |
| **ArrayList** | `add(int i, E e)` | Inserta en la posición `i`. | `lista.add(0, "Azul");` |
| **ArrayList** | `get(int i)` | Obtiene el elemento en la posición `i`. | `String c = lista.get(2);` |
| **ArrayList** | `set(int i, E e)` | Sustituye el elemento en la posición `i`. | `lista.set(1, "Verde");` |
| **ArrayList** | `remove(int i)` | Elimina el elemento en la posición `i`. | `lista.remove(0);` |
| **ArrayList** | `contains(Obj o)`| Devuelve `true` si el elemento existe. | `boolean b = lista.contains("Rojo");` |
| **ArrayList** | `size()` | Devuelve el número de elementos. | `int n = lista.size();` |
| **ArrayList** | `isEmpty()` | Devuelve `true` si está vacía. | `if (lista.isEmpty()) ...` |
| **ArrayList** | `clear()` | Elimina todos los elementos. | `lista.clear();` |
| **ArrayList** | `subList(i, j)` | Crea una vista de la lista desde `i` hasta `j` (exclusivo). | `List<String> sub = lista.subList(1, 3);` |
| **ArrayList** | `clone()` | Crea una copia superficial de la lista. | `Object copia = lista.clone();` |
| **ArrayList** | `addAll(Coll c)` | Añade todos los elementos de otra colección. | `lista.addAll(otraLista);` |
| **Collections** | `sort(List l)` | Ordena la lista (alfabético/numérico). | `Collections.sort(lista);` |
| **Collections** | `shuffle(List l)`| Mezcla los elementos aleatoriamente. | `Collections.shuffle(lista);` |
| **Collections** | `reverse(List l)`| Invierte el orden de los elementos. | `Collections.reverse(lista);` |
| **Collections** | `swap(List l, i, j)`| Intercambia los elementos de las posiciones `i` y `j`. | `Collections.swap(lista, 0, 2);` |
| **Collections** | `copy(dest, src)`| Copia elementos de `src` a `dest` (debe tener tamaño suficiente). | `Collections.copy(destino, origen);` |
