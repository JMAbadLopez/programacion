# Actividad Entregable UD5: Gestión de Cine

**Objetivo:** Diseñar y construir un programa orientado a objetos aplicando encapsulamiento, constructores, y estructuras de datos dinámicas como `ArrayList`.

**Resultados de Aprendizaje (RAs) Trabajados: RA4, RA6.**

* Se han diseñado clases con sus atributos y métodos.
* Se han utilizado constructores para inicializar objetos.
* Se han utilizado estructuras de datos para almacenar colecciones de objetos.
* Se ha implementado la lógica de negocio en métodos específicos.

## Contexto

El **Cine "Alucine Max"** necesita un sistema para gestionar sus salas y la venta de entradas. Cada sala proyecta una película diferente y tiene su propia capacidad.

## Enunciado

Desarrolla una aplicación modular en Java con las siguientes características:

### 1. Clase `Sala`

Esta clase representará cada una de las salas del cine.

*   **Atributos:**
    *   `asientos`: Matriz de caracteres (`char[][]`) que representa las filas y columnas de butacas.
    *   `numSala`: Número identificativo de la sala (`int`).
    *   `pelicula`: Título de la película (`String`).
    *   `horaProyeccion`: Hora de la sesión (`String`, ej: "18:00").
    *   `recaudacionTotal`: Dinero acumulado por ventas (`double`).
    *   **Constante:** El precio de la entrada es fijo: **5.99 €**.

*   **Constructores:**
    1.  **Constructor completo**: Recibe todos los parámetros necesarios para inicializar la sala (dimensiones, número, película, hora).
    2.  **Constructor simplificado**: Recibe `pelicula` y `horaProyeccion`. Crea por defecto una sala de **6 filas x 10 columnas**.
    *   *Nota:* Ambos constructores deben inicializar la matriz de asientos con el carácter `'.'` (libre).

*   **Métodos:**
    *   `void mostrarSala()`: Muestra por consola el estado de los asientos (matriz).
    *   `boolean asientoDisponible(int fila, int columna)`: Devuelve `true` si el asiento está libre (`'.'`) y dentro de rango.
    *   `void venderEntrada(int fila, int columna)`: Marca el asiento como ocupado (ej: `'X'`) y suma el precio a la recaudación.
    *   `double getRecaudacionTotal()`: Devuelve el dinero recaudado.
    *   `int getAsientosDisponibles()`: Devuelve el número total de asientos vacíos en la sala.
    *   `String toString()`: Devuelve una cadena con la información de la sala: número, película, hora y número de asientos disponibles.
    *   **Getters y Setters:** Debes implementar los métodos *get* y *set* para los atributos que lo requieran.

### 2. Clase `Main` (Programa Principal)

Usa un `ArrayList<Sala>` para gestionar las diferentes salas del cine. El programa debe permitir:

1.  **Configuración inicial:** Crea varias salas con diferentes películas y añádelas a tu lista.
2.  **Menú de opciones:**
    *   A) Crear sala (Añadir una nueva sala al cine).
    *   B) Ver cartelera (Listar salas con su información básica).
    *   C) Ver sala (Mostrar butacas de una sala específica).
    *   D) Vender entrada (Pedir sala, fila y columna, validando disponibilidad).
    *   E) Recaudación total del cine (Suma de todas las salas).
    *   F) Salir.

---
### Pistas de Implementación

!!! tip "Matriz de Asientos"
    Para inicializar la matriz en el constructor, necesitarás recorrerla con dos bucles `for` anidados y asignar el carácter `.` a cada posición.

!!! tip "Venta de Entradas"
    Recuerda comprobar `asientoDisponible()` antes de vender. Si el asiento está libre, cámbialo a ocupado (ej. `X`) y suma `5.99` a la recaudación de esa sala.

!!! example "Ejemplo de Salida - Mostrar Sala"
    ```text
      0 1 2 3 4 5 6 7 8 9
    0 . . . . . . . . . .
    1 . . . X X . . . . .
    2 . . . . . . . . . .
    ...
    ```
