package ejemplos;

import java.util.Scanner;

public class AlumnosNotas {

    public static void main(String[] args) {

        final int N = 5;

        double[] notas = new double[N];
        String[] alumnos = new String[N];
        double maximo, minimo, media = 0;

        Scanner sc = new Scanner(System.in);

        /**
         * Pedimos el nombre del alumno y su nota
         */
        System.out.println("--- INTRODUCCIÓN DE NOTAS ---");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Dame el nombre del alumno/a: ");
            alumnos[i] = sc.nextLine();

            System.out.println("Dame el nota del alumno/a: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        /**
         * Realizamos los cálculos
         */
        maximo = notas[0];
        minimo = notas[0];
        for(int i = 0; i < notas.length; i++){

            if(notas[i] > maximo){
                maximo = notas[i];
            }

            if(notas[i] < minimo){
                minimo = notas[i];
            }

            media += notas[i];
        }
        /**
         * Mostramos los datos de los ALUMNOS
         */
        System.out.println("--- INFORMACIÓN DE LA CLASE ---");
        for(int i= 0; i < notas.length; i++){
            System.out.println(alumnos[i] + "\t\t - Nota: " + notas[i]);
        }
        System.out.println("* La nota máxima es " + maximo);
        System.out.println("* La nota mínima es " + minimo);
        System.out.println("* La media de la clase es " + media/notas.length);

    }
}
