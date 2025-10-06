package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {

        double kg, m, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cálculo del IMC");
        System.out.println("Introduce tu altura (en m): ");
        m =  teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Introduce tu peso (kg): ");
        kg = teclado.nextFloat();
        teclado.nextLine();

        imc = kg/Math.pow(m,2);

        System.out.println("Tu IMC es : " + imc);

        teclado.close();
    }
}
