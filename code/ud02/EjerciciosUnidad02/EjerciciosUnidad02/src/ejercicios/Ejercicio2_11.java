package ejercicios;

import java.util.Scanner;

public class Ejercicio2_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los 3 números
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        int mayor, medio, menor;

        // Comparaciones
        if (a >= b && a >= c) {
            mayor = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            mayor = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        // Mostrar ordenados
        System.out.println("Ordenados de mayor a menor: " + mayor + " - " + medio + " - " + menor);

        sc.close();
    }
}
