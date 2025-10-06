package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {

    public static void main(String[] args) {

        int base, altura;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa de cálculo de un área");
        System.out.println("Introduce la base: ");
        base = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduce la altura: ");
        altura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("El área del cuadrado es: " + (base*altura) + "cm2");

        teclado.close();

    }
}
