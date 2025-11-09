# Actividad entregable: Gestor de Inventario de Ferretería

**Objetivo:** Diseñar e implementar un programa modular completo desde cero, combinando los conceptos de funciones (UD3) con el manejo de arrays paralelos y `String` (UD2).

**Resultados de Aprendizaje (RAs) Trabajados: RA2 y RA3.**

* **Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje.**
* **Desarrolla programas aplicando la programación estructurada e introduciendo el tratamiento de datos.**

---

## Enunciado

Vamos a programar el software para la "Ferretería CAMP". Necesitamos un programa que gestione nuestro inventario de piezas. Para ello, usaremos tres arrays paralelos:

1. `String[] nombres`: Para guardar los nombres de las piezas (ej: "Tornillo", "Tuerca", "Martillo").
2. `int[] cantidades`: Para guardar el stock (cantidad) de cada pieza.
3. `double[] precios`: Para guardar el precio por unidad de cada pieza.

El programa debe ser **totalmente modular**. Esto significa que el `main` solo se encargará de mostrar el menú y llamar a las funciones adecuadas para cada tarea.

### Requisitos del Programa

1. **Inicialización:** Al arrancar, el programa preguntará: "¿Cuántas piezas únicas quieres gestionar?". Y creará los 3 arrays con ese tamaño.
2. **Menú Principal:** Deberá mostrar un menú repetitivo (con un `do-while`) que ofrezca las siguientes opciones:
    1. Gestionar Almacén (Rellenar/Actualizar datos)
    2. Mostrar Almacén
    3. Vender Producto
    4. Mostrar Informe Comercial
    5. Salir
3. **Variable de Ventas:** Deberás tener una variable (por ejemplo, `double totalVentas = 0.0;`) que acumule el importe de todas las ventas realizadas.

---

### Funciones a Implementar

Tu tarea es **diseñar e implementar** todas las funciones necesarias para que el `main` sea lo más simple posible. Aquí tienes una guía de las funciones que necesitarás (puedes crear más si las ves útiles):

**1 `public static void gestionarAlmacen(Scanner teclado, String[] nombres, int[] cantidades, double[] precios)`**

* **Tarea:** Recorre los arrays y pide al usuario el nombre, la cantidad y el precio de cada una de las piezas para rellenar el inventario.

**2. `public static void mostrarAlmacen(String[] nombres, int[] cantidades, double[] precios)`**

* **Tarea:** Muestra un listado formateado de todo el inventario, indicando el nombre, el stock actual y el precio de cada pieza.

**3. `public static void venderProducto(Scanner teclado, String[] nombres, int[] cantidades, double[] precios)`**

* **Tarea:** Esta es la función más compleja. Llamará a funciones auxiliares (**puntos 4 y 5**). Debe:
    1. Pedir al usuario el nombre de la pieza que quiere vender.
    2. Llamar a una **función auxiliar** (ej: `buscarProducto`) para encontrar el **índice** de esa pieza. Devolverá `-1` en caso de no encontrarlo (**esta función no muestra ningún mensaje**).
    3. Si no la encuentra, mostrará un mensaje de error *'Producto no encontrado'* y terminará la función.
    4. Si la encuentra, pedirá la cantidad a vender y comprobar si hay stock suficiente.
    5. Pedir el porcentaje de descuento a aplicar (ej: 10 para un 10%, o 0 para sin descuento).
    6. Llamar a una **función auxiliar de cálculo** (ej: `calcularPrecioVenta`) que reciba el precio original, la cantidad y el descuento, y devuelva el precio final de la venta.
    7. **Actualizar el stock** en el array `cantidades` (¡recuerda el paso por referencia!).
    8. **Actualizar el `totalVentas`** (sumando el precio final de esta venta).
    9. Mostrar un mensaje de "Venta realizada. Precio final: X.XX €".

**4. `public static int buscarProducto(String nombreBuscado, String[] nombres)`**

* **Función Auxiliar (Helper):** Recibe un nombre y el array de nombres.
* **Retorna:** El `int` del índice (posición) donde se encuentra el producto, o `-1` si no lo encuentra.

**5. `public static double calcularPrecioVenta(double precioUnitario, int cantidad, double descuentoPorcentaje)`**

* **Función Auxiliar (Helper):** Recibe los datos de la venta.
* **Lógica:** Si `descuentoPorcentaje` es `0`, devuelve `precioUnitario * cantidad`. Si es mayor que 0, calcula y aplica el descuento.
* **Retorna:** El `double` del precio final.

**6. `public static void mostrarInformeComercial(String[] nombres, int[] cantidades, double[] precios, double totalVentas)`**

* **Tarea:** Calcula y muestra las siguientes estadísticas:
    * Producto más caro (Nombre y Precio).
    * Producto con más stock (Nombre y Cantidad).
    * Producto con menos stock (Nombre y Cantidad).
    * Precio medio de todos los productos del inventario.
    * **Importe total de ventas** (el valor de `totalVentas`).
* **Pista:** ¡Esta función debería llamar a sus propias funciones auxiliares (ej: `encontrarIndiceMaxPrecio`, `calcularPrecioMedio`, etc.) para mantenerse limpia y modular!

### Entrega

* Nombra tu fichero como `ud3_ferreteria_[tu_nombre].java`.

---

## Esqueleto de Código para Rellenar

Copia este código en tu IDE. **Debes crear las cabeceras y el cuerpo de las funciones**.

```java
import java.util.Scanner;

/**
 * Actividad entregable: Gestor de Inventario de Ferretería.
 *
 * OBJETIVO: Implementar la lógica de las funciones marcadas con "TODO"
 * para construir un programa modular que gestione un inventario.
 */
public class GestorFerreteria {

    // Variable estática para acumular el total de ventas.
    // Es accesible desde todas las funciones estáticas de esta clase.
    private static double totalVentas = 0.0;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas piezas únicas quieres gestionar? ");
        int numPiezas = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        // Creación de arrays paralelos
        String[] nombres = new String[numPiezas];
        int[] cantidades = new int[numPiezas];
        double[] precios = new double[numPiezas];

        int opcion;
        do {
            System.out.println("\n--- FERRETERÍA DAM ---");
            System.out.println("1. Gestionar Almacén (Rellenar Inventario)");
            System.out.println("2. Mostrar Almacén");
            System.out.println("3. Vender Producto");
            System.out.println("4. Mostrar Informe Comercial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionarAlmacen(teclado, nombres, cantidades, precios);
                    break;
                case 2:
                    mostrarAlmacen(nombres, cantidades, precios);
                    break;
                case 3:
                    venderProducto(teclado, nombres, cantidades, precios);
                    break;
                case 4:
                    mostrarInformeComercial(nombres, cantidades, precios, totalVentas);
                    break;
                case 5:
                    System.out.println("Cerrando programa. Ventas totales del día: " + String.format("%.2f", totalVentas) + " €");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 5);

        teclado.close();
    } // Fin del main

    // ############### FUNCIONES Y PROCEDIMIENTOS ###################
    // TU TRABAJO COMIENZA AQUÍ: Crea las funciones y procedimientos.
    // ##############################################################
}
```
