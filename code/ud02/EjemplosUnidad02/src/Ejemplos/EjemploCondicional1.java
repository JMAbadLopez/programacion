package Ejemplos;

import java.util.Scanner;

public class EjemploCondicional1 {

    public static void main(String[] args) {

        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();

        if( edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

    }
}
