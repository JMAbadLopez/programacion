package ejemplos;

import java.util.Scanner;

public class EjemploCondicional3 {

    public static void main(String[] args) {

        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();

        if( edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if ( edad < 6 ) {
            System.out.println("Eres un ninño");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
