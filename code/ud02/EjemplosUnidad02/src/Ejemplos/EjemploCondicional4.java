package Ejemplos;

import java.util.Scanner;

public class EjemploCondicional4 {

    public static void main(String[] args) {

        int edad;
        boolean vieneAcompanado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();

        if( edad >= 18) {
            System.out.println("Puedes entrar, eres mayor de edad");
        } else {
            System.out.print("Vienes acompañado por un adulto (true/false): ");
            vieneAcompanado = teclado.nextBoolean();

            if (vieneAcompanado) {
                System.out.println("Puedes entrar, acompañado");
            } else  {
                System.out.println("No puedes entrar");
            }
        }

    }
}
