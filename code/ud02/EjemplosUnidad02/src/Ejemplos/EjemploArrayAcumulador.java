package ejemplos;

import java.util.Scanner;

public class EjemploArrayAcumulador {

    public static void main(String[] args) {

        double [] compra = new double [2];
        double total = 0.0;
        String totalRedondeado;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < compra.length; i++){
            System.out.print("Ingrese el precio del producto #" + (i+1)  + ": ");
            compra[i] = sc.nextDouble();
        }

        for (int i = 0; i < compra.length; i++){
            total = total + compra[i];
        }


        totalRedondeado = String.format("%.2f", total);
        System.out.println("El total de la compra es " + totalRedondeado + "€");
    }
}
