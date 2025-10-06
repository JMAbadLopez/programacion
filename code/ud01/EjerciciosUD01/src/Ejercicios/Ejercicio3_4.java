package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {

        int tamanyo, numAlumnos, residuo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa de distribución de grupos");
        System.out.print("Introduce el tamaño del grupo: ");
        tamanyo = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduce el número de alumnos por equipo: ");
        numAlumnos = teclado.nextInt();
        teclado.nextLine();

        residuo = tamanyo%numAlumnos;

        System.out.println("Los alumnos se repartirán en " + tamanyo/numAlumnos + " equipos de " + numAlumnos+
                ". Hay un desajuste de " + residuo + " alumnos");
        
        teclado.close();
    }
}
