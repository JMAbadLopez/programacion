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
        for(int i = 0; i < cantidades.length; i++) {
            System.out.println("DATOS DEL PRODUCTO ["+ (i+1) + "]");

            System.out.println("Nombre del producto :");
            nombres[i] = teclado.nextLine();

            System.out.println("Cantidad del producto:");
            cantidades[i] = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Precio del producto:");
            precios[i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    /**
     * PROCEDIMIENTO: Muestra el contenido de los 3 arrays
     * de forma formateada.
     */
    public static void mostrarAlmacen(String[] nombres, int[] cantidades, double[] precios) {
        System.out.println("ALMACEN DE PRODUCTOS");
        for(int i = 0; i < nombres.length; i++) {
            System.out.println("-" + nombres[i] + " " + cantidades[i] + " " + precios[i] + "€");
        }
    }

    /**
     * PROCEDIMIENTO: Gestiona la venta de un producto.
     * Debe llamar a 'buscarProducto' y 'calcularPrecioVenta'.
     * Debe actualizar el stock en 'cantidades' y sumar la venta a 'totalVentas'.
     */
    public static void venderProducto(Scanner teclado, String[] nombres, int[] cantidades, double[] precios) {

        int posicionProducto;
        String nombreBuscado;
        int cantidad;
        double precioFinal = 0.0, descuento = 0.0;

        System.out.println("Producto a buscar: ");
        nombreBuscado = teclado.nextLine();

        posicionProducto = buscarProducto(nombreBuscado, nombres);
        if(posicionProducto == -1) {
            System.out.println("No existe el producto.");
        } else {

            System.out.println("¿Cuántas unidades quieres?");
            cantidad = teclado.nextInt();
            teclado.nextLine();

            if(cantidades[posicionProducto] >= cantidad) {
                System.out.println("¿Qué descuento se aplica?");
                descuento = teclado.nextDouble();
                teclado.nextLine();

                precioFinal = calcularPrecioVenta(precios[posicionProducto], cantidad, descuento);

                cantidades[posicionProducto] -= cantidad;
                totalVentas += precioFinal;

                System.out.printf("Venta realizada. Precio final: " + String.format("%.2f", precioFinal) + " €");
            } else {
                System.out.println("No queda stock del producto.");
            }
        }
    }

    /**
     * FUNCIÓN: Busca un producto en el array 'nombres'.
     * @param nombreBuscado El nombre de la pieza a buscar.
     * @param nombres El array de nombres.
     * @return El índice (int) de la pieza si se encuentra, o -1 si no.
     */
    public static int buscarProducto(String nombreBuscado, String[] nombres) {
        for(int i = 0; i < nombres.length; i++) {
            if(nombreBuscado.equals(nombres[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * FUNCIÓN: Calcula el precio final de una venta aplicando un descuento.
     * @param precioUnitario El precio de la pieza.
     * @param cantidad La cantidad de piezas a vender.
     * @param descuentoPorcentaje El descuento (ej: 10.0 para un 10%).
     * @return El precio final (double) de la venta.
     */
    public static double calcularPrecioVenta(double precioUnitario, int cantidad, double descuentoPorcentaje) {
        return (precioUnitario * cantidad) - ((precioUnitario * cantidad) * descuentoPorcentaje / 100);
    }


    /**
     * PROCEDIMIENTO: Muestra el informe comercial completo.
     * Debe calcular y mostrar el producto más caro, el de mayor stock,
     * el de menor stock, el precio medio y el total de ventas.
     */
    public static void mostrarInformeComercial(String[] nombres, int[] cantidades, double[] precios, double totalVentas) {
        int maxPrecio, maxCantidades;
        double precioMedio = 0.0;

        maxPrecio = buscarMayorPrecio(precios);
        maxCantidades = buscarMayorCantidad(cantidades);
        precioMedio = calculaMedia(precios);

        System.out.println("INFORME COMERCIAL");
        System.out.println("-----------------");
        System.out.println("- Producto de mayor precio : " + nombres[maxPrecio] + " - Precio: " + String.format("%.2f", precios[maxPrecio]) + " €");
        System.out.println("- Producto con mayor cantidad : " + nombres[maxCantidades] + " - Cantidad: " + cantidades[maxCantidades] + " uds.");
        System.out.println("- Precio medio : " + String.format("%.2f", precioMedio) + " €");
        System.out.println("- TOTAL VENTAS: " + String.format("%.2f", totalVentas) + " €");
    }

    public static int buscarMayorPrecio(double[] precios) {
        int mayor = 0;
        for(int i = 0; i < precios.length; i++) {
            if(precios[i] > precios[mayor]) {
                mayor = i;
            }
        }
        return mayor;
    }

    public static int buscarMayorCantidad(int[] cantidades) {
        int mayor = 0;
        for(int i = 0; i < cantidades.length; i++) {
            if(cantidades[i] > cantidades[mayor]) {
                mayor = i;
            }
        }
        return mayor;
    }

    public static double calculaMedia(double[] precios) {
        double media = 0.0;
        for(int i = 0; i < precios.length; i++) {
            media += precios[i];
        }
        return media/precios.length;
    }
}