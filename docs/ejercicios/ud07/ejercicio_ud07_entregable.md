# Actividad Entregable UD7: Gestión de Almacén con Persistencia 📦

**Objetivo:** 

* Implementar una aplicación Java que gestione el inventario de un almacén, aplicando conceptos de persistencia de datos en ficheros de texto (CSV), gestión de excepciones, y ordenación de colecciones.

**Resultados de Aprendizaje (RAs) Trabajados: RA5.**

* Realiza operaciones de entrada y salida de información, utilizando procedimientos específicos del lenguaje y librerías de clases.

---

## Contexto

La empresa **"Logística 4.0"** necesita una herramienta para gestionar el stock de sus productos. Hasta ahora, usaban hojas de cálculo, pero quieren un programa en Java que guarde los datos en un archivo `productos.csv`. Como programador/a, tu tarea es crear este sistema robusto que permita manipular los datos y asegurar que se guarden correctamente al salir.

## Requisitos Técnicos

### 1. Clase `Producto`

Esta clase debe representar los elementos lógicos del inventario.

*   **Definición de Clase:** Deberás decidir qué atributos y tipos de datos son necesarios para almacenar la información de un producto (id, nombre, stock y precio) garantizando el **encapsulamiento**.
*   **Interfaz `Comparable`:** La clase debe implementar `Comparable<Producto>` para permitir la ordenación por la cantidad de **stock** (de menor a mayor).
*   **Métodos:** Implementa los constructores y métodos necesarios (`toString`, getters, setters) para que la clase sea funcional dentro del sistema.

### 2. Programa Principal (`Main`)

El programa gestionará un `ArrayList<Producto>` que se sincronizará con el archivo `productos.csv`.

#### Funcionalidades obligatorias:

1.  **Leer todos los productos:** Al arrancar, el programa debe cargar los datos del fichero CSV (si existe). Si no existe, debe empezar con la lista vacía.
2.  **Crear un nuevo producto:** Solicita datos al usuario y añade el producto a la lista en memoria.
3.  **Buscar y modificar:** Busca un producto por su `id`. Si existe, permite cambiar su stock o su precio.
4.  **Eliminar un producto:** Elimina un producto de la lista buscando por su `id`.
5.  **Ordenar por stock:** Muestra la lista de productos ordenada de menor a mayor stock.
6.  **Generar fichero de reposición:** Solicita al usuario un umbral de stock y genera un nuevo archivo llamado `reposicion_productos.csv` que contenga únicamente los productos cuyo stock sea inferior a dicho número.
7.  **Guardar y Salir:** Escribe todos los productos del `ArrayList` en el archivo `productos.csv` (actualizando los cambios) y finaliza la ejecución.

---

## Tips de Implementación

!!! tip "Gestión del Archivo CSV"
    Un archivo CSV separa los campos por un delimitador (ej: `;`). Para leer cada línea y recuperar los datos, usa el método `split(";")` de la clase `String`.
    ```java
    String linea = "1;Martillo;50;15.5";
    String[] partes = linea.split(";");
    int id = Integer.parseInt(partes[0]);
    // ... continuar parseando el resto de campos
    ```

!!! tip "Persistencia y Excepciones"
    Utiliza `try-catch` o el moderno **try-with-resources** para gestionar la apertura de `Scanner` (lectura) y `PrintStream` (escritura).
    - Al leer: Controla que el archivo pueda no existir (`FileNotFoundException`).
    - Al escribir: Asegúrate de cerrar el flujo para que los datos se vuelquen realmente al disco.

!!! danger "Importante: Ordenación"
    Para que `Collections.sort(lista)` funcione, no olvides implementar correctamente el método `compareTo` en la clase `Producto`.

---

## Estructura del Fichero CSV (Ejemplo)
El archivo `productos.csv` debería tener una apariencia similar a esta:
```text
1;Tuercas;500;0.10
2;Tornillos;250;0.05
3;Taladro;10;89.99
```
