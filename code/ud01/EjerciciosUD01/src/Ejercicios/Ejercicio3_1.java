package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {

        float precio = 0, impuestos = 0, precioFinal = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa de costes");
        System.out.println("Introduce el precio (en euros): ");
        precio = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Introduce el porcentaje de impuestos (no hace falta que pongas %):");
        impuestos = teclado.nextFloat();
        teclado.nextLine();

        precioFinal = precio * (1+impuestos/100);
        System.out.println("El coste total es: " + precioFinal + "€");

        teclado.close();
    }
}
