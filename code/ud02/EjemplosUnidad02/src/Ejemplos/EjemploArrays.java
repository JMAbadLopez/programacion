package ejemplos;

import java.util.Scanner;

public class EjemploArrays {

    public static void main(String[] args) {

        final int N = 5;

        double [] notas = new double [N];
        Scanner sc = new Scanner(System.in);

        String [] diasSemana = {"lunes","martes","miércoles","jueves","viernes"};

       for(int i = 0; i < notas.length; i++){

            System.out.println("Ingresa la nota del alumno #" + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println("Alumno/a " + (i+1) + ":\t" + notas[i]);
        }

        for(int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
        }
    }
}
