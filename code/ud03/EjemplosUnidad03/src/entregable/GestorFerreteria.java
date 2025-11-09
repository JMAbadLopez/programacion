package entregable;

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
            }
        } while (opcion != 5);

        teclado.close();
    } // Fin del main

    /**
     * PROCEDIMIENTO: Rellena los 3 arrays paralelos pidiendo
     * los datos al usuario.
     */
    public static void gestionarAlmacen(Scanner teclado, String[] nombres, int[] cantidades, double[] precios) {
        System.out.println("Función 'gestionarAlmacen' no implementada.");
    }

    /**
     * PROCEDIMIENTO: Muestra el contenido de los 3 arrays
     * de forma formateada.
     */
    public static void mostrarAlmacen(String[] nombres, int[] cantidades, double[] precios) {
        System.out.println("Función 'mostrarAlmacen' no implementada.");
    }

    /**
     * PROCEDIMIENTO: Gestiona la venta de un producto.
     * Debe llamar a 'buscarProducto' y 'calcularPrecioVenta'.
     * Debe actualizar el stock en 'cantidades' y sumar la venta a 'totalVentas'.
     */
    public static void venderProducto(Scanner teclado, String[] nombres, int[] cantidades, double[] precios) {
        System.out.println("Función 'venderProducto' no implementada.");
    }

    /**
     * FUNCIÓN: Busca un producto en el array 'nombres'.
     * @param nombreBuscado El nombre de la pieza a buscar.
     * @param nombres El array de nombres.
     * @return El índice (int) de la pieza si se encuentra, o -1 si no.
     */
    public static int buscarProducto(String nombreBuscado, String[] nombres) {
        System.out.println("Función 'buscarProducto' no implementada.");
        return -1; // Valor por defecto
    }

    /**
     * FUNCIÓN: Calcula el precio final de una venta aplicando un descuento.
     * @param precioUnitario El precio de la pieza.
     * @param cantidad La cantidad de piezas a vender.
     * @param descuentoPorcentaje El descuento (ej: 10.0 para un 10%).
     * @return El precio final (double) de la venta.
     */
    public static double calcularPrecioVenta(double precioUnitario, int cantidad, double descuentoPorcentaje) {
        System.out.println("Función 'calcularPrecioVenta' no implementada.");
        return 0.0; // Valor por defecto
    }


    /**
     * PROCEDIMIENTO: Muestra el informe comercial completo.
     * Debe calcular y mostrar el producto más caro, el de mayor stock,
     * el de menor stock, el precio medio y el total de ventas.
     */
    public static void mostrarInformeComercial(String[] nombres, int[] cantidades, double[] precios, double totalVentas) {
        System.out.println("Función 'mostrarInformeComercial' no implementada.");
    }
}