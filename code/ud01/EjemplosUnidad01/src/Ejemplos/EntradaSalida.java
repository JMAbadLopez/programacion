package Ejemplos;

import java.util.Scanner;

public class EntradaSalida {

    public static void main(String[] args) {

        System.out.print("Línea sin salto");
        System.out.println("Al final de este texto sí que hay salto");
        System.out.print("Texto con un salto con el carácter de escape\n");

        String nombre = "Álex";
        int edad = 20;

        System.out.println(nombre + " tiene " + edad + " años");
        System.out.println("Ojo con los carácteres especiales, tenemos que escaparlos. Por ejemplo \\n, \\t \" ");

        /**
         * Ejemplo de entrada estándar
         */

        // Declaración de "Scanner"
        Scanner teclado = new Scanner(System.in);

        int entero;
        double decimal;
        String texto;

        System.out.println("Dame un entero: ");
        entero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("El entero vale " + entero);

        System.out.println("Dame un decimal: ");
        decimal = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("El decimal vale " + decimal);

        System.out.printf("Escribe un texto: ");
        texto = teclado.nextLine();
        System.out.println("El texto dice así: " + texto);

    }
}
