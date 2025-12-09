# Ejercicios Iniciales: Conjuntos (Set) y Mapas (Map)

**Objetivo:** Familiarizarse con la sintaxis y el comportamiento básico de las estructuras `HashSet` y `HashMap` en Java.

---

## Parte 1: Conjuntos (Set)

Recuerda: Un `Set` es como una bolsa de elementos únicos. No tiene orden garantizado y **no admite duplicados**.

### Ejercicio 1.1: El Censo del Zoológico
**Enunciado:**
Estás creando el inventario de especies para el nuevo Zoológico de la ciudad.

1. Crea un `HashSet<String>` llamado `especies`.
2. Añade los siguientes animales: "León", "Tigre", "Cebra", "León", "Elefante", "Tigre".
3. Imprime el tamaño del conjunto (`size()`). ¿Cuántas especies únicas hay realmente?
4. Imprime todas las especies usando un bucle `for-each`. Observa si salen duplicados.

**Salida esperada:**
```text
Total de especies únicas: 4
Lista: [León, Cebra, Tigre, Elefante]  (El orden puede variar)
```

### Ejercicio 1.2: ¿Tenemos este animal?
**Enunciado:**
Partiendo del ejercicio anterior:

1. Pregunta al usuario (con `Scanner`) el nombre de un animal para buscar.
2. Usa el método `contains()` para decirle si esa especie ya está en el zoológico.
3. Si la especie está, elimínala del conjunto (`remove()`) porque ha sido trasladada a otro parque, y muestra un mensaje de confirmación.

### Ejercicio 1.3: Limpiando la Base de Datos
**Enunciado:**
El sistema antiguo del zoo ha generado una lista de identificadores de animales con errores (duplicados).

1. Crea un `ArrayList<Integer>` y añádele estos IDs: `101, 102, 103, 101, 104, 102, 105`.
2. Muestra la lista original con los duplicados.
3. Crea un `HashSet<Integer>` y pásale la lista completa en su constructor (`new HashSet<>(lista)`).
4. Muestra el conjunto resultante. ¡Los IDs duplicados han desaparecido automáticamente!

---

## Parte 2: Mapas (Map) - El Diccionario Clave-Valor

Recuerda: Un `Map` asocia una **Clave única** con un **Valor**. Es ideal para diccionarios, agendas o inventarios.

### Ejercicio 2.1: El Diccionario Español-Inglés
**Enunciado:**
Crea un pequeño traductor.

1. Crea un `HashMap<String, String>`. La clave será la palabra en español y el valor en inglés.
2. Añade ("gato", "cat"), ("perro", "dog"), ("mesa", "table").
3. Imprime el tamaño del mapa.
4. Pide al usuario una palabra en español y muestra su traducción recuperándola con `get()`.

**Salida esperada:**
```text
Diccionario cargado con 3 palabras.
Dime una palabra: gato
En inglés es: cat
```

### Ejercicio 2.2: Actualizando la Agenda
**Enunciado:**
Vamos a gestionar una agenda telefónica simple (Nombre -> Teléfono).

1. Crea un `HashMap<String, Integer>`.
2. Inserta: ("Juan", 666111222), ("Marta", 666333444).
3. Juan ha cambiado de número. Vuelve a insertar la clave "Juan" con el nuevo número 666999888.
4. Imprime el mapa completo. ¿Aparece Juan dos veces o se ha actualizado?
5. Intenta obtener el teléfono de "Pedro" (que no existe). ¿Qué devuelve el método `get()`?

### Ejercicio 2.3: Inventario de Frutas (Recorrido)
**Enunciado:**
Gestiona el stock de una frutería.

1. Crea un `HashMap<String, Double>` (Fruta -> Precio/kg).
2. Añade: "Manzana" (1.5), "Pera" (1.8), "Plátano" (2.1).
3. Recorre el mapa usando `entrySet()` y un bucle `for-each`.
4. Muestra por pantalla cada fruta y su precio con el formato: `Producto: Manzana - Precio: 1.5 €`.

### Ejercicio 2.4: Frecuencia de Números
**Enunciado:**
Este es un caso de uso clásico de los mapas. Dado un array de números: `{1, 5, 1, 2, 5, 5, 3}`.

1. Crea un `HashMap<Integer, Integer>` donde la Clave es el número y el Valor es su "contador".
2. Recorre el array.
3. Para cada número, si NO está en el mapa, añádelo con valor 1.
4. Si YA está, recupera su valor actual, súmale 1 y guárdalo de nuevo.
5. Al final, imprime qué números aparecieron y cuántas veces (ej: "El 5 aparece 3 veces").