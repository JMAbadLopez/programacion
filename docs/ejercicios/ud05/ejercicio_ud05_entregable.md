# Actividad Entregable UD5: Gestión de Cine 🎬

**Objetivo:** Diseñar y construir un programa orientado a objetos aplicando encapsulamiento, constructores, y estructuras de datos dinámicas como `ArrayList`.

**Resultados de Aprendizaje (RAs) Trabajados: RA2, RA4, RA6.**

* Se han diseñado clases con sus atributos y métodos.
* Se han utilizado constructores para inicializar objetos.
* Se han utilizado estructuras de datos para almacenar colecciones de objetos.
* Se ha implementado la lógica de negocio en métodos específicos.

## Contexto

El **Cine "Alucine Max"** necesita un sistema para gestionar sus salas y la venta de entradas. **Tú eres el programador backend** encargado de diseñar la estructura de datos y la lógica para hacer esto posible. Cada sala proyecta una película diferente y tiene su propia capacidad.

## Enunciado

Desarrolla una aplicación modular en Java con las siguientes características:

### 1. Clase `Sala`

Esta clase representará cada una de las salas del cine.

*   **Atributos:**
    *   `asientos`: Matriz de caracteres (`char[][]`) que representa las filas y columnas de butacas.
    *   `numSala`: Número identificativo de la sala (`int`).
    *   `pelicula`: Título de la película (`String`).
    *   `horaProyeccion`: Hora de la sesión (`String`, ej: "18:00").
    *   `recaudacionSala`: Dinero acumulado por ventas (`double`).
    *   `recaudacionTotal`: (Estático) Acumula la recaudación total de todos los cines (`double`).
    *   **Constantes:** El precio de la entrada es fijo: **5.99** (`double`). El número de filas y de las columnas son **6** y **10**, respectivamente (`int`).

*   **Constructores:**
    1. **Constructor por defecto**: No recibe parámetros. Crea por defecto una sala de **6 filas x 10 columnas**, el número de la sala es 0, la película es "", la hora de la proyección es "" y la recaudación de la sala es 0.
    2. **Constructor parcial**: Recibe `numSala`, `pelicula` y `horaProyeccion`. Crea por defecto una sala de **6 filas x 10 columnas** y pone la recaudación de la sala a 0.
    !!! tip "Nota"
        El constructor debe inicializar la matriz de asientos con el carácter `'.'` (libre).

*   **Métodos:**
    *   `void mostrarSala()`: Muestra por consola el estado de los asientos (matriz).
    *   `boolean asientoDisponible(int fila, int columna)`: Devuelve `true` si el asiento está libre (`'.'`) y dentro de rango.
    *   `void venderEntrada(int fila, int columna)`: Marca el asiento como ocupado (ej: `'X'`) y suma el precio a la recaudación.
    *   `double getRecaudacionSala()`: Devuelve el dinero recaudado.
    *   `int getAsientosDisponibles()`: Devuelve el número total de asientos vacíos en la sala.
    *   `String toString()`: Devuelve una cadena con la información de la sala: número, película, hora y número de asientos disponibles.
    *   `static double getRecaudacionTotal()`: Método estático que devuelve la **recaudación total** de todas las salas.
    *   **Getters y Setters:** Debes implementar los métodos *get* y *set* para los atributos `numSala`, `pelicula` y `horaProyeccion`.

### 2. Clase `Main` (Programa Principal)

Usa un `ArrayList<Sala>` para gestionar las diferentes salas del cine. El programa debe permitir:

1.  **Configuración inicial:** Crea varias salas con diferentes películas y añádelas a tu lista.
2.  **Menú de opciones:**
    *   **A) Crear sala** (Añadir una nueva sala al cine).
        ```text
        > Seleccione opción: A
        Ingrese número de sala: 4
        Ingrese título película: Gladiator II
        Ingrese hora: 22:00
        [INFO] Sala 4 creada con éxito.
        ```
    *   **B) Ver cartelera** (Listar salas con su información básica).
        ```text
        > Seleccione opción: B
        --- CARTELERA ---
        [Sala 1] Openheimer (17:00) - Asientos Libres: 60
        [Sala 2] Barbie (20:00) - Asientos Libres: 15
        -----------------
        ```
    *   **C) Ver sala** (Mostrar butacas de una sala específica).
        ```text
        > Seleccione opción: C
        Ingrese número de sala: 1
        --- ESTADO SALA 1 ---
          0 1 2 3 4 5 6 7 8 9
        0 . . . . . . . . . .
        1 . . X X . . . . . .
        2 . . . . . . . . . .
        ...
        ```
    *   **D) Vender entrada** (Pedir sala, fila y columna, validando disponibilidad).
        ```text
        > Seleccione opción: D
        Ingrese número de sala: 1
        Ingrese fila: 1
        Ingrese columna: 3
        [OK] Entrada vendida (Precio: 5.99€).
        ```

        En caso de no poder realizar la venta, porque el asiento no está disponible, mostrará el siguiente mensaje:
        ```text
        [ASIENTO NO DISPONIBLE]
        ```

    *   **E) Ver recaudación de sala** (Muestra el dinero reacudado por una sala).
        ```text
        > Seleccione opción: E
        Ingrese número de sala: 1
        [INFO] La sala 1 ha recaudado: 35.94€
        ```
    *   **F) Recaudación total del cine** (Recaudación de todas las salas).
        ```text
        > Seleccione opción: F
        Recaudación total del cine: 450.25€
        ```
    *   **G) Salir.**

---
### Pistas de Implementación

!!! tip "Matriz de Asientos"
    Para inicializar la matriz en el constructor, necesitarás recorrerla con dos bucles `for` anidados y asignar el carácter `.` a cada posición.

!!! tip "Venta de Entradas"
    Recuerda comprobar `asientoDisponible()` antes de vender. Si el asiento está libre, cámbialo a ocupado (ej. `X`) y suma `5.99` a la recaudación de esa sala.
